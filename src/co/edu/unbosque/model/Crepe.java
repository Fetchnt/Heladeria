package co.edu.unbosque.model;

import java.util.Properties;

public class Crepe extends Producto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4877126570275282649L;

	private String tipoDeCrepe; // dulce o salado
	private String salsa; // ahi miramos
	private Properties prop;

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

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	@Override
	public String toString() {
		return super.toString() + prop.getProperty("h.model.crepe.tipodecrepe") + tipoDeCrepe
				+ prop.getProperty("h.model.crepe.salsa") + salsa + "\n======================================";
	}

}
