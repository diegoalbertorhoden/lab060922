
package br.diego.WsProdutoClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Create complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Create">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paramProduto" type="{http://webservicesjax.diego.br/}produto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Create", propOrder = {
    "paramProduto"
})
public class Create {

    protected Produto paramProduto;

    /**
     * Obtém o valor da propriedade paramProduto.
     * 
     * @return
     *     possible object is
     *     {@link Produto }
     *     
     */
    public Produto getParamProduto() {
        return paramProduto;
    }

    /**
     * Define o valor da propriedade paramProduto.
     * 
     * @param value
     *     allowed object is
     *     {@link Produto }
     *     
     */
    public void setParamProduto(Produto value) {
        this.paramProduto = value;
    }

}
