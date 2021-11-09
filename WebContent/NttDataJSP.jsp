<%@ page import="com.nttdata.apachetomcat.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>NttDataJSP -- Javier Ramos López</title>
</head>
<body>

	<p>Bienvenidos a la aplicación</p>

	<p>Vamos a contar la longitud de una palabra</p>

	<%
		String palabra = "NttData";

	for (int i = 1; i <= palabra.length(); i++) {

		out.println("La palabra tiene " + i + " caracteres");

	}
	%>

	<p>Vamos a llamar al método de la clase NttDataJSP</p>

	<%=NttDataJSP.numberBiggerThan(-4)%>

</body>
</html>