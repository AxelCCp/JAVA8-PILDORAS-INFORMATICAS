package A2_ListaHashSetClientesBancoIterator;

import java.util.HashSet;
import java.util.Iterator;

public class A1_183_CuentasUsuarios {
public static void main(String[]args){
		
		A0_183_Cliente cl1 = new A0_183_Cliente("Antonio Banderas", "00001", 200000);
		A0_183_Cliente cl2 = new A0_183_Cliente("Rafael Nadal","00002", 250000);
		A0_183_Cliente cl3 = new A0_183_Cliente("Penélope Cruz", "00003", 300000);
		A0_183_Cliente cl4 = new A0_183_Cliente("Julio Iglesias", "00004", 500000);
		A0_183_Cliente cl5 = new A0_183_Cliente("Antonio Banderas", "00001", 200000);
		
		
		//USAMOS LA CLASE HASHSET       
		//HASHSET<GENERICO>NOMBRECOLECCION = NEW HASHSET<GENERICO>(); 
		HashSet <A0_183_Cliente> clientesBanco = new HashSet <A0_183_Cliente> ();
		
		clientesBanco.add(cl1);
		clientesBanco.add(cl2);
		clientesBanco.add(cl3);
		clientesBanco.add(cl4);
		clientesBanco.add(cl5);
		
		
		//USAMOS UN ITERATOR PARA ELIMINAR OBJ's DE LA LISTA
		Iterator<A0_183_Cliente> it = clientesBanco.iterator();
		while(it.hasNext()) {
			String nombreCliente = it.next().getNombre();
			if(nombreCliente.equals("Julio Iglesias")) {
				it.remove();
			}
		}
		
		
		
		
		//RECORRE TODOS LOS OBJ's DE TIPO A0_180_Cliente QUE ESTÁN DENTRO DE LA COLECCION CLIENTESBANCO
		for (A0_183_Cliente cliente : clientesBanco) {
			
			System.out.println(" ***NOMBRE: "+ cliente.getNombre() 
							 + " ***CUENTA: " + cliente.getNCuenta()
							 + " ***SALDO: " + cliente.getSaldo());
		}
		
		
		//CONSTRUCCIÓN DE ITERADOR PARA RECORRER NOMBRES DE LA LISTA
		//it es igual a lo que devuelva la coleccion clientesBanco, con el met. iterator();
		/*Iterator <A0_183_Cliente> it = clientesBanco.iterator();	
		
		while(it.hasNext()) {
			//ESTA VARIABLE ES IGUAL A LO QUE EL ITERADOR EXAMINE EN EL 1ER OBJ. OBJ's DE TIPO CLIENTE
			String nombreCliente=it.next().getNombre();
			System.out.println(nombreCliente);
		}
		*/	
	}
}
