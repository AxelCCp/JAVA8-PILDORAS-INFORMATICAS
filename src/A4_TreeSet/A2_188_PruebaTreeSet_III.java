package A4_TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class A2_188_PruebaTreeSet_III {

	public static void main(String[]args) {	
		
		ArticuloY primero = new ArticuloY(1,"Primer Artículo");
		ArticuloY segundo = new ArticuloY(2,"Segundo Artículo");
		ArticuloY tercero = new ArticuloY(3,"Tercer Artículo");
	
		TreeSet<ArticuloY>ordenaArticulos = new TreeSet<ArticuloY>();
		ordenaArticulos.add(tercero);
		ordenaArticulos.add(primero);
		ordenaArticulos.add(segundo);
		
		for(ArticuloY ar : ordenaArticulos) {
			System.out.println(ar.getDescripcion());
		}
		
		
		
		ComparadorArticulos comparaArt = new ComparadorArticulos();
		TreeSet<ArticuloY>ordenaArticulos2 = new TreeSet<ArticuloY>(comparaArt);
		
		ordenaArticulos2.add(primero);
		ordenaArticulos2.add(segundo);
		ordenaArticulos2.add(tercero);
		for(ArticuloY ar :  ordenaArticulos2) {
			System.out.println(ar.getDescripcion());
		}
	}	
}


//UNA CLASE PUEDE IMPLEMENTAR MÁS DE UNA INTERFAZ
//IMPLEMENTA LA INTERFAZ COMPARABLE Y ESTA INTERFAZ ADMITE UN GENERICO POR PARÁMETRO. 
//EN ESTE CASO ES <ARTÍCULO>
class ArticuloY implements Comparable<ArticuloY>{
	
	//CONSTRUCTOR CON 2 PARÁMETROS:
	public ArticuloY(int num,String desc) {
		numeroArticulo=num;
		descripcion=desc;
	}
	
	
	
	//METODO DE LA INTERFAZ COMPARABLE:
	//DEVUELVE: -1,0,1 ,,, DEPENDIENDO DE SI EL OBJ VA ANTES, SI SON IGUALES, O VA DESPUÉS. 
	//COMPARA UN OBJETO CON OTRO.
	//COMPARA EL N° DE UN ARTICULO CON EL QUE LE LLEGUE POR PARÁMETRO.
	//POR LO TANTO ORDENA EN FUNCIÓN DEL NÚMERO DE ARTICULO. 
	public int compareTo(ArticuloY otro) {
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


//ESTA CLASE IMPLEMENTA LA INTERFAZ COMPARATOR Y RECIBIRÁ OBJ's DE TIPO ARTICULOY 
class ComparadorArticulos implements Comparator<ArticuloY>{

	@Override
	public int compare(ArticuloY o1, ArticuloY o2) {
		String desc1 = o1.getDescripcion();
		String desc2 = o2.getDescripcion();
		return desc1.compareTo(desc2);
	}
	
}

