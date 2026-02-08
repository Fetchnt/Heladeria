package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaWaffle extends JDialog {

	private JComboBox<String> cbTipoWaffle;
	private JButton btnAceptarWaffle;
	private JButton btnCancelarWaffle;
	private JLabel lblPregunta;
	private JLabel lblPrecio;
	private Properties prop;

	public VentanaWaffle() {
		setVisible(false);
		initializeComponents();
	}

	public VentanaWaffle(Properties prop) {
		this.prop = prop;
		initializeComponents();
		setVisible(false);
	}

	private void initializeComponents() {
		setTitle("Seleccionar waffle");
		setSize(360, 220);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 360, 220);
		panel.setBackground(Color.decode("#FFF8E1"));
		panel.setLayout(null);
		add(panel);

		lblPregunta = new JLabel("¿Cómo deseas tu waffle?");
		lblPregunta.setBounds(40, 20, 300, 30);
		lblPregunta.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblPregunta.setForeground(Color.decode("#6E2C00"));
		panel.add(lblPregunta);

		cbTipoWaffle = new JComboBox<>(new String[] { "Dulce", "Salado" });
		cbTipoWaffle.setBounds(60, 70, 230, 35);
		cbTipoWaffle.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		panel.add(cbTipoWaffle);

		lblPrecio = new JLabel("Precio: $6.000 COP");
		lblPrecio.setBounds(60, 105, 230, 20);
		lblPrecio.setFont(new Font("Comic Sans MS", Font.ITALIC, 13));
		lblPrecio.setForeground(Color.decode("#7D6608"));
		panel.add(lblPrecio);

		btnAceptarWaffle = new JButton("Aceptar");
		btnAceptarWaffle.setBounds(60, 130, 100, 30);
		btnAceptarWaffle.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnAceptarWaffle.setBackground(Color.decode("#FAD7A0"));
		btnAceptarWaffle.setForeground(Color.decode("#6E2C00"));
		btnAceptarWaffle.setFocusPainted(false);
		panel.add(btnAceptarWaffle);

		btnCancelarWaffle = new JButton("Cancelar");
		btnCancelarWaffle.setBounds(190, 130, 100, 30);
		btnCancelarWaffle.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		btnCancelarWaffle.setBackground(Color.decode("#F5EFE7"));
		btnCancelarWaffle.setForeground(Color.decode("#6E2C00"));
		btnCancelarWaffle.setFocusPainted(false);
		panel.add(btnCancelarWaffle);
	}

	public void aplicarInternacionalizacion(Properties prop) {
		setTitle(prop.getProperty("heladeria.start.title"));
		lblPregunta.setText(prop.getProperty("heladeria.dialog.waffle.question"));
		lblPrecio.setText(prop.getProperty("heladeria.dialog.waffle.price"));
		btnAceptarWaffle.setText(prop.getProperty("heladeria.dialog.sabor.accept"));
		btnCancelarWaffle.setText(prop.getProperty("heladeria.dialog.sabor.cancel"));

		cbTipoWaffle.removeAllItems();
		cbTipoWaffle.addItem(prop.getProperty("heladeria.crepe.sweet"));
		cbTipoWaffle.addItem(prop.getProperty("heladeria.crepe.salty"));
	}

	public JComboBox<String> getCbTipoWaffle() {
		return cbTipoWaffle;
	}

	public void setCbTipoWaffle(JComboBox<String> cbTipoWaffle) {
		this.cbTipoWaffle = cbTipoWaffle;
	}

	public JButton getBtnAceptarWaffle() {
		return btnAceptarWaffle;
	}

	public void setBtnAceptarWaffle(JButton btnAceptarWaffle) {
		this.btnAceptarWaffle = btnAceptarWaffle;
	}

	public JButton getBtnCancelarWaffle() {
		return btnCancelarWaffle;
	}

	public void setBtnCancelarWaffle(JButton btnCancelarWaffle) {
		this.btnCancelarWaffle = btnCancelarWaffle;
	}

	public JLabel getLblPregunta() {
		return lblPregunta;
	}

	public void setLblPregunta(JLabel lblPregunta) {
		this.lblPregunta = lblPregunta;
	}

	public JLabel getLblPrecio() {
		return lblPrecio;
	}

	public void setLblPrecio(JLabel lblPrecio) {
		this.lblPrecio = lblPrecio;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	
}
