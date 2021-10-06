package dados;

/**
 * Classe para fazer o pre cadastro dos produtos
 * @author Pedro/Lucas
 * @version TP.05
 */

import java.util.ArrayList;

public class PreCadastro {
    private static final String[] modelos = {"juliet", "aviador","redondo", "quadrado", "esportivo",
            "aba reta", "aba torta", "viseira"};
    private static final String[] cor = {"azul", "preto", "verde", "roxo", "branco",
            "rosa","vermelho","laranja"};
    private static final int[] qntEstoque = {1, 2, 3, 4, 5,
            3, 4, 5};
    private static final Long[] valor = {10L, 15L, 20L, 25L, 30L,
            20L, 30L, 40L};
    private static final Boolean[] tipoProdutos = {true, true, true, true, true,
            false, false, false};

    //Pre cadastro de cliente
    private static final String[] nomes = {"Pedro", "Lucas", "Rafael", "Bruno", "Natalia"};
    private static final String[] cpfs = {"23308665820", "34435651610", "07806112910", "54763006717", "25958055873"};
    private static final String[] ceps = {"56017711", "86507126", "74540474", "32968541", "27702914"};
    private static final String[] telefones = {"(61)87170784", "(61)83469070", "(61)86584869", "(61)84325776", "(61)84268100"};

    //Pre cadastro de venda
    private static final int[] qntProdutos = {1, 4, 7, 10, 11};
    private static final int[] ids = {1001, 1002, 2001, 2002, 1003};
    private static final Long[] valores = {10L, 15L, 35L, 20L, 55L};

    //Pre cadastro de loja
    private static final String[] nomeLojas = {"SunglassHut", "Chilli Beans", "New Era"};
    private static final String[] cpnjs = {"75120410073347", "08888932464067", "05484928010396"};

    ArrayList<Produto> produtos = new ArrayList<>();
    ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<Venda> vendas = new ArrayList<>();

    public static void preCadastro(){


        //Setando novos produtos
        for(int i = 0; i < 8; i++){
            Produto produto =  new Produto(){};
            produto.modelo = modelos[i];
            produto.cor = cor[i];
            produto.qntEstoque = qntEstoque[i];
            produto.valor = valor[i];
            if(tipoProdutos[i])
                produto.tipoProduto = "Oculos";
            else
                produto.tipoProduto = "Bone";

            System.out.println("Modelo: " + produto.modelo + "\n");
            System.out.println("Cor: " + produto.cor + "\n");
            System.out.println("Qnt Estoque: " + produto.qntEstoque + "\n");
            System.out.println("Valor: " + produto.valor + "\n");
            System.out.println("Tipo Produto: " + produto.tipoProduto + "\n");
            System.out.println(i);
            System.out.println("-------------------------------\n");
        }

        //Setando novos clientes
        for(int i = 0; i < 5; i++){
            Cliente cliente = new Cliente();
            cliente.nome = nomes[i];
            cliente.cpf = cpfs[i];
            cliente.cep = ceps[i];
            cliente.telefone = telefones[i];
        }

        //Setando novas vendas
        for(int i = 0; i < 5; i++){
            Venda venda = new Venda();
            venda.qntProduto = qntProdutos[i];
            venda.id = ids[i];
            venda.valor = valores[i];
        }
    }

    /**
     * Array produto [ ].
     * @return the produto [ ]
     */
    public Produto[] toArray(){
        return(Produto[]) produtos.toArray();
    }
}
