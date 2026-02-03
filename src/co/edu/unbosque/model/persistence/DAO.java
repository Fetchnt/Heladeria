package co.edu.unbosque.model.persistence;

public interface DAO <H>{
	
	public void crear(H newData);
	public String mostrarDatos();
	public boolean eliminar(int indice);
	public boolean actualizar(int indice, H datoActualizado);
	public void cargarDesdeArchivoSerializado();
	public void escribirArchivoSerializado();
	
}
