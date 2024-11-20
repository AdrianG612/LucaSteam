package datos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import model.Editor;

class DatosTest {

	@Test
	void testEditorExiste1() {
		JuegosImp juegos1=new JuegosImp();
		
		Editor e1=new Editor("Pepe");
		Editor e2=new Editor("Sara");
		Editor e3=null;
		
		List<Editor> editores=new ArrayList();
		editores.add(e1);
		
		juegos1.setEditores(editores);
		
		System.out.println(juegos1.editorExiste(e1));
		System.out.println(juegos1.editorExiste(e3));
		System.out.println(juegos1.editorExiste(e2));
		
		editores.add(e2);
		juegos1.setEditores(editores);
		
		System.out.println(juegos1.editorExiste(e2));;
	}

}
