package gui;

import model.Editor;
import model.Genero;
import model.Juego;
import model.Plataforma;
import utilidades.LeerTeclado;

public class Formulario {
	
	private int rango;
	private String nombre;
	private Plataforma plataforma;
	private int anyo;
	private Genero genero;
	
	public Juego formularioJuego()
	{
		
		System.out.println("Introduzaca el nombre del juego");
		nombre = LeerTeclado.leerLinea();
		
		System.out.println("Introduzaca la plataforma del juego");
		String plat= LeerTeclado.leerLinea();
		
		/*falta generean la plataforma al ser enum*/
		
		System.out.println("Introduzaca el año del juego");
		anyo = LeerTeclado.leerInt();
		
		System.out.println("Introduzaca el genero");
		String gen = LeerTeclado.leerLinea();
		
		/*falta generar el genero al ser enum*/
		
		System.out.println("Introduzaca el nombre del editor");
		String edi = LeerTeclado.leerLinea();
	
		Editor editor = new Editor(edi);
		
		
		Juego juego = new Juego(rango, nombre, plataforma, anyo, genero, editor);
		
		return juego;
		
	}
}
