package com.nttdata.apachetomcat;

/**
 * Librerías importadas 
 */
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Clase NttDataServlet
 * 
 * @author jramlope
 *
 */
@WebServlet("/NttDataServlet")
public class NttDataServlet extends HttpServlet {

	/** Atributo estático Serializable **/
	private static final long serialVersionUID = 1L;

	/**
	 * Método constructor
	 * 
	 * @see HttpServlet#HttpServlet()
	 */
	public NttDataServlet() {
		super();
	}

	/**
	 * Método para la obtención del GET
	 * 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Bienvenidos, soy Javier Ramos López");
	}

	/**
	 * Método para la obtención del POST
	 * 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Creación de parámetros
		final String parametro1 = request.getParameter("parametro1");

		final String parametro2 = request.getParameter("parametro2");

		final String parametro3 = request.getParameter("parametro3");

		// Respuesta para la anterior creación de parámetros
		response.getWriter().append(parametro1 + " " + parametro2 + " " + parametro3 + " ");

		doGet(request, response);
	}

}
