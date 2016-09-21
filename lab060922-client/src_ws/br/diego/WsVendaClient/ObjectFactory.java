
package br.diego.WsVendaClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.diego.WsVendaClient package. 
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

    private final static QName _FecharVenda_QNAME = new QName("http://webservicesjax.diego.br/", "fecharVenda");
    private final static QName _IOException_QNAME = new QName("http://webservicesjax.diego.br/", "IOException");
    private final static QName _ServletException_QNAME = new QName("http://webservicesjax.diego.br/", "ServletException");
    private final static QName _FecharVendaResponse_QNAME = new QName("http://webservicesjax.diego.br/", "fecharVendaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.diego.WsVendaClient
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
     * Create an instance of {@link FecharVendaResponse }
     * 
     */
    public FecharVendaResponse createFecharVendaResponse() {
        return new FecharVendaResponse();
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link FecharVenda }
     * 
     */
    public FecharVenda createFecharVenda() {
        return new FecharVenda();
    }

    /**
     * Create an instance of {@link Venda }
     * 
     */
    public Venda createVenda() {
        return new Venda();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FecharVenda }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicesjax.diego.br/", name = "fecharVenda")
    public JAXBElement<FecharVenda> createFecharVenda(FecharVenda value) {
        return new JAXBElement<FecharVenda>(_FecharVenda_QNAME, FecharVenda.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FecharVendaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicesjax.diego.br/", name = "fecharVendaResponse")
    public JAXBElement<FecharVendaResponse> createFecharVendaResponse(FecharVendaResponse value) {
        return new JAXBElement<FecharVendaResponse>(_FecharVendaResponse_QNAME, FecharVendaResponse.class, null, value);
    }

}
