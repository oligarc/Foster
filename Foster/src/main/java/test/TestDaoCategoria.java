package test;

import java.util.ArrayList;

import daos.DaoCategoria;
import entidades.Categoria;

public class TestDaoCategoria {

	public static void main(String[] args) {
		
		DaoCategoria daoCategoria = new DaoCategoria();
		
		ArrayList<Categoria> prueba = daoCategoria.obtenerListaCategorias();
		
		for (Categoria categoria : prueba) {
			System.out.println(categoria.toString());
		}

	}

}
