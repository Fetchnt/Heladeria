package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaSaborHelado extends JDialog {

	private JComboBox<String> cbSabores;
	private JButton btnAceptarHelado;
	private JButton btnCancelarHelado;
	private JLabel lblPregunta;
	private JLabel lblPrecio;
	private Properties prop;

	public VentanaSaborHelado() {
		setVisible(false);
		initializeComponents();
	}

	public VentanaSaborHelado(Properties prop) {
		setProp(prop);
		initializeComponents();
		setVisible(false);
	}

	private void initializeComponents() {
		setTitle("Seleccionar sabor");
		setSize(360, 220);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 360, 220);
		panel.setBackground(Color.decode("#FFF3E0"));
		panel.setLayout(null);
		add(panel);

		lblPregunta = new JLabel("¿Qué sabor te gustaría?");
		lblPregunta.setBounds(40, 20, 300, 30);
		lblPregunta.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblPregunta.setForeground(Color.decode("#6E2C00"));
		panel.add(lblPregunta);

		lblPrecio = new JLabel("Precio: $4.000 COP");
		lblPrecio.setBounds(60, 105, 230, 20);
		lblPrecio.setFont(new Font("Comic Sans MS", Font.ITALIC, 13));
		lblPrecio.setForeground(Color.decode("#7D6608"));
		panel.add(lblPrecio);

		cbSabores = new JComboBox<>(new String[] { "Vainilla", "Chocolate", "Fresa", "Mora", "Oreo" });
		cbSabores.setBounds(60, 70, 230, 35);
		cbSabores.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		panel.add(cbSabores);

		btnAceptarHelado = new JButton("Aceptar");
		btnAceptarHelado.setBounds(60, 130, 100, 30);
		btnAceptarHelado.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnAceptarHelado.setBackground(Color.decode("#FAD7A0"));
		btnAceptarHelado.setForeground(Color.decode("#6E2C00"));
		btnAceptarHelado.setFocusPainted(false);
		panel.add(btnAceptarHelado);

		btnCancelarHelado = new JButton("Cancelar");
		btnCancelarHelado.setBounds(190, 130, 100, 30);
		btnCancelarHelado.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		btnCancelarHelado.setBackground(Color.decode("#F5EFE7"));
		btnCancelarHelado.setForeground(Color.decode("#6E2C00"));
		btnCancelarHelado.setFocusPainted(false);
		panel.add(btnCancelarHelado);

	}

	public void aplicarInternacionalizacion(Properties prop) {
		setTitle(prop.getProperty("heladeria.dialog.sabor.title"));
		lblPrecio.setText(prop.getProperty("heladeria.dialog.sabor.price"));
		lblPregunta.setText(prop.getProperty("heladeria.dialog.sabor.question"));
		btnAceptarHelado.setText(prop.getProperty("heladeria.dialog.sabor.accept"));
		btnCancelarHelado.setText(prop.getProperty("heladeria.dialog.sabor.cancel"));

		cbSabores.removeAllItems();
		cbSabores.addItem(prop.getProperty("heladeria.flavor.vanilla"));
		cbSabores.addItem(prop.getProperty("heladeria.flavor.chocolate"));
		cbSabores.addItem(prop.getProperty("heladeria.flavor.strawberry"));
		cbSabores.addItem(prop.getProperty("heladeria.flavor.blackberry"));
		cbSabores.addItem(prop.getProperty("heladeria.flavor.caramel"));
	}

	public JComboBox<String> getCbSabores() {
		return cbSabores;
	}

	public void setCbSabores(JComboBox<String> cbSabores) {
		this.cbSabores = cbSabores;
	}

	public JButton getBtnAceptar() {
		return btnAceptarHelado;
	}

	public void setBtnAceptar(JButton btnAceptar) {
		this.btnAceptarHelado = btnAceptar;
	}

	public JButton getBtnCancelar() {
		return btnCancelarHelado;
	}

	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelarHelado = btnCancelar;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

}
