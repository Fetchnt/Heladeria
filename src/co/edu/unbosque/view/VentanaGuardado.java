package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.Properties;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaGuardado extends JFrame {

	private Properties prop;
	private JLabel dialogo;

	public VentanaGuardado() {
		initializeComponents();
		setVisible(false);
	}

	public VentanaGuardado(Properties prop) {
		initializeComponents();
		setVisible(false);
	}

	public void initializeComponents() {
		setTitle("Guardado");
		setSize(600, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		getContentPane().setBackground(Color.decode("#F5EFE7"));

		dialogo = new JLabel("*La heladeria te llena de determinacion ");
		dialogo.setBounds(100, 0, 550, 80);
		dialogo.setForeground(Color.BLACK);
		dialogo.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		add(dialogo);


	}

	public void aplicarInternacionalizacion(Properties prop) {
		setTitle(prop.getProperty("heladeria.guardado.titulo"));
		dialogo.setText(prop.getProperty("heladeria.guardado.texto"));
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}
}
