<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Foster</title>
<!-- Required meta tags -->
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />

<!-- Bootstrap CSS v5.2.1 -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous" />
</head>

<body>
	<header style="background-color: rgb(23, 24, 71)" class="py-3">
		<img src="img-foster/logo.svg" alt="" />
	</header>
	<main>
		<div class="row justify-content-center mt-3">
			<c:forEach items="${listadoCategorias}" var="categoria">
				<div class="col-xl-2 col-lg-3 col-md-4 col-6 mb-3">
					<div class="card">
						<a
							href="ControllerAdmin?operacion=obtenerplatos&categoriaID=${categoria.categoriaID}"
							class="text-decoration-none text-secondary"> <img
							class="card-img-top" src="img-foster/category/${categoria.nombre}.png"
							alt="Title" />
							<div class="card-body">
								<h4 class="card-title">
									<c:out value="${categoria.nombre}" />
								</h4>
							</div>
						</a>
					</div>
				</div>
			</c:forEach>
		</div>
		
		<c:if test="${listaProductorPorCategoria != null}">
			
			<h1 class="text-center">Listado de Productos de la categoria <c:out value="${nombreCategoria}"></c:out></h1>
			
			<div class="row justify-content-center mt-3">
			<c:forEach items="${listaProductorPorCategoria}" var="producto">
				<div class="col-xl-2 col-lg-3 col-md-4 col-6 mb-3">
					<div class="card">
						<img
							class="card-img-top" src="${producto.imagen}"
							alt="Title" />
							<div class="card-body">
								<h4 class="card-title">
									<c:out value="${producto.titulo}" />
								</h4>
								<p class="card-text">${producto.sumario}</p>
							</div>
					</div>
				</div>
			</c:forEach>
		</div>
			
			</c:if>
	</main>
	<footer style="background-color: rgb(23, 24, 71)">
		<h1 class="text-center" style="color: white">Si cenas aquí eres
			tonto</h1>
	</footer>
	<!-- Bootstrap JavaScript Libraries -->
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
		integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
		crossorigin="anonymous"></script>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js"
		integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+"
		crossorigin="anonymous"></script>
</body>
</html>
