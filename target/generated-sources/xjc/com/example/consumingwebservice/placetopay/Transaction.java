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
 * <p>Clase Java para Transaction complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Transaction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sessionID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="requestDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bankProcessDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="onTest" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="totalAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="taxAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="devolutionBase" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="tipAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="airline" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="serviceFee" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="serviceFeeTax" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="serviceFeeBase" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="payer" type="{https://api.placetopay.com/soap/placetopay}Person"/&gt;
 *         &lt;element name="buyer" type="{https://api.placetopay.com/soap/placetopay}Person"/&gt;
 *         &lt;element name="shipping" type="{https://api.placetopay.com/soap/placetopay}Person"/&gt;
 *         &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userAgent" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="franchise" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="franchiseName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bankCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bankFactor" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="authorization" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="receipt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="refunded" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="transactionState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="responseCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="responseReasonCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="responseReasonText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serviceFeeTransactionState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serviceFeeResponseCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="serviceFeeResponseReasonCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serviceFeeResponseReasonText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serviceFeeAuthorization" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serviceFeeReceipt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="additional" type="{https://api.placetopay.com/soap/placetopay}ArrayOfAttribute"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction", propOrder = {

})
public class Transaction {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer transactionID;
    @XmlElement(required = true, nillable = true)
    protected String sessionID;
    @XmlElement(required = true, nillable = true)
    protected String reference;
    @XmlElement(required = true, nillable = true)
    protected String requestDate;
    @XmlElement(required = true, nillable = true)
    protected String bankProcessDate;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean onTest;
    @XmlElement(required = true, nillable = true)
    protected String description;
    @XmlElement(required = true, nillable = true)
    protected String currency;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double totalAmount;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double taxAmount;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double devolutionBase;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double tipAmount;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer airline;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double serviceFee;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double serviceFeeTax;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double serviceFeeBase;
    @XmlElement(required = true, nillable = true)
    protected Person payer;
    @XmlElement(required = true, nillable = true)
    protected Person buyer;
    @XmlElement(required = true, nillable = true)
    protected Person shipping;
    @XmlElement(required = true, nillable = true)
    protected String ipAddress;
    @XmlElement(required = true, nillable = true)
    protected String userAgent;
    @XmlElement(required = true, nillable = true)
    protected String franchise;
    @XmlElement(required = true, nillable = true)
    protected String franchiseName;
    @XmlElement(required = true, nillable = true)
    protected String bankName;
    @XmlElement(required = true, nillable = true)
    protected String bankCurrency;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float bankFactor;
    @XmlElement(required = true, nillable = true)
    protected String authorization;
    @XmlElement(required = true, nillable = true)
    protected String receipt;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean refunded;
    @XmlElement(required = true, nillable = true)
    protected String transactionState;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer responseCode;
    @XmlElement(required = true, nillable = true)
    protected String responseReasonCode;
    @XmlElement(required = true, nillable = true)
    protected String responseReasonText;
    @XmlElement(required = true, nillable = true)
    protected String serviceFeeTransactionState;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer serviceFeeResponseCode;
    @XmlElement(required = true, nillable = true)
    protected String serviceFeeResponseReasonCode;
    @XmlElement(required = true, nillable = true)
    protected String serviceFeeResponseReasonText;
    @XmlElement(required = true, nillable = true)
    protected String serviceFeeAuthorization;
    @XmlElement(required = true, nillable = true)
    protected String serviceFeeReceipt;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfAttribute additional;

