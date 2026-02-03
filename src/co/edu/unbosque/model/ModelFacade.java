package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.HeladoDAO;
public class ModelFacade {

	private HeladoDAO heladoDAO;

	public ModelFacade() {
		heladoDAO = new HeladoDAO();
	}

	public HeladoDAO getHeladoDAO() {
		return heladoDAO;
	}

	public void setHeladoDAO(HeladoDAO heladoDAO) {
		this.heladoDAO = heladoDAO;
	}
	
	
	
}
