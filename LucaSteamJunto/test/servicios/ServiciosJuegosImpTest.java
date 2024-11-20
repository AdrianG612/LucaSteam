package servicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Juego;

class ServiciosJuegosImpTest {

	
	@Test
	void testFicheroVacio() {
		
		ServiciosJuegos sj = new ServiciosJuegosImp();
		
		boolean result = sj.cargarDatosFichero();
		
		assertEquals(true, result, "El metodo cargarDatosFichero deberia devolver siempre true ya que la ruta es fija (res/vgsales.csv");
			
	}
	
	@Test
	void testJuegoRepetido() {
		
		ServiciosJuegos sj = new ServiciosJuegosImp();

		Juego j1 = new Juego();
		j1.setNombre("mario bros");
		
		Juego j2 = new Juego();
		j2.setNombre("mario bros");
		
		boolean primerJuego = sj.addJuego(j1);
		boolean segundoJuego = sj.addJuego(j2);
		
		assertEquals(true, primerJuego, "Al añadir un juego nuevo deberia devolver true");
		assertEquals(false, segundoJuego, "Al añadir un juego repetido deberia devolver false");


	}

}
