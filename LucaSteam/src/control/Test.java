package control;

import java.util.ArrayList;
import java.util.List;

import datos.JuegosImp;
import model.Editor;

public class Test {

	public static void pruebaExisteEditor() {
		 
		JuegosImp juegos1=new JuegosImp();
		
		Editor e1=new Editor("Pepe");
		Editor e2=new Editor("Sara");
		Editor e3=null;
		
		List<Editor> editores=new ArrayList();
		editores.add(e1);
		
		juegos1.setEditores(editores);
		
		System.out.println(juegos1.editorExite(e1));
		System.out.println(juegos1.editorExite(e3));
		System.out.println(juegos1.editorExite(e2));
		
		editores.add(e2);
		juegos1.setEditores(editores);
		
		System.out.println(juegos1.editorExite(e2));

	}
}
