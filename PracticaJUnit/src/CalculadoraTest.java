import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

/**
 * 
 */

/**
 * @author Mario Gabriel N��ez Alc�zar de Velasco
 *
 */
class CalculadoraTest {
	/**
	 * Declaramos el Objeto Calculadora para acceder a sus m�todos no est�ticos
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
	 * ******************   PRUEBAS DEL M�TODO SUMA   ************************
	 *************************************************************************/
	/**
	 * Prueba del M�todo suma, comprobaremos si el m�todo finaliza su ejecuci�n correctamente o no
	 */
	@Test
	@DisplayName("Prueba suma - Ejecuci�n Correcta (o no) - M�todo Fail")
	void sumaFail() {
		try {
			calc.suma(Double.parseDouble("2"), 2);
		} catch (Exception e) {
			fail("Error en el M�todo Calculadora.suma\nFinalizado con Errores.\n" + e);
		}
	}
	
	/**
	 * Prueba del M�todo Suma, comprobaremos si el m�todo controla el caso de la llegada de un valor no compatible
	 */
	@Test
	@DisplayName("Prueba Suma - Introduce valor no compatible - M�todo Fail")
	void sumaNull() {
		Double sum = calc.suma('3', 2);
		if (sum == null || sum != 5) {
			fail("Error en el M�todo Calculadora.suma\nNo controla el caso en el que el usuario meta un valor de tipo diferente a doble");
		};
	}

	/**
	 * Prueba del M�todo Suma, comprobaremos que el resultado de la suma es el esperado.
	 */
	@Test
	@DisplayName("Prueba Suma - M�todo assertEquals")
	void sumaEquals() {
		assertEquals(calc.suma(0, 2), 2.0);
	}
	
	
	/*************************************************************************
	 *******************   PRUEBAS DEL M�TODO RESTA   ************************
	 *************************************************************************/
	/**
	 * Prueba del M�todo resta, comprobaremos si el m�todo finaliza su ejecuci�n correctamente o no
	 */
	@Test
	@DisplayName("Prueba resta - Ejecuci�n Correcta - M�todo Fail")
	void restaFail() {
		try {
			calc.resta('c', 2);
		} catch (Exception e) {
			fail("Error en el M�todo Calculadora.resta\nFinalizado con Errores.\n" + e);
		}
	}
	
	/**
	 * Prueba del M�todo Resta, comprobaremos si el m�todo controla el caso de la llegada de un valor no compatible
	 */
	@Test
	@DisplayName("Prueba Resta - Introduce valor no compatible - M�todo Fail")
	void restaNull() {
		Double sum = calc.resta('3', 2);
		if (sum == null || sum != 1.0) {
			fail("Error en el M�todo Calculadora.resta\nNo controla el caso en el que el usuario meta un valor de tipo diferente a doble");
		};
	}

	/**
	 * Prueba del M�todo Resta, comprobaremos que el resultado de la Resta es el esperado.
	 */
	@Test
	@DisplayName("Prueba Resta - M�todo assertEquals")
	void restaEquals() {
		assertEquals(-1.0, calc.resta(1, 2));
	}
	
	
	/*************************************************************************
	 *****************   PRUEBAS DEL M�TODO MULTIPLICACI�N   *****************
	 *************************************************************************/
	/**
	 * Prueba del M�todo multiplicaci�n, comprobaremos si el m�todo finaliza su ejecuci�n correctamente o no
	 */
	@Test
	@DisplayName("Prueba multiplicaci�n - Ejecuci�n Correcta - M�todo Fail")
	void multiplicacionFail() {
		try {
			calc.multiplicacion(Double.parseDouble("hola"), 2);
		} catch (Exception e) {
			fail("Error en el M�todo Calculadora.multiplicacion\nFinalizado con Errores.\n" + e);
		}
	}
	
	/**
	 * Prueba del M�todo multiplicaci�n, comprobaremos que en el caso de rercibir numeros grandes,
	 * el resultado de la multiplicaci�n es el esperado y no causa ningun tipo de error.
	 */
	@Test
	@DisplayName("Prueba multiplicaci�n - N�meros Grandes")
	void multiplicacionBigNumbers() {
		assertFalse(calc.multiplicacion(999999999.00, 999999999.00) != 999999998000000001.00);
	}
	
	/**
	 * Prueba del M�todo multiplicaci�n, comprobaremos que el resultado de la multiplicaci�n es el esperado.
	 */
	@Test
	@DisplayName("Prueba multiplicaci�n - M�todo assertTrue")
	void multiplicacionEquals() {
		assertTrue(calc.multiplicacion(3, 2) == 6);
	}
}
