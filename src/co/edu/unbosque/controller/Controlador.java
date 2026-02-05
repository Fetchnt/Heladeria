package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.swing.JOptionPane;

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

		vf.getvPrincipal().getBotonHelados().addActionListener(this);
		vf.getvPrincipal().getBotonHelados().setActionCommand("boton_helados");

		vf.getvPrincipal().getBotonVolver().addActionListener(this);
		vf.getvPrincipal().getBotonVolver().setActionCommand("boton_volver_vp");

		vf.getvPrincipal().getBotonWaffles().addActionListener(this);
		vf.getvPrincipal().getBotonWaffles().setActionCommand("boton_waffle");

		vf.getvHelado().getBtnCancelar().addActionListener(this);
		vf.getvHelado().getBtnCancelar().setActionCommand("boton_volver_helado");

		vf.getvWaffle().getBtnCancelarWaffle().addActionListener(this);
		vf.getvWaffle().getBtnCancelarWaffle().setActionCommand("boton_volver_waffle");

		vf.getvPrincipal().getBotonPollo().addActionListener(this);
		vf.getvPrincipal().getBotonPollo().setActionCommand("boton_pollo");

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

		case "boton_acceso": {
			vf.getvInicio().dispose();
			vf.getvPrincipal().setVisible(true);
			break;
		}

		case "boton_helados": {
			vf.getvPrincipal().dispose();
			vf.getvHelado().setVisible(true);
			break;
		}
		case "boton_volver_helado": {
			vf.getvHelado().dispose();
			vf.getvPrincipal().setVisible(true);
			break;
		}

		case "boton_waffle": {
			vf.getvPrincipal().dispose();
			vf.getvWaffle().setVisible(true);
			break;
		}
		case "boton_volver_waffle": {
			vf.getvWaffle().dispose();
			vf.getvPrincipal().setVisible(true);
			break;
		}

		case "boton_volver_vp": {
			vf.getvPrincipal().dispose();
			vf.getvInicio().setVisible(true);
			break;
		}
		case "boton_pollo": {
			vf.getvPrincipal().dispose();
			JOptionPane.showMessageDialog(null, "Esto es una heladería, no vendemos pollo 😂", "Error", 0);
			vf.getvPrincipal().setVisible(true);
			break;
		}

		} // Cierra el switch

	}

}
