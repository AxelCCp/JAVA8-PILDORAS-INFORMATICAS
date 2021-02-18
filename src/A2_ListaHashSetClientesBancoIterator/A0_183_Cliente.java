package A2_ListaHashSetClientesBancoIterator;

public class A0_183_Cliente {
	
	private String nombre;
	private String NCuenta;
	private double saldo;
	
	public A0_183_Cliente (String nombre, String NCuenta, double saldo) {
		
		this.nombre=nombre;
		this.NCuenta=NCuenta;
		this.saldo=saldo;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNCuenta() {
		return NCuenta;
	}

	public void setNCuenta(String nCuenta) {
		NCuenta = nCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((NCuenta == null) ? 0 : NCuenta.hashCode());
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
		A0_183_Cliente other = (A0_183_Cliente) obj;
		if (NCuenta == null) {
			if (other.NCuenta != null)
				return false;
		} else if (!NCuenta.equals(other.NCuenta))
			return false;
		return true;
	}
	
	
}

	
