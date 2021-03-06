
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
 *         &lt;element name="sid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ticketHandle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attmntName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "sid",
    "ticketHandle",
    "url",
    "attmntName",
    "description"
})
@XmlRootElement(name = "attachURLLinkToTicket")
public class AttachURLLinkToTicket {

    protected int sid;
    @XmlElement(required = true)
    protected String ticketHandle;
    @XmlElement(required = true)
    protected String url;
    @XmlElement(required = true)
    protected String attmntName;
    @XmlElement(required = true)
    protected String description;

    /**
     * Obtiene el valor de la propiedad sid.
     * 
     */
    public int getSid() {
        return sid;
    }

    /**
     * Define el valor de la propiedad sid.
     * 
     */
    public void setSid(int value) {
        this.sid = value;
    }

    /**
     * Obtiene el valor de la propiedad ticketHandle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketHandle() {
        return ticketHandle;
    }

    /**
     * Define el valor de la propiedad ticketHandle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketHandle(String value) {
        this.ticketHandle = value;
    }

    /**
     * Obtiene el valor de la propiedad url.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Define el valor de la propiedad url.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Obtiene el valor de la propiedad attmntName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttmntName() {
        return attmntName;
    }

    /**
     * Define el valor de la propiedad attmntName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttmntName(String value) {
        this.attmntName = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
