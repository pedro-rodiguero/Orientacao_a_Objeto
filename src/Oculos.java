public class Oculos {
    private String marca;
    private String modelo;
    private String cor;
    private String genero;
    private Long valor;

    public Oculos(String marca, String modelo, String cor, String genero, Long valor){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.genero = genero;
        this.valor = valor;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public Long getValor(){
        return valor;
    }
}
