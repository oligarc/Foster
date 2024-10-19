package entidades;

public class Categoria {
	
	private int categoriaID;
	private String nombre;
	private String descripcion;
	private String guarnicion;
	
	public Categoria() {
        
    }
	
	public Categoria(int categoriaID, String nombre, String descripcion, String guarnicion) {
		this.categoriaID = categoriaID;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.guarnicion = guarnicion;
	}

	public int getCategoriaID() {
		return categoriaID;
	}

	public void setCategoriaID(int categoriaID) {
		this.categoriaID = categoriaID;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getGuarnicion() {
		return guarnicion;
	}

	public void setGuarnicion(String guarnicion) {
		this.guarnicion = guarnicion;
	}

	@Override
	public String toString() {
		return "Categoria [categoriaID=" + categoriaID + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", guarnicion=" + guarnicion + "]";
	}
	
	
	
	

}
