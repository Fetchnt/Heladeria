package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import java.util.Properties;

import co.edu.unbosque.model.Helado;
import co.edu.unbosque.model.HeladoDTO;

public class HeladoDAO implements DAO<HeladoDTO> {

	private ArrayList<Helado> listaHelado;
	private final String SERIAL_FILE_NAME = "helado.bin";

	public HeladoDAO() {
		listaHelado = new ArrayList<>();
		cargarDesdeArchivoSerializado();
	}

	@Override
	public void crear(HeladoDTO newData) {
		Helado entity = DataMapper.convertirHeladoDTOaHelado(newData);
		listaHelado.add(entity);
		escribirArchivoSerializado();
	}

	private String contenido;
	private int i;

	@Override
	public String mostrarDatos() {
		contenido = "";
		i = 1;
		listaHelado.forEach((Helado) -> {
			contenido += "| " + i + 1 + " |" + Helado.toString();
			i++;
		});

		return contenido;
	}

	@Override
	public boolean eliminar(int indice) {
		if (indice < 0 || indice >= listaHelado.size()) {
			return false;
		} else {
			listaHelado.remove(indice);
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
			listaHelado.set(indice, entity);
			escribirArchivoSerializado();
			return true;
		}
	}

	@Override
	public void cargarDesdeArchivoSerializado() {
		Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
		if (contenido != null) {
			listaHelado = (ArrayList<Helado>) contenido;
		} else {
			listaHelado = new ArrayList<>();
		}
	}

	@Override
	public void escribirArchivoSerializado() {
		FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaHelado);

	}

	public ArrayList<Helado> getListaHelado() {
		return listaHelado;
	}

	public void setListaHelado(ArrayList<Helado> listaHelado) {
		this.listaHelado = listaHelado;
	}

	public StringBuilder escribirDesdeArchivoTextoMixto() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		for (Helado Helado : listaHelado) {
			sb.append(Helado.getNombreProducto() + ";" + Helado.getSaborBolas() + Helado.getPrecioProducto()
					+ Helado.getCantidadProducto() + ";" + "\n");
		}
		return sb;
	}
	
	@Override
	public void ponerPropiedades(Properties prop) {
		for (Helado helado : listaHelado) {
			helado.setProp(prop);
		}
	}

}
