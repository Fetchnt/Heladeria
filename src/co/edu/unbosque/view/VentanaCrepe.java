package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaCrepe extends JDialog {

	private JComboBox<String> cbTipoCrepe;
	private JComboBox<String> cbSalsa;
	private JButton btnAceptarCrepe;
	private JButton btnCancelarCrepe;
	private JLabel lblPreguntaTipo;
	private JLabel lblPreguntaSalsa;
	private JLabel lblPrecio;
	private Properties prop;

	public VentanaCrepe() {
		setVisible(false);
		initializeComponents();
	}

	public VentanaCrepe(Properties prop) {
		setProp(prop);
		initializeComponents();
		setVisible(false);
	}

	private void initializeComponents() {
		setTitle("Seleccionar crepe");
		setSize(360, 300);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 360, 300);
		panel.setBackground(Color.decode("#FFF8E1"));
		panel.setLayout(null);
		add(panel);

		lblPreguntaTipo = new JLabel("¿Cómo deseas tu crepe?");
		lblPreguntaTipo.setBounds(40, 20, 300, 30);
		lblPreguntaTipo.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblPreguntaTipo.setForeground(Color.decode("#6E2C00"));
		panel.add(lblPreguntaTipo);

		cbTipoCrepe = new JComboBox<>(new String[] { "Dulce", "Salado" });
		cbTipoCrepe.setBounds(60, 60, 230, 35);
		cbTipoCrepe.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		panel.add(cbTipoCrepe);

		lblPreguntaSalsa = new JLabel("¿Qué salsa deseas?");
		lblPreguntaSalsa.setBounds(60, 105, 230, 25);
		lblPreguntaSalsa.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblPreguntaSalsa.setForeground(Color.decode("#6E2C00"));
		panel.add(lblPreguntaSalsa);

		cbSalsa = new JComboBox<>(new String[] { "Chocolate", "Arequipe", "Fresa", "Caramelo" });
		cbSalsa.setBounds(60, 135, 230, 35);
		cbSalsa.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		panel.add(cbSalsa);

		lblPrecio = new JLabel("Precio: $5.000 COP");
		lblPrecio.setBounds(60, 175, 230, 20);
		lblPrecio.setFont(new Font("Comic Sans MS", Font.ITALIC, 13));
		lblPrecio.setForeground(Color.decode("#7D6608"));
		panel.add(lblPrecio);

		btnAceptarCrepe = new JButton("Aceptar");
		btnAceptarCrepe.setBounds(60, 210, 100, 30);
		btnAceptarCrepe.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnAceptarCrepe.setBackground(Color.decode("#FAD7A0"));
		btnAceptarCrepe.setForeground(Color.decode("#6E2C00"));
		btnAceptarCrepe.setFocusPainted(false);
		panel.add(btnAceptarCrepe);

		btnCancelarCrepe = new JButton("Cancelar");
		btnCancelarCrepe.setBounds(190, 210, 100, 30);
		btnCancelarCrepe.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		btnCancelarCrepe.setBackground(Color.decode("#F5EFE7"));
		btnCancelarCrepe.setForeground(Color.decode("#6E2C00"));
		btnCancelarCrepe.setFocusPainted(false);
		panel.add(btnCancelarCrepe);
	}

	public void aplicarInternacionalizacion(Properties prop) {
		setTitle(prop.getProperty("heladeria.dialog.crepe.title"));
		lblPreguntaTipo.setText(prop.getProperty("heladeria.dialog.crepe.type"));
		lblPreguntaSalsa.setText(prop.getProperty("heladeria.dialog.crepe.sauce"));
		lblPrecio.setText(prop.getProperty("heladeria.dialog.crepe.price"));
		btnAceptarCrepe.setText(prop.getProperty("heladeria.dialog.crepe.accept"));
		btnCancelarCrepe.setText(prop.getProperty("heladeria.dialog.crepe.cancel"));

		cbTipoCrepe.removeAllItems();
		cbTipoCrepe.addItem(prop.getProperty("heladeria.crepe.sweet"));
		cbTipoCrepe.addItem(prop.getProperty("heladeria.crepe.salty"));

		cbSalsa.removeAllItems();
		cbSalsa.addItem(prop.getProperty("heladeria.sauce.chocolate"));
		cbSalsa.addItem(prop.getProperty("heladeria.sauce.caramel"));
		cbSalsa.addItem(prop.getProperty("heladeria.sauce.strawberry"));
		cbSalsa.addItem(prop.getProperty("heladeria.sauce.arequipe"));
	}

	public JComboBox<String> getCbTipoCrepe() {
		return cbTipoCrepe;
	}

	public void setCbTipoCrepe(JComboBox<String> cbTipoCrepe) {
		this.cbTipoCrepe = cbTipoCrepe;
	}

	public JComboBox<String> getCbSalsa() {
		return cbSalsa;
	}

	public void setCbSalsa(JComboBox<String> cbSalsa) {
		this.cbSalsa = cbSalsa;
	}

	public JButton getBtnAceptarCrepe() {
		return btnAceptarCrepe;
	}

	public void setBtnAceptarCrepe(JButton btnAceptarCrepe) {
		this.btnAceptarCrepe = btnAceptarCrepe;
	}

	public JButton getBtnCancelarCrepe() {
		return btnCancelarCrepe;
	}

	public void setBtnCancelarCrepe(JButton btnCancelarCrepe) {
		this.btnCancelarCrepe = btnCancelarCrepe;
	}

	public JLabel getLblPreguntaTipo() {
		return lblPreguntaTipo;
	}

	public void setLblPreguntaTipo(JLabel lblPreguntaTipo) {
		this.lblPreguntaTipo = lblPreguntaTipo;
	}

	public JLabel getLblPreguntaSalsa() {
		return lblPreguntaSalsa;
	}

	public void setLblPreguntaSalsa(JLabel lblPreguntaSalsa) {
		this.lblPreguntaSalsa = lblPreguntaSalsa;
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