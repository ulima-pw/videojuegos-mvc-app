<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
    <head>
        <meta charset="utf-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    </head>
    <body class="container">
        <h1>Registrar Videojuego</h1>
        <c:choose>
            <c:when test="${videojuego == null}">
                <form action="/videojuegos/guardar" method="post">
                    <div class="form-group">
                        <label for="videojuego_id">Id</label>
                        <input type="text" class="form-control" id="videojuego_id" name="videojuego_id" readonly="true"/>
                    </div>
                    <div class="form-group">
                        <label for="videojuego_nombre">Nombre</label>
                        <input type="text" class="form-control" id="videojuego_nombre" name="videojuego_nombre"/>
                    </div>
                    <div class="form-group">
                        <label for="videojuego_categoria">Categoría</label>
                        <select class="form-control" id="videojuego_categoria" name="videojuego_categoria">
                            <option value="0">---- Seleccionar una categoría ----</option>
                            <c:forEach var="categoria" items="${categorias}">
                                <option value="${categoria.id}">${categoria.nombre}</option>
                            </c:forEach>
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="videojuego_consolas">Consolas</label>
                        <input type="text" class="form-control" id="videojuego_consolas" name="videojuego_consolas"/>
                    </div>
                    <div class="form-group">
                        <label for="videojuego_desarrollador">Desarrollador</label>
                        <input type="text" class="form-control" id="videojuego_desarrollador"/>
                    </div>
                    <div class="form-group">
                        <label for="videojuego_ranking">Ranking</label>
                        <input type="number" class="form-control" id="videojuego_ranking"/>
                    </div>
                    <button id="but_guardar" type="submit" class="btn btn-primary">Guardar</button>
                    <button id="but_regresar" type="button" class="btn btn-primary">Regresar</button>
                </form>
            </c:when>
            <c:otherwise>
                <form action="/videojuegos/guardar" method="post">
                    <div class="form-group">
                        <label for="videojuego_id">Id</label>
                        <input type="text" class="form-control"
                                id="videojuego_id" name="videojuego_id" readonly="true"
                                value="${videojuego.id}"/>
                    </div>
                    <div class="form-group">
                        <label for="videojuego_nombre">Nombre</label>
                        <input type="text" class="form-control" id="videojuego_nombre"
                                name="videojuego_nombre" value="${videojuego.nombre}"/>
                    </div>
                    <div class="form-group">
                        <label for="videojuego_categoria">Categoría</label>
                        <select class="form-control" id="videojuego_categoria" name="videojuego_categoria">
                            <option value="0">---- Seleccionar una categoría ----</option>
                            <c:forEach var="categoria" items="${categorias}">
                                <option value="${categoria.id}">${categoria.nombre}</option>
                            </c:forEach>
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="videojuego_consolas">Consolas</label>
                        <input type="text" class="form-control" id="videojuego_consolas"
                                name="videojuego_consolas"/>
                    </div>
                    <div class="form-group">
                        <label for="videojuego_desarrollador">Desarrollador</label>
                        <input type="text" class="form-control" id="videojuego_desarrollador"/>
                    </div>
                    <div class="form-group">
                        <label for="videojuego_ranking">Ranking</label>
                        <input type="number" class="form-control" id="videojuego_ranking"/>
                    </div>
                    <button id="but_guardar" type="submit" class="btn btn-primary">Guardar</button>
                    <button id="but_regresar" type="button" class="btn btn-primary">Regresar</button>
                </form>
            </c:otherwise>
        </c:choose>

    </body>
</html>