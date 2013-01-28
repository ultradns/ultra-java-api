
package com.neustar.ultraservice.schema.v01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HttpCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HttpCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="connectTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="runTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="runTimeTotal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="searchString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HttpCriteria", propOrder = {
    "connectTime",
    "runTime",
    "runTimeTotal",
    "searchString"
})
public class HttpCriteria {

    protected int connectTime;
    protected int runTime;
    protected int runTimeTotal;
    @XmlElement(required = true)
    protected String searchString;

    /**
     * Gets the value of the connectTime property.
     * 
     */
    public int getConnectTime() {
        return connectTime;
    }

    /**
     * Sets the value of the connectTime property.
     * 
     */
    public void setConnectTime(int value) {
        this.connectTime = value;
    }

    /**
     * Gets the value of the runTime property.
     * 
     */
    public int getRunTime() {
        return runTime;
    }

    /**
     * Sets the value of the runTime property.
     * 
     */
    public void setRunTime(int value) {
        this.runTime = value;
    }

    /**
     * Gets the value of the runTimeTotal property.
     * 
     */
    public int getRunTimeTotal() {
        return runTimeTotal;
    }

    /**
     * Sets the value of the runTimeTotal property.
     * 
     */
    public void setRunTimeTotal(int value) {
        this.runTimeTotal = value;
    }

    /**
     * Gets the value of the searchString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchString() {
        return searchString;
    }

    /**
     * Sets the value of the searchString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchString(String value) {
        this.searchString = value;
    }

}
