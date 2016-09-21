
package br.diego.WsEntregaClient;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WsEntregaService", targetNamespace = "http://webservicesjax.diego.br/", wsdlLocation = "http://localhost:8080/lab060922/WsEntrega?wsdl")
public class WsEntregaService
    extends Service
{

    private final static URL WSENTREGASERVICE_WSDL_LOCATION;
    private final static WebServiceException WSENTREGASERVICE_EXCEPTION;
    private final static QName WSENTREGASERVICE_QNAME = new QName("http://webservicesjax.diego.br/", "WsEntregaService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/lab060922/WsEntrega?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSENTREGASERVICE_WSDL_LOCATION = url;
        WSENTREGASERVICE_EXCEPTION = e;
    }

    public WsEntregaService() {
        super(__getWsdlLocation(), WSENTREGASERVICE_QNAME);
    }

    public WsEntregaService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSENTREGASERVICE_QNAME, features);
    }

    public WsEntregaService(URL wsdlLocation) {
        super(wsdlLocation, WSENTREGASERVICE_QNAME);
    }

    public WsEntregaService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSENTREGASERVICE_QNAME, features);
    }

    public WsEntregaService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsEntregaService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WsEntrega
     */
    @WebEndpoint(name = "WsEntregaPort")
    public WsEntrega getWsEntregaPort() {
        return super.getPort(new QName("http://webservicesjax.diego.br/", "WsEntregaPort"), WsEntrega.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WsEntrega
     */
    @WebEndpoint(name = "WsEntregaPort")
    public WsEntrega getWsEntregaPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservicesjax.diego.br/", "WsEntregaPort"), WsEntrega.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSENTREGASERVICE_EXCEPTION!= null) {
            throw WSENTREGASERVICE_EXCEPTION;
        }
        return WSENTREGASERVICE_WSDL_LOCATION;
    }

}