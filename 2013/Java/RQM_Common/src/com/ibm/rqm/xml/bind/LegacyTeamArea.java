//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.04.28 at 12:49:50 PM EDT
//

package com.ibm.rqm.xml.bind;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * [DEPRECATED] [READ-ONLY] A team of contributors within the scope of a project area. Note, this property will be removed after RQM 4.0.
 * <p>
 * Java class for teamarea element declaration.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="teamarea">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;extension base="{http://jazz.net/xmlns/alm/qm/v0.1/}reportableArtifact">
 *         &lt;sequence>
 *           &lt;element ref="{http://purl.org/dc/elements/1.1/}title"/>
 *           &lt;element name="summary" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element ref="{http://jazz.net/xmlns/alm/v0.1/}updated"/>
 *           &lt;element name="contributor" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute ref="{http://www.w3.org/1999/02/22-rdf-syntax-ns#}resource"/>
 *                   &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                   &lt;attribute ref="{http://schema.ibm.com/vega/2008/}id"/>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
 *       &lt;/extension>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"title", "summary", "id", "updated", "contributor"})
@XmlRootElement(name = "teamarea")
public class LegacyTeamArea extends ReportableArtifact
{
    
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/", required = true)
    protected String                           title;
    
    @XmlElement(required = true)
    protected String                           summary;
    
    @XmlElement(required = true)
    protected String                           id;
    
    @XmlElement(namespace = "http://jazz.net/xmlns/alm/v0.1/", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar             updated;
    
    protected List<LegacyTeamArea.Contributor> contributor;
    
    /**
     * [READ-ONLY] A name given to the team area.
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
     * Gets the value of the summary property.
     * 
     * @return possible object is {@link String }
     */
    public String getSummary()
    {
        return summary;
    }
    
    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setSummary(String value)
    {
        this.summary = value;
    }
    
    /**
     * Gets the value of the id property.
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
    
    /**
     * [READ-ONLY] XML dateTime of the last update of the team area.
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
     * Gets the value of the contributor property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the contributor property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getContributor().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link LegacyTeamArea.Contributor }
     */
    public List<LegacyTeamArea.Contributor> getContributor()
    {
        if (contributor == null)
        {
            contributor = new ArrayList<LegacyTeamArea.Contributor>();
        }
        return this.contributor;
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
     *       &lt;attribute ref="{http://www.w3.org/1999/02/22-rdf-syntax-ns#}resource"/>
     *       &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *       &lt;attribute ref="{http://schema.ibm.com/vega/2008/}id"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Contributor
    {
        
        @XmlAttribute(namespace = "http://www.w3.org/1999/02/22-rdf-syntax-ns#")
        @XmlSchemaType(name = "anyURI")
        protected String resource;
        
        @XmlAttribute(required = true)
        @XmlSchemaType(name = "anyURI")
        protected String href;
        
        @XmlAttribute(namespace = "http://schema.ibm.com/vega/2008/")
        protected String id;
        
        /**
         * [READ-ONLY] The Jazz Team Server (JTS) URL of the contributor that is a member of the team area.
         * 
         * @return possible object is {@link String }
         */
        public String getResource()
        {
            return resource;
        }
        
        /**
         * Sets the value of the resource property.
         * 
         * @param value
         *            allowed object is {@link String }
         */
        public void setResource(String value)
        {
            this.resource = value;
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
        
        /**
         * [READ-ONLY] UUID of the contributor.
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
