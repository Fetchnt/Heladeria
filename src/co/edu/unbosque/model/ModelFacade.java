package co.edu.unbosque.model;

import java.util.Properties;

import co.edu.unbosque.model.persistence.CrepeDAO;
import co.edu.unbosque.model.persistence.HeladoDAO;
import co.edu.unbosque.model.persistence.WaffleDAO;

public class ModelFacade {

	private HeladoDAO hDAO;
	private WaffleDAO wDAO;
	private CrepeDAO cDAO;

	public ModelFacade() {
		hDAO = new HeladoDAO();
		wDAO = new WaffleDAO();
		cDAO = new CrepeDAO();
	}

	public HeladoDAO gethDAO() {
		return hDAO;
	}

	public void sethDAO(HeladoDAO hDAO) {
		this.hDAO = hDAO;
	}

	public WaffleDAO getwDAO() {
		return wDAO;
	}

	public void setwDAO(WaffleDAO wDAO) {
		this.wDAO = wDAO;
	}

	public CrepeDAO getcDAO() {
		return cDAO;
	}

	public void setcDAO(CrepeDAO cDAO) {
		this.cDAO = cDAO;
	}

	public void escribirArchivoDeTexto() {
		String content = "";
		content += hDAO.escribirDesdeArchivoTextoMixto().toString() + wDAO.escribirDesdeArchivoTextoMixto().toString()
				+ cDAO.escribirDesdeArchivoTextoMixto().toString();
	}

	public void cargarPropiedades(Properties prop) {
		hDAO.ponerPropiedades(prop);
		wDAO.ponerPropiedades(prop);
		cDAO.ponerPropiedades(prop);
	}

}
