<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags"
prefix="spring"%>
<spring:url value="/resources" var="urlPublic" />
<link href="${urlPublic}/css/myStyle.css" rel="stylesheet">
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html ">
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bienvenido a CineApp</title>
</head>
<body>
${urlPublic}/images/elMaquinista.jpg

	<%-- 	<ol>
		<c:forEach items="${peliculas}" var="pelicula">
		-	<li> ${pelicula} </li>		
		</c:forEach>
	</ol> --%>
	

	<div class="panel panel-default">
		<div class="panel-heading">Listado de peliculas</div>
		<div class="panel-body">
			<table class="table table-striped table-bordered table-hover">
				<thead>
					<tr>
						<th>Id</th>
						<th>Titulo</th>
						<th>Duración</th>
						<th>Clasificación</th>
						<th>Genero</th>
						<th>Imagen</th>
						<th>Fecha Estreno</th>
						<th>Estatus</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${peliculas}" var="pelicula">
						<tr>
							<th>${pelicula.id}</th>
							<th>${pelicula.titulo}</th>
							<th>${pelicula.duracion} min</th>
							<th>${pelicula.clasificacion}</th>
							<th>${pelicula.genero}</th>
							<th><img alt="imag3n" src="${urlPublic }/images/${pelicula.imagen}" width="80" height="120"></th>
							<th><fmt:formatDate value="${pelicula.fechaEstreno }" pattern="dd-mm-yyyy"/></th>
							<th>${pelicula.estatus}</th>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	

	
</body>
</html>