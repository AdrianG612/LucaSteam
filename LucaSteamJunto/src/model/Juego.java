package model;

public class Juego {
	
	private String nombre;
	private Plataforma plataforma;
	private int anyo;
	private Genero genero;
	private Editor editor;
	
	public Juego() {
		super();
	}
	
	//se ha puesto el juego sin rango
	public Juego(String nombre, Plataforma plataforma, int anyo, Genero genero, Editor editor) {
		super();
		this.nombre = nombre;
		this.plataforma = plataforma;
		this.anyo = anyo;
		this.genero = genero;
		this.editor = editor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Plataforma getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(Plataforma plataforma) {
		this.plataforma = plataforma;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Editor getEditor() {
		return editor;
	}

	public void setEditor(Editor editor) {
		this.editor = editor;
	}

	@Override
	public String toString() {
		return "Juego [nombre=" + nombre + ", plataforma=" + plataforma + ", anyo=" + anyo
				+ ", genero=" + genero + "]";
	}
	
	
}
