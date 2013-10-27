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
import javax.xml.bind.annotation.XmlValue;

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
 *         &lt;element ref="{http://jazz.net/xmlns/alm/qm/v0.1/catalog/v0.1}type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="attribute" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="primitiveType">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           &lt;enumeration value="StringType"/>
 *                           &lt;enumeration value="NumericType"/>
 *                           &lt;enumeration value="TimeStampType"/>
 *                           &lt;enumeration value="UserType"/>
 *                           &lt;enumeration value="GroupType"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                     &lt;element name="referenceType">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                   &lt;element name="cardinality">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="ZERO_OR_ONE"/>
 *                         &lt;enumeration value="ZERO_OR_MORE"/>
 *                         &lt;enumeration value="ONE"/>
 *                         &lt;enumeration value="ONE_OR_MORE"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="hidden" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="enumeration" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://jazz.net/xmlns/alm/qm/v0.1/catalog/v0.1}attributePath" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="testPlanCoverageType" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://jazz.net/xmlns/alm/qm/v0.1/catalog/v0.1}attributePath"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="externalId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="typeId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="hidden" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"type", "attribute", "enumeration", "attributePath", "testPlanCoverageType"})
@XmlRootElement(name = "type", namespace = "http://jazz.net/xmlns/alm/qm/v0.1/catalog/v0.1")
public class Type
{
    
    @XmlElement(namespace = "http://jazz.net/xmlns/alm/qm/v0.1/catalog/v0.1")
    protected List<Type>                      type;
    
    @XmlElement(namespace = "http://jazz.net/xmlns/alm/qm/v0.1/catalog/v0.1")
    protected List<Type.Attribute>            attribute;
    
    @XmlElement(namespace = "http://jazz.net/xmlns/alm/qm/v0.1/catalog/v0.1")
    protected List<Type.Enumeration>          enumeration;
    
    @XmlElement(namespace = "http://jazz.net/xmlns/alm/qm/v0.1/catalog/v0.1")
    protected List<AttributePath>             attributePath;
    
    @XmlElement(namespace = "http://jazz.net/xmlns/alm/qm/v0.1/catalog/v0.1")
    protected List<Type.TestPlanCoverageType> testPlanCoverageType;
    
    @XmlAttribute(required = true)
    protected String                          name;
    
    @XmlAttribute
    protected String                          externalId;
    
    @XmlAttribute
    protected Integer                         typeId;
    
    @XmlAttribute(required = true)
    protected boolean                         hidden;
    
    /**
     * [READ-ONLY] A sub type of the object.Gets the value of the type property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the type property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getType().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Type }
     */
    public List<Type> getType()
    {
        if (type == null)
        {
            type = new ArrayList<Type>();
        }
        return this.type;
    }
    
    /**
     * Gets the value of the attribute property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the attribute property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getAttribute().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Type.Attribute }
     */
    public List<Type.Attribute> getAttribute()
    {
        if (attribute == null)
        {
            attribute = new ArrayList<Type.Attribute>();
        }
        return this.attribute;
    }
    
    /**
     * Gets the value of the enumeration property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the enumeration property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getEnumeration().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Type.Enumeration }
     */
    public List<Type.Enumeration> getEnumeration()
    {
        if (enumeration == null)
        {
            enumeration = new ArrayList<Type.Enumeration>();
        }
        return this.enumeration;
    }
    
    /**
     * [READ-ONLY] The path to the attributes on the type.Gets the value of the attributePath property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the attributePath property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getAttributePath().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link AttributePath }
     */
    public List<AttributePath> getAttributePath()
    {
        if (attributePath == null)
        {
            attributePath = new ArrayList<AttributePath>();
        }
        return this.attributePath;
    }
    
    /**
     * Gets the value of the testPlanCoverageType property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the testPlanCoverageType property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getTestPlanCoverageType().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Type.TestPlanCoverageType }
     */
    public List<Type.TestPlanCoverageType> getTestPlanCoverageType()
    {
        if (testPlanCoverageType == null)
        {
            testPlanCoverageType = new ArrayList<Type.TestPlanCoverageType>();
        }
        return this.testPlanCoverageType;
    }
    
    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Sets the value of the name property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setName(String value)
    {
        this.name = value;
    }
    
    /**
     * Gets the value of the externalId property.
     * 
     * @return possible object is {@link String }
     */
    public String getExternalId()
    {
        return externalId;
    }
    
    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setExternalId(String value)
    {
        this.externalId = value;
    }
    
    /**
     * Gets the value of the typeId property.
     * 
     * @return possible object is {@link Integer }
     */
    public Integer getTypeId()
    {
        return typeId;
    }
    
    /**
     * Sets the value of the typeId property.
     * 
     * @param value
     *            allowed object is {@link Integer }
     */
    public void setTypeId(Integer value)
    {
        this.typeId = value;
    }
    
    /**
     * Gets the value of the hidden property.
     */
    public boolean isHidden()
    {
        return hidden;
    }
    
