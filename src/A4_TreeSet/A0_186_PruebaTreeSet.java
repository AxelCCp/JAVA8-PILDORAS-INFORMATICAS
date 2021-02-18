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
			//TREESET LOS ORDENA ALFAB�TICAMENTE PQ IMPLEMENTA LA INTERFAZ COMPARABLE.
			System.out.println(e);}
			*/
	
		
		Articulo primero = new Articulo(1,"Primer Art�culo");
		Articulo segundo = new Articulo(2,"Segundo Art�culo");
		Articulo tercero = new Articulo(3,"Tercer Art�culo");
	
		TreeSet<Articulo>ordenaArticulos = new TreeSet<Articulo>();
		ordenaArticulos.add(tercero);
		ordenaArticulos.add(primero);
		ordenaArticulos.add(segundo);
		
		for(Articulo ar : ordenaArticulos) {
			System.out.println(ar.getDescripcion());
		}
	}
}


//IMPLEMENTA LA INTERFAZ COMPARABLE Y ESTA INTERFAZ ADMITE UN GENERICO POR PAR�METRO. 
//EN ESTE CASO ES <ART�CULO>
class Articulo implements Comparable<Articulo>{
	
	//CONSTRUCTOR
	public Articulo(int num,String desc) {
		numeroArticulo=num;
		descripcion=desc;
	}
	
	
	//METODO DE LA INTERFAZ
	//DEVUELVE: -1,0,1 ,,, DEPENDIENDO DE SI EL OBJ VA ANTES, SI SON IGUALES, O VA DESPU�S. 
	//COMPARA UN OBJETO CON OTRO.
	//COMPARA EL N� DE UN ARTICULO CON EL QUE LE LLEGUE POR PAR�METRO.
	//POR LO TANTO ORDENA EN FUNCI�N DEL N�MERO DE ARTICULO. 
	public int compareTo(Articulo otro) {
		return numeroArticulo - otro.numeroArticulo;
	}
	
	
	//M�TODO QUE ENTREGA UNA DESCRIPCI�N DEL OBJ
	public String getDescripcion() {
		return descripcion;
	}
	
	
	//CAMPOS DE CLASE
	private int numeroArticulo;
	private String descripcion;
}
