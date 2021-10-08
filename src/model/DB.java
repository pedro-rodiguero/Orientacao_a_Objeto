package model;

import java.util.ArrayList;

public abstract class DB {

	private static final ArrayList<Cliente> listaClientes = new ArrayList<>();

	public static ArrayList<Cliente> getListaclientes() {
		return listaClientes;
	}

	private DB() {
	}

}