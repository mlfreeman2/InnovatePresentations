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
import javax.xml.bind.annotation.XmlValue;
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
 *         &lt;element name="uuidIdentifier" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="externalIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}title"/>
 *         &lt;element ref="{http://jazz.net/xmlns/alm/v0.1/}updated"/>
 *         &lt;element name="parent">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
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
@XmlType(name = "", propOrder = {"uuidIdentifier", "externalIdentifier", "title", "updated", "parent"})
@XmlRootElement(name = "labresourceattribute")
public class Labresourceattribute extends ReportableArtifact
{
    
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String                      uuidIdentifier;
    
    @XmlElement(required = true)
    protected String                      externalIdentifier;
    
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/", required = true)
    protected String                      title;
    
    @XmlElement(namespace = "http://jazz.net/xmlns/alm/v0.1/", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar        updated;
    
    @XmlElement(required = true)
    protected Labresourceattribute.Parent parent;
    
    /**
     * Gets the value of the uuidIdentifier property.
     * 
     * @return possible object is {@link String }
     */
    public String getUuidIdentifier()
    {
        return uuidIdentifier;
    }
    
    /**
     * Sets the value of the uuidIdentifier property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setUuidIdentifier(String value)
    {
        this.uuidIdentifier = value;
    }
    
    /**
     * Gets the value of the externalIdentifier property.
     * 
     * @return possible object is {@link String }
     */
    public String getExternalIdentifier()
    {
        return externalIdentifier;
    }
    
    /**
     * Sets the value of the externalIdentifier property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setExternalIdentifier(String value)
    {
        this.externalIdentifier = value;
    }
    
    /**
     * Name of the lab resource type.
     * 
     * @return possible object is {@link String }
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Sets the value of the title property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setTitle(String value)
    {
        this.title = value;
    }
    
    /**
     * [READ-ONLY] The last modification date of a lab resource type. Format is XML dateTime.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getUpdated()
    {
        return updated;
    }
    
    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *            allowed object is {@link XMLGregorianCalendar }
     */
    public void setUpdated(XMLGregorianCalendar value)
    {
        this.updated = value;
    }
    
    /**
     * Gets the value of the parent property.
     * 
     * @return possible object is {@link Labresourceattribute.Parent }
     */
    public Labresourceattribute.Parent getParent()
    {
        return parent;
    }
    
    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *            allowed object is {@link Labresourceattribute.Parent }
     */
    public void setParent(Labresourceattribute.Parent value)
    {
        this.parent = value;
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
     *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"content"})
    public static class Parent
    {
        
        @XmlValue
        protected String content;
        
        @XmlAttribute
        @XmlSchemaType(name = "anyURI")
        protected String href;
        
        /**
         * Gets the value of the content property.
         * 
         * @return possible object is {@link String }
         */
        public String getContent()
        {
            return content;
        }
        
        /**
         * Sets the value of the content property.
         * 
         * @param value
         *            allowed object is {@link String }
         */
        public void setContent(String value)
        {
            this.content = value;
        }
        
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
        
    }
    
}
