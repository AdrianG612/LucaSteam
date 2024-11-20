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

	//metodos gestion de EDITOR
	
	@Override
	public boolean editorExiste(String nombre) {
		//comprobar string valido
		if (nombre == null || nombre.isEmpty()) {
	        logger.warn("El nombre del editor es nulo o vacío.");
	        return false;
	    }
	    for (Editor editor : editores) {
	    	//comprobar si esta en la lista
	        if (editor.getNombre().equalsIgnoreCase(nombre))
	            return true;
	    }
	    return false;
	}
	
	@Override
	public boolean editorExiste(Editor e) {
		//Comprobar editor no nulo
		if (e == null ) {
			logger.warn("El editor es nulo.");
			return false;
		}
		//comprobar por nombre
		else if (editorExiste(e.getNombre())) {
			logger.warn("El editor "+e.getNombre()+" ya existe.");
			return true;
		}			
		return editores.contains(e);
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
	
	//metodos gestion JUEGO
	
	@Override
	public boolean juegoExiste(String nombre) {
		//comprobar string valido
		if (nombre == null || nombre.isEmpty()) {
			logger.warn("El nombre del juego es nulo o vacío.");
			return false;
		}
		//comprobar si esta en la lista
		for (Juego juego : juegos) {
			if (juego.getNombre().equalsIgnoreCase(nombre))
				return true;
		}
		return false;
	}
	
	@Override
	public boolean juegoExiste(Juego j) {
		//comprobar juego no nulo
		if (j == null ) {
			logger.warn("El juego es nulo.");
			return false;
		}
		//comprobar por nombre
		else if (juegoExiste(j.getNombre())) {
			logger.warn("El editor "+j.getNombre()+" ya existe.");
			return true;
		}			
		return juegos.contains(j);
	}

	@Override
	public boolean addJuego(Juego j) {
		//comprobar juego y nombre del juego no nulos 
		if (j == null || j.getNombre() == null || j.getNombre().isEmpty()) {
            logger.warn("No se puede añadir un juego nulo o con nombre vacío.");
            return false;
        }
		//comprobar que no este ya en la lista
        if (juegos.contains(j)) {
            logger.warn("El juego \"" + j.getNombre() + "\" ya existe.");
            return false;
        }
        //agregar j a la lista de juegos
        juegos.add(j);
        return true;
	}
	
	//OTROS
	
	@Override
	public String toString() {
		return "Juegos [juegos=" + juegos + ", editores=" + editores + "]";
	}

	@Override
	public List<Juego> filtrarGeneroPlataforma() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