    /**
     * Sets the value of the hidden property.
     */
    public void setHidden(boolean value)
    {
        this.hidden = value;
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
     *         &lt;choice>
     *           &lt;element name="primitiveType">
     *             &lt;simpleType>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                 &lt;enumeration value="StringType"/>
     *                 &lt;enumeration value="NumericType"/>
     *                 &lt;enumeration value="TimeStampType"/>
     *                 &lt;enumeration value="UserType"/>
     *                 &lt;enumeration value="GroupType"/>
     *               &lt;/restriction>
     *             &lt;/simpleType>
     *           &lt;/element>
     *           &lt;element name="referenceType">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/choice>
     *         &lt;element name="cardinality">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="ZERO_OR_ONE"/>
     *               &lt;enumeration value="ZERO_OR_MORE"/>
     *               &lt;enumeration value="ONE"/>
     *               &lt;enumeration value="ONE_OR_MORE"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="hidden" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"primitiveType", "referenceType", "cardinality"})
    public static class Attribute
    {
        
        @XmlElement(namespace = "http://jazz.net/xmlns/alm/qm/v0.1/catalog/v0.1")
        protected String                       primitiveType;
        
        @XmlElement(namespace = "http://jazz.net/xmlns/alm/qm/v0.1/catalog/v0.1")
        protected Type.Attribute.ReferenceType referenceType;
        
        @XmlElement(namespace = "http://jazz.net/xmlns/alm/qm/v0.1/catalog/v0.1", required = true)
        protected String                       cardinality;
        
        @XmlAttribute(required = true)
        protected boolean                      hidden;
        
        @XmlAttribute(required = true)
        protected String                       name;
        
        /**
         * Gets the value of the primitiveType property.
         * 
         * @return possible object is {@link String }
         */
        public String getPrimitiveType()
        {
            return primitiveType;
        }
        
        /**
         * Sets the value of the primitiveType property.
         * 
         * @param value
         *            allowed object is {@link String }
         */
        public void setPrimitiveType(String value)
        {
            this.primitiveType = value;
        }
        
        /**
         * Gets the value of the referenceType property.
         * 
         * @return possible object is {@link Type.Attribute.ReferenceType }
         */
        public Type.Attribute.ReferenceType getReferenceType()
        {
            return referenceType;
        }
        
        /**
         * Sets the value of the referenceType property.
         * 
         * @param value
         *            allowed object is {@link Type.Attribute.ReferenceType }
         */
        public void setReferenceType(Type.Attribute.ReferenceType value)
        {
            this.referenceType = value;
        }
        
        /**
         * Gets the value of the cardinality property.
         * 
         * @return possible object is {@link String }
         */
        public String getCardinality()
        {
            return cardinality;
        }
        
        /**
         * Sets the value of the cardinality property.
         * 
         * @param value
         *            allowed object is {@link String }
         */
        public void setCardinality(String value)
        {
            this.cardinality = value;
        }
        
        /**
         * Gets the value of the hidden property.
         */
        public boolean isHidden()
        {
            return hidden;
        }
        
        /**
         * Sets the value of the hidden property.
         */
        public void setHidden(boolean value)
        {
            this.hidden = value;
        }
        
        /**
         * Gets the value of the name property.
         * 
         * @return possible object is {@link String }
         */
        public String getName()
        {
            return name;
        }
        
        /**
         * Sets the value of the name property.
         * 
         * @param value
         *            allowed object is {@link String }
         */
        public void setName(String value)
        {
            this.name = value;
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
        public static class ReferenceType
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
     *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"value"})
    public static class Enumeration
    {
        
        @XmlElement(namespace = "http://jazz.net/xmlns/alm/qm/v0.1/catalog/v0.1")
        protected List<String> value;
        
        @XmlAttribute(required = true)
        protected String       name;
        
        /**
         * Gets the value of the value property.
         * <p>
         * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the value property.
         * <p>
         * For example, to add a new item, do as follows:
         * 
         * <pre>
         * getValue().add(newItem);
         * </pre>
         * <p>
         * Objects of the following type(s) are allowed in the list {@link String }
         */
        public List<String> getValue()
        {
            if (value == null)
            {
                value = new ArrayList<String>();
            }
            return this.value;
        }
        
        /**
         * Gets the value of the name property.
         * 
         * @return possible object is {@link String }
         */
        public String getName()
        {
            return name;
        }
        
        /**
         * Sets the value of the name property.
         * 
         * @param value
         *            allowed object is {@link String }
         */
        public void setName(String value)
        {
            this.name = value;
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
     *       &lt;sequence>
     *         &lt;element ref="{http://jazz.net/xmlns/alm/qm/v0.1/catalog/v0.1}attributePath"/>
     *       &lt;/sequence>
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"attributePath"})
    public static class TestPlanCoverageType
    {
        
        @XmlElement(namespace = "http://jazz.net/xmlns/alm/qm/v0.1/catalog/v0.1", required = true)
        protected AttributePath attributePath;
        
        @XmlAttribute(required = true)
        protected String        name;
        
        /**
         * [READ-ONLY] The path to the attribute referencing the type.
         * 
         * @return possible object is {@link AttributePath }
         */
        public AttributePath getAttributePath()
        {
            return attributePath;
        }
        
        /**
         * Sets the value of the attributePath property.
         * 
         * @param value
         *            allowed object is {@link AttributePath }
         */
        public void setAttributePath(AttributePath value)
        {
            this.attributePath = value;
        }
        
        /**
         * Gets the value of the name property.
         * 
         * @return possible object is {@link String }
         */
        public String getName()
        {
            return name;
        }
        
        /**
         * Sets the value of the name property.
         * 
         * @param value
         *            allowed object is {@link String }
         */
        public void setName(String value)
        {
            this.name = value;
        }
        
    }
    
}
