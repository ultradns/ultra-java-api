
package com.neustar.ultraservice.schema.v01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ARPoolAlerts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ARPoolAlerts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="poolAlert" type="{http://schema.ultraservice.neustar.com/v01/}ARPoolAlert" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ARPoolAlerts", propOrder = {
    "poolAlert"
})
public class ARPoolAlerts {

    @XmlElement(required = true)
    protected List<ARPoolAlert> poolAlert;

    /**
     * Gets the value of the poolAlert property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the poolAlert property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoolAlert().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ARPoolAlert }
     * 
     * 
     */
    public List<ARPoolAlert> getPoolAlert() {
        if (poolAlert == null) {
            poolAlert = new ArrayList<ARPoolAlert>();
        }
        return this.poolAlert;
    }

}
