<%-- 
    Document   : resultado_ws_2
    Created on : Jun 29, 2016, 9:06:11 PM
    Author     : lfranco
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Web Service - Raspberry Pi - Resultado</title>
    </head>
    <body>
        <h1>Web Service - Raspberry Pi - Resultado</h1>
        <%       
    
    try {
	ws.server.WSServer_Service service = new ws.server.WSServer_Service();
	ws.server.WSServer port = service.getWSServerPort();
	 // TODO initialize WS operation arguments here
        java.lang.String dadosrasp = request.getParameter("rfcode");
	// TODO process result here
	
	GregorianCalendar calendar = new GregorianCalendar();        
        SimpleDateFormat formatador = new SimpleDateFormat("dd'/'MM'/'yyyy' - 'HH':'mm':'ss");
        java.lang.String result = port.picagem(dadosrasp+" "+formatador.format(calendar.getTime()));
        out.println("Result = "+result);                
    } 
    catch (Exception ex) {
        out.println(ex.getMessage());
        out.println("Erro try WS_RASP_RESULT");
	// TODO handle custom exceptions here
    }
    
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
