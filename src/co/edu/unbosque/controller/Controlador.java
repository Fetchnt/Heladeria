package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;
import javax.swing.JOptionPane;
import co.edu.unbosque.model.CrepeDTO;
import co.edu.unbosque.model.HeladoDTO;
import co.edu.unbosque.model.ModelFacade;
import co.edu.unbosque.model.WaffleDTO;
import co.edu.unbosque.model.persistence.FileHandler;
import co.edu.unbosque.view.ViewFacade;

public class Controlador implements ActionListener {

	private ViewFacade vf;
	private ModelFacade mf;
	private Properties prop;

	public Controlador() {
		prop = FileHandler.cargarArchivoPropiedades("eng.properties");
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

		vf.getvFactura().getBtnCancelar().addActionListener(this);
		vf.getvFactura().getBtnCancelar().setActionCommand("boton_cancelar_compra");

		vf.getvFactura().getBtnConfirmarCompra().addActionListener(this);
		vf.getvFactura().getBtnConfirmarCompra().setActionCommand("boton_comprar");

		vf.getvSans().getBotonSans().addActionListener(this);
		vf.getvSans().getBotonSans().setActionCommand("boton_sans");

		vf.getvSans().getBotonVolver().addActionListener(this);
		vf.getvSans().getBotonVolver().setActionCommand("boton_volver_sans");

	}

	public void run() {
		mf.cargarPropiedades(prop);
		vf.cargarPropiedades(prop);

		vf.getvInicio().setVisible(true);
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
			if (vf.getvInicio().getCbLanguage().getSelectedItem().equals("Español")) {
				prop = FileHandler.cargarArchivoPropiedades("esp.properties");
			} else if (vf.getvInicio().getCbLanguage().getSelectedItem().equals("English")) {
				prop = FileHandler.cargarArchivoPropiedades("eng.properties");
			} else if (vf.getvInicio().getCbLanguage().getSelectedItem().equals("Francais")) {
				prop = FileHandler.cargarArchivoPropiedades("fr.properties");
			}

			vf.cargarPropiedades(prop);
			mf.cargarPropiedades(prop);

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
			if (vf.getvHelado().getCbSabores().getSelectedItem().toString()
					.equals(prop.getProperty("h.controller.botonhelado.chocolate"))) {
				vf.getvFactura().getTextoProducto().setText(prop.getProperty("h.view.textohelados"));
				vf.getvFactura().getTextoTipo().setText(prop.getProperty("h.controller.botonhelado.chocolate"));
			}
			if (vf.getvHelado().getCbSabores().getSelectedItem().toString()
					.equals(prop.getProperty("h.controller.botonhelado.vainilla"))) {
				vf.getvFactura().getTextoProducto().setText(prop.getProperty("h.view.textohelados"));
				vf.getvFactura().getTextoTipo().setText(prop.getProperty("h.controller.botonhelado.vainilla"));
			}
			if (vf.getvHelado().getCbSabores().getSelectedItem().toString()
					.equals(prop.getProperty("h.controller.botonhelado.fresa"))) {
				vf.getvFactura().getTextoProducto().setText(prop.getProperty("h.view.textohelados"));
				vf.getvFactura().getTextoTipo().setText(prop.getProperty("h.controller.botonhelado.fresa"));
			}
			if (vf.getvHelado().getCbSabores().getSelectedItem().toString()
					.equals(prop.getProperty("h.controller.botonhelado.oreo"))) {
				vf.getvFactura().getTextoProducto().setText(prop.getProperty("h.view.textohelados"));
				vf.getvFactura().getTextoTipo().setText(prop.getProperty("h.controller.botonhelado.oreo"));
			}
			if (vf.getvHelado().getCbSabores().getSelectedItem().toString()
					.equals(prop.getProperty("h.controller.botonhelado.mora"))) {
				vf.getvFactura().getTextoProducto().setText(prop.getProperty("h.view.textohelados"));
				vf.getvFactura().getTextoTipo().setText(prop.getProperty("h.controller.botonhelado.mora"));
			}

			vf.getvFactura().getLblTotal().setText("Total: 4.000 $");

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

			if (vf.getvWaffle().getCbTipoWaffle().getSelectedItem().toString()
					.equals(prop.getProperty("heladeria.crepe.sweet"))) {
				vf.getvFactura().getTextoProducto().setText(prop.getProperty("h.view.textowaffles"));
				vf.getvFactura().getTextoTipo().setText(prop.getProperty("heladeria.crepe.sweet"));
			}
			if (vf.getvWaffle().getCbTipoWaffle().getSelectedItem().toString()
					.equals(prop.getProperty("heladeria.crepe.salty"))) {
				vf.getvFactura().getTextoProducto().setText(prop.getProperty("h.view.textowaffles"));
				vf.getvFactura().getTextoTipo().setText(prop.getProperty("heladeria.crepe.salty"));
			}

			vf.getvFactura().getLblTotal().setText("Total: 6.000 $");

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
			// JOptionPane.showMessageDialog(null, prop.getProperty("h.pollo.dimelo"),
			// prop.getProperty("h.errorrrr"), 0);
			vf.getvSans().getDialogoSans().setVisible(false);
			vf.getvSans().getDialogoSansDos().setVisible(false);
			vf.getvSans().setVisible(true);
			break;
		}

