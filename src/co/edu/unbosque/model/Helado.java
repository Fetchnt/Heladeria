package co.edu.unbosque.model;

public class Helado extends Producto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8606686925984464450L;
	private String saborBolas;

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

	@Override
	public String toString() {
		return super.toString() + "\n - Sabor de las bolas: " + saborBolas + "\n - Cantidad de bolas: " + "\n======================================";
	}

}
