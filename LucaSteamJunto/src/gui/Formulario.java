package gui;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import datos.JuegosImp;
import model.Editor;
import model.Genero;
import model.Juego;
import model.Plataforma;
import utilidades.LeerTeclado;

public class Formulario {
	
<<<<<<< HEAD
=======
	private static Logger logger = LogManager.getLogger(Formulario.class);
	
	private int rango;
>>>>>>> origin/nosa
	private String nombre;
	private Plataforma plataforma;
	private int anyo;
	private Genero genero;
	
	public Juego formularioJuego()
	{
		
		//se comprueba que el nombre no sea null
		boolean booleanoNombre=true;
		do {
			
			//se introduce por pantalla el nombre del juego
			System.out.println("Introduzaca el nombre del juego");
			nombre = LeerTeclado.leerLinea();
			
			booleanoNombre = this.comprobarNombre(nombre);
		
		}while(booleanoNombre);
					
		//se hace un bucle y no sale hasta que la plataforma este correcta
		boolean booleanoPlataforma=true;
		do {
			
			//se introduce la plataforma del juego
			System.out.println("Introduzaca la plataforma del juego");
			System.out.println("Plataformas: Wii NES GB DS X360 PS3 PS2 SNES GBA PS4 3DS PSP PS Wii_U GameCube XBox Nintendo_64  Xbox ONE Genesis PC");
			String plat= LeerTeclado.leerLinea();
			
			//se hace una comprobacion de que la plataforma introducida se encuentre en la lista de enumeracion
			plataforma = Plataforma.asignarEnumDesdeString(plat);
			
			booleanoPlataforma = this.comprobarPlataforma(plataforma, plat);
		
		}while(booleanoPlataforma);
		
		
		//se introduce el el año del juego por pantalla
		System.out.println("Introduzaca el año del juego");
		anyo = LeerTeclado.leerInt();
			
		
		boolean booleanGenero= true;
		do {
			
			//se introduce el genero por pantalla
			System.out.println("Introduzaca el genero");
			System.out.println("Generos: Action Sports Misc Roleplaying Shooter Platform Racing Puzzle Simulation Fighting Adventure Strategy");
			String gen = LeerTeclado.leerLinea();
			
			//se hace una comprobacion de que el editor introducida se encuentre en la lista de enumeracion y si no es asi se pone a null
			genero = Genero.asignarEnumDesdeString(gen);
			
			booleanGenero = this.comprobarGenero(genero, gen);
			
		}while(booleanGenero);

		boolean booleanEditos=true;
		Editor editor = null;
		do {
			System.out.println("Introduzaca el nombre del editor");
			String edi = LeerTeclado.leerLinea();
			 
			 if(!(edi == null || edi.isEmpty()))
				{
					System.out.println("se encuentra la plataforma");
					editor = new Editor(edi);
					booleanEditos=false;
				}
				else
					logger.warn("No se encuentra la plataforma con nombre: " +edi);
			 
		}while(booleanEditos);	
		
<<<<<<< HEAD
		System.out.println("Introduzaca el nombre del editor");
		String edi = LeerTeclado.leerLinea();
			
		Editor editor = new Editor(edi);
					
=======
>>>>>>> origin/nosa
		Juego juego = new Juego(nombre, plataforma, anyo, genero, editor);
		
		return juego;
		
	}
	
	public boolean comprobarNombre(String nom)
	{
		boolean nombreDevolver =true;
		if(!(nom == null || nom.isEmpty()))
		{
			System.out.println("Se ha introducido el nombre del juego correctamente");
			nombreDevolver = false;
		}
		else 
			logger.warn("el nombre introducido no es correcto: "+nom);
		
		return nombreDevolver;
	}
	
	public boolean comprobarPlataforma(Plataforma plataform, String valor)
	{
		boolean platdevol = true;
		if(plataform!=null)
		{
			System.out.println("se encuentra la plataforma");
			platdevol=false;
		}
		else
			logger.warn("No se encuentra la plataforma con nombre: " +valor);
		
		return platdevol;
	}
	
	public boolean comprobarGenero(Genero gen, String valor)
	{
		boolean platdevol = true;
		if(gen!=null)
		{
			System.out.println("se encuentra el genero");
			platdevol=false;
		}
		else
			logger.warn("No se encuentra el genero con nombre: "+ valor);
		
		return platdevol;
	}
	
}
