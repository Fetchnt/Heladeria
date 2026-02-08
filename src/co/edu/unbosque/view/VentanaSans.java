package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.Properties;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaSans extends JFrame {

	private Properties prop;
	private JLabel titulo;
	private JLabel dialogoSans;
	private JLabel dialogoSansDos;
	private JButton botonSans;
	private JButton botonGuardado;
	private JButton botonVolver;

	public VentanaSans() {
		initializeComponents();
		setVisible(false);
	}

	public VentanaSans(Properties prop) {
		initializeComponents();
		setVisible(false);
	}

	public void initializeComponents() {
		setTitle("Sans");
		setSize(900, 650);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		getContentPane().setBackground(Color.decode("#F5EFE7"));

		ImageIcon iconoOriginalc = new ImageIcon(getClass().getResource("sans.png"));
		Image imagenEscaladac = iconoOriginalc.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH);
		ImageIcon iconoFinalc = new ImageIcon(imagenEscaladac);
		botonSans = new JButton(iconoFinalc);
		botonSans.setBounds(50, 120, 400, 400);
		botonSans.setFocusPainted(false);
		this.add(botonSans);

		ImageIcon iconoOriginalg = new ImageIcon(getClass().getResource("guardado.jpg"));
		Image imagenEscaladag = iconoOriginalg.getImage().getScaledInstance(200, 100, Image.SCALE_SMOOTH);
		ImageIcon iconoFinalg = new ImageIcon(imagenEscaladag);
		botonGuardado = new JButton(iconoFinalg);
		botonGuardado.setBounds(550, 300, 200, 100);
		botonGuardado.setFocusPainted(false);
		this.add(botonGuardado);

		titulo = new JLabel("Haz click!");
		titulo.setBounds(150, 20, 250, 100);
		titulo.setForeground(Color.BLACK);
		titulo.setFont(new Font("Comic Sans MS", Font.BOLD, 33));
		add(titulo);

		dialogoSans = new JLabel(" *Preguntar si hay pollo en una ");
		dialogoSans.setBounds(480, 140, 350, 100);
		dialogoSans.setForeground(Color.BLACK);
		dialogoSans.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		add(dialogoSans);

		dialogoSansDos = new JLabel(" heladeria ");
		dialogoSansDos.setBounds(480, 170, 400, 100);
		dialogoSansDos.setForeground(Color.BLACK);
		dialogoSansDos.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		add(dialogoSansDos);

		botonVolver = new JButton("VOLVER");
		botonVolver.setBounds(385, 540, 100, 40);
		botonVolver.setBackground(Color.decode("#042F6D"));
		botonVolver.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		botonVolver.setForeground(Color.WHITE);
		botonVolver.setFocusPainted(false);
		botonVolver.setBorderPainted(false);
		add(botonVolver);

	}

	public void aplicarInternacionalizacion(Properties prop) {
		setTitle(prop.getProperty("heladeria.sans.titulo"));
		titulo.setText(prop.getProperty("heladeria.sans.click"));
		dialogoSans.setText(prop.getProperty("heladeria.sans.dialogo"));
		dialogoSansDos.setText(prop.getProperty("heladeria.sans.dialogoDos"));
		botonVolver.setText(prop.getProperty("heladeria.sans.volver"));
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JButton getBotonSans() {
		return botonSans;
	}

	public void setBotonSans(JButton botonSans) {
		this.botonSans = botonSans;
	}

	public JButton getBotonGuardado() {
		return botonGuardado;
	}

	public void setBotonGuardado(JButton botonGuardado) {
		this.botonGuardado = botonGuardado;
	}

	public JLabel getDialogoSans() {
		return dialogoSans;
	}

	public void setDialogoSans(JLabel dialogoSans) {
		this.dialogoSans = dialogoSans;
	}

	public JLabel getDialogoSansDos() {
		return dialogoSansDos;
	}

	public void setDialogoSansDos(JLabel dialogoSansDos) {
		this.dialogoSansDos = dialogoSansDos;
	}

	public JButton getBotonVolver() {
		return botonVolver;
	}

	public void setBotonVolver(JButton botonVolver) {
		this.botonVolver = botonVolver;
	}

}
