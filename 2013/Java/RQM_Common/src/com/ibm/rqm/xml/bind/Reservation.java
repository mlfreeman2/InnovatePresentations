//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.04.28 at 12:49:50 PM EDT
//

package com.ibm.rqm.xml.bind;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for anonymous complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://jazz.net/xmlns/alm/qm/v0.1/}reportableArtifact">
 *       &lt;sequence>
 *         &lt;element name="webId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="reservedFor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reservedBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reserveTo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="reserveFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="visibleId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="labresource">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                 &lt;attribute ref="{http://schema.ibm.com/vega/2008/}id"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="request" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                 &lt;attribute ref="{http://schema.ibm.com/vega/2008/}id"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"webId", "reservedFor", "reservedBy", "reserveTo", "reserveFrom", "visibleId", "labresource", "request"})
@XmlRootElement(name = "reservation")
public class Reservation extends ReportableArtifact
{
    
    protected Integer                 webId;
    
    @XmlElement(required = true)
    protected String                  reservedFor;
    
    @XmlElement(required = true)
    protected String                  reservedBy;
    
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar    reserveTo;
    
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar    reserveFrom;
    
    @XmlElement(required = true)
    protected String                  visibleId;
    
    @XmlElement(required = true)
    protected Reservation.Labresource labresource;
    
    protected Reservation.Request     request;
    
    /**
     * Gets the value of the webId property.
     * 
     * @return possible object is {@link Integer }
     */
    public Integer getWebId()
    {
        return webId;
    }
    
    /**
     * Sets the value of the webId property.
     * 
     * @param value
     *            allowed object is {@link Integer }
     */
    public void setWebId(Integer value)
    {
        this.webId = value;
    }
    
    /**
     * Gets the value of the reservedFor property.
     * 
     * @return possible object is {@link String }
     */
    public String getReservedFor()
    {
        return reservedFor;
    }
    
    /**
     * Sets the value of the reservedFor property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setReservedFor(String value)
    {
        this.reservedFor = value;
    }
    
    /**
     * Gets the value of the reservedBy property.
     * 
     * @return possible object is {@link String }
     */
    public String getReservedBy()
    {
        return reservedBy;
    }
    
    /**
     * Sets the value of the reservedBy property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setReservedBy(String value)
    {
        this.reservedBy = value;
    }
    
    /**
     * Gets the value of the reserveTo property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getReserveTo()
    {
        return reserveTo;
    }
    
    /**
     * Sets the value of the reserveTo property.
     * 
     * @param value
     *            allowed object is {@link XMLGregorianCalendar }
     */
    public void setReserveTo(XMLGregorianCalendar value)
    {
        this.reserveTo = value;
    }
    
    /**
     * Gets the value of the reserveFrom property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getReserveFrom()
    {
        return reserveFrom;
    }
    
    /**
     * Sets the value of the reserveFrom property.
     * 
     * @param value
     *            allowed object is {@link XMLGregorianCalendar }
     */
    public void setReserveFrom(XMLGregorianCalendar value)
    {
        this.reserveFrom = value;
    }
    
    /**
     * Gets the value of the visibleId property.
     * 
     * @return possible object is {@link String }
     */
    public String getVisibleId()
    {
        return visibleId;
    }
    
    /**
     * Sets the value of the visibleId property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setVisibleId(String value)
    {
        this.visibleId = value;
    }
    
    /**
     * Gets the value of the labresource property.
     * 
     * @return possible object is {@link Reservation.Labresource }
     */
    public Reservation.Labresource getLabresource()
    {
        return labresource;
    }
    
    /**
     * Sets the value of the labresource property.
     * 
     * @param value
     *            allowed object is {@link Reservation.Labresource }
     */
    public void setLabresource(Reservation.Labresource value)
    {
        this.labresource = value;
    }
    
    /**
     * Gets the value of the request property.
     * 
     * @return possible object is {@link Reservation.Request }
     */
    public Reservation.Request getRequest()
    {
        return request;
    }
    
    /**
     * Sets the value of the request property.
     * 
     * @param value
     *            allowed object is {@link Reservation.Request }
     */
    public void setRequest(Reservation.Request value)
    {
        this.request = value;
    }
    
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
     *       &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *       &lt;attribute ref="{http://schema.ibm.com/vega/2008/}id"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Labresource
    {
        
        @XmlAttribute(required = true)
        @XmlSchemaType(name = "anyURI")
        protected String href;
        
        @XmlAttribute(namespace = "http://schema.ibm.com/vega/2008/")
        protected String id;
        
        /**
         * Gets the value of the href property.
         * 
         * @return possible object is {@link String }
         */
        public String getHref()
        {
            return href;
        }
        
        /**
         * Sets the value of the href property.
         * 
         * @param value
         *            allowed object is {@link String }
         */
        public void setHref(String value)
        {
            this.href = value;
        }
        
        /**
         * [READ-ONLY] UUID of the labresource.
         * 
         * @return possible object is {@link String }
         */
        public String getId()
        {
            return id;
        }
        
        /**
         * Sets the value of the id property.
         * 
         * @param value
         *            allowed object is {@link String }
         */
        public void setId(String value)
        {
            this.id = value;
        }
        
    }
    
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
     *       &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *       &lt;attribute ref="{http://schema.ibm.com/vega/2008/}id"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Request
    {
        
        @XmlAttribute(required = true)
        @XmlSchemaType(name = "anyURI")
        protected String href;
        
        @XmlAttribute(namespace = "http://schema.ibm.com/vega/2008/")
        protected String id;
        
        /**
         * Gets the value of the href property.
         * 
         * @return possible object is {@link String }
         */
        public String getHref()
        {
            return href;
        }
        
        /**
         * Sets the value of the href property.
         * 
         * @param value
         *            allowed object is {@link String }
         */
        public void setHref(String value)
        {
            this.href = value;
        }
        
        /**
         * [READ-ONLY] UUID of the request.
         * 
         * @return possible object is {@link String }
         */
        public String getId()
        {
            return id;
        }
        
        /**
         * Sets the value of the id property.
         * 
         * @param value
         *            allowed object is {@link String }
         */
        public void setId(String value)
        {
            this.id = value;
        }
        
    }
    
}
