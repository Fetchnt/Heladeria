package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VentanaFactura extends JDialog {

	private JTable tablaFactura;
	private DefaultTableModel modeloFactura;
	private JLabel lblTitulo;
	private JLabel lblTotal;
	private JButton btnSeguirComprando;
	private JButton btnConfirmarCompra;
	private JButton btnCancelar;
	private JLabel textoProducto;
	private Properties prop;

	public VentanaFactura() {
		initializeComponents();
		setVisible(false);
	}

	public VentanaFactura(Properties prop) {
		setProp(prop);
		initializeComponents();
		setVisible(false);
	}

	private void initializeComponents() {
		setTitle("Factura");
		setSize(520, 460);
		setLocationRelativeTo(null);
		setResizable(false);
		setModal(true);
		setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 520, 460);
		panel.setBackground(Color.decode("#FFF8E1"));
		panel.setLayout(null);
		add(panel);

		lblTitulo = new JLabel("Factura de compra", JLabel.CENTER);
		lblTitulo.setBounds(0, 15, 520, 30);
		lblTitulo.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
		lblTitulo.setForeground(Color.decode("#6E2C00"));
		panel.add(lblTitulo);

		String[] columnas = { "Producto", "Tipo", "Detalle", "Precio (COP)" };
		modeloFactura = new DefaultTableModel(columnas, 0);

		tablaFactura = new JTable(modeloFactura);
		tablaFactura.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		tablaFactura.getTableHeader().setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		tablaFactura.setRowHeight(22);

		textoProducto = new JLabel();
		textoProducto.setBounds(60, 90, 520, 30);
		textoProducto.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textoProducto.setForeground(Color.decode("#6E2C00"));
		panel.add(textoProducto);

		JScrollPane scroll = new JScrollPane(tablaFactura);
		scroll.setBounds(30, 60, 460, 230);
		scroll.setBackground(Color.WHITE);
		panel.add(scroll);

		lblTotal = new JLabel("TOTAL: $0 COP");
		lblTotal.setBounds(30, 300, 300, 30);
		lblTotal.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblTotal.setForeground(Color.decode("#7D6608"));
		panel.add(lblTotal);

		btnSeguirComprando = new JButton("Comprar más");
		btnSeguirComprando.setBounds(30, 350, 150, 35);
		btnSeguirComprando.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnSeguirComprando.setBackground(Color.decode("#FAD7A0"));
		btnSeguirComprando.setForeground(Color.decode("#6E2C00"));
		btnSeguirComprando.setFocusPainted(false);
		panel.add(btnSeguirComprando);

		btnConfirmarCompra = new JButton("Confirmar compra");
		btnConfirmarCompra.setBounds(190, 350, 160, 35);
		btnConfirmarCompra.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnConfirmarCompra.setBackground(Color.decode("#ABEBC6"));
		btnConfirmarCompra.setForeground(Color.decode("#145A32"));
		btnConfirmarCompra.setFocusPainted(false);
		panel.add(btnConfirmarCompra);

		btnCancelar = new JButton("Cancelar factura");
		btnCancelar.setBounds(360, 350, 130, 35);
		btnCancelar.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		btnCancelar.setBackground(Color.decode("#F5EFE7"));
		btnCancelar.setForeground(Color.decode("#6E2C00"));
		btnCancelar.setFocusPainted(false);
		panel.add(btnCancelar);
	}

	public void aplicarInternacionalizacion(Properties prop) {
		setTitle(prop.getProperty("heladeria.dialog.factura.title"));
		lblTitulo.setText(prop.getProperty("heladeria.dialog.factura.header"));
		lblTotal.setText(prop.getProperty("heladeria.dialog.factura.total"));

		btnSeguirComprando.setText(prop.getProperty("heladeria.dialog.factura.more"));
		btnConfirmarCompra.setText(prop.getProperty("heladeria.dialog.factura.confirm"));
		btnCancelar.setText(prop.getProperty("heladeria.dialog.factura.cancel"));

		modeloFactura.setColumnIdentifiers(new Object[] { prop.getProperty("heladeria.factura.col.producto"),
				prop.getProperty("heladeria.factura.col.tipo"), prop.getProperty("heladeria.factura.col.detalle"),
				prop.getProperty("heladeria.factura.col.precio") });
	}

	public JTable getTablaFactura() {
		return tablaFactura;
	}

	public void setTablaFactura(JTable tablaFactura) {
		this.tablaFactura = tablaFactura;
	}

	public DefaultTableModel getModeloFactura() {
		return modeloFactura;
	}

	public void setModeloFactura(DefaultTableModel modeloFactura) {
		this.modeloFactura = modeloFactura;
	}

	public JLabel getLblTitulo() {
		return lblTitulo;
	}

	public void setLblTitulo(JLabel lblTitulo) {
		this.lblTitulo = lblTitulo;
	}

	public JLabel getLblTotal() {
		return lblTotal;
	}

	public void setLblTotal(JLabel lblTotal) {
		this.lblTotal = lblTotal;
	}

	public JButton getBtnSeguirComprando() {
		return btnSeguirComprando;
	}

	public void setBtnSeguirComprando(JButton btnSeguirComprando) {
		this.btnSeguirComprando = btnSeguirComprando;
	}

	public JButton getBtnConfirmarCompra() {
		return btnConfirmarCompra;
	}

	public void setBtnConfirmarCompra(JButton btnConfirmarCompra) {
		this.btnConfirmarCompra = btnConfirmarCompra;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}

	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public JLabel getTextoProducto() {
		return textoProducto;
	}

	public void setTextoProducto(JLabel textoProducto) {
		this.textoProducto = textoProducto;
	}

}
