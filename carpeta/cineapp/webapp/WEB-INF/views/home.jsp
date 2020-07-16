<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bienvenido a CineApp</title>
</head>
<body>
	<h1> Listado de peliculas</h1>
	
	<ol>
		<c:forEach items="${peliculas}" var="pelicula">
		-	<li> ${pelicula} </li>		
		</c:forEach>
	</ol>
	
	Tabla de peliculas
	
	<table border="1">
		<thead>
			<tr>
				<th>Id</th>
				<th>Titulo</th>
				<th>Duración</th>
				<th>Clasificación</th>
				<th>Genero</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${peliculas}" var="pelicula">
				<tr>
					<th> ${pelicula.id}</th>
					<th> ${pelicula.titulo}</th>
					<th> ${pelicula.duracion} min</th>
					<th> ${pelicula.clasificacion}</th>
					<th> ${pelicula.genero}</th>
				</tr>	
			</c:forEach>		
		</tbody>
	</table>
	
</body>
</html>