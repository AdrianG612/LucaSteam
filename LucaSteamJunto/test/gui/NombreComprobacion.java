package gui;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NombreComprobacion {

	
	@Test
	void testFicheroVacio() {
		
		Formulario form = new Formulario();
		boolean valor= form.comprobarNombre(null);
		
		
		assertEquals(true,valor , "en caso de que el formulario no sea correcto");
		
		
	}
	
}
