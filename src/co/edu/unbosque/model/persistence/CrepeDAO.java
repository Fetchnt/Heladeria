package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import java.util.Properties;

import co.edu.unbosque.model.Crepe;
import co.edu.unbosque.model.CrepeDTO;

public class CrepeDAO implements DAO<CrepeDTO> {

	private ArrayList<Crepe> listaCrepe;
	private final String SERIAL_FILE_NAME = "crepe.bin";

	public CrepeDAO() {
		listaCrepe = new ArrayList<>();
		cargarDesdeArchivoSerializado();
	}

	@Override
	public void crear(CrepeDTO newData) {
		Crepe entity = DataMapper.convertirCrepeDTOaCrepe(newData);
		listaCrepe.add(entity);
		escribirArchivoSerializado();
	}

	private String contenido;
	private int i;

	@Override
	public String mostrarDatos() {
		contenido = "";
		i = 1;
		listaCrepe.forEach((Crepe) -> {
			contenido += "| " + i + 1 + " |" + Crepe.toString();
			i++;
		});

		return contenido;
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
			listaCrepe.set(indice, entity);
			escribirArchivoSerializado();
			return true;
		}
	}

	@Override
	public void cargarDesdeArchivoSerializado() {
		Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
		if (contenido != null) {
			listaCrepe = (ArrayList<Crepe>) contenido;
		} else {
			listaCrepe = new ArrayList<>();
		}
	}

	@Override
	public void escribirArchivoSerializado() {
		FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaCrepe);

	}

	public ArrayList<Crepe> getListaCrepe() {
		return listaCrepe;
	}

	public void setListaCrepe(ArrayList<Crepe> listaCrepe) {
		this.listaCrepe = listaCrepe;
	}

	public StringBuilder escribirDesdeArchivoTextoMixto() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		for (Crepe Crepe : listaCrepe) {
			sb.append(Crepe.getNombreProducto() + ";" + Crepe.getTipoDeCrepe() + Crepe.getPrecioProducto()
					+ Crepe.getCantidadProducto() + ";" + "\n");
		}
		return sb;
	}
	
	@Override
	public void ponerPropiedades(Properties prop) {
		for (Crepe crepe : listaCrepe) {
			crepe.setProp(prop);
		}		
	}
}