    /**
     * Obtiene el valor de la propiedad transactionID.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransactionID() {
        return transactionID;
    }

    /**
     * Define el valor de la propiedad transactionID.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransactionID(Integer value) {
        this.transactionID = value;
    }

    /**
     * Obtiene el valor de la propiedad sessionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Define el valor de la propiedad sessionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

    /**
     * Obtiene el valor de la propiedad reference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Define el valor de la propiedad reference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Obtiene el valor de la propiedad requestDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestDate() {
        return requestDate;
    }

    /**
     * Define el valor de la propiedad requestDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestDate(String value) {
        this.requestDate = value;
    }

    /**
     * Obtiene el valor de la propiedad bankProcessDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankProcessDate() {
        return bankProcessDate;
    }

    /**
     * Define el valor de la propiedad bankProcessDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankProcessDate(String value) {
        this.bankProcessDate = value;
    }

    /**
     * Obtiene el valor de la propiedad onTest.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnTest() {
        return onTest;
    }

    /**
     * Define el valor de la propiedad onTest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnTest(Boolean value) {
        this.onTest = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtiene el valor de la propiedad currency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Define el valor de la propiedad currency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Obtiene el valor de la propiedad totalAmount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalAmount() {
        return totalAmount;
    }

    /**
     * Define el valor de la propiedad totalAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalAmount(Double value) {
        this.totalAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad taxAmount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxAmount() {
        return taxAmount;
    }

    /**
     * Define el valor de la propiedad taxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxAmount(Double value) {
        this.taxAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad devolutionBase.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDevolutionBase() {
        return devolutionBase;
    }

    /**
     * Define el valor de la propiedad devolutionBase.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDevolutionBase(Double value) {
        this.devolutionBase = value;
    }

    /**
     * Obtiene el valor de la propiedad tipAmount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTipAmount() {
        return tipAmount;
    }

    /**
     * Define el valor de la propiedad tipAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTipAmount(Double value) {
        this.tipAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad airline.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAirline() {
        return airline;
    }

    /**
     * Define el valor de la propiedad airline.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAirline(Integer value) {
        this.airline = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceFee.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getServiceFee() {
        return serviceFee;
    }

    /**
     * Define el valor de la propiedad serviceFee.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setServiceFee(Double value) {
        this.serviceFee = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceFeeTax.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getServiceFeeTax() {
        return serviceFeeTax;
    }

    /**
     * Define el valor de la propiedad serviceFeeTax.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setServiceFeeTax(Double value) {
        this.serviceFeeTax = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceFeeBase.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getServiceFeeBase() {
        return serviceFeeBase;
    }

    /**
     * Define el valor de la propiedad serviceFeeBase.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setServiceFeeBase(Double value) {
        this.serviceFeeBase = value;
    }

    /**
     * Obtiene el valor de la propiedad payer.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPayer() {
        return payer;
    }

    /**
     * Define el valor de la propiedad payer.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPayer(Person value) {
        this.payer = value;
    }

    /**
     * Obtiene el valor de la propiedad buyer.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getBuyer() {
        return buyer;
    }

    /**
     * Define el valor de la propiedad buyer.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setBuyer(Person value) {
        this.buyer = value;
    }

    /**
     * Obtiene el valor de la propiedad shipping.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getShipping() {
        return shipping;
    }

    /**
     * Define el valor de la propiedad shipping.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setShipping(Person value) {
        this.shipping = value;
    }

    /**
     * Obtiene el valor de la propiedad ipAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Define el valor de la propiedad ipAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad userAgent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * Define el valor de la propiedad userAgent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAgent(String value) {
        this.userAgent = value;
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
     * Obtiene el valor de la propiedad franchiseName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFranchiseName() {
        return franchiseName;
    }

    /**
     * Define el valor de la propiedad franchiseName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFranchiseName(String value) {
        this.franchiseName = value;
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
     * Obtiene el valor de la propiedad bankCurrency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCurrency() {
        return bankCurrency;
    }

    /**
     * Define el valor de la propiedad bankCurrency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCurrency(String value) {
        this.bankCurrency = value;
    }

    /**
     * Obtiene el valor de la propiedad bankFactor.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBankFactor() {
        return bankFactor;
    }

    /**
     * Define el valor de la propiedad bankFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBankFactor(Float value) {
        this.bankFactor = value;
    }

    /**
     * Obtiene el valor de la propiedad authorization.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorization() {
        return authorization;
    }

    /**
     * Define el valor de la propiedad authorization.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorization(String value) {
        this.authorization = value;
    }

    /**
     * Obtiene el valor de la propiedad receipt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceipt() {
        return receipt;
    }

    /**
     * Define el valor de la propiedad receipt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceipt(String value) {
        this.receipt = value;
    }

    /**
     * Obtiene el valor de la propiedad refunded.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefunded() {
        return refunded;
    }

    /**
     * Define el valor de la propiedad refunded.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefunded(Boolean value) {
        this.refunded = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionState() {
        return transactionState;
    }

    /**
     * Define el valor de la propiedad transactionState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionState(String value) {
        this.transactionState = value;
    }

    /**
     * Obtiene el valor de la propiedad responseCode.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResponseCode() {
        return responseCode;
    }

    /**
     * Define el valor de la propiedad responseCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResponseCode(Integer value) {
        this.responseCode = value;
    }

    /**
     * Obtiene el valor de la propiedad responseReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseReasonCode() {
        return responseReasonCode;
    }

    /**
     * Define el valor de la propiedad responseReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseReasonCode(String value) {
        this.responseReasonCode = value;
    }

    /**
     * Obtiene el valor de la propiedad responseReasonText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseReasonText() {
        return responseReasonText;
    }

    /**
     * Define el valor de la propiedad responseReasonText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseReasonText(String value) {
        this.responseReasonText = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceFeeTransactionState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceFeeTransactionState() {
        return serviceFeeTransactionState;
    }

    /**
     * Define el valor de la propiedad serviceFeeTransactionState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceFeeTransactionState(String value) {
        this.serviceFeeTransactionState = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceFeeResponseCode.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServiceFeeResponseCode() {
        return serviceFeeResponseCode;
    }

    /**
     * Define el valor de la propiedad serviceFeeResponseCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServiceFeeResponseCode(Integer value) {
        this.serviceFeeResponseCode = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceFeeResponseReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceFeeResponseReasonCode() {
        return serviceFeeResponseReasonCode;
    }

    /**
     * Define el valor de la propiedad serviceFeeResponseReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceFeeResponseReasonCode(String value) {
        this.serviceFeeResponseReasonCode = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceFeeResponseReasonText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceFeeResponseReasonText() {
        return serviceFeeResponseReasonText;
    }

    /**
     * Define el valor de la propiedad serviceFeeResponseReasonText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceFeeResponseReasonText(String value) {
        this.serviceFeeResponseReasonText = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceFeeAuthorization.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceFeeAuthorization() {
        return serviceFeeAuthorization;
    }

    /**
     * Define el valor de la propiedad serviceFeeAuthorization.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceFeeAuthorization(String value) {
        this.serviceFeeAuthorization = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceFeeReceipt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceFeeReceipt() {
        return serviceFeeReceipt;
    }

    /**
     * Define el valor de la propiedad serviceFeeReceipt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceFeeReceipt(String value) {
        this.serviceFeeReceipt = value;
    }

    /**
     * Obtiene el valor de la propiedad additional.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttribute }
     *     
     */
    public ArrayOfAttribute getAdditional() {
        return additional;
    }

    /**
     * Define el valor de la propiedad additional.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttribute }
     *     
     */
    public void setAdditional(ArrayOfAttribute value) {
        this.additional = value;
    }

}
