<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bienvenido a CineApp</title>
<spring:url value="/resources" var="urlPublic" />
<link rel="stylesheet"	href="${urlPublic}/bootstrap/css/bootstrap.min.css">

</head>
<body>
${urlPublic}/images/elMaquinista.jpg <br>
${urlPublic}

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
						<th>Duraci�n</th>
						<th>Clasificaci�n</th>
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
							<th>
							
								<c:choose>
									<c:when test="${pelicula.estatus=='Activa' }">
										<span class="label label-success"> ACTIVA</span>
									</c:when>
									<c:otherwise>
										<span class="label label-danger">INACTIVA</span>
									</c:otherwise>
								</c:choose>
							
							</th>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	

	
</body>
</html>