package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlataformaTest {

	@Test
	void testAsignarEnumDesdeString() {

		Plataforma wii = Plataforma.asignarEnumDesdeString("wii");
		
		assertEquals("Wii",wii.getNombre(),"La funcion deberia devolver el enum correspondiente al String");
		assertNull(Plataforma.asignarEnumDesdeString("la plei"));
		
		
	}
}
