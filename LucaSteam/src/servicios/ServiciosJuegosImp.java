package servicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import model.Editor;
import model.Genero;
import model.Juego;
import model.Plataforma;

public class ServiciosJuegosImp implements ServiciosJuegos{

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
				//(int rango, String nombre, Plataforma plataforma, int anyo, Genero genero, Editor editor)
				Juego j = new Juego(Integer.parseInt(datosCSV[0]),datosCSV[1],plataforma,Integer.parseInt(datosCSV[3]),genero,new Editor(datosCSV[5]));
				System.out.println(j);
				
			//	addJuego(j);
			}
			
		} catch (FileNotFoundException e) {
			//log
			e.printStackTrace();
		} catch (IOException e) {
			//log
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean addJuego() {
		
		return false;
	}
	
	
	
	
	
	
		
		
		
	
	
	

}
