package com.nttdata.apachetomcat;

/**
 * Clase NttDataJSP
 * 
 * @author jramlope
 *
 */
public class NttDataJSP {

	/**
	 * M�todo est�tico que devolver� un valor dependiendo del n�mero pasado por
	 * par�metros
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
