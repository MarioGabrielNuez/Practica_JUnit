import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

/**
 * 
 */

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 *
 */
class CalculadoraTest {
	/**
	 * Declaramos el Objeto Calculadora para acceder a sus métodos no estáticos
	 */
	private static Calculadora calc = new Calculadora();
	
//	/**
//	 * @throws java.lang.Exception
//	 */
//	@BeforeAll
//	static void setUpBeforeClass() throws Exception {
//	}
//
//	/**
//	 * @throws java.lang.Exception
//	 */
//	@AfterAll
//	static void tearDownAfterClass() throws Exception {
//	}
//
//	/**
//	 * @throws java.lang.Exception
//	 */
//	@BeforeEach
//	void setUp() throws Exception {
//	}
//
//	/**
//	 * @throws java.lang.Exception
//	 */
//	@AfterEach
//	void tearDown() throws Exception {
//	}

	/**
	 * Prueba del Método Suma, comprobaremos que el resultado de la suma es el esperado.
	 */
	@Test
	@DisplayName("Prueba Suma")
	void suma() {
		assertEquals(2, calc.suma(0, 2));
	}

}
