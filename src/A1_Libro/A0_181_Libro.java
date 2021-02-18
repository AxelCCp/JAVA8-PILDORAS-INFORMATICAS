package A1_Libro;

public class A0_181_Libro {
	public A0_181_Libro(String titulo,String autor,int ISBN) {
		
		this.titulo=titulo;
		this.autor=autor;
		this.ISBN=ISBN;
	}
	
	public String getDatos() {
		return "El título es: " + titulo + ". El autor es: " + autor + ". Y el ISBN es: " + ISBN + ".";
	}
	
	/*
	//SOBREESCRIBIMOS EL MÉTODO EQUALS DE LA CLASE OBJ:
	//EL OBJ QUE LE PASEMOS POR PARÁMETRO, SERÁ UNA INSTANCIA DE LA CLASE LIBRO.
	//OPERADOR INSTANCEOF: NOS PERMITE AVERIGUAR SI UN OBJ ES UNA INSTANCIA DE UNA CLASE EN CONCRETO.
	public boolean equals(Object obj) {
		if(obj instanceof A0_181_Libro) {
			
			//CONVERTIMOS A OBJ EN UN OBJETO DE TIPO LIBRO Y LO ALMACENAMOS EN OTRO. 
			A0_181_Libro otro = (A0_181_Libro)obj;
			
			//HACEMOS LA COMPARACIÓN DE ISBN's ENTRE EL OBJETO ACTUAL Y EL QUE SE PASA POR PARÁMETRO.
			if(this.ISBN==otro.ISBN) {
				return true;
			}else {
				return false;
			}
			
		}else {
			return false;
		}
	}
	*/
	

	private String titulo;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ISBN;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A0_181_Libro other = (A0_181_Libro) obj;
		if (ISBN != other.ISBN)
			return false;
		return true;
	}

	private String autor;
	private int ISBN;
}
