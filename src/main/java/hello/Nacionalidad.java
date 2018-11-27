package hello;

public class Nacionalidad {
	
	private Integer id;
	private String nombre;
	
	
	public Nacionalidad(Integer id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return String.format("Nacionalidad [id=%s, nombre=%s]", id, nombre);
	}
	
	
}
