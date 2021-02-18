package A3_LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class A1_185_PruebaListaEnlazada {
	public static void main(String[]args) {
	
		LinkedList<String>paises=new LinkedList<String>();
		paises.add("España");
		paises.add("Colombia");
		paises.add("México");
		paises.add("Perú");
		
		LinkedList<String>capitales=new LinkedList<String>();
		capitales.add("madrid");
		capitales.add("Bogotá");
		capitales.add("DF");
		capitales.add("Lima");
		
		//System.out.println(paises);
		//System.out.println(capitales);
		
		ListIterator<String>iterA = paises.listIterator();
		ListIterator<String>iterB = capitales.listIterator();
		
		//JUNTAMOS AMBAS LISTAS
		while(iterB.hasNext()) {
			if(iterA.hasNext()) {
				iterA.next();
			}
			iterA.add(iterB.next());
		}
		System.out.println(paises);
		
		//ELIMINAR LAS POSICIONES PARES
		//LO MANDAMOS DE VUELTA AL PRINCIPIO DE LA LISTA
		iterB=capitales.listIterator();
		while(iterB.hasNext()) {
			iterB.next();
			if(iterB.hasNext()) {
				iterB.next();
				iterB.remove();
			}
		}
		System.out.println(capitales);
		
		//ELIMINAMOS LAS CAPITALES DE LA LISTA DE PAISES
		paises.removeAll(capitales);
		System.out.println(paises);
	}
	
}
