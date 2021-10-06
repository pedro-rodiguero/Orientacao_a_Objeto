package dados;

public class Oculos extends Produto {
    private String tamanho;

	public Oculos(String modelo, String cor, int qntEstoque, Long valor, String tamanho) {
		super(modelo, cor, qntEstoque, valor);
		this.tamanho = tamanho;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> fa47ad818d7469992e86880cd0039ad7099b0e11
