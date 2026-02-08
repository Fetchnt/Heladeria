package co.edu.unbosque.model;

import java.util.Properties;

public class Waffle extends Producto {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3544920024446685144L;

	private String tipoDeWaffle; // dulce o salado
	// private String salsa; // con un int se seleccionan las salsas

	private Properties prop;

	public Waffle() {
		super();
	}

	public Waffle(String tipoDeWaffle, String salsa) {
		super();
		this.tipoDeWaffle = tipoDeWaffle;
		// this.salsa = salsa;
	}

	public Waffle(String nombreProducto, int cantidadProducto, int precioProducto, String tipoDeWaffle, String salsa) {
		super(nombreProducto, cantidadProducto, precioProducto);
		this.tipoDeWaffle = tipoDeWaffle;
		// this.salsa = salsa;
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

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	@Override
	public String toString() {
		return super.toString() + prop.getProperty("h.model.crepe.tipowaffle") + tipoDeWaffle /*
																								 * +
																								 * "\n - Salsa Deseada: "
																								 */
				+ "\n======================================";
	}

}
