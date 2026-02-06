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

		vf.getvHelado().getBtnAceptar().addActionListener(this);
		vf.getvHelado().getBtnAceptar().setActionCommand("boton_aceptar_helado");

		vf.getvHelado().getBtnCancelar().addActionListener(this);
		vf.getvHelado().getBtnCancelar().setActionCommand("boton_volver_helado");

		vf.getvWaffle().getBtnAceptarWaffle().addActionListener(this);
		vf.getvWaffle().getBtnAceptarWaffle().setActionCommand("boton_aceptar_waffle");

		vf.getvWaffle().getBtnCancelarWaffle().addActionListener(this);
		vf.getvWaffle().getBtnCancelarWaffle().setActionCommand("boton_volver_waffle");

		vf.getvPrincipal().getBotonPollo().addActionListener(this);
		vf.getvPrincipal().getBotonPollo().setActionCommand("boton_pollo");

		vf.getvPrincipal().getBotonCrepes().addActionListener(this);
		vf.getvPrincipal().getBotonCrepes().setActionCommand("boton_crepe");

		vf.getvCrepe().getBtnAceptarCrepe().addActionListener(this);
		vf.getvCrepe().getBtnAceptarCrepe().setActionCommand("boton_aceptar_crepe");

		vf.getvCrepe().getBtnCancelarCrepe().addActionListener(this);
		vf.getvCrepe().getBtnCancelarCrepe().setActionCommand("boton_volver_crepe");

		vf.getvFactura().getBtnSeguirComprando().addActionListener(this);
		vf.getvFactura().getBtnSeguirComprando().setActionCommand("boton_seguir_comprando");

		vf.getvFactura().getBtnCancelar().addActionListener(this);
		vf.getvFactura().getBtnCancelar().setActionCommand("boton_cancelar_compra");

		vf.getvFactura().getBtnConfirmarCompra().addActionListener(this);
		vf.getvFactura().getBtnConfirmarCompra().setActionCommand("boton_comprar");

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

		case "boton_aceptar_helado": {
			vf.getvHelado().dispose();
			if (vf.getvHelado().getCbSabores().getSelectedItem().toString().equals("Chocolate")) {
				vf.getvFactura().getTextoProducto().setText("Helado");
				vf.getvFactura().getTextoTipo().setText("Chocolate");
			}
			if (vf.getvHelado().getCbSabores().getSelectedItem().toString().equals("Vainilla")) {
				vf.getvFactura().getTextoProducto().setText("Helado");
				vf.getvFactura().getTextoTipo().setText("Vainilla");
			}
			if (vf.getvHelado().getCbSabores().getSelectedItem().toString().equals("Fresa")) {
				vf.getvFactura().getTextoProducto().setText("Helado");
				vf.getvFactura().getTextoTipo().setText("Fresa");
			}
			if (vf.getvHelado().getCbSabores().getSelectedItem().toString().equals("Oreo")) {
				vf.getvFactura().getTextoProducto().setText("Helado");
				vf.getvFactura().getTextoTipo().setText("Oreo");
			}
			if (vf.getvHelado().getCbSabores().getSelectedItem().toString().equals("Mora")) {
				vf.getvFactura().getTextoProducto().setText("Helado");
				vf.getvFactura().getTextoTipo().setText("Mora");
			}

			vf.getvFactura().getTextoPrecio().setText("4.000");
			vf.getvFactura().revalidate();
			vf.getvFactura().repaint();
			vf.getvFactura().setVisible(true);

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

		case "boton_aceptar_waffle": {
			vf.getvWaffle().dispose();

			if (vf.getvWaffle().getCbTipoWaffle().getSelectedItem().toString().equals("Dulce")) {
				vf.getvFactura().getTextoProducto().setText("Waffle");
				vf.getvFactura().getTextoTipo().setText("Dulce");
			}
			if (vf.getvWaffle().getCbTipoWaffle().getSelectedItem().toString().equals("Salado")) {
				vf.getvFactura().getTextoProducto().setText("Waffle");
				vf.getvFactura().getTextoTipo().setText("Salado");
			}
			vf.getvFactura().getTextoPrecio().setText("6.000");
			vf.getvFactura().revalidate();
			vf.getvFactura().repaint();
			vf.getvFactura().setVisible(true);

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

		case "boton_crepe": {
			vf.getvPrincipal().dispose();
			vf.getvCrepe().setVisible(true);
			break;
		}

		case "boton_aceptar_crepe": {
			vf.getvCrepe().dispose();

			if (vf.getvCrepe().getCbTipoCrepe().getSelectedItem().toString().equals("Dulce")) {
				vf.getvFactura().getTextoProducto().setText("Crepe");
				vf.getvFactura().getTextoTipo().setText("Dulce");
			}
			if (vf.getvCrepe().getCbTipoCrepe().getSelectedItem().toString().equals("Salado")) {
				vf.getvFactura().getTextoProducto().setText("Crepe");
				vf.getvFactura().getTextoTipo().setText("Salado");
			}

			if (vf.getvCrepe().getCbSalsa().getSelectedItem().toString().equals("Chocolate")) {
				vf.getvFactura().getTextoDetalle().setText("Chocolate");
			}
			if (vf.getvCrepe().getCbSalsa().getSelectedItem().toString().equals("Arequipe")) {
				vf.getvFactura().getTextoDetalle().setText("Arequipe");
			}
			if (vf.getvCrepe().getCbSalsa().getSelectedItem().toString().equals("Fresa")) {
				vf.getvFactura().getTextoDetalle().setText("Fresa");
			}
			if (vf.getvCrepe().getCbSalsa().getSelectedItem().toString().equals("Caramelo")) {
				vf.getvFactura().getTextoDetalle().setText("Caramelo");
			}

			vf.getvFactura().getTextoPrecio().setText("5.000");
			vf.getvFactura().revalidate();
			vf.getvFactura().repaint();
			vf.getvFactura().setVisible(true);
			break;
		}

		case "boton_volver_crepe": {
			vf.getvCrepe().dispose();
			vf.getvPrincipal().setVisible(true);
			break;
		}

		case "boton_seguir_comprando": {
			break;
		}

		case "boton_comprar": {
			vf.getvFactura().dispose();
			JOptionPane.showMessageDialog(null, "Compra realizada con éxito", "Compra exitosa", 1);
			vf.getvPrincipal().setVisible(true);
			break;
		}

		case "boton_cancelar_compra": {
			vf.getvFactura().dispose();
			JOptionPane.showMessageDialog(null, "Compra cancelada", "Compra  cancelada", 1);
			vf.getvInicio().setVisible(true);
		}

		} // Cierra el switch

	}

}
