package control;

import gui.Menu;
import utilidades.LeerTeclado;
<<<<<<< HEAD:LucaSteamJunto/src/control/Start.java
import servicios.ServiciosJuegos;
import servicios.ServiciosJuegosImp;

public class Start {
	
	ServiciosJuegos servicioJuego = new ServiciosJuegosImp();
=======

public class Start {
	
	ServiciosJuegos servicioJuego = new ServicioJuego();
>>>>>>> a8040d31717cbb48770dbf8aef263c075aad67e1:LucaSteam/src/control/Start.java

	public void comenzar()
	{
		
		boolean seguir = false;
		
		do {
			Menu.mostrar();
			seguir= this.seleccionarOpciones();
			
			
		}while(seguir);
	}
	
	public boolean seleccionarOpciones()
	{
	
		/*public boolean addJuego(Juego juego);
	
		public boolean cargarDatosFichero();
		
		public boolean filtrarGeneroPlataforma();*/
			
		boolean continuar = true;
		
		switch (LeerTeclado.leerInt()) {
		case 1:
			//falta el poder cargas los juegos del csv
			
			boolean devuelto = servicioJuego.addJuego(juego);
			
			if(devuelto)
			{
				System.out.println("Se han cargado los juegos coorectamente");
			}
			else
				System.out.println("Se no se han podido cargar los usuarios correctamente");
				
			break;

		case 2:
			
			boolean devuelto = servicioJuego.cargarDatosFichero();
			
			if(devuelto)
			{
				System.out.println("Se han cargado los juegos coorectamente desde el ficchero");
			}
			else
				System.out.println("Se no se han podido cargar los usuarios correctamente desde el fichero");
			
			break;

		case 3:
			
			boolean devuelto = servicioJuego.filtrarGeneroPlataforma();
			
			if(devuelto)
			{
				System.out.println("Se han filtrado por plataforma de forma correcta");
			}
			else
				System.out.println("Se no se han filtrado por plataforma de forma correcta");
			
			break;

		case 0:
			System.out.println("Se ha salido correctamente del programa");
			continuar = false;
			break;
		}
		
		return continuar;
	}
	
}
