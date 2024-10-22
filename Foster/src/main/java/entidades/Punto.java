package entidades;

public class Punto {
	
	private int id;
	private int idProducto;
	private int puntos;
	
	public Punto() {
        
    }
	
	public Punto(int id, int idProducto, int puntos) {
		this.id = id;
        this.idProducto = idProducto;
        this.puntos = puntos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	@Override
	public String toString() {
		return "Punto [id=" + id + ", idProducto=" + idProducto + ", puntos=" + puntos + "]";
	}
	
	

}
