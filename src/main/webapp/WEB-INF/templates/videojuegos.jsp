<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
    <head>
        <meta charset="utf-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <link rel="stylesheet" href="/css/videojuegos.css">
    </head>
    <body class="container">
        <h1>Videojuegos</h1>
        <a class="btn btn-primary" href="/videojuegos/editar">Nuevo</a>
        <div id="data">
            <c:forEach var="vj" items="${listaVideojuegos}">
                <div class="card videojuego">
                    <img class="card-img-top rounded imagen_perfil" src="http://img.unocero.com/2020/09/among-us-2-cancelado-1200x600.jpg">
                    <div class="card-body">
                        <div class="card-title">
                            <h2>${vj.nombre}</h2>
                        </div>
                        <div class="card-text">
                            <h5>${vj.categoria.nombre}</h5>
                        </div>
                        <div>
                            <a href="/videojuegos/modificar/${vj.id}" class="btn btn-secondary">Modificar</a>
                            <a href="/videojuegos/eliminar" class="btn btn-secondary">Eliminar</a>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </body>
</html>