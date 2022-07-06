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
 * <p>Clase Java para TokenInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TokenInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="franchise" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lastDigits" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="validUntil" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="subtoken" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TokenInfo", propOrder = {

})
public class TokenInfo {

    @XmlElement(required = true, nillable = true)
    protected String token;
    @XmlElement(required = true, nillable = true)
    protected String franchise;
    @XmlElement(required = true, nillable = true)
    protected String bankName;
    @XmlElement(required = true, nillable = true)
    protected String lastDigits;
    @XmlElement(required = true, nillable = true)
    protected String validUntil;
    @XmlElement(required = true, nillable = true)
    protected String subtoken;

    /**
     * Obtiene el valor de la propiedad token.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Define el valor de la propiedad token.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Obtiene el valor de la propiedad franchise.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFranchise() {
        return franchise;
    }

    /**
     * Define el valor de la propiedad franchise.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFranchise(String value) {
        this.franchise = value;
    }

    /**
     * Obtiene el valor de la propiedad bankName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Define el valor de la propiedad bankName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Obtiene el valor de la propiedad lastDigits.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastDigits() {
        return lastDigits;
    }

    /**
     * Define el valor de la propiedad lastDigits.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastDigits(String value) {
        this.lastDigits = value;
    }

    /**
     * Obtiene el valor de la propiedad validUntil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidUntil() {
        return validUntil;
    }

    /**
     * Define el valor de la propiedad validUntil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidUntil(String value) {
        this.validUntil = value;
    }

    /**
     * Obtiene el valor de la propiedad subtoken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtoken() {
        return subtoken;
    }

    /**
     * Define el valor de la propiedad subtoken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtoken(String value) {
        this.subtoken = value;
    }

}
