
package br.diego.WsProdutoClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Delete complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Delete">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paramId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Delete", propOrder = {
    "paramId"
})
public class Delete {

    protected Long paramId;

    /**
     * Obtém o valor da propriedade paramId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParamId() {
        return paramId;
    }

    /**
     * Define o valor da propriedade paramId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParamId(Long value) {
        this.paramId = value;
    }

}
