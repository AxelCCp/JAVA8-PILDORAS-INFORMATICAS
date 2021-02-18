package A4_TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class A1_187_PruebaTreeSetComparator {
	
	public static void main(String[]args) {	
		
		ArticuloZ primero = new ArticuloZ(1,"Primer Artículo");
		ArticuloZ segundo = new ArticuloZ(2,"Segundo Artículo");
		ArticuloZ tercero = new ArticuloZ(3,"Tercer Artículo");
	
		TreeSet<ArticuloZ>ordenaArticulos = new TreeSet<ArticuloZ>();
		ordenaArticulos.add(tercero);
		ordenaArticulos.add(primero);
		ordenaArticulos.add(segundo);
		
		for(ArticuloZ ar : ordenaArticulos) {
			System.out.println(ar.getDescripcion());
		}
		
		
		ArticuloZ comparadorArticulos = new ArticuloZ();
		//CON ESTO CONSEGUIMOS DECIRLE AL PROGRAMA, QUE EN ESTE TREESET, LOS OBJ SE VAN A ALMACENAR ORDENADOS,..
		//..SEGÚN LO QUE MARQUE EL OBJ DE TIPO COMPARATOR, comparadorArticulos.
		TreeSet<ArticuloZ>ordenaArticulos2 = new TreeSet<ArticuloZ>(comparadorArticulos);
		ordenaArticulos2.add(primero);
		ordenaArticulos2.add(segundo);
		ordenaArticulos2.add(tercero);
		for(ArticuloZ ar :  ordenaArticulos2) {
			System.out.println(ar.getDescripcion());
		}
	}
}



//UNA CLASE PUEDE IMPLEMENTAR MÁS DE UNA INTERFAZ
//IMPLEMENTA LA INTERFAZ COMPARABLE Y ESTA INTERFAZ ADMITE UN GENERICO POR PARÁMETRO. 
//EN ESTE CASO ES <ARTÍCULO>
class ArticuloZ implements Comparable<ArticuloZ>, Comparator<ArticuloZ>{
	
	//CONSTRUCTOR CON 2 PARÁMETROS:
	public ArticuloZ(int num,String desc) {
		numeroArticulo=num;
		descripcion=desc;
	}
	
	
	//CONSTRUCTOR POR DEFECTO,..
	//..PARA PODER USAR EL OBJ COMPARATOR EN LA CLASE PRINCIPAL
	public ArticuloZ() {
		
	}
	
	
	//METODO DE LA INTERFAZ COMPARABLE:
	//DEVUELVE: -1,0,1 ,,, DEPENDIENDO DE SI EL OBJ VA ANTES, SI SON IGUALES, O VA DESPUÉS. 
	//COMPARA UN OBJETO CON OTRO.
	//COMPARA EL N° DE UN ARTICULO CON EL QUE LE LLEGUE POR PARÁMETRO.
	//POR LO TANTO ORDENA EN FUNCIÓN DEL NÚMERO DE ARTICULO. 
	public int compareTo(ArticuloZ otro) {
		return numeroArticulo - otro.numeroArticulo;
	}
	
	
	//MÉTODO QUE ENTREGA UNA DESCRIPCIÓN DEL OBJ
	public String getDescripcion() {
		return descripcion;
	}
	
	
	//MÉTODO DE LA INTERFAZ COMPARATOR
	//HACE UNA COMPARACIÓN EN BASE A LA DESCRIPCIÓN.
	public int compare(ArticuloZ arg0, ArticuloZ arg1) {
		String descripcionA = arg0.getDescripcion();
		String descripcionB = arg1.getDescripcion();
		return descripcionA.compareTo(descripcionB);
	
	}
	
	
	//CAMPOS DE CLASE
	private int numeroArticulo;
	private String descripcion;
	
}
