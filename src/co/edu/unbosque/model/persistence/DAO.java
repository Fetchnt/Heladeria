package co.edu.unbosque.model.persistence;

import java.util.Properties;

public interface DAO<H> {

	public void crear(H newData);

	public String mostrarDatos();

	public boolean eliminar(int indice);

	public boolean actualizar(int indice, H datoActualizado);

	public void cargarDesdeArchivoSerializado();

	public void escribirArchivoSerializado();
	
	public void ponerPropiedades(Properties prop);

}