		case "boton_sans": {
			vf.getvSans().getDialogoSans().setVisible(true);
			vf.getvSans().getDialogoSansDos().setVisible(true);
			break;
		}

		case "boton_volver_sans": {
			vf.getvSans().dispose();
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

			if (vf.getvCrepe().getCbTipoCrepe().getSelectedItem().toString()
					.equals(prop.getProperty("heladeria.crepe.sweet"))) {
				vf.getvFactura().getTextoProducto().setText(prop.getProperty("h.view.textocrepeeee"));
				vf.getvFactura().getTextoTipo().setText(prop.getProperty("heladeria.crepe.sweet"));
			}
			if (vf.getvCrepe().getCbTipoCrepe().getSelectedItem().toString()
					.equals(prop.getProperty("heladeria.crepe.salty"))) {
				vf.getvFactura().getTextoProducto().setText(prop.getProperty("h.view.textocrepeeee"));
				vf.getvFactura().getTextoTipo().setText(prop.getProperty("heladeria.crepe.salty"));
			}

			if (vf.getvCrepe().getCbSalsa().getSelectedItem().toString()
					.equals(prop.getProperty("h.controller.botonhelado.chocolate"))) {
				vf.getvFactura().getTextoDetalle().setText(prop.getProperty("h.controller.botonhelado.chocolate"));
			}
			if (vf.getvCrepe().getCbSalsa().getSelectedItem().toString()
					.equals(prop.getProperty("h.controller.botonhelado.arequipe"))) {
				vf.getvFactura().getTextoDetalle().setText(prop.getProperty("h.controller.botonhelado.arequipe"));
			}
			if (vf.getvCrepe().getCbSalsa().getSelectedItem().toString()
					.equals(prop.getProperty("h.controller.botonhelado.fresa"))) {
				vf.getvFactura().getTextoDetalle().setText(prop.getProperty("h.controller.botonhelado.fresa"));
			}
			if (vf.getvCrepe().getCbSalsa().getSelectedItem().toString()
					.equals(prop.getProperty("h.controller.botonhelado.caramelo"))) {
				vf.getvFactura().getTextoDetalle().setText(prop.getProperty("h.controller.botonhelado.caramelo"));
			}

			vf.getvFactura().getLblTotal().setText("Total: 5.000 $");

			vf.getvFactura().getTextoPrecio().setText("5000");
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

			String producto = vf.getvFactura().getTextoProducto().getText();
			String tipo = vf.getvFactura().getTextoTipo().getText();
			String detalle = vf.getvFactura().getTextoDetalle().getText();
			String precioTxt = vf.getvFactura().getTextoPrecio().getText();

			int precio = Integer.parseInt(precioTxt.replace(".", ""));

			if (producto.equalsIgnoreCase(prop.getProperty("h.view.textohelados"))) {
				HeladoDTO dto = new HeladoDTO();
				dto.setNombreProducto(producto);
				dto.setSaborBolas(tipo);
				dto.setPrecioProducto(precio);
				dto.setCantidadProducto(1);

				mf.gethDAO().crear(dto);
			}

			if (producto.equalsIgnoreCase(prop.getProperty("h.view.textowafleee"))) {
				WaffleDTO dto = new WaffleDTO();
				dto.setNombreProducto(producto);
				dto.setTipoDeWaffle(tipo);
				dto.setPrecioProducto(precio);
				dto.setCantidadProducto(1);

				mf.getwDAO().crear(dto);
			}

			if (producto.equalsIgnoreCase(prop.getProperty("h.view.textocrepeeee"))) {
				CrepeDTO dto = new CrepeDTO();
				dto.setNombreProducto(producto);
				dto.setTipoDeCrepe(tipo);
				dto.setPrecioProducto(precio);
				dto.setCantidadProducto(1);

				if (detalle != null && !detalle.isEmpty()) {
					dto.setSalsa(detalle);
				}

				mf.getcDAO().crear(dto);
			}

			String mensaje = prop.getProperty("h.comprarealizadaconexito") + prop.getProperty("h.productoooo")
					+ producto + "\n" + prop.getProperty("heladeria.factura.col.tipo") + tipo + "\n";

			if (detalle != null && !detalle.isEmpty()) {
				mensaje += prop.getProperty("heladeria.factura.col.detalle") + detalle + "\n";
			}

			mensaje += "Precio: $" + precioTxt;

			vf.getvFactura().dispose();
			JOptionPane.showMessageDialog(null, mensaje, prop.getProperty("h.comprarealizadaconexito"),
					JOptionPane.INFORMATION_MESSAGE);
			vf.getvInicio().setVisible(true);
			break;
		}

		case "boton_cancelar_compra": {
			vf.getvFactura().dispose();
			JOptionPane.showMessageDialog(null, prop.getProperty("h.canceocaeiae"), prop.getProperty("h.canceocaeiae"),
					1);
			vf.getvInicio().setVisible(true);
		}

		} // Cierra el switch

	}

}
