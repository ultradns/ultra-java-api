
package com.neustar.ultraservice.schema.v01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ARPoolAlertsList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ARPoolAlertsList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arPoolAlerts" type="{http://schema.ultraservice.neustar.com/v01/}ARPoolAlerts"/>
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ARPoolAlertsList", propOrder = {
    "arPoolAlerts",
    "total",
    "offset",
    "count"
})
public class ARPoolAlertsList {

    @XmlElement(required = true)
    protected ARPoolAlerts arPoolAlerts;
    protected int total;
    protected int offset;
    protected int count;

    /**
     * Gets the value of the arPoolAlerts property.
     * 
     * @return
     *     possible object is
     *     {@link ARPoolAlerts }
     *     
     */
    public ARPoolAlerts getArPoolAlerts() {
        return arPoolAlerts;
    }

    /**
     * Sets the value of the arPoolAlerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ARPoolAlerts }
     *     
     */
    public void setArPoolAlerts(ARPoolAlerts value) {
        this.arPoolAlerts = value;
    }

    /**
     * Gets the value of the total property.
     * 
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     */
    public void setTotal(int value) {
        this.total = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     */
    public int getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     */
    public void setOffset(int value) {
        this.offset = value;
    }

    /**
     * Gets the value of the count property.
     * 
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(int value) {
        this.count = value;
    }

}
