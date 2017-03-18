<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : mostrartodos
    Created on : 17/03/2017, 05:44:53 PM
    Author     : carlosmc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Todos los alumnos</title>
       </head>
    <body>
        
        
   <table border="1">
      <thead>
                  <tr>
                      <th>CODIGO</th>
                      <th>NOMBRE</th>
                      <th>APELLIDO</th>
                      <th>EDITAR</th>
                      <th>ELIMINAR</th>
                  </tr>
          </thead>
              <tbody>
                  <c:forEach var="lista" items="${sessionScope.alumnos}">
                  <tr>
                      <td>${lista.codalumno}</td>
                      <td>${lista.nombrealumno}</td>
                      <td>${lista.apellido}</td>
                      <td>
                          <form action="editar.do" method="POST">
                              <input type="submit" value="editar" id=${lista.codalumno}
                          </form>
                      </td>
                       <td>
                          <form action="eliminar.do" method="POST">
                              <input type="submit" value="eliminar" id=${lista.codalumno}
                          </form>
                      </td>
                  </tr>
                  </c:forEach>
             </tbody>     
        <br/>
        <hr/>
    
</table>
    </body>
</html>
