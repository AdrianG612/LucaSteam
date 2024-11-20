package servicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import model.Editor;
import model.Genero;
import model.Juego;
import model.Plataforma;

import datos.Juegos;
import datos.JuegosImp;
import gui.Menu;

public class ServiciosJuegosImp implements ServiciosJuegos{
	
	private Juegos juegos = new JuegosImp();
	
<<<<<<< HEAD
	private static Logger logger = LogManager.getLogger(ServiciosJuegosImp.class);
=======
	private static Logger logger = LogManager.getLogger(JuegosImp.class);
>>>>>>> origin/daniel
	
	@Override
	public boolean cargarDatosFichero() {
		
		String fichero = "res/vgsales.csv";
		String linea;
		String [] datosCSV = null;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fichero));
			
			//desechamos la primera linea porque son los nombres de las columnas
			linea = reader.readLine();
			
			while((linea = reader.readLine()) != null) {
				//cargamos los datos de las distintas columnas en este array
				 datosCSV = linea.split(",");
				Plataforma plataforma = Plataforma.asignarEnumDesdeString(datosCSV[2]);
				Genero genero = Genero.asignarEnumDesdeString(datosCSV[4]);
<<<<<<< HEAD
				if(datosCSV[3].equals("N/A"))
					datosCSV[3]="0";
				Juego j = new Juego(datosCSV[1],plataforma,Integer.parseInt(datosCSV[3]),genero,new Editor(datosCSV[5]));				
=======
				Juego j = new Juego(Integer.parseInt(datosCSV[0]),datosCSV[1],plataforma,Integer.parseInt(datosCSV[3]),genero,new Editor(datosCSV[5]));				
				addJuego(j);
>>>>>>> origin/daniel
			}
			
		} catch (FileNotFoundException e) {
			logger.error("Fichero CSV no encontrado");
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			logger.error("Excepcion de Entrada/Salida");			
			e.printStackTrace();
			return false;
<<<<<<< HEAD
		}catch (NumberFormatException e) {
			System.out.println(datosCSV[1]);
=======
>>>>>>> origin/daniel
		}
		
		return true;
	}

	@Override
	public boolean addJuego(Juego juego) {
<<<<<<< HEAD
		
		//juego vacio
		if (juego == null || juego.getNombre() == null || juego.getNombre().isEmpty()) {
            logger.warn("No se puede añadir un juego nulo o con nombre vacío.");
            return false;
        }
		
		//editor repetido
		if (juego.getEditor() != null && !juegos.editorExiste(juego.getEditor().getNombre())) {
			juegos.addEditor(new Editor(juego.getEditor().getNombre()));
			
			logger.info("Se ha agregado el editor " + juego.getEditor().getNombre() + " a la lista.");
		}
		
		//juego repetido
		if(juegos.juegoExiste(juego)) {
            logger.warn("No se puede añadir un juego que ya existe.");
            return false;
		}
		
		juegos.addJuego(juego);

		logger.info("Se ha agregado el juego " + juego.getNombre() + " a la lista.");
		return true;
		
=======
		if (!juegos.juegoExiste(juego.getNombre())) {
			if (!juegos.editorExiste(juego.getEditor().getNombre())) {
				juegos.addEditor(new Editor(juego.getEditor().getNombre()));
				
				logger.info("Se ha agregado el editor " + juego.getEditor().getNombre() + " a la lista.");
			}
			juegos.addJuego(juego);
			
			logger.info("Se ha agregado el juego " + juego.getNombre() + " a la lista.");
			return true;
		}
		return false;
>>>>>>> origin/daniel
	}
	
	
	@Override
<<<<<<< HEAD
	public boolean filtrarGeneroPlataformas() {
		for (Juego j : juegos.filtrarGenero(Genero.PLATFORM)) {
=======
	public boolean filtrarGeneroPlataforma() {
<<<<<<< HEAD
		for (Juego j : juegos.filtrarGeneroPlataforma()) {
=======
		for (Juego j : juegos.filtrarGenero(Genero.PLATFORM)) {
>>>>>>> origin/daniel
>>>>>>> ad4ac3418fa944c2145b8f78b2259734a2989eaa
			Menu.pintarJuego(j);
		}
		return false;
	}

}
