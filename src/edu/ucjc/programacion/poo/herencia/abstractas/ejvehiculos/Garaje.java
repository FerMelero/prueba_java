package edu.ucjc.programacion.poo.herencia.abstractas.ejvehiculos;

public class Garaje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coche coche1 = new Coche("Ford", "Mustang", 2005, "3852 DHZ", 2, "Gasolina");

		Coche coche2 = new Coche("Mazda", "3", 2014, "8739 HYD", 2, "Diesel");

		CocheElectrico coche3 = new CocheElectrico("Tesla", "Model S Long Range", 2020, "4387 LYZ", 5, "Eléctrico",
				120);

		Bicicleta bici1 = new Bicicleta("Orbea", "Urban", 2021, 6);
		Bicicleta bici2 = new Bicicleta("RockRider", "St100", 6);

		Moto moto1 = new Moto("Honda", "CBR", 2006, "5739 DYL", 600);
		SideCar sd1 = new SideCar("BMW", "R1100", 1990, "M1653LP", 1100, 40);

		Vehiculo[] vehiculos = { coche1, coche2, coche3, bici1, bici2, moto1, sd1 };

		aparcar(vehiculos);

	}

	public static void aparcar(Vehiculo[] vehiculos) {

	    int plazasCoche = 2;
	    int plazasMoto = 2;
	    int plazasBici = 2;

	    boolean sideCarAparcado = false; // Variable para controlar si se ha aparcado un SideCar

	    for (Vehiculo vehiculo : vehiculos) {

	        if (vehiculo instanceof Coche) {

	            if (plazasCoche > 0) {
	                plazasCoche--;
	                System.out.println(
	                        "El " + vehiculo.getMarca() + " " + vehiculo.getModelo() + " ha sido aparcado exitosamente");
	            } else {
	                System.out.println(
	                        "No hay plazas disponibles para aparcar el " + vehiculo.getMarca() + " " + vehiculo.getModelo());
	            }

	        }

	        if (vehiculo instanceof SideCar) {
	            if (((SideCar) vehiculo).getTamaño() > 100) {
	                System.out.println("No se pudo aparcar la " + vehiculo.getMarca() + " " + vehiculo.getModelo());

	            } else {
	                if (!sideCarAparcado && plazasMoto > 0) { // Verificar si ya se ha aparcado un SideCar
	                    plazasMoto--;
	                    System.out.println(
	                            "La " + vehiculo.getMarca() + " " + vehiculo.getModelo() + " ha sido aparcada exitosamente");
	                    sideCarAparcado = true; // Actualizar la variable para indicar que se ha aparcado un SideCar
	                } else {
	                    System.out.println("No se pudo aparcar la " + vehiculo.getMarca() + " " + vehiculo.getModelo());
	                }
	            }
	        }

	        if (vehiculo instanceof Moto && !(vehiculo instanceof SideCar)) { // Asegurarse de que no sea un SideCar
	            if (plazasMoto > 0) {
	                plazasMoto--;
	                System.out.println(
	                        "La " + vehiculo.getMarca() + " " + vehiculo.getModelo() + " ha sido aparcada exitosamente");
	            } else {
	                System.out.println("No se pudo aparcar la " + vehiculo.getMarca() + " " + vehiculo.getModelo());
	            }
	        }

	        if (vehiculo instanceof Bicicleta) {
	            if (plazasBici > 0) {
	                plazasBici--;
	                System.out.println(
	                        "La " + vehiculo.getMarca() + " " + vehiculo.getModelo() + " ha sido aparcada exitosamente");
	                
	                
	                ((Bicicleta) vehiculo).inflarRuedas();
	                System.out.println("Ruedas infladas");
	            } else {

	                System.out.println("No se pudo aparcar la " + vehiculo.getMarca() + " " + vehiculo.getModelo());

	            }
	        }

	    }

	}

}
