package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeneroTest {

	@Test
	void testAsignarEnumDesdeString() {

		Genero action = Genero.asignarEnumDesdeString("action");
		
		assertEquals("Action",action.getNombre(),"La funcion deberia devolver el enum correspondiente al String");
		assertNull(Genero.asignarEnumDesdeString("miedo"));
		
		
	}

}
