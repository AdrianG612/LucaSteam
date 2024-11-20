package gui;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import model.Juego;
import servicios.ServiciosJuegos;
import servicios.ServiciosJuegosImp;

public class FormularioTest {

	@Test
	void testFicheroVacio() {
		
		ServiciosJuegos servicioJuego = new ServiciosJuegosImp();
		
		Juego juego = new Juego();
		Formulario form = new Formulario();
		juego = form.formularioJuego();
		boolean devuelto1 = servicioJuego.addJuego(juego);
		
		assertEquals(true,devuelto1 , "en caso de que el formulario no sea correcto");
		
		
	}
	
}
