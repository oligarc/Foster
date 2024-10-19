package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexiones.Conexion;
import entidades.Categoria;

public class DaoCategoria {
	
	public DaoCategoria() {
		
	}
	
	public ArrayList<Categoria> obtenerListaCategorias(){
		
		
		ArrayList<Categoria> listaCategorias = new ArrayList<Categoria>();
		
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		
		String query = "SELECT * FROM CATEGORIA";
		
		Conexion miconex = new Conexion();
		try {
			
			con = miconex.getConexion();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				Categoria categoria = new Categoria();
				categoria.setCategoriaID(rs.getInt("ID"));
				categoria.setNombre(rs.getString("NOMBRE"));
				categoria.setDescripcion(rs.getString("DESCRIPCION"));
				categoria.setGuarnicion(rs.getString("GUARNICION"));
				
				listaCategorias.add(categoria);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listaCategorias;
		
	}
	
	public String obtenerNombreCategoriaPorIDCategoria(int idCategoria) {
		
		String nombre = "";
		
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		
		String query = "SELECT NOMBRE FROM CATEGORIA WHERE ID=?";
		
		Conexion miconex = new Conexion();
		
		try {
			con = miconex.getConexion();
			ps = con.prepareStatement(query);
			ps.setInt(1, idCategoria);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				nombre = rs.getString("NOMBRE");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return nombre;
	}

}
