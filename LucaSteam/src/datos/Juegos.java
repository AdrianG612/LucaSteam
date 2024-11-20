package datos;

<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> origin/patricia
import model.Editor;
import model.Juego;

public interface Juegos {
<<<<<<< HEAD
	
	public boolean editorExiste(String editor);
	
	public boolean juegoExiste(String editor);
	
	public boolean addJuego(Juego j);
	
	public boolean addEditor(Editor e);
	
	public List<Juego> filtrarGeneroPlataforma();
=======

	public boolean editorExiste(Editor e);
	public boolean editorExiste(String e);
	
	public boolean addEditor(Editor e);
	
	public boolean addJuego(Juego j);
>>>>>>> origin/patricia
	
}
