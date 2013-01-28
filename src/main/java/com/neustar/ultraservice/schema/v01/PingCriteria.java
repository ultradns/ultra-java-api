
package com.neustar.ultraservice.schema.v01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PingCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PingCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="runTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="connectTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="percentLost" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PingCriteria", propOrder = {
    "runTime",
    "connectTime",
    "percentLost"
})
public class PingCriteria {

    protected int runTime;
    protected int connectTime;
    protected int percentLost;

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
     * Gets the value of the percentLost property.
     * 
     */
    public int getPercentLost() {
        return percentLost;
    }

    /**
     * Sets the value of the percentLost property.
     * 
     */
    public void setPercentLost(int value) {
        this.percentLost = value;
    }

}
