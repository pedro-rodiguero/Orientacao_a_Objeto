package br.gov.tcu.ministeriopublico.afastamento.aplicacao.afastamento;

import br.gov.tcu.ministeriopublico.afastamento.dominio.afastamento.*;
import br.gov.tcu.ministeriopublico.afastamento.dominio.evento.TipoEventoAfastamento;
import br.gov.tcu.ministeriopublico.afastamento.dominio.substituicao.AtualizaGRHEvent;
import br.gov.tcu.ministeriopublico.afastamento.infraestrutura.evento.DomainEvents;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class AfastaMinistroAppService {

    private final AfastaMinistroService afastaMinistroService;
    private final AfastamentoRepository afastamentoRepository;
    private final RegistraEventoAfastamentoAppService registraEventoAfastamentoAppService;
    private final AnexaArquivoAfastamentoAppService anexaArquivoAfastamentoAppService;
    private final DadosBasicosAfastamentoAssembler dadosBasicosAfastamentoAssembler;

    @Autowired
    public AfastaMinistroAppService(
        AfastaMinistroService afastaMinistroService,
        AfastamentoRepository afastamentoRepository,
        AnexaArquivoAfastamentoAppService anexaArquivoAfastamentoAppService,
        RegistraEventoAfastamentoAppService registraEventoAfastamentoAppService,
        DadosBasicosAfastamentoAssembler dadosBasicosAfastamentoAssembler
    ) {
        this.afastaMinistroService = afastaMinistroService;
        this.afastamentoRepository = afastamentoRepository;
        this.registraEventoAfastamentoAppService = registraEventoAfastamentoAppService;
        this.anexaArquivoAfastamentoAppService = anexaArquivoAfastamentoAppService;
        this.dadosBasicosAfastamentoAssembler = dadosBasicosAfastamentoAssembler;
    }

    @Transactional
    public Afastamento afastar(Afastamento afastaCommand, MultipartFile[] arquivosNovos) {
        Afastamento afastamento = cadastrarAfastamento(afastaCommand);
        anexarArquivosERemoverAnexos(afastamento, arquivosNovos, afastaCommand);
        registraEventoAfastamentoAppService.registrar(afastamento, TipoEventoAfastamento.CRIACAO_AFASTAMENTO);
        publicarEventoAtualizarGRH(afastamento);
        return afastamento;
    }

    private void publicarEventoAtualizarGRH(Afastamento afastamento) {
        AtualizaGRHEvent event = new AtualizaGRHEvent((afastamento));
        DomainEvents.publishEvent(event);
    }

    private Afastamento cadastrarAfastamento(Afastamento afastaCommand) {
        DadosBasicosAfastamento dadosBasicosAfastamento =
            dadosBasicosAfastamentoAssembler.montarDadosBasicosAfastamento(afastaCommand);
        Afastamento afastamento = afastaMinistroService.afastar(dadosBasicosAfastamento);
        return afastamentoRepository.save(afastamento);
    }

    private void anexarArquivosERemoverAnexos(
        Afastamento afastamentoNovo, MultipartFile[] arquivosNovos, Afastamento atualizaAfastamentoCommand
    ) {
        List<Anexo> anexosRestantes = atualizaAfastamentoCommand.getAnexos();
        anexaArquivoAfastamentoAppService.anexarArquivosAfastamento(afastamentoNovo, arquivosNovos, anexosRestantes);
    }

}
