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
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}title"/>
 *         &lt;element ref="{http://jazz.net/xmlns/alm/v0.1/}updated"/>
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}description"/>
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}creator"/>
 *         &lt;element ref="{http://jazz.net/xmlns/alm/v0.1/}owner"/>
 *         &lt;element name="isBvt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="runOnFailedBuild" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="scheduleStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="associatedBuildDefinition">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                 &lt;attribute ref="{http://schema.ibm.com/vega/2008/}id"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="jobscheduler">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                 &lt;attribute ref="{http://schema.ibm.com/vega/2008/}id"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://jazz.net/xmlns/alm/qm/v0.1/}sequencestep" maxOccurs="unbounded"/>
 *         &lt;element name="testcell" minOccurs="0">
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
@XmlType(name = "", propOrder = {"webId", "title", "updated", "description", "creator", "owner", "isBvt", "runOnFailedBuild", "scheduleStart", "associatedBuildDefinition", "jobscheduler", "sequencestep", "testcell"})
@XmlRootElement(name = "executionsequence")
public class Executionsequence extends ReportableArtifact
{
    
    protected Integer                                     webId;
    
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/", required = true)
    protected String                                      title;
    
    @XmlElement(namespace = "http://jazz.net/xmlns/alm/v0.1/", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar                        updated;
    
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/", required = true)
    protected String                                      description;
    
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/", required = true)
    protected Creator                                     creator;
    
    @XmlElement(namespace = "http://jazz.net/xmlns/alm/v0.1/", required = true)
    protected Owner                                       owner;
    
    protected Boolean                                     isBvt;
    
    protected Boolean                                     runOnFailedBuild;
    
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar                        scheduleStart;
    
    @XmlElement(required = true)
    protected Executionsequence.AssociatedBuildDefinition associatedBuildDefinition;
    
    @XmlElement(required = true)
    protected Executionsequence.Jobscheduler              jobscheduler;
    
    @XmlElement(required = true)
    protected List<Sequencestep>                          sequencestep;
    
    protected Executionsequence.Testcell                  testcell;
    
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
     * A name given to the execution sequence.
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
     * [READ-ONLY] The timestamp for the last time execution sequence was updated. Format is XML dateTime.
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
     * An account of the execution sequence.
     * 
     * @return possible object is {@link String }
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * Sets the value of the description property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setDescription(String value)
    {
        this.description = value;
    }
    
    /**
     * The contributor that created the execution sequence.
     * 
     * @return possible object is {@link Creator }
     */
    public Creator getCreator()
    {
        return creator;
    }
    
    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *            allowed object is {@link Creator }
     */
    public void setCreator(Creator value)
    {
        this.creator = value;
    }
    
    /**
     * The contributor that owns the execution sequence.
     * 
     * @return possible object is {@link Owner }
     */
    public Owner getOwner()
    {
        return owner;
    }
    
    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *            allowed object is {@link Owner }
     */
    public void setOwner(Owner value)
    {
        this.owner = value;
    }
    
    /**
     * Gets the value of the isBvt property.
     * 
     * @return possible object is {@link Boolean }
     */
    public Boolean isIsBvt()
    {
        return isBvt;
    }
    
    /**
     * Sets the value of the isBvt property.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     */
    public void setIsBvt(Boolean value)
    {
        this.isBvt = value;
    }
    
    /**
     * Gets the value of the runOnFailedBuild property.
     * 
     * @return possible object is {@link Boolean }
     */
    public Boolean isRunOnFailedBuild()
    {
        return runOnFailedBuild;
    }
    
    /**
     * Sets the value of the runOnFailedBuild property.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     */
    public void setRunOnFailedBuild(Boolean value)
    {
        this.runOnFailedBuild = value;
    }
    
    /**
     * Gets the value of the scheduleStart property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getScheduleStart()
    {
        return scheduleStart;
    }
    
    /**
     * Sets the value of the scheduleStart property.
     * 
     * @param value
     *            allowed object is {@link XMLGregorianCalendar }
     */
    public void setScheduleStart(XMLGregorianCalendar value)
    {
        this.scheduleStart = value;
    }
    
    /**
     * Gets the value of the associatedBuildDefinition property.
     * 
     * @return possible object is {@link Executionsequence.AssociatedBuildDefinition }
     */
    public Executionsequence.AssociatedBuildDefinition getAssociatedBuildDefinition()
    {
        return associatedBuildDefinition;
    }
    
    /**
     * Sets the value of the associatedBuildDefinition property.
     * 
     * @param value
     *            allowed object is {@link Executionsequence.AssociatedBuildDefinition }
     */
    public void setAssociatedBuildDefinition(Executionsequence.AssociatedBuildDefinition value)
    {
        this.associatedBuildDefinition = value;
    }
    
    /**
     * Gets the value of the jobscheduler property.
     * 
     * @return possible object is {@link Executionsequence.Jobscheduler }
     */
    public Executionsequence.Jobscheduler getJobscheduler()
    {
        return jobscheduler;
    }
    
    /**
     * Sets the value of the jobscheduler property.
     * 
     * @param value
     *            allowed object is {@link Executionsequence.Jobscheduler }
     */
    public void setJobscheduler(Executionsequence.Jobscheduler value)
    {
        this.jobscheduler = value;
    }
    
    /**
     * Steps in the execution sequence.Gets the value of the sequencestep property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the sequencestep property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSequencestep().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Sequencestep }
     */
    public List<Sequencestep> getSequencestep()
    {
        if (sequencestep == null)
        {
            sequencestep = new ArrayList<Sequencestep>();
        }
        return this.sequencestep;
    }
    
    /**
     * Gets the value of the testcell property.
     * 
     * @return possible object is {@link Executionsequence.Testcell }
     */
    public Executionsequence.Testcell getTestcell()
    {
        return testcell;
    }
    
    /**
     * Sets the value of the testcell property.
     * 
     * @param value
     *            allowed object is {@link Executionsequence.Testcell }
     */
    public void setTestcell(Executionsequence.Testcell value)
    {
        this.testcell = value;
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
    public static class AssociatedBuildDefinition
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
         * [READ-ONLY] UUID of the associated build definition.
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
    public static class Jobscheduler
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
         * [READ-ONLY] UUID of the associated Job Scheduler.
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
    public static class Testcell
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
         * [READ-ONLY] UUID of the testcell.
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
