
package br.diego.WsVendaClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de fecharVendaResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="fecharVendaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultVenda" type="{http://webservicesjax.diego.br/}venda" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fecharVendaResponse", propOrder = {
    "resultVenda"
})
public class FecharVendaResponse {

    protected Venda resultVenda;

    /**
     * Obtém o valor da propriedade resultVenda.
     * 
     * @return
     *     possible object is
     *     {@link Venda }
     *     
     */
    public Venda getResultVenda() {
        return resultVenda;
    }

    /**
     * Define o valor da propriedade resultVenda.
     * 
     * @param value
     *     allowed object is
     *     {@link Venda }
     *     
     */
    public void setResultVenda(Venda value) {
        this.resultVenda = value;
    }

}
