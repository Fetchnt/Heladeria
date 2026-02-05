package co.edu.unbosque.model;

public class Waffle extends Producto {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3544920024446685144L;

	private String tipoDeWaffle; // dulce o salado
	// private String salsa; // con un int se seleccionan las salsas

	public Waffle() {
		super();
	}

	public Waffle(String tipoDeWaffle, String salsa) {
		super();
		this.tipoDeWaffle = tipoDeWaffle;
	//	this.salsa = salsa;
	}

	public Waffle(String nombreProducto, int cantidadProducto, int precioProducto, String tipoDeWaffle, String salsa) {
		super(nombreProducto, cantidadProducto, precioProducto);
		this.tipoDeWaffle = tipoDeWaffle;
	//	this.salsa = salsa;
	}

	public Waffle(String nombreProducto, int cantidadProducto, int precioProducto) {
		super(nombreProducto, cantidadProducto, precioProducto);
		// TODO Auto-generated constructor stub
	}
	

	public String getTipoDeWaffle() {
		return tipoDeWaffle;
	}

	public void setTipoDeWaffle(String tipoDeWaffle) {
		this.tipoDeWaffle = tipoDeWaffle;
	}

	@Override
	public String toString() {
		return super.toString() +  "\n - Tipo de waffle: " + tipoDeWaffle /*+ "\n - Salsa Deseada: "*/ + "\n======================================";
	}

}
