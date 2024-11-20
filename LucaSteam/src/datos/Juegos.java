package datos;

import java.util.List;

import model.Editor;
import model.Juego;

public interface Juegos {
	
	public boolean editorExiste(String editor);
	
	public boolean juegoExiste(String editor);
	
	public boolean addJuego(Juego j);
	
	public boolean addEditor(Editor e);
	
	public List<Juego> filtrarGeneroPlataforma();
	
}
