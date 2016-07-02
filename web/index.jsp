<%-- 
    Document   : index
    Created on : Jun 30, 2016, 11:13:08 AM
    Author     : lfranco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Web Service - Raspberry</title>
    </head>
    <body>
        <h1>Raspberry Pi - Recebe STRING do Rocket!!!</h1>
        <form action="resultado_ws_2.jsp" method="post">
        <%
        String rfcode;%> 
        RF Code:<input type="text" name="rfcode" />
        <input type="submit" name="botao-ok" value="Enviar">
        
        </form>
    </body>
</html>
