
package br.diego.WsProdutoClient;

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
@WebServiceClient(name = "WsProdutoService", targetNamespace = "http://webservicesjax.diego.br/", wsdlLocation = "http://localhost:8080/lab060922/WsProduto?wsdl")
public class WsProdutoService
    extends Service
{

    private final static URL WSPRODUTOSERVICE_WSDL_LOCATION;
    private final static WebServiceException WSPRODUTOSERVICE_EXCEPTION;
    private final static QName WSPRODUTOSERVICE_QNAME = new QName("http://webservicesjax.diego.br/", "WsProdutoService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/lab060922/WsProduto?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSPRODUTOSERVICE_WSDL_LOCATION = url;
        WSPRODUTOSERVICE_EXCEPTION = e;
    }

    public WsProdutoService() {
        super(__getWsdlLocation(), WSPRODUTOSERVICE_QNAME);
    }

    public WsProdutoService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSPRODUTOSERVICE_QNAME, features);
    }

    public WsProdutoService(URL wsdlLocation) {
        super(wsdlLocation, WSPRODUTOSERVICE_QNAME);
    }

    public WsProdutoService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSPRODUTOSERVICE_QNAME, features);
    }

    public WsProdutoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsProdutoService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WsProduto
     */
    @WebEndpoint(name = "WsProdutoPort")
    public WsProduto getWsProdutoPort() {
        return super.getPort(new QName("http://webservicesjax.diego.br/", "WsProdutoPort"), WsProduto.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WsProduto
     */
    @WebEndpoint(name = "WsProdutoPort")
    public WsProduto getWsProdutoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservicesjax.diego.br/", "WsProdutoPort"), WsProduto.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSPRODUTOSERVICE_EXCEPTION!= null) {
            throw WSPRODUTOSERVICE_EXCEPTION;
        }
        return WSPRODUTOSERVICE_WSDL_LOCATION;
    }

}
