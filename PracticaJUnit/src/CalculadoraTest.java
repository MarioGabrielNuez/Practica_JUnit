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
//	void setUp() t	hrows Exception {
//	}
//
//	/**
//	 * @throws java.lang.Exception
//	 */
//	@AfterEach
//	void tearDown() throws Exception {
//	}
	
	
	/*************************************************************************
	 * ******************   PRUEBAS DEL MÉTODO SUMA   ************************
	 *************************************************************************/
	/**
	 * Prueba del Método suma, comprobaremos si el método finaliza su ejecución correctamente o no
	 */
	@Test
	@DisplayName("Prueba suma - Ejecución Correcta (o no) - Método Fail")
	void sumaFail() {
		try {
			calc.suma(Double.parseDouble("2"), 2);
		} catch (Exception e) {
			fail("Error en el Método Calculadora.suma\nFinalizado con Errores.\n" + e);
		}
	}
	
	/**
	 * Prueba del Método Suma, comprobaremos si el método controla el caso de la llegada de un valor no compatible
	 */
	@Test
	@DisplayName("Prueba Suma - Introduce valor no compatible - Método Fail")
	void sumaNull() {
		Double sum = calc.suma('3', 2);
		if (sum == null || sum != 5) {
			fail("Error en el Método Calculadora.suma\nNo controla el caso en el que el usuario meta un valor de tipo diferente a doble");
		};
	}

	/**
	 * Prueba del Método Suma, comprobaremos que el resultado de la suma es el esperado.
	 */
	@Test
	@DisplayName("Prueba Suma - Método assertEquals")
	void sumaEquals() {
		assertEquals(calc.suma(0, 2), 2.0);
	}
	
	
	/*************************************************************************
	 *******************   PRUEBAS DEL MÉTODO RESTA   ************************
	 *************************************************************************/
	/**
	 * Prueba del Método resta, comprobaremos si el método finaliza su ejecución correctamente o no
	 */
	@Test
	@DisplayName("Prueba resta - Ejecución Correcta - Método Fail")
	void restaFail() {
		try {
			calc.resta('c', 2);
		} catch (Exception e) {
			fail("Error en el Método Calculadora.resta\nFinalizado con Errores.\n" + e);
		}
	}
	
	/**
	 * Prueba del Método Resta, comprobaremos si el método controla el caso de la llegada de un valor no compatible
	 */
	@Test
	@DisplayName("Prueba Resta - Introduce valor no compatible - Método Fail")
	void restaNull() {
		Double sum = calc.resta('3', 2);
		if (sum == null || sum != 1.0) {
			fail("Error en el Método Calculadora.resta\nNo controla el caso en el que el usuario meta un valor de tipo diferente a doble");
		};
	}

	/**
	 * Prueba del Método Resta, comprobaremos que el resultado de la Resta es el esperado.
	 */
	@Test
	@DisplayName("Prueba Resta - Método assertEquals")
	void restaEquals() {
		assertEquals(-1.0, calc.resta(1, 2));
	}
	
	
	/*************************************************************************
	 *****************   PRUEBAS DEL MÉTODO MULTIPLICACIÓN   *****************
	 *************************************************************************/
	/**
	 * Prueba del Método multiplicación, comprobaremos si el método finaliza su ejecución correctamente o no
	 */
	@Test
	@DisplayName("Prueba multiplicación - Ejecución Correcta - Método Fail")
	void multiplicacionFail() {
		try {
			calc.multiplicacion(Double.parseDouble("hola"), 2);
		} catch (Exception e) {
			fail("Error en el Método Calculadora.multiplicacion\nFinalizado con Errores.\n" + e);
		}
	}
	
	/**
	 * Prueba del Método multiplicación, comprobaremos que en el caso de rercibir numeros grandes,
	 * el resultado de la multiplicación es el esperado y no causa ningun tipo de error.
	 */
	@Test
	@DisplayName("Prueba multiplicación - Números Grandes")
	void multiplicacionBigNumbers() {
		assertFalse(calc.multiplicacion(999999999.00, 999999999.00) != 999999998000000001.00);
	}
	
	/**
	 * Prueba del Método multiplicación, comprobaremos que el resultado de la multiplicación es el esperado.
	 */
	@Test
	@DisplayName("Prueba multiplicación - Método assertTrue")
	void multiplicacionEquals() {
		assertTrue(calc.multiplicacion(3, 2) == 6);
	}
}
