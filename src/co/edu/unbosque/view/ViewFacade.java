package co.edu.unbosque.view;

import java.util.Properties;

public class ViewFacade {

	private StartWindow sWin;

	public ViewFacade(Properties prop) {
		sWin = new StartWindow(prop);

	}

	public void cargarPropiedades(Properties prop) {
	}

	public StartWindow getsWin() {
		return sWin;
	}

	public void setsWin(StartWindow sWin) {
		this.sWin = sWin;
	}

}
