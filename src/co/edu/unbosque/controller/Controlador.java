package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;
import co.edu.unbosque.model.ModelFacade;
import co.edu.unbosque.model.persistence.FileHandler;
import co.edu.unbosque.view.ViewFacade;

public class Controlador implements ActionListener {

	private ViewFacade vf;
	private ModelFacade mf;
	private Properties prop;

	public Controlador() {
		prop = FileHandler.cargarArchivoPropiedades("esp.properties");
		mf = new ModelFacade();
		vf = new ViewFacade(prop);
		mf.escribirArchivoDeTexto();
	}

	public void asignarListeners() {
		vf.getvInicio().getBtnAccess().addActionListener(this);
		vf.getvInicio().getBtnAccess().setActionCommand("boton_acceso");

		vf.getvInicio().getBtnExit().addActionListener(this);
		vf.getvInicio().getBtnExit().setActionCommand("boton_salir");

	}

	public void run() {
		vf.getvInicio().setVisible(true);
		vf.cargarPropiedades(prop);
		asignarListeners();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String alias = e.getActionCommand();
		
		switch (alias) {

		case "boton_salir": {
			System.exit(0);
			break;
		}
		
		

		} // Cierra el switch

	}

}
