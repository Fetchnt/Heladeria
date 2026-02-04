package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Waffle;
import co.edu.unbosque.model.WaffleDTO;

public class WaffleDAO implements DAO<WaffleDTO> {

	private ArrayList<Waffle> listaWaffle;
	private final String SERIAL_FILE_NAME = "Waffle.bin";

	public WaffleDAO() {
		listaWaffle = new ArrayList<>();
		cargarDesdeArchivoSerializado();
	}

	@Override
	public void crear(WaffleDTO newData) {
		Waffle entity = DataMapper.convertirWaffleDTOaWaffle(newData);
		listaWaffle.add(entity);
		escribirArchivoSerializado();
	}

	private String contenido;
	private int i;

	@Override
	public String mostrarDatos() {
		contenido = "";
		i = 1;
		listaWaffle.forEach((Waffle) -> {
			contenido += "| " + i + 1 + " |" + Waffle.toString();
			i++;
		});

		return contenido;
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
			listaWaffle.set(indice, entity);
			escribirArchivoSerializado();
			return true;
		}
	}

	@Override
	public void cargarDesdeArchivoSerializado() {
		Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
		if (contenido != null) {
			listaWaffle = (ArrayList<Waffle>) contenido;
		} else {
			listaWaffle = new ArrayList<>();
		}
	}

	@Override
	public void escribirArchivoSerializado() {
		FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaWaffle);

	}

	public ArrayList<Waffle> getListaWaffle() {
		return listaWaffle;
	}

	public void setListaWaffle(ArrayList<Waffle> listaWaffle) {
		this.listaWaffle = listaWaffle;
	}

	public StringBuilder escribirDesdeArchivoTextoMixto() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		for (Waffle Waffle : listaWaffle) {
			sb.append(Waffle.getNombreProducto() + ";" + Waffle.getTipoDeWaffle() + Waffle.getPrecioProducto()
					+ Waffle.getCantidadProducto() + ";" + "\n");
		}
		return sb;
	}

}
