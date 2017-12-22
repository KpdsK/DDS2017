<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Donde Invierto WebApp</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Donde Invierto?</a>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Inicio</a></li>
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#">Cargar<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#">Cuenta</a></li>
							<li><a href="#">Indicador</a></li>
							<li><a href="#">Metodologia</a></li>
						</ul></li>
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#">Consultar<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#">Cuenta</a></li>
							<li><a href="#">Indic ador</a></li>
							<li><a href="#">Metodologia</a></li>
						</ul></li>
					<li><a href="#">Page 3</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#"><span class="glyphicon glyphicon-log-out"></span>
							Cerrar Sesion</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container">
		<h3>Collapsible Navbar</h3>
		<p>In this example, the navigation bar is hidden on small screens
			and replaced by a button in the top right corner (try to re-size this
			window).
		<p>Only when the button is clicked, the navigation bar will be
			displayed.</p>
	</div>

</body>
</html>