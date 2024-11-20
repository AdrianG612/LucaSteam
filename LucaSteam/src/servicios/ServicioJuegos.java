package servicios;

import model.Juego;

public interface ServicioJuegos {
	
	public boolean addJuego(Juego juego);
	
	public boolean cargarDatosFichero();
	
	public boolean filtrarGeneroPlataforma();
	
}
