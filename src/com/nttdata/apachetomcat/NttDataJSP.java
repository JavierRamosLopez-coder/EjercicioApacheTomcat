package com.nttdata.apachetomcat;

/**
 * Clase NttDataJSP
 * 
 * @author jramlope
 *
 */
public class NttDataJSP {

	/**
	 * Método estático que devolverá un valor dependiendo del número pasado por
	 * parámetros
	 * 
	 * @param number
	 * @return
	 */
	public static int numberBiggerThan(int number) {

		if (number > 0) {

			return 1;

		} else {

			return -1;

		}

	}

}
