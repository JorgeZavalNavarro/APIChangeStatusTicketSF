
package mx.com.syntech.tpe.salesforce.servicedesk.changestatus.sdmclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updateRatingReturn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "updateRatingReturn"
})
@XmlRootElement(name = "updateRatingResponse")
public class UpdateRatingResponse {

    @XmlElement(required = true)
    protected String updateRatingReturn;

    /**
     * Obtiene el valor de la propiedad updateRatingReturn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateRatingReturn() {
        return updateRatingReturn;
    }

    /**
     * Define el valor de la propiedad updateRatingReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateRatingReturn(String value) {
        this.updateRatingReturn = value;
    }

}
