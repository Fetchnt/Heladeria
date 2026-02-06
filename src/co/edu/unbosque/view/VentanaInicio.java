package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.util.Properties;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaInicio extends JFrame {

	private Properties prop;
	private JPanel panelHeader;
	private JPanel panelOptions;
	private JLabel lTitle;
	private JLabel lWelcome;
	private JLabel lRoleHint;
	private JButton btnAccess;
	private JButton btnExit;
	private JComboBox<String> cbLanguage;

	public VentanaInicio() {
		initializeComponents();
		setVisible(false);
	}

	public VentanaInicio(Properties prop) {
		setProp(prop);
		initializeComponents();
		setVisible(false);
	}

	private void initializeComponents() {
		setTitle("Heladaria - Inicio");
		setSize(900, 650);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		getContentPane().setBackground(Color.decode("#F5EFE7"));

		panelHeader = new JPanel();
		panelHeader.setBounds(0, 0, 900, 140);
		panelHeader.setBackground(Color.decode("#FFFFFF"));
		panelHeader.setLayout(null);
		add(panelHeader);

		lTitle = new JLabel("Heladeria", JLabel.CENTER);
		lTitle.setBounds(0, 35, panelHeader.getWidth(), 60);
		lTitle.setFont(new Font("Comic Sans MS", Font.BOLD, 56));
		lTitle.setForeground(Color.decode("#D35400"));
		panelHeader.add(lTitle);

		panelOptions = new JPanel();
		panelOptions.setBounds(280, 190, 340, 320);
		panelOptions.setBackground(Color.decode("#FFFFFF"));
		panelOptions.setLayout(null);
		add(panelOptions);

		lWelcome = new JLabel("Bienvenido");
		lWelcome.setBounds(95, 20, 200, 30);
		lWelcome.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lWelcome.setForeground(Color.decode("#6E2C00"));
		panelOptions.add(lWelcome);

		lRoleHint = new JLabel("Seleccione el idioma:");
		lRoleHint.setBounds(30, 70, 200, 22);
		lRoleHint.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		panelOptions.add(lRoleHint);

		cbLanguage = new JComboBox<>(new String[] { "Español", "English" });
		cbLanguage.setBounds(30, 110, 280, 35);
		cbLanguage.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		panelOptions.add(cbLanguage);

		btnAccess = new JButton("Continuar");
		btnAccess.setBounds(30, 190, 280, 40);
		btnAccess.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnAccess.setBackground(Color.decode("#FAD7A0"));
		btnAccess.setForeground(Color.decode("#6E2C00"));
		btnAccess.setFocusPainted(false);
		btnAccess.setBorderPainted(false);
		panelOptions.add(btnAccess);

		btnExit = new JButton("Salir");
		btnExit.setBounds(120, 255, 100, 30);
		btnExit.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		btnExit.setBackground(Color.decode("#F5EFE7"));
		btnExit.setForeground(Color.decode("#6E2C00"));
		btnExit.setFocusPainted(false);
		btnExit.setBorderPainted(false);
		panelOptions.add(btnExit);

		ImageIcon imageHelados = new ImageIcon(getClass().getResource("HeladosInicio.jpg"));
		JLabel lHelados = new JLabel(imageHelados);
		lHelados.setBounds(0, 139, 884, 472);
		getContentPane().add(lHelados);

	}

	public void aplicarInternacionalizacion(Properties prop) {
		setTitle(prop.getProperty("heladeria.start.title"));
		lWelcome.setText(prop.getProperty("heladeria.start.welcome"));
		lRoleHint.setText(prop.getProperty("heladeria.start.role"));
		btnAccess.setText(prop.getProperty("heladeria.start.continue"));
		btnExit.setText(prop.getProperty("heladeria.start.exit"));

	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public JPanel getPanelHeader() {
		return panelHeader;
	}

	public void setPanelHeader(JPanel panelHeader) {
		this.panelHeader = panelHeader;
	}

	public JPanel getPanelOptions() {
		return panelOptions;
	}

	public void setPanelOptions(JPanel panelOptions) {
		this.panelOptions = panelOptions;
	}

	public JLabel getlTitle() {
		return lTitle;
	}

	public void setlTitle(JLabel lTitle) {
		this.lTitle = lTitle;
	}

	public JLabel getlWelcome() {
		return lWelcome;
	}

	public void setlWelcome(JLabel lWelcome) {
		this.lWelcome = lWelcome;
	}

	public JLabel getlRoleHint() {
		return lRoleHint;
	}

	public void setlRoleHint(JLabel lRoleHint) {
		this.lRoleHint = lRoleHint;
	}

	public JButton getBtnAccess() {
		return btnAccess;
	}

	public void setBtnAccess(JButton btnAccess) {
		this.btnAccess = btnAccess;
	}

	public JButton getBtnExit() {
		return btnExit;
	}

	public void setBtnExit(JButton btnExit) {
		this.btnExit = btnExit;
	}

	public JComboBox<String> getCbLanguage() {
		return cbLanguage;
	}

	public void setCbLanguage(JComboBox<String> cbLanguage) {
		this.cbLanguage = cbLanguage;
	}

}
