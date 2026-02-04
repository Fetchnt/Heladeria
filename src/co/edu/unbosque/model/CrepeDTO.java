package co.edu.unbosque.model;

public class CrepeDTO extends Producto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3808053802987068180L;

	private String tipoDeCrepe; // dulce o salado
	private String salsa; // ahi miramos

	public CrepeDTO() {
		super();
	}

	public CrepeDTO(String tipoDeCrepe, String salsa) {
		super();
		this.tipoDeCrepe = tipoDeCrepe;
		this.salsa = salsa;
	}

	public CrepeDTO(String nombreProducto, int cantidadProducto, int precioProducto, String tipoDeCrepe, String salsa) {
		super(nombreProducto, cantidadProducto, precioProducto);
		this.tipoDeCrepe = tipoDeCrepe;
		this.salsa = salsa;
	}

	public CrepeDTO(String nombreProducto, int cantidadProducto, int precioProducto) {
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
