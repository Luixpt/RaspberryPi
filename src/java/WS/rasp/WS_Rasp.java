/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS.rasp;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.WebParam;
import javax.xml.ws.WebServiceRef;
import ws.server.WSServer_Service;

/**
 *
 * @author lfranco
 */
@WebService(serviceName = "WS_Rasp")
public class WS_Rasp {
    
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/RaspPi/WS_Server.wsdl")
    private WSServer_Service service;

     /**
     * Web service operation
     */
    
    @WebMethod(operationName = "envia")
    public String envia(@WebParam(name = "dadosrocket") String dadosrocket) {
        String devolver="";        
        ws.server.WSServer port = service.getWSServerPort();
        devolver=port.picagem(dadosrocket);
        
        return devolver;
    }    
}