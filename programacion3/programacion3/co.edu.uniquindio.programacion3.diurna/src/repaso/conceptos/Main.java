package repaso.conceptos;

import repaso.conceptos.model.Avion;
import repaso.conceptos.model.Carro;

public class Main {

	public static void main(String[] args) {
		repasoHerencia();
	}

	private static void repasoHerencia() {
		Carro carro = new Carro();
		carro.setNombre("Mi carro");
		System.out.println(carro.getNombre());
		carro.encenderVehiculo();
		
		Avion avion = new Avion();
		avion.setNombre("Mi avion");
		System.out.println(avion.getNombre());
		avion.encenderVehiculo();

	}

	
	
//	Vehiculo vehiculo = new Vehiculo();
//	vehiculo.setNombre("Avion");
//	
//	
//	Vehiculo vehiculo2 = new Vehiculo();
//	vehiculo2.setNombre("Carro");
//	
//	
//	if(vehiculo.getNombre().contentEquals("Avion"))
//		System.out.println("Es un avion");
//	
//	if(vehiculo2.getNombre().contentEquals("Avion"))
//		System.out.println("Es un avion");
	
}
