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
		
		//se comprueba que el nombre no sea null
		boolean booleanoNombre=true;
		do {
			
			//se introduce por pantalla el nombre del juego
			System.out.println("Introduzaca el nombre del juego");
			nombre = LeerTeclado.leerLinea();
			if(nombre!=null)
			{
				System.out.println("Se ha introducido el nombre del juego correctamente");
				booleanoNombre=false;
			}
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
			if(plataforma!=null)
			{
				System.out.println("se encuentra la plataforma");
				booleanoPlataforma=false;
			}
			else
				System.out.println("No se encuentra la plataforma");
		
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
			if(genero!=null)
			{
				System.out.println("se encuentra el genero");
				booleanGenero=false;
			}
			else
				System.out.println("No se encuentra el genero");
			
		}while(booleanGenero);

		
		System.out.println("Introduzaca el nombre del editor");
		String edi = LeerTeclado.leerLinea();
			
		Editor editor = new Editor(edi);
				
				
		Juego juego = new Juego(nombre, plataforma, anyo, genero, editor);
		
		return juego;
		
	}
}
