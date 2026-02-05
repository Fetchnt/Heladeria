package co.edu.unbosque.view;

import java.util.Properties;

public class ViewFacade {

	private VentanaInicio vInicio;
	private VentanaPrincipal vPrincipal;

	public ViewFacade(Properties prop) {
		vInicio = new VentanaInicio(prop);
		vPrincipal = new VentanaPrincipal(prop);

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

}
