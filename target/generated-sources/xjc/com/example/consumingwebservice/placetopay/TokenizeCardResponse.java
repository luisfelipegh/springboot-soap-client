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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tokenizeCardResult" type="{https://api.placetopay.com/soap/placetopay}TokenInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tokenizeCardResult"
})
@XmlRootElement(name = "tokenizeCardResponse")
public class TokenizeCardResponse {

    @XmlElement(required = true)
    protected TokenInfo tokenizeCardResult;

    /**
     * Obtiene el valor de la propiedad tokenizeCardResult.
     * 
     * @return
     *     possible object is
     *     {@link TokenInfo }
     *     
     */
    public TokenInfo getTokenizeCardResult() {
        return tokenizeCardResult;
    }

    /**
     * Define el valor de la propiedad tokenizeCardResult.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenInfo }
     *     
     */
    public void setTokenizeCardResult(TokenInfo value) {
        this.tokenizeCardResult = value;
    }

}
