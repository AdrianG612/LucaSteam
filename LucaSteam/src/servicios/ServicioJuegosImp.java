package servicios;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import datos.Juegos;
import model.Editor;
import model.Juego;

public class ServicioJuegosImp implements ServicioJuegos {
	
	private Juegos juegos;
	
	private static Logger logger = LogManager.getLogger(ServicioJuegosImp.class);
	
	public ServicioJuegosImp() {
		super();
	}

	@Override
	public boolean addJuego(Juego juego) {
		if (!juegos.juegoExiste(juego.getNombre())) {
			if (!juegos.editorExiste(juego.getEditor().getNombre())) {
				juegos.addEditor(new Editor(juego.getEditor().getNombre()));
				
				logger.info("Se ha agregado el editor " + juego.getEditor().getNombre() + " a la lista.");
			}
			juegos.addJuego(juego);
			
			logger.info("Se ha agregado el juego " + juego.getNombre() + " a la lista.");
			return true;
		}
		return false;
	}

	@Override
	public boolean cargarDatosFichero() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean filtrarGeneroPlataforma() {
		for (Juego j : juegos.filtrarGeneroPlataforma()) {
			Menu.pintarJuego(j);
		}
		return false;
	}

}
