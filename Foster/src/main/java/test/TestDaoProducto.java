package test;

import java.util.ArrayList;

import daos.DaoProducto;
import entidades.Producto;

public class TestDaoProducto {
	
	public static void main(String[] args) {
		
		DaoProducto daoProducto = new DaoProducto();
		
		ArrayList<Producto> listaProductos;
		
		listaProductos = daoProducto.obtenerTodosLosProductos();
		
		/*for (Producto producto : listaProductos) {
			System.out.println(producto.toString());
		}
		
		*/
		
		ArrayList<Producto> listaProductos2;
		
		listaProductos2 = daoProducto.obtenerProductosCategoriaID(32);
		for (Producto producto : listaProductos2) {
			System.out.println(producto.toString());
		}
		
	}

}
