package datos;

import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import model.Editor;
import model.Juego;

public class JuegosImp implements Juegos{
	
	private static Logger logger = LogManager.getLogger(JuegosImp.class);
	
	private List<Juego> juegos=new ArrayList();
	private List<Editor> editores=new ArrayList();
	
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
		//comprobar que no es nulo y tiene nombre
		if (j == null || j.getNombre() == null || j.getNombre().isEmpty()) {
            logger.warning("No se puede añadir un juego nulo o con nombre vacío.");
            return false;
        }
		//comprobar que no está ya añadido
        if (juegos.contains(j)) {
            logger.warning("El juego \"" + j.getNombre() + "\" ya existe.");
            return false;
        }
        //agregar juego
        juegos.add(j);
        return true;
	}
	
	@Override
	public String toString() {
		return "Juegos [juegos=" + juegos + ", editores=" + editores + "]";
	}
	
}
