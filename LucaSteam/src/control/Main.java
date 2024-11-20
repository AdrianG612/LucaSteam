package control;

import servicios.ServiciosJuegosImp;

public class Main {

	public static void main(String[] args) {

		ServiciosJuegosImp s = new ServiciosJuegosImp();
		s.cargarDatosFichero();
	}

}
