package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Waffle;
import co.edu.unbosque.model.WaffleDTO;

public class WaffleDAO implements DAO<WaffleDTO> {

	private ArrayList<WaffleDTO> listaWaffle;
	private final String SERIAL_FILE_NAME = "waffle.bin";

	public WaffleDAO() {
		listaWaffle = new ArrayList<WaffleDTO>();
		cargarDesdeArchivoSerializado();
	}

	@Override
	public void crear(WaffleDTO newData) {
		Waffle entity = DataMapper.convertirWaffleDTOaWaffle(newData);
		listaWaffle.add(newData);
		DataMapper.convertirListaWaffleDTOAListaWaffle(listaWaffle);
		escribirArchivoSerializado();
	}

	@Override
	public String mostrarDatos() {
		StringBuilder content = new StringBuilder();
		ArrayList<Waffle> entities = DataMapper.convertirListaWaffleDTOAListaWaffle(listaWaffle);

		for (int i = 0; i < entities.size(); i++) {
			content.append(i + 1).append(". ").append(entities.get(i).toString()).append("\n");
		}
		return content.toString();
	}

	@Override
	public boolean eliminar(int indice) {
		if (indice < 0 || indice >= listaWaffle.size()) {
			return false;
		} else {
			listaWaffle.remove(indice);
			escribirArchivoSerializado();
			return true;
		}
	}

	@Override
	public boolean actualizar(int indice, WaffleDTO datoActualizado) {
		if (indice < 0 || indice >= listaWaffle.size()) {
			return false;
		} else {
			Waffle entity = DataMapper.convertirWaffleDTOaWaffle(datoActualizado);
			listaWaffle.set(indice, datoActualizado);
			DataMapper.convertirListaWaffleDTOAListaWaffle(listaWaffle);
			escribirArchivoSerializado();
			return true;
		}
	}

	@Override
	public void cargarDesdeArchivoSerializado() {
		Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
		if (contenido != null) {
			listaWaffle = (ArrayList<WaffleDTO>) contenido;
		} else {
			listaWaffle = new ArrayList<WaffleDTO>();
		}
	}

	@Override
	public void escribirArchivoSerializado() {
		FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaWaffle);
	}

}
