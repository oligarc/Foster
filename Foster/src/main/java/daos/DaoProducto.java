package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexiones.Conexion;
import entidades.Producto;

public class DaoProducto {
	
	public DaoProducto() {
		
		
	}
	
	public ArrayList<Producto> obtenerTodosLosProductos(){
		
		
		ArrayList<Producto> listaProductos = new ArrayList<Producto>();
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		
		String query = "SELECT * FROM PRODUCTO";
		
		Conexion miconex = new Conexion();
		
		try {
			
			con = miconex.getConexion();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				Producto producto = new Producto();
				producto.setIdProducto(rs.getInt("ID"));
				producto.setTitulo(rs.getString("TITULO"));
				producto.setBody(rs.getString("BODY"));
				producto.setCategoriaID(rs.getInt("CATEGORIAID"));
				producto.setImagen(rs.getString("IMAGEN"));
				producto.setFondo(rs.getString("FONDO"));
				producto.setSumario(rs.getString("SUMARIO"));
				
				listaProductos.add(producto);
			}
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listaProductos;
	}
	
	public ArrayList<Producto> obtenerProductosCategoriaID(int categoriaID){
		
		ArrayList<Producto> listaProductos = new ArrayList<Producto>();
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String query = "SELECT * FROM PRODUCTO WHERE CATEGORIAID=? ORDER BY TITULO";
		
		Conexion miconex = new Conexion();
		try {
			con = miconex.getConexion();
			ps = con.prepareStatement(query);
			ps.setInt(1, categoriaID);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				Producto producto = new Producto();
				
				producto.setIdProducto(rs.getInt("ID"));
				producto.setTitulo(rs.getString("TITULO"));
				producto.setBody(rs.getString("BODY"));
				producto.setCategoriaID(rs.getInt("CATEGORIAID"));
				producto.setImagen(rs.getString("IMAGEN"));
				producto.setFondo(rs.getString("FONDO"));
				producto.setSumario(rs.getString("SUMARIO"));
				
				listaProductos.add(producto);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return listaProductos;
	}
	
	
	

}
