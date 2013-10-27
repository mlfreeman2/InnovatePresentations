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
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="riskLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="factors" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="factor" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cost" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="probability" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="mitigationAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="commnunityAssessment" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="riskLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="veryHighAmount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="highAmount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="neutralAmount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="lowAmount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="veryLowAmount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "", propOrder = {"id", "riskLevel", "factors", "commnunityAssessment"})
@XmlRootElement(name = "risk")
public class Risk
{
    
    protected Integer                   id;
    
    protected Integer                   riskLevel;
    
    protected Risk.Factors              factors;
    
    protected Risk.CommnunityAssessment commnunityAssessment;
    
    /**
     * Gets the value of the id property.
     * 
     * @return possible object is {@link Integer }
     */
    public Integer getId()
    {
        return id;
    }
    
    /**
     * Sets the value of the id property.
     * 
     * @param value
     *            allowed object is {@link Integer }
     */
    public void setId(Integer value)
    {
        this.id = value;
    }
    
    /**
     * Gets the value of the riskLevel property.
     * 
     * @return possible object is {@link Integer }
     */
    public Integer getRiskLevel()
    {
        return riskLevel;
    }
    
    /**
     * Sets the value of the riskLevel property.
     * 
     * @param value
     *            allowed object is {@link Integer }
     */
    public void setRiskLevel(Integer value)
    {
        this.riskLevel = value;
    }
    
    /**
     * Gets the value of the factors property.
     * 
     * @return possible object is {@link Risk.Factors }
     */
    public Risk.Factors getFactors()
    {
        return factors;
    }
    
    /**
     * Sets the value of the factors property.
     * 
     * @param value
     *            allowed object is {@link Risk.Factors }
     */
    public void setFactors(Risk.Factors value)
    {
        this.factors = value;
    }
    
    /**
     * Gets the value of the commnunityAssessment property.
     * 
     * @return possible object is {@link Risk.CommnunityAssessment }
     */
    public Risk.CommnunityAssessment getCommnunityAssessment()
    {
        return commnunityAssessment;
    }
    
