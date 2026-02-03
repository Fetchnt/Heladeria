package co.edu.unbosque.model.persistence;

public interface DAO <H>{
	
	public void crear(H nuevoDato);
	public String mostrarDatos();
	public boolean eliminar(int indice);
	public boolean eliminar(H objetoAEliminar);
	public boolean actualizar(int indice, H datoActualizado);
	public int contar();
	public void cargarDesdeArchivoSerializado();
	public void escribirArchivoSerializado();
	
}
