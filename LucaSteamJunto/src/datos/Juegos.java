package datos;


import java.util.List;

import model.Editor;
import model.Juego;

public interface Juegos {
	
	public boolean editorExiste(Editor e);
	public boolean editorExiste(String editor);
	
	public boolean addEditor(Editor e);
	
	public boolean juegoExiste(String nombre);
	public boolean juegoExiste(Juego j);
	
	public boolean addJuego(Juego j);
	
	public List<Juego> filtrarGeneroPlataforma();
	
}
