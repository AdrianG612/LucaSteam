package datos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Editor;
import model.Genero;
import model.Juego;
import model.Plataforma;
import servicios.ServiciosJuegos;
import servicios.ServiciosJuegosImp;

class JuegosImpTest {

	@Test
	void testJuegoVacio() {
		Juegos juegosDatos = new JuegosImp();
		
		Juego juego = new Juego(null, null, 0, null, null);
		
		boolean result = juegosDatos.addJuego(juego);
		
		assertEquals(false, result, "El método addJuego debería devolver false al tratarse de un juego vacío y no poder agregarlo a la lista");
	}
	
	@Test
	void testFiltradoJuegosNull() {
		Juegos juegosDatos = new JuegosImp();
		
		juegosDatos.addJuego(new Juego("Juego1", Plataforma.DS, 2009, Genero.ADVENTURE, new Editor("Editor")));
		juegosDatos.addJuego(new Juego("Juego2", Plataforma.GB, 2009, Genero.FIGHTING, new Editor("Editor")));
		juegosDatos.addJuego(new Juego("Juego3", Plataforma.GB, 2009, Genero.PLATFORM, new Editor("Editor")));
		
		boolean result = false;
		
		if (juegosDatos.filtrarGenero(null).size() == 0) {
			result = true;
		}
		
		assertEquals(true, result, "La categoría no coincide con ninguna por tanto se devuelve una lista vacía.");
	}
	
	@Test 
	void testFiltradoJuegosAventura() {
		Juegos juegosDatos = new JuegosImp();
		
		juegosDatos.addJuego(new Juego("Juego1", Plataforma.DS, 2009, Genero.ADVENTURE, new Editor("Editor")));
		juegosDatos.addJuego(new Juego("Juego2", Plataforma.GB, 2009, Genero.ADVENTURE, new Editor("Editor")));
		juegosDatos.addJuego(new Juego("Juego3", Plataforma.GB, 2009, Genero.PLATFORM, new Editor("Editor")));
		
		boolean result = false;
		
		if (juegosDatos.filtrarGenero(Genero.ADVENTURE).size() == 2) {
			result = true;
		}
		
		assertEquals(true, result, "El filtrado da como resultado una lista de dos juegos de género adventure");
	}

}
