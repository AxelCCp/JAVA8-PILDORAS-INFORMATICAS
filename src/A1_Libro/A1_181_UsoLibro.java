package A1_Libro;

public class A1_181_UsoLibro {
	public static void main(String[]args) {
		
		
		A0_181_Libro libro1 = new A0_181_Libro("P en Java","Juan",25);
		A0_181_Libro libro2 = new A0_181_Libro("P en Java","Juan",25);
		
		if(libro1.equals(libro2)) {
			System.out.println("Es el mismo libro");
			System.out.println(libro1.hashCode());
			System.out.println(libro2.hashCode());
		}else {
			System.out.println("No es el mismo libro");
			System.out.println(libro1.hashCode());
			System.out.println(libro2.hashCode());
		}
	}
}