    /**
     * Sets the value of the commnunityAssessment property.
     * 
     * @param value
     *            allowed object is {@link Risk.CommnunityAssessment }
     */
    public void setCommnunityAssessment(Risk.CommnunityAssessment value)
    {
        this.commnunityAssessment = value;
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
     *         &lt;element name="riskLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="veryHighAmount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="highAmount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="neutralAmount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="lowAmount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="veryLowAmount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"riskLevel", "veryHighAmount", "highAmount", "neutralAmount", "lowAmount", "veryLowAmount"})
    public static class CommnunityAssessment
    {
        
        protected Integer riskLevel;
        
        protected Integer veryHighAmount;
        
        protected Integer highAmount;
        
        protected Integer neutralAmount;
        
        protected Integer lowAmount;
        
        protected Integer veryLowAmount;
        
        /**
         * Gets the value of the riskLevel property.
         * 
         * @return possible object is {@link Integer }
         */
        public Integer getRiskLevel()
        {
            return riskLevel;
        }
        
        /**
         * Sets the value of the riskLevel property.
         * 
         * @param value
         *            allowed object is {@link Integer }
         */
        public void setRiskLevel(Integer value)
        {
            this.riskLevel = value;
        }
        
        /**
         * Gets the value of the veryHighAmount property.
         * 
         * @return possible object is {@link Integer }
         */
        public Integer getVeryHighAmount()
        {
            return veryHighAmount;
        }
        
        /**
         * Sets the value of the veryHighAmount property.
         * 
         * @param value
         *            allowed object is {@link Integer }
         */
        public void setVeryHighAmount(Integer value)
        {
            this.veryHighAmount = value;
        }
        
        /**
         * Gets the value of the highAmount property.
         * 
         * @return possible object is {@link Integer }
         */
        public Integer getHighAmount()
        {
            return highAmount;
        }
        
        /**
         * Sets the value of the highAmount property.
         * 
         * @param value
         *            allowed object is {@link Integer }
         */
        public void setHighAmount(Integer value)
        {
            this.highAmount = value;
        }
        
        /**
         * Gets the value of the neutralAmount property.
         * 
         * @return possible object is {@link Integer }
         */
        public Integer getNeutralAmount()
        {
            return neutralAmount;
        }
        
        /**
         * Sets the value of the neutralAmount property.
         * 
         * @param value
         *            allowed object is {@link Integer }
         */
        public void setNeutralAmount(Integer value)
        {
            this.neutralAmount = value;
        }
        
        /**
         * Gets the value of the lowAmount property.
         * 
         * @return possible object is {@link Integer }
         */
        public Integer getLowAmount()
        {
            return lowAmount;
        }
        
        /**
         * Sets the value of the lowAmount property.
         * 
         * @param value
         *            allowed object is {@link Integer }
         */
        public void setLowAmount(Integer value)
        {
            this.lowAmount = value;
        }
        
        /**
         * Gets the value of the veryLowAmount property.
         * 
         * @return possible object is {@link Integer }
         */
        public Integer getVeryLowAmount()
        {
            return veryLowAmount;
        }
        
        /**
         * Sets the value of the veryLowAmount property.
         * 
         * @param value
         *            allowed object is {@link Integer }
         */
        public void setVeryLowAmount(Integer value)
        {
            this.veryLowAmount = value;
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
     *         &lt;element name="factor" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cost" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="probability" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="mitigationAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {"factor"})
    public static class Factors
    {
        
        protected List<Risk.Factors.Factor> factor;
        
        /**
         * Gets the value of the factor property.
         * <p>
         * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the factor property.
         * <p>
         * For example, to add a new item, do as follows:
         * 
         * <pre>
         * getFactor().add(newItem);
         * </pre>
         * <p>
         * Objects of the following type(s) are allowed in the list {@link Risk.Factors.Factor }
         */
        public List<Risk.Factors.Factor> getFactor()
        {
            if (factor == null)
            {
                factor = new ArrayList<Risk.Factors.Factor>();
            }
            return this.factor;
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
         *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cost" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="probability" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="mitigationAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {"id", "name", "description", "cost", "weight", "probability", "mitigationAction"})
        public static class Factor
        {
            
            protected Integer id;
            
            @XmlElement(required = true)
            protected String  name;
            
            protected String  description;
            
            protected Integer cost;
            
            protected Integer weight;
            
            protected Integer probability;
            
            protected String  mitigationAction;
            
            /**
             * Gets the value of the id property.
             * 
             * @return possible object is {@link Integer }
             */
            public Integer getId()
            {
                return id;
            }
            
            /**
             * Sets the value of the id property.
             * 
             * @param value
             *            allowed object is {@link Integer }
             */
            public void setId(Integer value)
            {
                this.id = value;
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
             * Gets the value of the description property.
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
             * Gets the value of the cost property.
             * 
             * @return possible object is {@link Integer }
             */
            public Integer getCost()
            {
                return cost;
            }
            
            /**
             * Sets the value of the cost property.
             * 
             * @param value
             *            allowed object is {@link Integer }
             */
            public void setCost(Integer value)
            {
                this.cost = value;
            }
            
            /**
             * Gets the value of the weight property.
             * 
             * @return possible object is {@link Integer }
             */
            public Integer getWeight()
            {
                return weight;
            }
            
            /**
             * Sets the value of the weight property.
             * 
             * @param value
             *            allowed object is {@link Integer }
             */
            public void setWeight(Integer value)
            {
                this.weight = value;
            }
            
            /**
             * Gets the value of the probability property.
             * 
             * @return possible object is {@link Integer }
             */
            public Integer getProbability()
            {
                return probability;
            }
            
            /**
             * Sets the value of the probability property.
             * 
             * @param value
             *            allowed object is {@link Integer }
             */
            public void setProbability(Integer value)
            {
                this.probability = value;
            }
            
            /**
             * Gets the value of the mitigationAction property.
             * 
             * @return possible object is {@link String }
             */
            public String getMitigationAction()
            {
                return mitigationAction;
            }
            
            /**
             * Sets the value of the mitigationAction property.
             * 
             * @param value
             *            allowed object is {@link String }
             */
            public void setMitigationAction(String value)
            {
                this.mitigationAction = value;
            }
            
        }
        
    }
    
}
