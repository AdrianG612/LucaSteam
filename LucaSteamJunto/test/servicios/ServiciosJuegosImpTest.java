package servicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ServiciosJuegosImpTest {

	
	@Test
	void testFicheroVacio() {
		
		ServiciosJuegos sj = new ServiciosJuegosImp();
		
		boolean result = sj.cargarDatosFichero();
		
		assertEquals(true, result, "El metodo cargarDatosFichero deberia devolver siempre true ya que la ruta es fija (res/vgsales.csv");
		
		
	}
}
