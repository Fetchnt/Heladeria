package co.edu.unbosque.view;

import java.util.Properties;

public class ViewFacade {

	private VentanaInicio vInicio;
	private VentanaPrincipal vPrincipal;
	private VentanaSaborHelado vHelado;

	public ViewFacade(Properties prop) {
		vInicio = new VentanaInicio(prop);
		vPrincipal = new VentanaPrincipal(prop);
		vHelado = new VentanaSaborHelado(prop);

	}

	public void cargarPropiedades(Properties prop) {

	}

	public VentanaInicio getvInicio() {
		return vInicio;
	}

	public void setvInicio(VentanaInicio vInicio) {
		this.vInicio = vInicio;
	}

	public VentanaPrincipal getvPrincipal() {
		return vPrincipal;
	}

	public void setvPrincipal(VentanaPrincipal vPrincipal) {
		this.vPrincipal = vPrincipal;
	}

	public VentanaSaborHelado getvHelado() {
		return vHelado;
	}

	public void setvHelado(VentanaSaborHelado vHelado) {
		this.vHelado = vHelado;
	}
	

}
