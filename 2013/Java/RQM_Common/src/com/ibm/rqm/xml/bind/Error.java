//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.04.28 at 12:49:50 PM EDT
//

package com.ibm.rqm.xml.bind;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"statusCode", "message", "trace"})
@XmlRootElement(name = "Error")
public class Error
{
    
    protected Integer statusCode;
    
    protected String  message;
    
    protected String  trace;
    
    /**
     * Gets the value of the statusCode property.
     * 
     * @return possible object is {@link Integer }
     */
    public Integer getStatusCode()
    {
        return statusCode;
    }
    
    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *            allowed object is {@link Integer }
     */
    public void setStatusCode(Integer value)
    {
        this.statusCode = value;
    }
    
    /**
     * Gets the value of the message property.
     * 
     * @return possible object is {@link String }
     */
    public String getMessage()
    {
        return message;
    }
    
    /**
     * Sets the value of the message property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setMessage(String value)
    {
        this.message = value;
    }
    
    /**
     * Gets the value of the trace property.
     * 
     * @return possible object is {@link String }
     */
    public String getTrace()
    {
        return trace;
    }
    
    /**
     * Sets the value of the trace property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setTrace(String value)
    {
        this.trace = value;
    }
    
}
