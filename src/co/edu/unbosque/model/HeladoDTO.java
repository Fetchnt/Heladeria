package co.edu.unbosque.model;

public class HeladoDTO extends Producto {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3780690120030889138L;
	private String saborBolas;

//	private String salsa;
//	private char estaEnVasoConoOPaleta;

	public HeladoDTO() {
		super();
	}

	public HeladoDTO(String saborBolas, int cantidadDeBolas) {
		super();
		this.saborBolas = saborBolas;
		// this.cantidadDeBolas = cantidadDeBolas;
	}

	public HeladoDTO(String nombreProducto, int cantidadProducto, int precioProducto, String saborBolas) {
		super(nombreProducto, cantidadProducto, precioProducto);
		this.saborBolas = saborBolas;
		// this.cantidadDeBolas = cantidadDeBolas;
	}

	public HeladoDTO(String nombreProducto, int cantidadProducto, int precioProducto) {
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
		return super.toString() + "\n - Sabor de las bolas: " + saborBolas
				+ "\n======================================";
	}

}
