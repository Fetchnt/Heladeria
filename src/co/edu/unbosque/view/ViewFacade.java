package co.edu.unbosque.view;

import java.util.Properties;

public class ViewFacade {

	private VentanaInicio vInicio;

	public ViewFacade(Properties prop) {
		vInicio = new VentanaInicio(prop);

	}

	public void cargarPropiedades(Properties prop) {

	}

	public VentanaInicio getvInicio() {
		return vInicio;
	}

	public void setvInicio(VentanaInicio vInicio) {
		this.vInicio = vInicio;
	}

}
