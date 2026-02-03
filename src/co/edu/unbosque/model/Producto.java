package co.edu.unbosque.model;

import java.io.Serializable;

public abstract class Producto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4561618794874101953L;
	private String nombreProducto;
	private int cantidadProducto;
	private int precioProducto;
//	private boolean facturaProducto;
	
	public Producto() {

	}

	public Producto(String nombreProducto, int cantidadProducto, int precioProducto) {
		super();
		this.nombreProducto = nombreProducto;
		this.cantidadProducto = cantidadProducto;
		this.precioProducto = precioProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public int getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	public int getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(int precioProducto) {
		this.precioProducto = precioProducto;
	}

	@Override
	public String toString() {
		return "======================================\n - Nombre del producto: " + nombreProducto + "\n - Cantidad del producto: " + cantidadProducto
				+ "\n - Precio del Producto: " + precioProducto;
	}
	

	
}
