package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Helado;
import co.edu.unbosque.model.HeladoDTO;

public class HeladoDAO implements DAO<HeladoDTO> {

	private ArrayList<HeladoDTO> listaHelado;
	private final String SERIAL_FILE_NAME = "helado.bin";

	public HeladoDAO() {
		listaHelado = new ArrayList<>();
		cargarDesdeArchivoSerializado();
	}

	@Override
	public void crear(HeladoDTO newData) {
		Helado entity = DataMapper.convertirHeladoDTOaHelado(newData);
		listaHelado.add(newData);
		DataMapper.convertirListaHeladoDTOaListaDTO(listaHelado);
		escribirArchivoSerializado();
	}

	@Override
	public String mostrarDatos() {
		StringBuilder content = new StringBuilder();
		ArrayList<Helado> entities = DataMapper.convertirListaHeladoDTOaListaDTO(listaHelado);

		for (int i = 0; i < entities.size(); i++) {
			content.append(i + 1).append(". ").append(entities.get(i).toString()).append("\n");
		}
		return content.toString();
	}

	@Override
	public boolean eliminar(int indice) {
		if (indice < 0 || indice >= listaHelado.size()) {
			return false;
		} else {
			listaHelado.remove(indice);
			// escribirDesdeArchivoDeTexto();
			escribirArchivoSerializado();
			return true;
		}
	}

	@Override
	public boolean actualizar(int indice, HeladoDTO datoActualizado) {
		if (indice < 0 || indice >= listaHelado.size()) {
			return false;
		} else {
			Helado entity = DataMapper.convertirHeladoDTOaHelado(datoActualizado);
			listaHelado.set(indice, datoActualizado);
			DataMapper.convertirListaHeladoDTOaListaDTO(listaHelado);
			escribirArchivoSerializado();
			return true;
		}
	}

	@Override
	public void cargarDesdeArchivoSerializado() {
		Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
		if (contenido != null) {
			listaHelado = (ArrayList<HeladoDTO>) contenido;
		} else {
			listaHelado = new ArrayList<HeladoDTO>();
		}
	}

	@Override
	public void escribirArchivoSerializado() {
		FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaHelado);

	}

	public ArrayList<HeladoDTO> getListaHelado() {
		return listaHelado;
	}

	public void setListaHelado(ArrayList<HeladoDTO> listaHelado) {
		this.listaHelado = listaHelado;
	}

}
