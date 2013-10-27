//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.04.28 at 12:49:50 PM EDT
//

package com.ibm.rqm.xml.bind.testsuitelog;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.ibm.rqm.xml.bind.Owner;

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
 *         &lt;element name="suiteelement" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="index" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="adapterid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="executionworkitem" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                           &lt;attribute ref="{http://schema.ibm.com/vega/2008/}id"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element ref="{http://jazz.net/xmlns/alm/v0.1/}owner"/>
 *                   &lt;choice>
 *                     &lt;element name="testscript" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                             &lt;attribute ref="{http://schema.ibm.com/vega/2008/}id"/>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="remotescript" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"suiteelement"})
@XmlRootElement(name = "suiteelements")
public class Suiteelements
{
    
    protected List<Suiteelements.Suiteelement> suiteelement;
    
    /**
     * Gets the value of the suiteelement property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the suiteelement property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSuiteelement().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Suiteelements.Suiteelement }
     */
    public List<Suiteelements.Suiteelement> getSuiteelement()
    {
        if (suiteelement == null)
        {
            suiteelement = new ArrayList<Suiteelements.Suiteelement>();
        }
        return this.suiteelement;
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
     *       &lt;sequence>
     *         &lt;element name="index" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="adapterid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="executionworkitem" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *                 &lt;attribute ref="{http://schema.ibm.com/vega/2008/}id"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element ref="{http://jazz.net/xmlns/alm/v0.1/}owner"/>
     *         &lt;choice>
     *           &lt;element name="testscript" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *                   &lt;attribute ref="{http://schema.ibm.com/vega/2008/}id"/>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="remotescript" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/choice>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"index", "adapterid", "executionworkitem", "owner", "testscript", "remotescript"})
    public static class Suiteelement
    {
        
        protected Integer                                      index;
        
        protected String                                       adapterid;
        
        protected Suiteelements.Suiteelement.Executionworkitem executionworkitem;
        
        @XmlElement(namespace = "http://jazz.net/xmlns/alm/v0.1/", required = true)
        protected Owner                                        owner;
        
        protected Suiteelements.Suiteelement.Testscript        testscript;
        
        protected Suiteelements.Suiteelement.Remotescript      remotescript;
        
        /**
         * Gets the value of the index property.
         * 
         * @return possible object is {@link Integer }
         */
        public Integer getIndex()
        {
            return index;
        }
        
        /**
         * Sets the value of the index property.
         * 
         * @param value
         *            allowed object is {@link Integer }
         */
        public void setIndex(Integer value)
        {
            this.index = value;
        }
        
        /**
         * Gets the value of the adapterid property.
         * 
         * @return possible object is {@link String }
         */
        public String getAdapterid()
        {
            return adapterid;
        }
        
        /**
         * Sets the value of the adapterid property.
         * 
         * @param value
         *            allowed object is {@link String }
         */
        public void setAdapterid(String value)
        {
            this.adapterid = value;
        }
        
        /**
         * Gets the value of the executionworkitem property.
         * 
         * @return possible object is {@link Suiteelements.Suiteelement.Executionworkitem }
         */
        public Suiteelements.Suiteelement.Executionworkitem getExecutionworkitem()
        {
            return executionworkitem;
        }
        
        /**
         * Sets the value of the executionworkitem property.
         * 
         * @param value
         *            allowed object is {@link Suiteelements.Suiteelement.Executionworkitem }
         */
        public void setExecutionworkitem(Suiteelements.Suiteelement.Executionworkitem value)
        {
            this.executionworkitem = value;
        }
        
        /**
         * [READ-ONLY] The contributor that owns execution of test suite step.
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
         * Gets the value of the testscript property.
         * 
         * @return possible object is {@link Suiteelements.Suiteelement.Testscript }
         */
        public Suiteelements.Suiteelement.Testscript getTestscript()
        {
            return testscript;
        }
        
        /**
         * Sets the value of the testscript property.
         * 
         * @param value
         *            allowed object is {@link Suiteelements.Suiteelement.Testscript }
         */
        public void setTestscript(Suiteelements.Suiteelement.Testscript value)
        {
            this.testscript = value;
        }
        
        /**
         * Gets the value of the remotescript property.
         * 
         * @return possible object is {@link Suiteelements.Suiteelement.Remotescript }
         */
        public Suiteelements.Suiteelement.Remotescript getRemotescript()
        {
            return remotescript;
        }
        
        /**
         * Sets the value of the remotescript property.
         * 
         * @param value
         *            allowed object is {@link Suiteelements.Suiteelement.Remotescript }
         */
        public void setRemotescript(Suiteelements.Suiteelement.Remotescript value)
        {
            this.remotescript = value;
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
        public static class Executionworkitem
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
             * UUID of the test execution record.
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
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Remotescript
        {
            
            @XmlAttribute(required = true)
            @XmlSchemaType(name = "anyURI")
            protected String href;
            
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
        public static class Testscript
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
             * [READ-ONLY] UUID of the test script.
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
    
}
