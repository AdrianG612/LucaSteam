package datos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Editor;

class DatosJuegosImpTest {

	@Test
	void testEditorYaExistente() {

		Juegos j = new JuegosImp();
				
		boolean primerEditor = j.addEditor(new Editor("Adrian"));
		boolean segundoEditor = j.addEditor(new Editor("Adrian"));
		
		assertEquals(true, primerEditor, "añadir un editor que no existe debería hacerse bien y devolver true");
		assertEquals(false, segundoEditor, "añadir un editor que existe debería no hacerse y devolver false");
		
	}
	


}
