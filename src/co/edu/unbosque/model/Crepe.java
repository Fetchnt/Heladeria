package co.edu.unbosque.model;

public class Crepe extends Producto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4877126570275282649L;

	private String tipoDeCrepe; // dulce o salado
	private String salsa; // ahi miramos

	public Crepe() {
		super();
	}

	public Crepe(String tipoDeCrepe, String salsa) {
		super();
		this.tipoDeCrepe = tipoDeCrepe;
		this.salsa = salsa;
	}

	public Crepe(String nombreProducto, int cantidadProducto, int precioProducto, String tipoDeCrepe, String salsa) {
		super(nombreProducto, cantidadProducto, precioProducto);
		this.tipoDeCrepe = tipoDeCrepe;
		this.salsa = salsa;
	}

	public Crepe(String nombreProducto, int cantidadProducto, int precioProducto) {
		super(nombreProducto, cantidadProducto, precioProducto);
		// TODO Auto-generated constructor stub
	}

	public String getTipoDeCrepe() {
		return tipoDeCrepe;
	}

	public void setTipoDeCrepe(String tipoDeCrepe) {
		this.tipoDeCrepe = tipoDeCrepe;
	}

	public String getSalsa() {
		return salsa;
	}

	public void setSalsa(String salsa) {
		this.salsa = salsa;
	}

	@Override
	public String toString() {
		return super.toString() + "\n - Tipo de crepe: " + tipoDeCrepe + "\n Salsa: " + salsa + "\n======================================";
	}

	
	
	
}
