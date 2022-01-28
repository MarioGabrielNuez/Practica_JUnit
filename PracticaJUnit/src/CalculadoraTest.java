import static org.junit.jupiter.api.Assertions.*;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.*;
import org.junit.runners.MethodSorters;

/**
 * 
 */

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class CalculadoraTest {
	private static double op1;
	private static double op2;
	
	/**
	 * Declaramos el Objeto Calculadora para acceder a sus métodos no estáticos
	 */
	private static Calculadora calc = new Calculadora();
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		op1 = 7.32;
		op2 = 120.3;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		op1 = 0.0;
		op2 = 0.0;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		op1++;
		op2++;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		op1--;
		op2--;
	}
	
	
	/*************************************************************************
	 * ******************   PRUEBAS DEL MÉTODO SUMA   ************************
	 *************************************************************************/
	/**
	 * Prueba del Método suma, comprobaremos si el método finaliza su ejecución correctamente o no
	 */
	@Test
	@DisplayName("Prueba suma - Ejecución Correcta")
	void m_suma_1() {
		try {
			calc.suma(Double.parseDouble("2"), op1);
		} catch (Exception e) {
			fail("Error en el Método Calculadora.suma\nFinalizado con Errores.\n" + e);
		}
	}
	
	/**
	 * Prueba del Método Suma, comprobaremos si el método controla el caso de la llegada de un valor no compatible
	 */
	@Test
	@DisplayName("Prueba Suma - Introduce valor no compatible")
	void m_suma_2() {
		Double sum = calc.suma('3', op1);
		if (sum != 5) {
			fail("Error en el Método Calculadora.suma\nNo controla la presente casuistica");
		};
	}

	/**
	 * Prueba del Método Suma, comprobaremos que el resultado de la suma es el esperado.
	 */
	@Test
	@DisplayName("Prueba Suma - Método assertEquals")
	void m_suma_3() {
		assertEquals(calc.suma(op2, op1), op2 + op1);
	}
	
	
	/*************************************************************************
	 *******************   PRUEBAS DEL MÉTODO RESTA   ************************
	 *************************************************************************/
	/**
	 * Prueba del Método resta, comprobaremos si el método finaliza su ejecución correctamente o no
	 */
	@Test
	@DisplayName("Prueba resta - Ejecución Correcta")
	void m_resta_1() {
		try {
			calc.resta('c', op1);
		} catch (Exception e) {
			fail("Error en el Método Calculadora.resta\nFinalizado con Errores.\n" + e);
		}
	}
	
	/**
	 * Prueba del Método Resta, comprobaremos si el método controla el caso de la llegada de un valor no compatible
	 */
	@Test
	@DisplayName("Prueba Resta - Introduce valor no compatible")
	void m_resta_2() {
		Double sum = calc.resta('3', op1);
		if (sum != 1.0) {
			fail("Error en el Método Calculadora.resta\nNo controla la presente casuistica");
		};
	}

	/**
	 * Prueba del Método Resta, comprobaremos que el resultado de la Resta es el esperado.
	 */
	@Test
	@DisplayName("Prueba Resta - Método assertEquals")
	void m_resta_3() {
		assertEquals(op2 - op1, calc.resta(op2, op1));
	}
	

	/*************************************************************************
	 *****************   PRUEBAS DEL MÉTODO MULTIPLICACIÓN   *****************
	 *************************************************************************/
	/**
	 * Prueba del Método multiplicación, comprobaremos si el método finaliza su ejecución correctamente o no
	 */
	@Test
	@DisplayName("Prueba multiplicación - Ejecución Correcta")
	void m_multiplicacion_1() {
		try {
			calc.multiplicacion(Double.parseDouble("hola"), op1);
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
	void m_multiplicacion_2() {
		assertFalse(calc.multiplicacion(999999999.00, 999999999.00) != 999999998000000001.00);
	}
	
	/**
	 * Prueba del Método multiplicación, comprobaremos que el resultado de la multiplicación es el esperado.
	 */
	@Test
	@DisplayName("Prueba multiplicación - Método assertTrue")
	void m_multiplicacion_3() {
		assertTrue(calc.multiplicacion(op2, op1) == op2 * op1);
	}
	

	/*************************************************************************
	 *******************   PRUEBAS DEL MÉTODO DIVISION   *********************
	 *************************************************************************/
	/**
	 * Prueba del Método división, comprobaremos si el método finaliza su ejecución correctamente o no
	 */
	@Test
	@DisplayName("Prueba división - Ejecución Correcta")
	void m_division_1() {
		try {
			calc.division(op2, op1);
		} catch (Exception e) {
			fail("Error en el Método Calculadora.división\nFinalizado con Errores.\n" + e);
		}
	}
	
	/**
	 * Prueba del Método división, comprobaremos el caso de recibir un divisor con valor '0.0'
	 */
	@Test
	@DisplayName("Prueba división - Divisior = 0.0")
	void m_division_2() {
		assertThrows(ArithmeticException.class, () -> calc.division(op2, op1 - op1));
	}
	
	/**
	 * Prueba del Método división, comprobaremos que el resultado de la división es el esperado.
	 */
	@Test
	@DisplayName("Prueba división - Método assertEquals")
	void m_division_3() {
		assertEquals(2, calc.division(op2, op1));
	}
	
	/*************************************************************************
	 *******************   PRUEBAS DEL MÉTODO FACTORIAL   ********************
	 *************************************************************************/
	/**
	 * Prueba del Método factorial, comprobaremos si el método finaliza su ejecución correctamente o no
	 */
	@Test
	@DisplayName("Prueba factorial - Ejecución Correcta")
	void m_factorial_1() {
		try {
			calc.factorial(op1);
		} catch (Exception e) {
			fail("Error en el Método Calculadora.factorial\nFinalizado con Errores.\n" + e);
		}
	}
	
	/**
	 * Prueba del Método factorial, comprobaremos que el resultado del factorial es el esperado.
	 */
	@Test
	@DisplayName("Prueba factorial - Método assertEquals")
	void m_factorial_3() {
		assertEquals(120, calc.factorial(5));
	}
	
	/*************************************************************************
	 *****************   PRUEBAS DEL MÉTODO RAIZ CUADRADA   ******************
	 *************************************************************************/
	/**
	 * Prueba del Método Raiz Cuadrada, comprobaremos si el método finaliza su ejecución correctamente o no
	 */
	@Test
	@DisplayName("Prueba Raiz Cuadrada - Ejecución Correcta")
	void m_raizCuadrada_1() {
		try {
			calc.raizCuadrada((int) op1);
		} catch (Exception e) {
			fail("Error en el Método Calculadora.raizCuadrada\nFinalizado con Errores.\n" + e);
		}
	}
	
	/**
	 * Prueba del Método Raiz Cuadrada, comprobamos que el método devuelve valor habiendo recibido numeros raros
	 */
	@Test
	@DisplayName("Prueba Raiz Cuadrada - valor no nulo")
	void m_raizCuadrada_2() {
		assertNotNull(calc.raizCuadrada(Math.E));
	}
	
	/**
	 * Prueba del Método Raiz Cuadrada, comprobaremos que el resultado de la Raiz Cuadrada es el esperado.
	 */
	@Test
	@DisplayName("Prueba Raiz Cuadrada - Método assertEquals")
	void m_raizCuadrada_3() {
		assertEquals(Math.sqrt(op1), calc.raizCuadrada(op1));
	}
	
	/*************************************************************************
	 *******************   PRUEBAS DEL MÉTODO POTENCIA   *********************
	 *************************************************************************/
	/**
	 * Prueba del Método potencia, comprobaremos si el método finaliza su ejecución correctamente o no
	 */
	@Test
	@DisplayName("Prueba potencia - Ejecución Correcta")
	void m_potencia_1() {
		try {
			calc.potencia((int) op1, Double.parseDouble("13.2"));
		} catch (Exception e) {
			fail("Error en el Método Calculadora.potencia\nFinalizado con Errores.\n" + e);
		}
	}
	
	/**
	 * Prueba del Método potencia, comprobamos que el metodo devuelve null en el caso de desbordamiento
	 */
	@Test
	@DisplayName("Prueba potencia - desbordamiento")
	void m_potencia_2() {
		assertNull(calc.potencia(op1,7000));
	}
	
	/**
	 * Prueba del Método potencia, comprobaremos que el resultado de la potencia es el esperado.
	 */
	@Test
	@DisplayName("Prueba potencia - Método assertEquals")
	void m_potencia_3() {
		assertEquals(Math.pow(op2, op1), calc.potencia(op2, op1));
	}
	
	/*************************************************************************
	 *********************   PRUEBAS DEL MÉTODO SENO   ***********************
	 *************************************************************************/
	/**
	 * Prueba del Método seno, comprobaremos si el método finaliza su ejecución correctamente o no
	 */
	@Test
	@DisplayName("Prueba seno - Ejecución Correcta")
	void m_seno_1() {
		try {
			calc.seno(Math.toRadians(op1));
		} catch (Exception e) {
			fail("Error en el Método Calculadora.seno\nFinalizado con Errores.\n" + e);
		}
	}
	
	/**
	 * Prueba del Método seno, comprobamos que el metodo falla al recibir valores en grados
	 * ya que, en vista de la implementacion realizada, para recojer un resultado correcto, 
	 * el método debe recibir los valores en radianes.
	 */
	@Test
	@DisplayName("Prueba seno - valores en grados")
	void m_seno_2() {
		assertNotEquals(Math.sin(Math.toRadians(op1)), calc.seno(op1));
	}
	
	/**
	 * Prueba del Método seno, comprobaremos que el resultado del seno es el esperado
	 * habiendo recibido el angulo en radianes.
	 */
	@Test
	@DisplayName("Prueba seno - valores en radianes")
	void m_seno_3() {
		assertEquals(Math.sin(Math.toRadians(op1)), calc.seno(Math.toRadians(op1)));
	}
	
	/*************************************************************************
	 *********************   PRUEBAS DEL MÉTODO COSENO   *********************
	 *************************************************************************/
	/**
	 * Prueba del Método coseno, comprobaremos si el método finaliza su ejecución correctamente o no
	 */
	@Test
	@DisplayName("Prueba coseno - Ejecución Correcta")
	void m_coseno_1() {
		try {
			calc.coseno(op1);
		} catch (Exception e) {
			fail("Error en el Método Calculadora.coseno\nFinalizado con Errores.\n" + e);
		}
	}
	
	/**
	 * Prueba del Método coseno, comprobamos que el metodo no falla al recibir valores en grados
	 * ya que, en vista de la implementacion realizada, para recojer un resultado correcto, 
	 * el método debe recibir los valores en grados.
	 */
	@Test
	@DisplayName("Prueba coseno - valores en grados")
	void m_coseno_2() {
		assertNotEquals(Math.cos(Math.toRadians(op1)), calc.coseno(op1));
	}
	
	/**
	 * Prueba del Método coseno, comprobaremos que el resultado del coseno es el esperado
	 * habiendo recibido el angulo en radianes.
	 */
	@Test
	@DisplayName("Prueba coseno - valores en radianes")
	void m_coseno_3() {
		assertEquals(Math.cos(Math.toRadians(op1)), calc.coseno(Math.toRadians(op1)));
	}
	
	/*************************************************************************
	 *********************   PRUEBAS DEL MÉTODO TANGENTE   *******************
	 *************************************************************************/
	/**
	 * Prueba del Método tangente, comprobaremos si el método finaliza su ejecución correctamente o no
	 */
	@Test
	@DisplayName("Prueba tangente - Ejecución Correcta")
	void m_tangente_1() {
		try {
			calc.tangente(op1);
		} catch (Exception e) {
			fail("Error en el Método Calculadora.tangente\nFinalizado con Errores.\n" + e);
		}
	}
	
	/**
	 * Prueba del Método tangente, comprobamos que el metodo no falla al recibir valores en grados
	 * ya que, en vista de la implementacion realizada, para recojer un resultado correcto, 
	 * el método debe recibir los valores en grados.
	 */
	@Test
	@DisplayName("Prueba tangente - valores en grados")
	void m_tangente_2() {
		assertNotEquals(Math.cos(Math.toRadians(op1)), calc.tangente(op1));
	}
	
	/**
	 * Prueba del Método tangente, comprobaremos que el resultado de la tangente es el esperado
	 * habiendo recibido el angulo en radianes.
	 */
	@Test
	@DisplayName("Prueba tangente - valores en radianes")
	void m_tangente_3() {
		assertEquals(Math.cos(Math.toRadians(op1)), calc.tangente(Math.toRadians(op1)));
	}
	
	/*************************************************************************
	 *********************   PRUEBAS DEL MÉTODO ARCOSENO   *******************
	 *************************************************************************/
	/**
	 * Prueba del Método arcoseno, comprobaremos si el método finaliza su ejecución correctamente o no
	 */
	@Test
	@DisplayName("Prueba arcoseno - Ejecución Correcta")
	void m_arcoseno_1() {
		try {
			Calculadora.arcoseno(Math.toRadians(op1));
		} catch (Exception e) {
			fail("Error en el Método Calculadora.arcoseno\nFinalizado con Errores.\n" + e);
		}
	}
	
	/**
	 * Prueba del Método arcoseno, comprobamos que el metodo falla al recibir valores en grados
	 * ya que, en vista de la implementacion realizada, para recojer un resultado correcto, 
	 * el método debe recibir los valores en radianes.
	 */
	@Test
	@DisplayName("Prueba arcoseno - valores en grados")
	void m_arcoseno_2() {
		assertNotEquals(Math.sin(Math.toRadians(op1)), Calculadora.arcoseno(op1));
	}
	
	/**
	 * Prueba del Método arcoseno, comprobaremos que el resultado del arcoseno es el esperado
	 * habiendo recibido el angulo en radianes.
	 */
	@Test
	@DisplayName("Prueba arcoseno - valores en radianes")
	void m_arcoseno_3() {
		assertEquals(Math.sin(Math.toRadians(op1)), Calculadora.arcoseno(Math.toRadians(op1)));
	}
	
	/*************************************************************************
	 *********************   PRUEBAS DEL MÉTODO ARCOCOSENO   *****************
	 *************************************************************************/
	/**
	 * Prueba del Método arcocoseno, comprobaremos si el método finaliza su ejecución correctamente o no
	 */
	@Test
	@DisplayName("Prueba arcocoseno - Ejecución Correcta")
	void m_arcocoseno_1() {
		try {
			Calculadora.arcocoseno(op1);
		} catch (Exception e) {
			fail("Error en el Método Calculadora.arcocoseno\nFinalizado con Errores.\n" + e);
		}
	}
	
	/**
	 * Prueba del Método arcocoseno, comprobamos que el metodo no falla al recibir valores en grados
	 * ya que, en vista de la implementacion realizada, para recojer un resultado correcto, 
	 * el método debe recibir los valores en grados.
	 */
	@Test
	@DisplayName("Prueba arcocoseno - valores en grados")
	void m_arcocoseno_2() {
		assertNotEquals(Math.cos(Math.toRadians(op1)), Calculadora.arcocoseno(op1));
	}
	
	/**
	 * Prueba del Método arcocoseno, comprobaremos que el resultado del arcocoseno es el esperado
	 * habiendo recibido el angulo en radianes.
	 */
	@Test
	@DisplayName("Prueba arcocoseno - valores en radianes")
	void m_arcocoseno_3() {
		assertEquals(Math.cos(Math.toRadians(op1)), Calculadora.arcocoseno(Math.toRadians(op1)));
	}
	
	/*************************************************************************
	 *********************   PRUEBAS DEL MÉTODO ARCOTANGENTE   *******************
	 *************************************************************************/
	/**
	 * Prueba del Método arcotangente, comprobaremos si el método finaliza su ejecución correctamente o no
	 */
	@Test
	@DisplayName("Prueba arcotangente - Ejecución Correcta")
	void m_arcotangente_1() {
		try {
			Calculadora.arcotangente(op1);
		} catch (Exception e) {
			fail("Error en el Método Calculadora.arcotangente\nFinalizado con Errores.\n" + e);
		}
	}
	
	/**
	 * Prueba del Método arcotangente, comprobamos que el metodo no falla al recibir valores en grados
	 * ya que, en vista de la implementacion realizada, para recojer un resultado correcto, 
	 * el método debe recibir los valores en grados.
	 */
	@Test
	@DisplayName("Prueba arcotangente - valores en grados")
	void m_arcotangente_2() {
		assertNotEquals(Math.cos(Math.toRadians(op1)), Calculadora.arcotangente(op1));
	}
	
	/**
	 * Prueba del Método arcotangente, comprobaremos que el resultado del arcotangente es el esperado
	 * habiendo recibido el angulo en radianes.
	 */
	@Test
	@DisplayName("Prueba arcotangente - valores en radianes")
	void m_arcotangente_3() {
		assertEquals(Math.cos(Math.toRadians(op1)), Calculadora.arcotangente(Math.toRadians(op1)));
	}
}
