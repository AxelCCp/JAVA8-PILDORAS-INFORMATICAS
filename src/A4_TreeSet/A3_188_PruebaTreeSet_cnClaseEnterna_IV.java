package A4_TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class A3_188_PruebaTreeSet_cnClaseEnterna_IV {
	public static void main(String[]args) {	
		
		ArticuloV primero = new ArticuloV(1,"Primer Art�culo");
		ArticuloV segundo = new ArticuloV(2,"Segundo Art�culo");
		ArticuloV tercero = new ArticuloV(3,"Tercer Art�culo");
	
		TreeSet<ArticuloV>ordenaArticulos = new TreeSet<ArticuloV>();
		ordenaArticulos.add(tercero);
		ordenaArticulos.add(primero);
		ordenaArticulos.add(segundo);
		
		for(ArticuloV ar : ordenaArticulos) {
			System.out.println(ar.getDescripcion());
		}
		
		
		
		// CLASE INTERNA AN�NIMA QUE IMPLEMENTA LA INTERFAZ COMPARATOR
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


//UNA CLASE PUEDE IMPLEMENTAR M�S DE UNA INTERFAZ
//IMPLEMENTA LA INTERFAZ COMPARABLE Y ESTA INTERFAZ ADMITE UN GENERICO POR PAR�METRO. 
//EN ESTE CASO ES <ART�CULO>
class ArticuloV implements Comparable<ArticuloV>{
	
	//CONSTRUCTOR CON 2 PAR�METROS:
	public ArticuloV(int num,String desc) {
		numeroArticulo=num;
		descripcion=desc;
	}
	
	
	
	//METODO DE LA INTERFAZ COMPARABLE:
	//DEVUELVE: -1,0,1 ,,, DEPENDIENDO DE SI EL OBJ VA ANTES, SI SON IGUALES, O VA DESPU�S. 
	//COMPARA UN OBJETO CON OTRO.
	//COMPARA EL N� DE UN ARTICULO CON EL QUE LE LLEGUE POR PAR�METRO.
	//POR LO TANTO ORDENA EN FUNCI�N DEL N�MERO DE ARTICULO. 
	public int compareTo(ArticuloV otro) {
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





