package co.edu.unbosque.view;

import java.util.Properties;

public class ViewFacade {

	private VentanaCrepe vCrepe;
	private VentanaFactura vFactura;
	private VentanaInicio vInicio;
	private VentanaPrincipal vPrincipal;
	private VentanaSaborHelado vHelado;
	private VentanaWaffle vWaffle;
	private VentanaSans vSans;

	public ViewFacade() {
	}

	public ViewFacade(Properties prop) {
		vCrepe = new VentanaCrepe(prop);
		vFactura = new VentanaFactura(prop);
		vInicio = new VentanaInicio(prop);
		vPrincipal = new VentanaPrincipal(prop);
		vHelado = new VentanaSaborHelado(prop);
		vWaffle = new VentanaWaffle(prop);
		vSans = new VentanaSans(prop);

	}

	public void cargarPropiedades(Properties prop) {
		vCrepe.aplicarInternacionalizacion(prop);
		vFactura.aplicarInternacionalizacion(prop);
		vInicio.aplicarInternacionalizacion(prop);
		vPrincipal.aplicarInternacionalizacion(prop);
		vHelado.aplicarInternacionalizacion(prop);
		vWaffle.aplicarInternacionalizacion(prop);
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

	public VentanaWaffle getvWaffle() {
		return vWaffle;
	}

	public void setvWaffle(VentanaWaffle vWaffle) {
		this.vWaffle = vWaffle;
	}

	public VentanaCrepe getvCrepe() {
		return vCrepe;
	}

	public void setvCrepe(VentanaCrepe vCrepe) {
		this.vCrepe = vCrepe;
	}

	public VentanaFactura getvFactura() {
		return vFactura;
	}

	public void setvFactura(VentanaFactura vFactura) {
		this.vFactura = vFactura;
	}

	public VentanaSans getvSans() {
		return vSans;
	}

	public void setvSans(VentanaSans vSans) {
		this.vSans = vSans;
	}

}
