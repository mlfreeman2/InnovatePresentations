//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.04.28 at 12:49:50 PM EDT
//

package com.ibm.rqm.xml.bind.tasks;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="property" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="propertyName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="propertyType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="propertyValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"property"})
@XmlRootElement(name = "properties")
public class Properties
{
    
    @XmlElement(required = true)
    protected List<Properties.Property> property;
    
    /**
     * Gets the value of the property property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the property property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getProperty().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Properties.Property }
     */
    public List<Properties.Property> getProperty()
    {
        if (property == null)
        {
            property = new ArrayList<Properties.Property>();
        }
        return this.property;
    }
    
    /**
     * <p>
     * Java class for anonymous complex type.
     * <p>
     * The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="propertyName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="propertyType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="propertyValue" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"value"})
    public static class Property
    {
        
        @XmlValue
        protected String value;
        
        @XmlAttribute
        protected String propertyName;
        
        @XmlAttribute
        protected String propertyType;
        
        @XmlAttribute
        protected String propertyValue;
        
        /**
         * Gets the value of the value property.
         * 
         * @return possible object is {@link String }
         */
        public String getValue()
        {
            return value;
        }
        
        /**
         * Sets the value of the value property.
         * 
         * @param value
         *            allowed object is {@link String }
         */
        public void setValue(String value)
        {
            this.value = value;
        }
        
        /**
         * Gets the value of the propertyName property.
         * 
         * @return possible object is {@link String }
         */
        public String getPropertyName()
        {
            return propertyName;
        }
        
        /**
         * Sets the value of the propertyName property.
         * 
         * @param value
         *            allowed object is {@link String }
         */
        public void setPropertyName(String value)
        {
            this.propertyName = value;
        }
        
        /**
         * Gets the value of the propertyType property.
         * 
         * @return possible object is {@link String }
         */
        public String getPropertyType()
        {
            return propertyType;
        }
        
        /**
         * Sets the value of the propertyType property.
         * 
         * @param value
         *            allowed object is {@link String }
         */
        public void setPropertyType(String value)
        {
            this.propertyType = value;
        }
        
        /**
         * Gets the value of the propertyValue property.
         * 
         * @return possible object is {@link String }
         */
        public String getPropertyValue()
        {
            return propertyValue;
        }
        
        /**
         * Sets the value of the propertyValue property.
         * 
         * @param value
         *            allowed object is {@link String }
         */
        public void setPropertyValue(String value)
        {
            this.propertyValue = value;
        }
        
    }
    
}
