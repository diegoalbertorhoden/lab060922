
package br.diego.WsEntregaClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.diego.WsEntregaClient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _IOException_QNAME = new QName("http://webservicesjax.diego.br/", "IOException");
    private final static QName _ServletException_QNAME = new QName("http://webservicesjax.diego.br/", "ServletException");
    private final static QName _FecharEntrega_QNAME = new QName("http://webservicesjax.diego.br/", "fecharEntrega");
    private final static QName _FecharEntregaResponse_QNAME = new QName("http://webservicesjax.diego.br/", "fecharEntregaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.diego.WsEntregaClient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServletException }
     * 
     */
    public ServletException createServletException() {
        return new ServletException();
    }

    /**
     * Create an instance of {@link FecharEntrega }
     * 
     */
    public FecharEntrega createFecharEntrega() {
        return new FecharEntrega();
    }

    /**
     * Create an instance of {@link FecharEntregaResponse }
     * 
     */
    public FecharEntregaResponse createFecharEntregaResponse() {
        return new FecharEntregaResponse();
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link Entrega }
     * 
     */
    public Entrega createEntrega() {
        return new Entrega();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicesjax.diego.br/", name = "IOException")
    public JAXBElement<IOException> createIOException(IOException value) {
        return new JAXBElement<IOException>(_IOException_QNAME, IOException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServletException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicesjax.diego.br/", name = "ServletException")
    public JAXBElement<ServletException> createServletException(ServletException value) {
        return new JAXBElement<ServletException>(_ServletException_QNAME, ServletException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FecharEntrega }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicesjax.diego.br/", name = "fecharEntrega")
    public JAXBElement<FecharEntrega> createFecharEntrega(FecharEntrega value) {
        return new JAXBElement<FecharEntrega>(_FecharEntrega_QNAME, FecharEntrega.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FecharEntregaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicesjax.diego.br/", name = "fecharEntregaResponse")
    public JAXBElement<FecharEntregaResponse> createFecharEntregaResponse(FecharEntregaResponse value) {
        return new JAXBElement<FecharEntregaResponse>(_FecharEntregaResponse_QNAME, FecharEntregaResponse.class, null, value);
    }

}
