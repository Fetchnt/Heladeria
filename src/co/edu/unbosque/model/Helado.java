package co.edu.unbosque.model;

import java.util.Properties;

public class Helado extends Producto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8606686925984464450L;
	private String saborBolas;
	private Properties prop;

//	private String salsa;
//	private char estaEnVasoConoOPaleta;

	public Helado() {
		super();
	}

	public Helado(String saborBolas, int cantidadDeBolas) {
		super();
		this.saborBolas = saborBolas;
	}

	public Helado(String nombreProducto, int cantidadProducto, int precioProducto, String saborBolas,
			int cantidadDeBolas) {
		super(nombreProducto, cantidadProducto, precioProducto);
		this.saborBolas = saborBolas;
	}

	public Helado(String nombreProducto, int cantidadProducto, int precioProducto) {
		super(nombreProducto, cantidadProducto, precioProducto);
		// TODO Auto-generated constructor stub
	}

	public String getSaborBolas() {
		return saborBolas;
	}

	public void setSaborBolas(String saborBolas) {
		this.saborBolas = saborBolas;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	@Override
	public String toString() {
		return super.toString() + prop.getProperty("h.model.crepe.saborbolas") + saborBolas
				+ prop.getProperty("h.model.crepe.cantidadbolas") + "\n======================================";
	}

}
