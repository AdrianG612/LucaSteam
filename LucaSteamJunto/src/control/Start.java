package control;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import gui.Formulario;
import gui.Menu;
import model.Juego;
import utilidades.LeerTeclado;
import servicios.ServiciosJuegos;
import servicios.ServiciosJuegosImp;

public class Start {
	
	private static Logger logger = LogManager.getLogger(Formulario.class);
	
	ServiciosJuegos servicioJuego = new ServiciosJuegosImp();

	public void comenzar()
	{
		//hacemos un bucle en el que mostraos el menu y sus opciones a elegir
		boolean seguir = false;
		
		do {
			Menu.mostrar();
			seguir= this.seleccionarOpciones();
			
			
		}while(seguir);
	}
	
	public boolean seleccionarOpciones()
	{
		boolean continuar = true;
		
		switch (LeerTeclado.leerInt()) {
		case 1:
			
			//en el caso 1 desde aqui se llama a cargarDatos del servicio y devuelve si se ha logrado o no
			boolean devuelto = servicioJuego.cargarDatosFichero();
			
			if(devuelto)
			{
				System.out.println("Se han cargado los juegos coorectamente");
			}
			else
				logger.warn("Se no se han podido cargar los usuarios correctamente");
				
			break;

		case 2:
			
			//en el caso 2 tenemos un formulario para crear un nuevo juego el cual le pasamos al servicio
			
			Juego juego = new Juego();
			Formulario form = new Formulario();
			juego = form.formularioJuego();
			
			boolean devuelto1 = servicioJuego.addJuego(juego);
			
			
			if(devuelto1)
			{
				System.out.println("Se han cargado los juegos correctamente desde el fichero en los datos");
			}
			else
				logger.warn("Se no se han podido cargar los usuarios correctamente desde el fichero en los datos");
			
			break;

		case 3:
			
			//se llama al metodo filtrargenero del servicio y nos devuelve si se ha logrado o no.
			
			boolean devuelto2 = servicioJuego.filtrarGeneroPlataforma();
			
			if(devuelto2)
			{
				System.out.println("Se han filtrado por plataforma de forma correcta");
			}
			else
				logger.warn("Se no se han filtrado por plataforma de forma correcta");
			
			break;
			
		case 0:
			//pulsamos 0 para salir del bucle;
			
			System.out.println("Se ha salido correctamente del programa");
			continuar = false;
			break;
			
		default:
			
			//el caracter introducido no coincide
			System.out.println("El valor introducido no coicide");
			break;
		}
		
		return continuar;
	}
	
}
