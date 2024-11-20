package datos;

import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import model.Editor;
import model.Genero;
import model.Juego;

public class JuegosImp implements Juegos{
	
	private static Logger logger = LogManager.getLogger(JuegosImp.class);
	
	private List<Juego> juegos = new ArrayList();
	private List<Editor> editores = new ArrayList();
	
	public JuegosImp() {
		super();
	}

	public JuegosImp(List<Juego> juegos, List<Editor> editores) {
		super();
		this.juegos = juegos;
		this.editores = editores;
	}
	
	//getter
	public List<Juego> getJuegos() {
		return juegos;
	}

	public List<Editor> getEditores() {
		return editores;
	}

	//setter
	public void setJuegos(List<Juego> juegos) {
		this.juegos = juegos;
	}

	public void setEditores(List<Editor> editores) {
		this.editores = editores;
	}

	@Override
	public boolean editorExiste(Editor e) {
		if (e == null || editorExiste(e.getNombre())) {
			logger.warn("El editor es nulo.");
			return false;
		}else
			return editores.contains(e);
	}

	@Override
	public boolean editorExiste(String nombre) {
		if (nombre == null || nombre.isEmpty()) {
	        logger.warn("El nombre del editor es nulo o vacío.");
	        return false;
	    }
	    for (Editor editor : editores) {
	        if (editor.getNombre().equalsIgnoreCase(nombre))
	            return true;
	    }
	    return false;
	}

	@Override
	public boolean addEditor(Editor e) {
		//comprobar si es nulo o vacio
		if (e == null || e.getNombre() == null || e.getNombre().isEmpty()) {
			logger.warn("No se puede añadir un editor nulo o con nombre vacío.");
			return false;
	     }
	     // Comprobar si el editor ya existe
	     if (editorExiste(e)) {
	    	 return false;
	     }
	     // Agregar el editor a la lista
	     editores.add(e);
	     return true;
	}

	@Override
	public boolean addJuego(Juego j) {
		//completarrrrr
		return false;
	}
	
	@Override
	public String toString() {
		return "Juegos [juegos=" + juegos + ", editores=" + editores + "]";
	}

	@Override
	public boolean juegoExiste(String editor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Juego> filtrarGenero(Genero genero) {
		List<Juego> listaFiltrada = new ArrayList<Juego>();
		for (Juego j: juegos) {
			if (j.getGenero().getNombre().equals(genero.getNombre())) {
				listaFiltrada.add(j);
			}
		}
		return listaFiltrada;
	}
	
}
