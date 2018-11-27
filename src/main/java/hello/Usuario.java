package hello;

public class Usuario {
	private String nombre;
	private String apellido;
	private Integer nacionalidad;
	
	public Usuario() {
		
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(Integer nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	@Override
	public String toString() {
		return String.format("Usuario [nombre=%s, apellido=%s, nacionalidad=%s]", nombre, apellido, nacionalidad);
	}
	
	
	
}
