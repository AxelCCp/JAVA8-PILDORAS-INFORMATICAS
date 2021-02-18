package A5_Mapas;

import java.util.HashMap;
import java.util.Map;

public class A0_PruebaMapas {
	public static void main(String[]args) {
		
		//CONSTRUIMOS UN MAPA:
		//ARGUMENTOS<CLAVE,VALOR>
		HashMap<String,Empleado>personal = new HashMap<String,Empleado>();
		
		personal.put("434", new Empleado("Juan"));
		personal.put("765", new Empleado("Penelope"));
		personal.put("576", new Empleado("Catalina"));
		personal.put("412", new Empleado("Francisca"));
		
		//IMPRIME LISTA
		System.out.println(personal);
		System.out.println("");
		
		//REMUEVE UN EMPLEADO E IMPRIME LISTA
		personal.remove("434");
		System.out.println(personal);
		System.out.println("");
		
		//CAMBIA A UN EMPLEADO POR OTRO
		personal.put("576", new Empleado("Antonio"));
		System.out.println(personal);
		System.out.println("");
		
		//IMPRIME UNA COLECCION DE TIPO SET
		System.out.println(personal.entrySet());
		System.out.println("");
		
		
		//BUCLE for-each PARA RECORRER LOS ELEMENTOS DE LA COLECCION Y.. 
		//..QUE NOS DEVUELVA LOS ELEMENTOS EN FORMA DE SET 
		//personal.entrySet() = NOS DEVUELVE LO QUE HAY ALMACENADO DENTRO DE LA COLECCION EN FORMA DE SET.
		//e = LO QUE DEVUELVE EntrySet() se almacena en "e". 
		//Map.Entry = es una interfaz interna de Map.
		//getKey() = método de Map.Entry.
		//getValue() = método de Map.Entry. 
		for(Map.Entry<String,Empleado> e : personal.entrySet()) {
			String clave = e.getKey();
			Empleado valor = e.getValue();
			System.out.println("Clave: " + clave + " *** " + "Valor: " + valor);
		}	
	}
}


class Empleado{
	public Empleado(String n) {
		nombre = n;
		sueldo = 2000;	
	}
	
	public String toString() {
		return "\n[Nombre = " + nombre + " *** Sueldo = " + sueldo + "]\n";
	}
	
	private String nombre;
	private double sueldo;
}
