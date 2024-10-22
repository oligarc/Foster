package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexiones.Conexion;

public class DaoPunto {
	
	public DaoPunto() {
		
	}
	
	public void aniadirPuntuaje(int idProducto, int puntos) {
		
		Connection con = null;
		PreparedStatement ps = null;
		String query = "INSERT INTO PUNTO(ID,IDPRODUCTO,PUNTOS) VALUES (SEQ_PUNTO.NEXTVAL,?,?)";
		Conexion miconex = new Conexion();
		
		try {
			con = miconex.getConexion();
			con.setAutoCommit(false);
			ps = con.prepareStatement(query);
			ps.setInt(1, idProducto);
			ps.setInt(2, puntos);
			ps.executeUpdate();
			con.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}if(ps!=null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		
	}

}
