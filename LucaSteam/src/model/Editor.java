package model;

public class Editor {
	
	private String nombre;

	public Editor(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Editor [nombre=" + nombre + "]";
	}
	
}
