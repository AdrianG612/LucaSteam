package servicios;

import model.Juego;

public interface ServiciosJuegos {

	public boolean cargarDatosFichero();
	
	public boolean addJuego(Juego juego);

	boolean filtrarGeneroPlataformas();

}
