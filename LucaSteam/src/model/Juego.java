package model;

public class Juego {
	
	private int rango;
	private String nombre;
	private Plataforma plataforma;
	private int anyo;
	private Genero genero;
	private Editor editor;
	
	public Juego() {
		super();
	}

	public Juego(int rango, String nombre, Plataforma plataforma, int anyo, Genero genero, Editor editor) {
		super();
		this.rango = rango;
		this.nombre = nombre;
		this.plataforma = plataforma;
		this.anyo = anyo;
		this.genero = genero;
		this.editor = editor;
	}

	public int getRango() {
		return rango;
	}

	public void setRango(int rango) {
		this.rango = rango;
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
		return "Juego [rango=" + rango + ", nombre=" + nombre + ", plataforma=" + plataforma + ", anyo=" + anyo
				+ ", genero=" + genero + "]";
	}
	
	
}
