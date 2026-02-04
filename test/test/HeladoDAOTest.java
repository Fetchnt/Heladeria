package test;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

import org.junit.*;

import co.edu.unbosque.model.HeladoDTO;
import co.edu.unbosque.model.persistence.HeladoDAO;

public class HeladoDAOTest {

	static HeladoDAO hDAO;
	static ArrayList<HeladoDTO> listaAntes;

	@BeforeClass
	public static void antesDeTodo() {
		hDAO = new HeladoDAO();
		listaAntes = new ArrayList<>(hDAO.getListaHelado());
		System.out.println("Empezando pruebas unitarias de HeladoDAO");
	}

	@Before
	public void antesDeCadaPrueba() {
		System.out.println("Iniciando prueba");
	}

	@Test
	public void testCrearHelado() {
		HeladoDTO hDTO = new HeladoDTO("Helado", 1, 8000, "Chocolate");

		int sizeAntes = hDAO.getListaHelado().size();
		hDAO.crear(hDTO);
		int sizeDespues = hDAO.getListaHelado().size();

		assertEquals(sizeAntes + 1, sizeDespues);

		HeladoDTO ultimo = hDAO.getListaHelado().get(hDAO.getListaHelado().size() - 1);

		//assertEquals(hDTO.getNombre(), ultimo.getNombre());
	}

	@Test
	public void testEliminarHeladoExistente() {
		HeladoDTO hDTO = new HeladoDTO("Helado", 1, 5000, "Vainilla");
		hDAO.crear(hDTO);

		int indice = hDAO.getListaHelado().size() - 1;
		boolean eliminado = hDAO.eliminar(indice);

		assertEquals(true, eliminado);
	}

	@Test
	public void testEliminarHeladoInexistente() {
		boolean eliminado = hDAO.eliminar(999);
		assertEquals(false, eliminado);
	}

	@After
	public void despuesDeCadaPrueba() {
		hDAO.setListaHelado(new ArrayList<>(listaAntes));
		hDAO.escribirArchivoSerializado();
		System.out.println("Finalizando prueba");
	}

	@AfterClass
	public static void despuesDeTodo() {
		System.out.println("Pruebas unitarias de HeladoDAO terminadas.");
	}
}
