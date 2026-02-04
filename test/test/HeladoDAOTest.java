package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.*;

import co.edu.unbosque.model.Helado;
import co.edu.unbosque.model.HeladoDTO;
import co.edu.unbosque.model.persistence.HeladoDAO;

public class HeladoDAOTest {

	static HeladoDAO hDAO;
	static ArrayList<Helado> listaOriginal;

	@BeforeClass
	public static void antesDeTodo() {
		hDAO = new HeladoDAO();
		listaOriginal = new ArrayList<>(hDAO.getListaHelado());

		System.out.println("Empezando pruebas unitarias de HeladoDAO");
	}

	@Before
	public void antesDeCadaPrueba() {
		System.out.println("Iniciando prueba");
	}

	@Test
	public void testCrearHelado() {
		HeladoDTO hDTO = new HeladoDTO("1", 1, 1, "1");

		int sizeAntes = hDAO.getListaHelado().size();
		hDAO.crear(hDTO);
		int sizeDespues = hDAO.getListaHelado().size();

		assertEquals(sizeAntes + 1, sizeDespues);
	}

	@Test
	public void testEliminarHeladoExistente() {
		HeladoDTO hDTO = new HeladoDTO("1", 1, 1, "1");
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
		hDAO.setListaHelado(new ArrayList<>(listaOriginal));
		System.out.println("Finalizando prueba");
	}

	@AfterClass
	public static void despuesDeTodo() {
		hDAO.setListaHelado(listaOriginal);
		hDAO.escribirArchivoSerializado();

		System.out.println("Pruebas unitarias de HeladoDAO terminadas.");
	}
}
