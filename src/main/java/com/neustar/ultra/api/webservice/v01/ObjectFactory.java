
package com.neustar.ultra.api.webservice.v01;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.neustar.ultra.api.webservice.v01 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UltraWSException_QNAME = new QName("http://webservice.api.ultra.neustar.com/v01/", "UltraWSException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.neustar.ultra.api.webservice.v01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UltraWSException }
     * 
     */
    public UltraWSException createUltraWSException() {
        return new UltraWSException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UltraWSException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.api.ultra.neustar.com/v01/", name = "UltraWSException")
    public JAXBElement<UltraWSException> createUltraWSException(UltraWSException value) {
        return new JAXBElement<UltraWSException>(_UltraWSException_QNAME, UltraWSException.class, null, value);
    }

}
