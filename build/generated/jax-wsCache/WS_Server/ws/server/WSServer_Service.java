
package ws.server;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WS_Server", targetNamespace = "http://server.ws/", wsdlLocation = "http://localhost:8080/RaspPi/WS_Server?wsdl")
public class WSServer_Service
    extends Service
{

    private final static URL WSSERVER_WSDL_LOCATION;
    private final static WebServiceException WSSERVER_EXCEPTION;
    private final static QName WSSERVER_QNAME = new QName("http://server.ws/", "WS_Server");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/RaspPi/WS_Server?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSSERVER_WSDL_LOCATION = url;
        WSSERVER_EXCEPTION = e;
    }

    public WSServer_Service() {
        super(__getWsdlLocation(), WSSERVER_QNAME);
    }

    public WSServer_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSSERVER_QNAME, features);
    }

    public WSServer_Service(URL wsdlLocation) {
        super(wsdlLocation, WSSERVER_QNAME);
    }

    public WSServer_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSSERVER_QNAME, features);
    }

    public WSServer_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSServer_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSServer
     */
    @WebEndpoint(name = "WS_ServerPort")
    public WSServer getWSServerPort() {
        return super.getPort(new QName("http://server.ws/", "WS_ServerPort"), WSServer.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSServer
     */
    @WebEndpoint(name = "WS_ServerPort")
    public WSServer getWSServerPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://server.ws/", "WS_ServerPort"), WSServer.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSSERVER_EXCEPTION!= null) {
            throw WSSERVER_EXCEPTION;
        }
        return WSSERVER_WSDL_LOCATION;
    }

}
