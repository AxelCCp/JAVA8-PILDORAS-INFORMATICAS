package A4_TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class A1_187_PruebaTreeSetComparator {
	
	public static void main(String[]args) {	
		
		ArticuloZ primero = new ArticuloZ(1,"Primer Art�culo");
		ArticuloZ segundo = new ArticuloZ(2,"Segundo Art�culo");
		ArticuloZ tercero = new ArticuloZ(3,"Tercer Art�culo");
	
		TreeSet<ArticuloZ>ordenaArticulos = new TreeSet<ArticuloZ>();
		ordenaArticulos.add(tercero);
		ordenaArticulos.add(primero);
		ordenaArticulos.add(segundo);
		
		for(ArticuloZ ar : ordenaArticulos) {
			System.out.println(ar.getDescripcion());
		}
		
		
		ArticuloZ comparadorArticulos = new ArticuloZ();
		//CON ESTO CONSEGUIMOS DECIRLE AL PROGRAMA, QUE EN ESTE TREESET, LOS OBJ SE VAN A ALMACENAR ORDENADOS,..
		//..SEG�N LO QUE MARQUE EL OBJ DE TIPO COMPARATOR, comparadorArticulos.
		TreeSet<ArticuloZ>ordenaArticulos2 = new TreeSet<ArticuloZ>(comparadorArticulos);
		ordenaArticulos2.add(primero);
		ordenaArticulos2.add(segundo);
		ordenaArticulos2.add(tercero);
		for(ArticuloZ ar :  ordenaArticulos2) {
			System.out.println(ar.getDescripcion());
		}
	}
}



//UNA CLASE PUEDE IMPLEMENTAR M�S DE UNA INTERFAZ
//IMPLEMENTA LA INTERFAZ COMPARABLE Y ESTA INTERFAZ ADMITE UN GENERICO POR PAR�METRO. 
//EN ESTE CASO ES <ART�CULO>
class ArticuloZ implements Comparable<ArticuloZ>, Comparator<ArticuloZ>{
	
	//CONSTRUCTOR CON 2 PAR�METROS:
	public ArticuloZ(int num,String desc) {
		numeroArticulo=num;
		descripcion=desc;
	}
	
	
	//CONSTRUCTOR POR DEFECTO,..
	//..PARA PODER USAR EL OBJ COMPARATOR EN LA CLASE PRINCIPAL
	public ArticuloZ() {
		
	}
	
	
	//METODO DE LA INTERFAZ COMPARABLE:
	//DEVUELVE: -1,0,1 ,,, DEPENDIENDO DE SI EL OBJ VA ANTES, SI SON IGUALES, O VA DESPU�S. 
	//COMPARA UN OBJETO CON OTRO.
	//COMPARA EL N� DE UN ARTICULO CON EL QUE LE LLEGUE POR PAR�METRO.
	//POR LO TANTO ORDENA EN FUNCI�N DEL N�MERO DE ARTICULO. 
	public int compareTo(ArticuloZ otro) {
		return numeroArticulo - otro.numeroArticulo;
	}
	
	
	//M�TODO QUE ENTREGA UNA DESCRIPCI�N DEL OBJ
	public String getDescripcion() {
		return descripcion;
	}
	
	
	//M�TODO DE LA INTERFAZ COMPARATOR
	//HACE UNA COMPARACI�N EN BASE A LA DESCRIPCI�N.
	public int compare(ArticuloZ arg0, ArticuloZ arg1) {
		String descripcionA = arg0.getDescripcion();
		String descripcionB = arg1.getDescripcion();
		return descripcionA.compareTo(descripcionB);
	
	}
	
	
	//CAMPOS DE CLASE
	private int numeroArticulo;
	private String descripcion;
	
}
