package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartWindow extends JFrame {

	private static final long serialVersionUID = 1L;

	private Properties prop;

	private JPanel panelHeader;
	private JPanel panelOptions;

	private JLabel lTitle;
	private JLabel lWelcome;
	private JLabel lRoleHint;
	private JLabel lLanguage;

	private JButton btnAccess;
	private JButton btnExit;

	// Selector de rol
	private JComboBox<String> cbRole;

	// Selector de idioma
	private JComboBox<String> cbLanguage;

	public StartWindow() {
		initializeComponents();
		setVisible(false);
	}

	public StartWindow(Properties prop) {
		setProp(prop);
		initializeComponents();
		setVisible(false);
	}

	private void initializeComponents() {
		// -------- CONFIG GENERAL --------
		setTitle("Heladaria NoseQue - Inicio");
		setSize(900, 650);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		getContentPane().setBackground(Color.decode("#F5EFE7"));

		// -------- HEADER --------
		panelHeader = new JPanel();
		panelHeader.setBounds(0, 0, 900, 140);
		panelHeader.setBackground(Color.decode("#FFFFFF"));
		panelHeader.setLayout(null);
		add(panelHeader);

		lTitle = new JLabel("Heladeria NoseQue", JLabel.CENTER);
		lTitle.setBounds(0, 35, panelHeader.getWidth(), 60);
		lTitle.setFont(new Font("Georgia", Font.BOLD, 56));
		lTitle.setForeground(Color.decode("#D35400"));
		panelHeader.add(lTitle);

		// -------- PANEL OPCIONES --------
		panelOptions = new JPanel();
		panelOptions.setBounds(280, 190, 340, 320);
		panelOptions.setBackground(Color.decode("#FFFFFF"));
		panelOptions.setLayout(null);
		add(panelOptions);

		lWelcome = new JLabel("Bienvenido");
		lWelcome.setBounds(95, 15, 200, 30);
		lWelcome.setFont(new Font("Noto Sans", Font.BOLD, 24));
		lWelcome.setForeground(Color.decode("#6E2C00"));
		panelOptions.add(lWelcome);

		lRoleHint = new JLabel("Desea ingresar como: ");
		lRoleHint.setBounds(30, 65, 200, 20);
		lRoleHint.setFont(new Font("Noto Sans", Font.PLAIN, 14));
		panelOptions.add(lRoleHint);

		cbRole = new JComboBox<>(new String[] { "Cliente" });
		cbRole.setBounds(30, 90, 280, 35);
		cbRole.setFont(new Font("Noto Sans", Font.PLAIN, 15));
		panelOptions.add(cbRole);

		lLanguage = new JLabel("Idioma");
		lLanguage.setBounds(30, 140, 200, 20);
		lLanguage.setFont(new Font("Noto Sans", Font.PLAIN, 14));
		panelOptions.add(lLanguage);

		cbLanguage = new JComboBox<>(new String[] { "Español"/* , "English", "Português", "Français" */ });
		cbLanguage.setBounds(30, 165, 280, 35);
		cbLanguage.setFont(new Font("Noto Sans", Font.PLAIN, 15));
		panelOptions.add(cbLanguage);

		btnAccess = new JButton("Continuar");
		btnAccess.setBounds(30, 225, 280, 40);
		btnAccess.setFont(new Font("Noto Sans", Font.BOLD, 18));
		btnAccess.setBackground(Color.decode("#FAD7A0"));
		btnAccess.setForeground(Color.decode("#6E2C00"));
		btnAccess.setFocusPainted(false);
		btnAccess.setBorderPainted(false);
		panelOptions.add(btnAccess);

		btnExit = new JButton("Salir");
		btnExit.setBounds(120, 275, 100, 30);
		btnExit.setFont(new Font("Noto Sans", Font.PLAIN, 14));
		btnExit.setBackground(Color.decode("#F5EFE7"));
		btnExit.setForeground(Color.decode("#6E2C00"));
		btnExit.setFocusPainted(false);
		btnExit.setBorderPainted(false);
		panelOptions.add(btnExit);
	}

	// -------- INTERNACIONALIZACIÓN --------
	public void aplicarInternacionalizacion(Properties prop) {
		setTitle(prop.getProperty("heladeria.start.title"));
		lWelcome.setText(prop.getProperty("heladeria.start.welcome"));
		lRoleHint.setText(prop.getProperty("heladeria.start.role"));
		lLanguage.setText(prop.getProperty("heladeria.start.language"));
		btnAccess.setText(prop.getProperty("heladeria.start.continue"));
		btnExit.setText(prop.getProperty("heladeria.start.exit"));

		cbRole.removeAllItems();
		cbRole.addItem(prop.getProperty("heladeria.start.role.client"));
		cbRole.addItem(prop.getProperty("heladeria.start.role.admin"));
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

	public JLabel getlLanguage() {
		return lLanguage;
	}

	public void setlLanguage(JLabel lLanguage) {
		this.lLanguage = lLanguage;
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

	public JComboBox<String> getCbRole() {
		return cbRole;
	}

	public void setCbRole(JComboBox<String> cbRole) {
		this.cbRole = cbRole;
	}

	public JComboBox<String> getCbLanguage() {
		return cbLanguage;
	}

	public void setCbLanguage(JComboBox<String> cbLanguage) {
		this.cbLanguage = cbLanguage;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}
	
	
}
