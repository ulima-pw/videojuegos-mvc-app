<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
    <head>
    </head>
    <body>
        <ul>
            <c:forEach var="vj" items="${listaVideojuegos}">
            <li>${vj.nombre}</li>
            </c:forEach>
        </ul>

    <body>
</html>