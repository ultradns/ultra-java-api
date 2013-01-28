
package com.neustar.ultraservice.schema.v01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProbeDefinitionTransactions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProbeDefinitionTransactions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="httpTransactions" type="{http://schema.ultraservice.neustar.com/v01/}ProbeDefinitionHttpTransactions" minOccurs="0"/>
 *         &lt;element name="dnsTransaction" type="{http://schema.ultraservice.neustar.com/v01/}DNSTransaction" minOccurs="0"/>
 *         &lt;element name="pingTransaction" type="{http://schema.ultraservice.neustar.com/v01/}PINGTransaction" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProbeDefinitionTransactions", propOrder = {
    "httpTransactions",
    "dnsTransaction",
    "pingTransaction"
})
public class ProbeDefinitionTransactions {

    protected ProbeDefinitionHttpTransactions httpTransactions;
    protected DNSTransaction dnsTransaction;
    protected PINGTransaction pingTransaction;

    /**
     * Gets the value of the httpTransactions property.
     * 
     * @return
     *     possible object is
     *     {@link ProbeDefinitionHttpTransactions }
     *     
     */
    public ProbeDefinitionHttpTransactions getHttpTransactions() {
        return httpTransactions;
    }

    /**
     * Sets the value of the httpTransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProbeDefinitionHttpTransactions }
     *     
     */
    public void setHttpTransactions(ProbeDefinitionHttpTransactions value) {
        this.httpTransactions = value;
    }

    /**
     * Gets the value of the dnsTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link DNSTransaction }
     *     
     */
    public DNSTransaction getDnsTransaction() {
        return dnsTransaction;
    }

    /**
     * Sets the value of the dnsTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNSTransaction }
     *     
     */
    public void setDnsTransaction(DNSTransaction value) {
        this.dnsTransaction = value;
    }

    /**
     * Gets the value of the pingTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link PINGTransaction }
     *     
     */
    public PINGTransaction getPingTransaction() {
        return pingTransaction;
    }

    /**
     * Sets the value of the pingTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link PINGTransaction }
     *     
     */
    public void setPingTransaction(PINGTransaction value) {
        this.pingTransaction = value;
    }

}
