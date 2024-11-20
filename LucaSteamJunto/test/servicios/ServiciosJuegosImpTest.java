package servicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Editor;
import model.Genero;
import model.Juego;
import model.Plataforma;

class ServiciosJuegosImpTest {

	
	@Test
	void testFicheroVacio() {
		
		ServiciosJuegos sj = new ServiciosJuegosImp();
		
		boolean result = sj.cargarDatosFichero();
		
		assertEquals(true, result, "El metodo cargarDatosFichero deberia devolver siempre true ya que la ruta es fija (res/vgsales.csv");	
		
	}
	
	@Test
	void testJuegoEditorNuevo() {
		
		ServiciosJuegos sj = new ServiciosJuegosImp();
		
		boolean result = sj.addJuego(new Juego("Mouthwashing", Plataforma.PC, 2024, Genero.MISC, new Editor("Wrong Organ")));
		
		assertEquals(true, result, "El método addJuego de la capa servicio debería encargarse de agregar el Editor también si este no existe aún");
	}

}
