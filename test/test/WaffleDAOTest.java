package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.*;

import co.edu.unbosque.model.Waffle;
import co.edu.unbosque.model.WaffleDTO;
import co.edu.unbosque.model.persistence.WaffleDAO;

public class WaffleDAOTest {

	static WaffleDAO cDAO;
	static ArrayList<Waffle> listaOriginal;

	@BeforeClass
	public static void antesDeTodo() {
		cDAO = new WaffleDAO();
		listaOriginal = new ArrayList<>(cDAO.getListaWaffle());

		System.out.println("Empezando pruebas unitarias de WaffleDAO");
	}

	@Before
	public void antesDeCadaPrueba() {
		System.out.println("Iniciando prueba");
	}

	@Test
	public void testCrearWaffle() {
		WaffleDTO hDTO = new WaffleDTO("1", 1, 1, "1", "1");

		int sizeAntes = cDAO.getListaWaffle().size();
		cDAO.crear(hDTO);
		int sizeDespues = cDAO.getListaWaffle().size();

		assertEquals(sizeAntes + 1, sizeDespues);
	}

	@Test
	public void testEliminarWaffleExistente() {
		WaffleDTO hDTO = new WaffleDTO("1", 1, 1, "1", "1");
		cDAO.crear(hDTO);

		int indice = cDAO.getListaWaffle().size() - 1;
		boolean eliminado = cDAO.eliminar(indice);

		assertEquals(true, eliminado);
	}

	@Test
	public void testEliminarWaffleInexistente() {
		boolean eliminado = cDAO.eliminar(999);
		assertEquals(false, eliminado);
	}

	@After
	public void despuesDeCadaPrueba() {
		cDAO.setListaWaffle(new ArrayList<>(listaOriginal));
		System.out.println("Finalizando prueba");
	}

	@AfterClass
	public static void despuesDeTodo() {
		cDAO.setListaWaffle(listaOriginal);
		cDAO.escribirArchivoSerializado();

		System.out.println("Pruebas unitarias de WaffleDAO terminadas.");
	}
}
