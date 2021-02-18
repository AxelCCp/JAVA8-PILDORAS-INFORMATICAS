package A0_ListaHashSetClientesBanco;

import java.util.HashSet;

public class A1_180_CuentasUsuarios {
	public static void main(String[]args){
		
		A0_180_Cliente cl1 = new A0_180_Cliente("Antonio Banderas", "00001", 200000);
		A0_180_Cliente cl2 = new A0_180_Cliente("Rafael Nadal","00002", 250000);
		A0_180_Cliente cl3 = new A0_180_Cliente("Penélope Cruz", "00003", 300000);
		A0_180_Cliente cl4 = new A0_180_Cliente("Julio Iglesias", "00004", 500000);
		A0_180_Cliente cl5 = new A0_180_Cliente("Antonio Banderas", "00001", 200000);
		
		
		//USAMOS LA CLASE HASHSET       
		//HASHSET<GENERICO>NOMBRECOLECCION = NEW HASHSET<GENERICO>(); 
		HashSet <A0_180_Cliente> clientesBanco = new HashSet <A0_180_Cliente> ();
		
		clientesBanco.add(cl1);
		clientesBanco.add(cl2);
		clientesBanco.add(cl3);
		clientesBanco.add(cl4);
		clientesBanco.add(cl5);
		
		//RECORRE TODOS LOS OBJ's DE TIPO A0_180_Cliente QUE ESTÁN DENTRO DE LA COLECCION CLIENTESBANCO
		for (A0_180_Cliente cliente : clientesBanco) {
			
			System.out.println(" ***NOMBRE: "+ cliente.getNombre() 
							 + " ***CUENTA: " + cliente.getNCuenta()
							 + " ***SALDO: " + cliente.getSaldo());
		}
		
	}
}
