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
	
	private static Logger logger = LogManager.getLogger(JuegosImp.class);
	
	@Override
	public boolean cargarDatosFichero() {
		
		String fichero = "res/vgsales.csv";
		String linea;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fichero));
			
			//desechamos la primera linea porque son los nombres de las columnas
			linea = reader.readLine();

			
			while((linea = reader.readLine()) != null) {
				//cargamos los datos de las distintas columnas en este array
				String [] datosCSV = linea.split(",");
				Plataforma plataforma = Plataforma.asignarEnumDesdeString(datosCSV[2]);
				Genero genero = Genero.asignarEnumDesdeString(datosCSV[4]);
				Juego j = new Juego(Integer.parseInt(datosCSV[0]),datosCSV[1],plataforma,Integer.parseInt(datosCSV[3]),genero,new Editor(datosCSV[5]));				
				addJuego(j);
			}
			
		} catch (FileNotFoundException e) {
			logger.error("Fichero CSV no encontrado");
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			logger.error("Excepcion de Entrada/Salida");			
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

	@Override
	public boolean addJuego(Juego juego) {
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
	}
	
	
	@Override
	public boolean filtrarGeneroPlataforma() {
		for (Juego j : juegos.filtrarGeneroPlataforma()) {
			Menu.pintarJuego(j);
		}
		return false;
	}

}
