package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.*;

import co.edu.unbosque.model.Crepe;
import co.edu.unbosque.model.CrepeDTO;
import co.edu.unbosque.model.persistence.CrepeDAO;

public class CrepeDAOTest {

	static CrepeDAO cDAO;
	static ArrayList<Crepe> listaOriginal;

	@BeforeClass
	public static void antesDeTodo() {
		cDAO = new CrepeDAO();
		listaOriginal = new ArrayList<>(cDAO.getListaCrepe());

		System.out.println("Empezando pruebas unitarias de CrepeDAO");
	}

	@Before
	public void antesDeCadaPrueba() {
		System.out.println("Iniciando prueba");
	}

	@Test
	public void testCrearCrepe() {
		CrepeDTO hDTO = new CrepeDTO("1", 1, 1, "1", "1");

		int sizeAntes = cDAO.getListaCrepe().size();
		cDAO.crear(hDTO);
		int sizeDespues = cDAO.getListaCrepe().size();

		assertEquals(sizeAntes + 1, sizeDespues);
	}

	@Test
	public void testEliminarCrepeExistente() {
		CrepeDTO hDTO = new CrepeDTO("1", 1, 1, "1", "1");
		cDAO.crear(hDTO);

		int indice = cDAO.getListaCrepe().size() - 1;
		boolean eliminado = cDAO.eliminar(indice);

		assertEquals(true, eliminado);
	}

	@Test
	public void testEliminarCrepeInexistente() {
		boolean eliminado = cDAO.eliminar(999);
		assertEquals(false, eliminado);
	}

	@After
	public void despuesDeCadaPrueba() {
		cDAO.setListaCrepe(new ArrayList<>(listaOriginal));
		System.out.println("Finalizando prueba");
	}

	@AfterClass
	public static void despuesDeTodo() {
		cDAO.setListaCrepe(listaOriginal);
		cDAO.escribirArchivoSerializado();

		System.out.println("Pruebas unitarias de CrepeDAO terminadas.");
	}
}
