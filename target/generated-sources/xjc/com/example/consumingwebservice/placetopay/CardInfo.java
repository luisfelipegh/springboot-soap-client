//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.07.05 a las 06:43:13 PM COT 
//


package com.example.consumingwebservice.placetopay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CardInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CardInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="expiration" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="differed" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="secureCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardInfo", propOrder = {

})
public class CardInfo {

    @XmlElement(required = true, nillable = true)
    protected String number;
    @XmlElement(required = true, nillable = true)
    protected String type;
    @XmlElement(required = true, nillable = true)
    protected String expiration;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer differed;
    @XmlElement(required = true, nillable = true)
    protected String secureCode;

    /**
     * Obtiene el valor de la propiedad number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Define el valor de la propiedad number.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad expiration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiration() {
        return expiration;
    }

    /**
     * Define el valor de la propiedad expiration.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiration(String value) {
        this.expiration = value;
    }

    /**
     * Obtiene el valor de la propiedad differed.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiffered() {
        return differed;
    }

    /**
     * Define el valor de la propiedad differed.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiffered(Integer value) {
        this.differed = value;
    }

    /**
     * Obtiene el valor de la propiedad secureCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureCode() {
        return secureCode;
    }

    /**
     * Define el valor de la propiedad secureCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureCode(String value) {
        this.secureCode = value;
    }

}
