/**
 * Curso: 2021-22
 * Ciclo: Desarrollo Aplicaciones Multiplataforma
 * Modulo: Entornos de Desarrollo
 * Docente: Sergio Fontán Llamas
 * Practica: Realizacion de pruebas en la clase Calculadora.java con JUnit
 * 
 * @author 
 * @version 1
 * 
 */

public class Calculadora {
	/**
	 * Metodo suma
	 * @param double a
	 * @param double b
	 * 
	 * @return double
	 */
	public double suma(double valor1, double valor2) {
		return valor1 + valor2;
	}
	
	/**
	 * Metodo resta
	 * @param double a
	 * @param double b
	 * 
	 * @return double
	 */
	public double resta(double valor1 , double valor2) {
		return valor1 - valor2;
	}
	
	/**
	 * Metodo multiplicacion
	 * @param double a
	 * @param double b
	 * 
	 * @return double
	 */
	public double multiplicacion(double valor1, double valor2) {
		return valor1 * valor2;
	}
	 
	/**
	 * Metodo division
	 * @param double a
	 * @param double b
	 * 
	 * @return double
	 */
	public double division(double valor1, double valor2) {
		if (valor2 != 0) {
			return valor1 / valor2;
		} else {
			throw new ArithmeticException("el divisor no puede ser 0");
		}
	}	
	
	/**
	 * Metodo factorial
	 * @param double num1
	 * 
	 * @return double
	 */
	public double factorial(double num1) {
		double res = 0;
		if (num1 == 2) {
			res = 2;
		} else if (num1 <= 1){
			res = 1;
		} else {
			res = num1 * factorial(num1 - 1);
		}
		return res;
	}
	
	/**
	 * Metodo raizCuadrada
	 * @param double valor
	 * 
	 * @return double
	 */
	public double raizCuadrada(double valor) {
		return Math.sqrt(valor);
	}
	
	/**
	 * Metodo potencia
	 * @param double base
	 * @param double exponente
	 * 
	 * @return double
	 */
	public double potencia(double base, double exponente) {
		return Math.pow(base, exponente);
	}
	
	/**
	 * Metodo seno
	 * @param double angulo
	 * 
	 * @return double
	 */
	public double seno(double angulo) {
		return Math.sin(angulo);
	}
	
	/**
	 * Metodo coseno
	 * @param double angulo
	 * 
	 * @return double
	 */
	public double coseno(double angulo) {
		return Math.cos(Math.toRadians(angulo));
	}
	
	/**
	 * Metodo tangente
	 * @param double angulo
	 * 
	 * @return double
	 */
	public double tangente(double angulo) {
		return Math.tan(Math.toRadians(angulo));
	}
	
	/**
	 * Metodo arcoseno
	 * @param double angulo
	 * 
	 * @return double
	 */
	public static double arcoseno(double angulo) {
		return Math.asin(Math.toRadians(angulo));
	}
	
	/**
	 * Metodo arcocoseno
	 * @param double angulo
	 * 
	 * @return double
	 */
	public static double arcocoseno(double angulo) {
		return Math.acos(Math.toRadians(angulo));
	}
	
	/**
	 * Metodo arcotangente
	 * @param double angulo
	 * 
	 * @return double
	 */
	public static double arcotangente(double angulo) {
		return Math.atan(Math.toRadians(angulo));
	}
}
