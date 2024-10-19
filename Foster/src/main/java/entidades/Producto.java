package entidades;

public class Producto {
	
	private int idProducto;
	private String titulo;
	private String body;
	private int categoriaID;
	private String imagen;
	private String fondo;
	private String sumario;
	
	public Producto() {
        
    }
	
	public Producto(int idProducto, String titulo, String body, int categoriaID, String imagen, String fondo, String sumario) {
		this.idProducto = idProducto;
        this.titulo = titulo;
        this.body = body;
        this.categoriaID = categoriaID;
        this.imagen = imagen;
        this.fondo = fondo;
        this.sumario = sumario;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public int getCategoriaID() {
		return categoriaID;
	}

	public void setCategoriaID(int categoriaID) {
		this.categoriaID = categoriaID;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getFondo() {
		return fondo;
	}

	public void setFondo(String fondo) {
		this.fondo = fondo;
	}

	public String getSumario() {
		return sumario;
	}

	public void setSumario(String sumario) {
		this.sumario = sumario;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", titulo=" + titulo + ", body=" + body + ", categoriaID="
				+ categoriaID + ", imagen=" + imagen + ", fondo=" + fondo + ", sumario=" + sumario + "]";
	}
	
	
	
	
	

}
