import interfaceGrafica.TelaMenu;

public class Main {

	public static void main(String[] args){
		try {
			new TelaMenu();			//Funcao para entrar no menu
		} catch (Exception e) {		//e nas outras telas
			e.printStackTrace();
		}
	}
}
