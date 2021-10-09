package main.model;

import java.util.ArrayList;

/**
 * The type Db.
 */
public abstract class DB {

	private static final ArrayList<Cliente> listaClientes = new ArrayList<>();

	/**
	 * Gets listaclientes.
	 *
	 * @return the listaclientes
	 */
	public static ArrayList<Cliente> getListaclientes() {
		return listaClientes;
	}

	private static final ArrayList<Produto> listaProdutos = new ArrayList<>();

	/**
	 * Get lista produtos array list.
	 *
	 * @return the array list
	 */
	public static ArrayList<Produto> getListaProdutos(){
		return listaProdutos;
	}

	/**
	 * Instantiates a new Db.
	 */
	public DB() {}

	private DB d = new DB(){};

	/**
	 * Gets d.
	 *
	 * @return the d
	 */
	public DB getD() {
		return d;
	}
}
