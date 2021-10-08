package model;

import java.util.ArrayList;

public abstract class DB {

	private static final ArrayList<Cliente> listaClientes = new ArrayList<>();
	public static ArrayList<Cliente> getListaclientes() {
		return listaClientes;
	}

	private static final ArrayList<Produto> listaProdutos = new ArrayList<>();
	public static ArrayList<Produto> getListaProdutos(){
		return listaProdutos;
	}

	public DB() {}

	private DB d = new DB(){};

	public DB getD() {
		return d;
	}
}
