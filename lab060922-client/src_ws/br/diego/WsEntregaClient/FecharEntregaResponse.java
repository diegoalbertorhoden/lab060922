
package br.diego.WsEntregaClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de fecharEntregaResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="fecharEntregaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultadoEntrega" type="{http://webservicesjax.diego.br/}entrega" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fecharEntregaResponse", propOrder = {
    "resultadoEntrega"
})
public class FecharEntregaResponse {

    protected Entrega resultadoEntrega;

    /**
     * Obtém o valor da propriedade resultadoEntrega.
     * 
     * @return
     *     possible object is
     *     {@link Entrega }
     *     
     */
    public Entrega getResultadoEntrega() {
        return resultadoEntrega;
    }

    /**
     * Define o valor da propriedade resultadoEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link Entrega }
     *     
     */
    public void setResultadoEntrega(Entrega value) {
        this.resultadoEntrega = value;
    }

}
