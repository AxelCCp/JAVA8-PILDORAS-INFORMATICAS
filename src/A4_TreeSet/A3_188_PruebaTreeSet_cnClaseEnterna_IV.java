package A4_TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class A3_188_PruebaTreeSet_cnClaseEnterna_IV {
	public static void main(String[]args) {	
		
		ArticuloV primero = new ArticuloV(1,"Primer Artículo");
		ArticuloV segundo = new ArticuloV(2,"Segundo Artículo");
		ArticuloV tercero = new ArticuloV(3,"Tercer Artículo");
	
		TreeSet<ArticuloV>ordenaArticulos = new TreeSet<ArticuloV>();
		ordenaArticulos.add(tercero);
		ordenaArticulos.add(primero);
		ordenaArticulos.add(segundo);
		
		for(ArticuloV ar : ordenaArticulos) {
			System.out.println(ar.getDescripcion());
		}
		
		
		
		// CLASE INTERNA ANÓNIMA QUE IMPLEMENTA LA INTERFAZ COMPARATOR
		TreeSet<ArticuloV>ordenaArticulos2 = new TreeSet<ArticuloV>(new Comparator<ArticuloV>() {
			@Override
			public int compare(ArticuloV o1, ArticuloV o2) {
				String desc1 = o1.getDescripcion();
				String desc2 = o2.getDescripcion();
				return desc1.compareTo(desc2);
			}
		});
		
		ordenaArticulos2.add(primero);
		ordenaArticulos2.add(segundo);
		ordenaArticulos2.add(tercero);
		for(ArticuloV ar :  ordenaArticulos2) {
			System.out.println(ar.getDescripcion()); 
		}
	}	
}


//UNA CLASE PUEDE IMPLEMENTAR MÁS DE UNA INTERFAZ
//IMPLEMENTA LA INTERFAZ COMPARABLE Y ESTA INTERFAZ ADMITE UN GENERICO POR PARÁMETRO. 
//EN ESTE CASO ES <ARTÍCULO>
class ArticuloV implements Comparable<ArticuloV>{
	
	//CONSTRUCTOR CON 2 PARÁMETROS:
	public ArticuloV(int num,String desc) {
		numeroArticulo=num;
		descripcion=desc;
	}
	
	
	
	//METODO DE LA INTERFAZ COMPARABLE:
	//DEVUELVE: -1,0,1 ,,, DEPENDIENDO DE SI EL OBJ VA ANTES, SI SON IGUALES, O VA DESPUÉS. 
	//COMPARA UN OBJETO CON OTRO.
	//COMPARA EL N° DE UN ARTICULO CON EL QUE LE LLEGUE POR PARÁMETRO.
	//POR LO TANTO ORDENA EN FUNCIÓN DEL NÚMERO DE ARTICULO. 
	public int compareTo(ArticuloV otro) {
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





