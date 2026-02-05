package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.Properties;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaPrincipal extends JFrame {

	private Properties prop;
	private JButton botonHelados;
	private JButton botonCrepes;
	private JButton botonVolver;
	private JButton botonPollo;
	private JButton botonWaffles;
	private JLabel textoInicio;
	private JLabel textoHelado;
	private JLabel textoCrepes;
	private JLabel textoWaffles;
	private JPanel panelGris;

	public VentanaPrincipal() {
		initializeComponents();
		setVisible(false);
	}

	public VentanaPrincipal(Properties prop) {
		setProp(prop);
		initializeComponents();
		setVisible(false);
	}

	private void initializeComponents() {
		setTitle("Ventana principal");
		setSize(900, 650);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		getContentPane().setBackground(Color.decode("#F5EFE7"));

		ImageIcon iconoOriginalh = new ImageIcon(getClass().getResource("helados.jpeg"));
		Image imagenEscaladah = iconoOriginalh.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
		ImageIcon iconoFinalh = new ImageIcon(imagenEscaladah);
		botonHelados = new JButton(iconoFinalh);
		botonHelados.setBounds(100, 250, 180, 180);
		botonHelados.setFocusPainted(false);
		this.add(botonHelados);

		textoHelado = new JLabel("Helado");
		textoHelado.setBounds(115, 430, 200, 100);
		textoHelado.setForeground(Color.BLACK);
		textoHelado.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
		add(textoHelado);

		ImageIcon iconoOriginalw = new ImageIcon(getClass().getResource("waffles.jpg"));
		Image imagenEscaladaw = iconoOriginalw.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
		ImageIcon iconoFinalw = new ImageIcon(imagenEscaladaw);
		botonWaffles = new JButton(iconoFinalw);
		botonWaffles.setBounds(350, 250, 180, 180);
		botonWaffles.setFocusPainted(false);
		this.add(botonWaffles);

		textoWaffles = new JLabel("Waffles");
		textoWaffles.setBounds(355, 430, 200, 100);
		textoWaffles.setForeground(Color.BLACK);
		textoWaffles.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
		add(textoWaffles);

		ImageIcon iconoOriginalc = new ImageIcon(getClass().getResource("creps.jpg"));
		Image imagenEscaladac = iconoOriginalc.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
		ImageIcon iconoFinalc = new ImageIcon(imagenEscaladac);
		botonCrepes = new JButton(iconoFinalc);
		botonCrepes.setBounds(600, 250, 180, 180);
		botonCrepes.setFocusPainted(false);
		this.add(botonCrepes);

		textoCrepes = new JLabel("Crepes");
		textoCrepes.setBounds(620, 430, 200, 100);
		textoCrepes.setForeground(Color.BLACK);
		textoCrepes.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
		add(textoCrepes);

		panelGris = new JPanel();
		panelGris.setBounds(0, 0, 900, 140);
		panelGris.setBackground(Color.decode("#FFFFFF"));
		panelGris.setLayout(null);
		add(panelGris);

		textoInicio = new JLabel("Seleccione su producto", JLabel.CENTER);
		textoInicio.setBounds(0, 20, 900, 80);
		textoInicio.setForeground(Color.decode("#D35400"));
		textoInicio.setFont(new Font("Comic Sans MS", Font.BOLD, 48));
		panelGris.add(textoInicio);

		botonVolver = new JButton("VOLVER");
		botonVolver.setBounds(385, 540, 100, 40);
		botonVolver.setBackground(Color.decode("#042F6D"));
		botonVolver.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		botonVolver.setForeground(Color.WHITE);
		botonVolver.setFocusPainted(false);
		botonVolver.setBorderPainted(false);
		add(botonVolver);

		botonPollo = new JButton("Pollo");
		botonPollo.setBounds(760, 170, 80, 30);
		botonPollo.setBackground(Color.RED);
		botonPollo.setForeground(Color.YELLOW);
		botonPollo.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		botonPollo.setFocusPainted(false);
		botonPollo.setBorderPainted(false);
		add(botonPollo);

	}

	public void aplicarInternacionalizacion(Properties prop) {
		setTitle(prop.getProperty("heladeria.start.title"));

	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public JButton getBotonHelados() {
		return botonHelados;
	}

	public void setBotonHelados(JButton botonHelados) {
		this.botonHelados = botonHelados;
	}

	public JButton getBotonCrepes() {
		return botonCrepes;
	}

	public void setBotonCrepes(JButton botonCrepes) {
		this.botonCrepes = botonCrepes;
	}

	public JButton getBotonVolver() {
		return botonVolver;
	}

	public void setBotonVolver(JButton botonVolver) {
		this.botonVolver = botonVolver;
	}

	public JButton getBotonWaffles() {
		return botonWaffles;
	}

	public void setBotonWaffles(JButton botonWaffles) {
		this.botonWaffles = botonWaffles;
	}

	public JLabel getTextoInicio() {
		return textoInicio;
	}

	public void setTextoInicio(JLabel textoInicio) {
		this.textoInicio = textoInicio;
	}

	public JLabel getTextoHelado() {
		return textoHelado;
	}

	public void setTextoHelado(JLabel textoHelado) {
		this.textoHelado = textoHelado;
	}

	public JLabel getTextoCrepes() {
		return textoCrepes;
	}

	public void setTextoCrepes(JLabel textoCrepes) {
		this.textoCrepes = textoCrepes;
	}

	public JLabel getTextoWaffles() {
		return textoWaffles;
	}

	public void setTextoWaffles(JLabel textoWaffles) {
		this.textoWaffles = textoWaffles;
	}

	public JPanel getPanelGris() {
		return panelGris;
	}

	public void setPanelGris(JPanel panelGris) {
		this.panelGris = panelGris;
	}

	public JButton getBotonPollo() {
		return botonPollo;
	}

	public void setBotonPollo(JButton botonPollo) {
		this.botonPollo = botonPollo;
	}

}
