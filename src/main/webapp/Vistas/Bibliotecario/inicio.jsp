<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="true" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inicio de Sesión - Sistema Bibliotecario</title>
    <link rel="stylesheet" href="../../styles.css">
    <link
    rel="stylesheet"
    href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css"
  />
</head>
<body>
    
    <div class="background-overlay"></div>
    <div class="contenido">
        <header>
            <a href="#" class="home-icon">
                <img src="../../img/list.png" alt="Inicio">
            </a>
            <h1>Sistema de Gestión Bibliotecaria Institución Educativa X</h1>
            
        </header>
        <div id="sidebarMenu" class="sidebar-menu">
          <ul>
          <ul>
            <li><a href="inicio.jsp"><i class="fas fa-home"></i><span>Inicio</span></a></li>
            <li><a href="${pageContext.request.contextPath}/LibroServlet">
                    <i class="fas fa-book"></i><span>Solicitar Libro</span>
                </a>
            </li>
            <li><a href="${pageContext.request.contextPath}/inicioSesion.jsp"><i class="fas fa-sign-out-alt"></i><span>Salir</span></a></li>

          </ul>

          </ul>
        </div>
        <div class="bienvenida">
            <h2>
                Bienvenido Bibliotecario
                
                <%= (session.getAttribute("usuarioNombre") != null ? session.getAttribute("usuarioNombre") : "Invitado") %>
            </h2>
            <p>Este sistema te permite realizar una gestión bibliotecaria de una manera satisfactoria</p>

        </div>
        
        <main>
        <div class="dashboard">
            <div class="card">
                <h2> Libros Registrados</h2>
                <p>128</p>
            </div>
            <div class="card">
                <h2> Libros Prestados</h2>
                <p>32</p>
            </div>
            <div class="card">
                <h2> Usuarios Registrados</h2>
                <p>56</p>
            </div>
            </div>            
          
        
        </main>

        <footer>
            <p>Leer es soñar con los ojos abiertos y descubrir mundos sin moverse del lugar.</p>
        </footer>
    </div>


            <script src="../../js/inicio.js"></script>

</body>