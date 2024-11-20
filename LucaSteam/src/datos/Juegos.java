package datos;

import model.Editor;
import model.Juego;

public interface Juegos {

	public boolean editorExiste(Editor e);
	public boolean editorExiste(String e);
	
	public boolean addEditor(Editor e);
	
	public boolean addJuego(Juego j);
	
}
