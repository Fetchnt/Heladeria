package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import co.edu.unbosque.model.ModelFacade;
import co.edu.unbosque.view.Consola;
import co.edu.unbosque.view.ViewFacade;

public class Controlador implements ActionListener {

	private ViewFacade vf;
	private ModelFacade mf;
	private Properties prop;

	public Controlador() {
		mf = new ModelFacade();
		vf = new ViewFacade();
		prop = new Properties();
		asignarListeners();
	}

	public void asignarListeners() {
		vf.getsWin().getBtnAccess().addActionListener(this);
		vf.getsWin().getBtnAccess().setActionCommand("boton_acceso");

	}
	
	public void run() {
		vf.getsWin().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String alias = e.getActionCommand();
		switch (alias) {

		}

	}

}
