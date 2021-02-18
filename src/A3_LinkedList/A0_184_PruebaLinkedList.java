package A3_LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class A0_184_PruebaLinkedList {
	
	public static void main(String[]args) {
		
	LinkedList<String>personas=new LinkedList<String>();
	
	personas.add("Pepe");
	personas.add("Sandra");
	personas.add("Ana");
	personas.add("Laura");
	
	System.out.println(personas.size());
	
	
	//ITERADOR
	ListIterator<String>it = personas.listIterator();
	it.next();
	it.add("Juan");
	
	for(String e : personas) {
		System.out.println(e);
	}
	
	}
}
