package datos;


import java.util.List;

import model.Editor;
import model.Genero;
import model.Juego;

public interface Juegos {
	
	public boolean editorExiste(Editor e);
	public boolean editorExiste(String editor);
	
	public boolean addEditor(Editor e);
	
	public boolean juegoExiste(String nombre);
	public boolean juegoExiste(Juego j);
	
	public boolean addJuego(Juego j);
	
<<<<<<< HEAD
	public List<Juego> filtrarGeneroPlataforma();
=======
	public List<Juego> filtrarGenero(Genero genero);
>>>>>>> origin/daniel
	
}
