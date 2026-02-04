package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Crepe;
import co.edu.unbosque.model.CrepeDTO;

public class CrepeDAO implements DAO<CrepeDTO> {

	private ArrayList<CrepeDTO> listaCrepe;
	private final String SERIAL_FILE_NAME = "crepe.bin";

	public CrepeDAO() {
		listaCrepe = new ArrayList<CrepeDTO>();
		cargarDesdeArchivoSerializado();
	}

	@Override
	public void crear(CrepeDTO newData) {
		Crepe entity = DataMapper.convertirCrepeDTOaCrepe(newData);
		listaCrepe.add(newData);
		DataMapper.convertirListaCrepeDTOAListaCrepe(listaCrepe);
		escribirArchivoSerializado();
	}

	@Override
	public String mostrarDatos() {
		StringBuilder content = new StringBuilder();
		ArrayList<Crepe> entities = DataMapper.convertirListaCrepeDTOAListaCrepe(listaCrepe);

		for (int i = 0; i < entities.size(); i++) {
			content.append(i + 1).append(". ").append(entities.get(i).toString()).append("\n");
		}
		return content.toString();
	}

	@Override
	public boolean eliminar(int indice) {
		if (indice < 0 || indice >= listaCrepe.size()) {
			return false;
		} else {
			listaCrepe.remove(indice);
			escribirArchivoSerializado();
			return true;
		}
	}

	@Override
	public boolean actualizar(int indice, CrepeDTO datoActualizado) {
		if (indice < 0 || indice >= listaCrepe.size()) {
			return false;
		} else {
			Crepe entity = DataMapper.convertirCrepeDTOaCrepe(datoActualizado);
			listaCrepe.set(indice, datoActualizado);
			DataMapper.convertirListaCrepeDTOAListaCrepe(listaCrepe);
			escribirArchivoSerializado();
			return true;
		}
	}

	@Override
	public void cargarDesdeArchivoSerializado() {
		Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
		if (contenido != null) {
			listaCrepe = (ArrayList<CrepeDTO>) contenido;
		} else {
			listaCrepe = new ArrayList<CrepeDTO>();
		}
	}

	@Override
	public void escribirArchivoSerializado() {
		FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaCrepe);
	}
}
