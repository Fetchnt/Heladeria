package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.HeladoDTO;

public class HeladoDAO implements DAO<HeladoDTO>{

	public ArrayList<HeladoDTO> listaHeladoDTO;
	private final String SERIAL_FILE_NAME = "helado.bin";
	
	
	public HeladoDAO() {
		listaHeladoDTO = new ArrayList<>();
		cargarDesdeArchivoSerializado();
	}

	@Override
	public void crear(HeladoDTO entity) {
		listaHeladoDTO.add(entity);
		DataMapper.convertirListaHeladoDTOaListaDTO(listaHeladoDTO);
		escribirArchivoSerializado();
	}

	private String contenido = "";
	@Override
	public String mostrarDatos() {
		contenido = "";
		for (int i = 0; i < listaHeladoDTO.size(); i++) {
			contenido += i+1 + "." + listaHeladoDTO.get(i).toString() + "\n";
		}
		//escribirDesdeArchivoDeTexto();
		escribirArchivoSerializado();
		return contenido;
	}

	@Override
	public boolean eliminar(int indice) {
		if (indice < 0 || indice >= listaHeladoDTO.size()) {
			return false;
		} else {
			listaHeladoDTO.remove(indice);
			DataMapper.convertirListaHeladoDTOaListaDTO(listaHeladoDTO);
			// escribirDesdeArchivoDeTexto();
			escribirArchivoSerializado();
			return true;
		}
	}

	@Override
	public boolean eliminar(HeladoDTO objetoAEliminar) {
		DataMapper.convertirListaHeladoDTOaListaDTO(listaHeladoDTO);
		return listaHeladoDTO.remove(objetoAEliminar);
	}

	@Override
	public boolean actualizar(int indice, HeladoDTO datoActualizado) {
		if (indice < 0 || indice >= listaHeladoDTO.size()) {
			return false;
		} else {
			listaHeladoDTO.set(indice, datoActualizado);
			DataMapper.convertirListaHeladoDTOaListaDTO(listaHeladoDTO);
			escribirArchivoSerializado();
			return true;
		}
	}

	@Override
	public int contar() {
		return listaHeladoDTO.size();
	}

	@Override
	public void cargarDesdeArchivoSerializado() {
		Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
		if (contenido != null) {
			listaHeladoDTO = (ArrayList<HeladoDTO>) contenido;
		} else {
			listaHeladoDTO = new ArrayList<HeladoDTO>();
		}
	}

	@Override
	public void escribirArchivoSerializado() {
		FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaHeladoDTO);

	}


}
