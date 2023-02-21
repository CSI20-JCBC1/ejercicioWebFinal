<%@ include file="/vistas/cabecera.jsp" %>

<html>
  <head>
  <title>SegundaEjemploWeb</title>
  </head>
  <body>
    <h1>EJEMPLO APLICACIÓN WEB</h1>
    <p>SEGUNDA (dentro de vistas)</p>
    <p>Alumnos insertados</p>  
    <c:forEach items="${miModelo.listaAlumnos}" var="alum">
      <c:out value="${alum.nombre}"/> 
      <i><c:out value="${alum.apellidos}"/></i>
      <br><br>
    </c:forEach>
	<a href="<c:url value="navegacionFormulario"/>">A formulario</a>
 </body>
</html>