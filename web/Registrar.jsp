<%-- 
    Document   : Registrar
    Created on : 17/03/2017, 06:04:10 PM
    Author     : carlosmc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registro de alumnbos</h1>
        
        <form Action="recibir.do" method="post"> 
            Codigo: <input type="text" name="txtCodigo" placeholder="Codigo de alumno" value="" /><br/>
            Nombre: <input type="text" name="txtNombre" value="" /><br/>
            Apellidos: <input type="text" name="txtApellido" value="" /><br/>
            <input type="submit" value="Registror alumno nuevo" />
        </form>
    </body>
</html>
