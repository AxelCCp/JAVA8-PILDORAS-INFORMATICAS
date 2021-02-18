package A4_TreeSet;

import java.util.TreeSet;

public class A0_186_PruebaTreeSet {
	public static void main(String[]args) {
		
		/*
		TreeSet<String>ordenaPersonas=new TreeSet<String>();
		ordenaPersonas.add("Sandra");
		ordenaPersonas.add("Amanda");
		ordenaPersonas.add("Diana");
		for(String e : ordenaPersonas) {
			//TREESET LOS ORDENA ALFABÉTICAMENTE PQ IMPLEMENTA LA INTERFAZ COMPARABLE.
			System.out.println(e);}
			*/
	
		
		Articulo primero = new Articulo(1,"Primer Artículo");
		Articulo segundo = new Articulo(2,"Segundo Artículo");
		Articulo tercero = new Articulo(3,"Tercer Artículo");
	
		TreeSet<Articulo>ordenaArticulos = new TreeSet<Articulo>();
		ordenaArticulos.add(tercero);
		ordenaArticulos.add(primero);
		ordenaArticulos.add(segundo);
		
		for(Articulo ar : ordenaArticulos) {
			System.out.println(ar.getDescripcion());
		}
	}
}


//IMPLEMENTA LA INTERFAZ COMPARABLE Y ESTA INTERFAZ ADMITE UN GENERICO POR PARÁMETRO. 
//EN ESTE CASO ES <ARTÍCULO>
class Articulo implements Comparable<Articulo>{
	
	//CONSTRUCTOR
	public Articulo(int num,String desc) {
		numeroArticulo=num;
		descripcion=desc;
	}
	
	
	//METODO DE LA INTERFAZ
	//DEVUELVE: -1,0,1 ,,, DEPENDIENDO DE SI EL OBJ VA ANTES, SI SON IGUALES, O VA DESPUÉS. 
	//COMPARA UN OBJETO CON OTRO.
	//COMPARA EL N° DE UN ARTICULO CON EL QUE LE LLEGUE POR PARÁMETRO.
	//POR LO TANTO ORDENA EN FUNCIÓN DEL NÚMERO DE ARTICULO. 
	public int compareTo(Articulo otro) {
		return numeroArticulo - otro.numeroArticulo;
	}
	
	
	//MÉTODO QUE ENTREGA UNA DESCRIPCIÓN DEL OBJ
	public String getDescripcion() {
		return descripcion;
	}
	
	
	//CAMPOS DE CLASE
	private int numeroArticulo;
	private String descripcion;
}
