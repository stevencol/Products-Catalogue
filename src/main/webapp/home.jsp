
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="WEB-INF/head.jsp" />
    <jsp:include page="WEB-INF/modalRegistro.jsp"/>
    <body >
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div  style="background: greenyellow" class="container-fluid">
                <a class="navbar-brand" href="#">Navbar</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div  class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="#">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Link</a>
                        </li>

                    </ul>
                    <form class="d-flex">
                        <input class="form-control me-2" type="search" placeholder="Correo">
                        <input class="form-control me-2" type="search" placeholder="Contraseña">
                        <a href="#" class="p-1" data-bs-toggle="modal" data-bs-target="#regsisterUser1">Registarse</a>
                        <a class="p-1" type="submit">Iniciar</a>


                    </form>
                </div>
            </div>
        </nav>
        ${date}
    </body>
</html>
