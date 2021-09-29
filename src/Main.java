import java.util.ArrayList;

public class Main {
	private static final String[] modelos = {"juliet", "aviador","redondo", "quadrado", "esportivo",
			"aba reta", "aba torta", "viseira"};
	private static final String[] cor = {"azul", "preto", "verde", "roxo", "branco",
			"rosa","vermelho","laranja"};
	private static final int[] qntEstoque = {1,2,3,4,5,
			3,4,5};
	private static final Long[] valor = {10L, 15L, 20L, 25L, 30L,
			20L, 30L, 40L};
	
	private static final Boolean[] tipoProduto = {true, true, true, true, true,
			false, false, false};
	
	
	public static void main(String[] args) {
		ArrayList<Produto> produtos = new ArrayList<>();
		
		for(int i =0; i<8; i++) {
			Produto produto =  new Produto(){};
			produto.modelo = modelos[i];
			produto.cor = cor[i];
			produto.qntEstoque = qntEstoque[i];
			produto.valor = valor[i];
			produto.tipoProduto = tipoProduto[i];
			
			
		}
	}
}
	
