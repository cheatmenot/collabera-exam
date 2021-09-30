package com.eycads.collaberaexam.model.from;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountingLine.XYZ", propOrder = {
        "typeIndicator",
        "fareApplication",
        "formOfPaymentCode",
        "linkCode",
        "accountingVendorCode",
        "chargeCategoryCoded",
        "airlineDesignator",
        "documentNumber",
        "commissionPercentage",
        "commissionAmount",
        "baseFare",
        "basePercent",
        "taxPercentage",
        "taxAmount",
        "taxSurchargeCode2",
        "gstCode",
        "gstAmount",
        "gstPercent",
        "qstCode",
        "qstAmount",
        "qstPercent",
        "creditCardNumber",
        "creditCardCode",
        "passengerName",
        "numberOfConjunctedDocuments",
        "numberOfCoupons",
        "originalTicketNumber",
        "originalDateOfIssue",
        "originalPlaceOfIssue",
        "fullPartialExchangeIndicator",
        "originalInvoice",
        "tarriffBasis",
        "freeFormText",
        "currencyCode",
        "segmentType",
        "segmentNumber"
})
public class AccountingLineXYZ
        implements Serializable
{

    @XmlElement(name = "TypeIndicator")
    protected String typeIndicator;
    @XmlElement(name = "FareApplication")
    protected String fareApplication;
    @XmlElement(name = "FormOfPaymentCode")
    protected String formOfPaymentCode;
    @XmlElement(name = "LinkCode")
    protected String linkCode;
    @XmlElement(name = "AccountingVendorCode")
    protected String accountingVendorCode;
    @XmlElement(name = "ChargeCategoryCoded")
    protected String chargeCategoryCoded;
    @XmlElement(name = "AirlineDesignator")
    protected String airlineDesignator;
    @XmlElement(name = "DocumentNumber")
    protected String documentNumber;
    @XmlElement(name = "CommissionPercentage")
    protected String commissionPercentage;
    @XmlElement(name = "CommissionAmount")
    protected String commissionAmount;
    @XmlElement(name = "BaseFare")
    protected String baseFare;
    @XmlElement(name = "BasePercent")
    protected String basePercent;
    @XmlElement(name = "TaxPercentage")
    protected String taxPercentage;
    @XmlElement(name = "TaxAmount")
    protected String taxAmount;
    @XmlElement(name = "TaxSurchargeCode2")
    protected String taxSurchargeCode2;
    @XmlElement(name = "GSTCode")
    protected String gstCode;
    @XmlElement(name = "GSTAmount")
    protected String gstAmount;
    @XmlElement(name = "GSTPercent")
    protected String gstPercent;
    @XmlElement(name = "QSTCode")
    protected String qstCode;
    @XmlElement(name = "QSTAmount")
    protected String qstAmount;
    @XmlElement(name = "QSTPercent")
    protected String qstPercent;
    @XmlElement(name = "CreditCardNumber")
    protected String creditCardNumber;
    @XmlElement(name = "CreditCardCode")
    protected String creditCardCode;
    @XmlElement(name = "PassengerName")
    protected String passengerName;
    @XmlElement(name = "NumberOfConjunctedDocuments")
    protected String numberOfConjunctedDocuments;
    @XmlElement(name = "NumberOfCoupons")
    protected String numberOfCoupons;
    @XmlElement(name = "OriginalTicketNumber")
    protected String originalTicketNumber;
    @XmlElement(name = "OriginalDateOfIssue")
    protected String originalDateOfIssue;
    @XmlElement(name = "OriginalPlaceOfIssue")
    protected String originalPlaceOfIssue;
    @XmlElement(name = "FullPartialExchangeIndicator")
    protected String fullPartialExchangeIndicator;
    @XmlElement(name = "OriginalInvoice")
    protected String originalInvoice;
    @XmlElement(name = "TarriffBasis")
    protected String tarriffBasis;
    @XmlElement(name = "FreeFormText")
    protected String freeFormText;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "SegmentType")
    protected String segmentType;
    @XmlElement(name = "SegmentNumber")
    protected String segmentNumber;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "index")
    protected Integer index;
    @XmlAttribute(name = "elementId")
    protected String elementId;

    /**
     * Gets the value of the typeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeIndicator()
    {
        return typeIndicator;
    }

    /**
     * Sets the value of the typeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeIndicator(String value)
    {
        this.typeIndicator = value;
    }

    /**
     * Gets the value of the fareApplication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareApplication()
    {
        return fareApplication;
    }

    /**
     * Sets the value of the fareApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareApplication(String value)
    {
        this.fareApplication = value;
    }

    /**
     * Gets the value of the formOfPaymentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormOfPaymentCode()
    {
        return formOfPaymentCode;
    }

    /**
     * Sets the value of the formOfPaymentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormOfPaymentCode(String value)
    {
        this.formOfPaymentCode = value;
    }

    /**
     * Gets the value of the linkCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkCode()
    {
        return linkCode;
    }

    /**
     * Sets the value of the linkCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkCode(String value)
    {
        this.linkCode = value;
    }

    /**
     * Gets the value of the accountingVendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountingVendorCode()
    {
        return accountingVendorCode;
    }

    /**
     * Sets the value of the accountingVendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountingVendorCode(String value)
    {
        this.accountingVendorCode = value;
    }

    /**
     * Gets the value of the chargeCategoryCoded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeCategoryCoded()
    {
        return chargeCategoryCoded;
    }

    /**
     * Sets the value of the chargeCategoryCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeCategoryCoded(String value)
    {
        this.chargeCategoryCoded = value;
    }

    /**
     * Gets the value of the airlineDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineDesignator()
    {
        return airlineDesignator;
    }

    /**
     * Sets the value of the airlineDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineDesignator(String value)
    {
        this.airlineDesignator = value;
    }

    /**
     * Gets the value of the documentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumber()
    {
        return documentNumber;
    }

    /**
     * Sets the value of the documentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumber(String value)
    {
        this.documentNumber = value;
    }

    /**
     * Gets the value of the commissionPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionPercentage()
    {
        return commissionPercentage;
    }

    /**
     * Sets the value of the commissionPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionPercentage(String value)
    {
        this.commissionPercentage = value;
    }

    /**
     * Gets the value of the commissionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionAmount()
    {
        return commissionAmount;
    }

    /**
     * Sets the value of the commissionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionAmount(String value)
    {
        this.commissionAmount = value;
    }

    /**
     * Gets the value of the baseFare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseFare()
    {
        return baseFare;
    }

    /**
     * Sets the value of the baseFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseFare(String value)
    {
        this.baseFare = value;
    }

    /**
     * Gets the value of the basePercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasePercent()
    {
        return basePercent;
    }

    /**
     * Sets the value of the basePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasePercent(String value)
    {
        this.basePercent = value;
    }

    /**
     * Gets the value of the taxPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxPercentage()
    {
        return taxPercentage;
    }

    /**
     * Sets the value of the taxPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxPercentage(String value)
    {
        this.taxPercentage = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAmount()
    {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAmount(String value)
    {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the taxSurchargeCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxSurchargeCode2()
    {
        return taxSurchargeCode2;
    }

    /**
     * Sets the value of the taxSurchargeCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxSurchargeCode2(String value)
    {
        this.taxSurchargeCode2 = value;
    }

    /**
     * Gets the value of the gstCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGSTCode()
    {
        return gstCode;
    }

    /**
     * Sets the value of the gstCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGSTCode(String value)
    {
        this.gstCode = value;
    }

    /**
     * Gets the value of the gstAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGSTAmount()
    {
        return gstAmount;
    }

    /**
     * Sets the value of the gstAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGSTAmount(String value)
    {
        this.gstAmount = value;
    }

    /**
     * Gets the value of the gstPercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGSTPercent()
    {
        return gstPercent;
    }

    /**
     * Sets the value of the gstPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGSTPercent(String value)
    {
        this.gstPercent = value;
    }

    /**
     * Gets the value of the qstCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQSTCode()
    {
        return qstCode;
    }

    /**
     * Sets the value of the qstCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQSTCode(String value)
    {
        this.qstCode = value;
    }

    /**
     * Gets the value of the qstAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQSTAmount()
    {
        return qstAmount;
    }

    /**
     * Sets the value of the qstAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQSTAmount(String value)
    {
        this.qstAmount = value;
    }

    /**
     * Gets the value of the qstPercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQSTPercent()
    {
        return qstPercent;
    }

    /**
     * Sets the value of the qstPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQSTPercent(String value)
    {
        this.qstPercent = value;
    }

    /**
     * Gets the value of the creditCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNumber()
    {
        return creditCardNumber;
    }

    /**
     * Sets the value of the creditCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNumber(String value)
    {
        this.creditCardNumber = value;
    }

    /**
     * Gets the value of the creditCardCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardCode()
    {
        return creditCardCode;
    }

    /**
     * Sets the value of the creditCardCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardCode(String value)
    {
        this.creditCardCode = value;
    }

    /**
     * Gets the value of the passengerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerName()
    {
        return passengerName;
    }

    /**
     * Sets the value of the passengerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerName(String value)
    {
        this.passengerName = value;
    }

    /**
     * Gets the value of the numberOfConjunctedDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfConjunctedDocuments()
    {
        return numberOfConjunctedDocuments;
    }

    /**
     * Sets the value of the numberOfConjunctedDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfConjunctedDocuments(String value)
    {
        this.numberOfConjunctedDocuments = value;
    }

    /**
     * Gets the value of the numberOfCoupons property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfCoupons()
    {
        return numberOfCoupons;
    }

    /**
     * Sets the value of the numberOfCoupons property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfCoupons(String value)
    {
        this.numberOfCoupons = value;
    }

    /**
     * Gets the value of the originalTicketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalTicketNumber()
    {
        return originalTicketNumber;
    }

    /**
     * Sets the value of the originalTicketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalTicketNumber(String value)
    {
        this.originalTicketNumber = value;
    }

    /**
     * Gets the value of the originalDateOfIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalDateOfIssue()
    {
        return originalDateOfIssue;
    }

    /**
     * Sets the value of the originalDateOfIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalDateOfIssue(String value)
    {
        this.originalDateOfIssue = value;
    }

    /**
     * Gets the value of the originalPlaceOfIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalPlaceOfIssue()
    {
        return originalPlaceOfIssue;
    }

    /**
     * Sets the value of the originalPlaceOfIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalPlaceOfIssue(String value)
    {
        this.originalPlaceOfIssue = value;
    }

    /**
     * Gets the value of the fullPartialExchangeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullPartialExchangeIndicator()
    {
        return fullPartialExchangeIndicator;
    }

    /**
     * Sets the value of the fullPartialExchangeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullPartialExchangeIndicator(String value)
    {
        this.fullPartialExchangeIndicator = value;
    }

    /**
     * Gets the value of the originalInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalInvoice()
    {
        return originalInvoice;
    }

    /**
     * Sets the value of the originalInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalInvoice(String value)
    {
        this.originalInvoice = value;
    }

    /**
     * Gets the value of the tarriffBasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarriffBasis()
    {
        return tarriffBasis;
    }

    /**
     * Sets the value of the tarriffBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarriffBasis(String value)
    {
        this.tarriffBasis = value;
    }

    /**
     * Gets the value of the freeFormText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeFormText()
    {
        return freeFormText;
    }

    /**
     * Sets the value of the freeFormText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeFormText(String value)
    {
        this.freeFormText = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode()
    {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value)
    {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the segmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentType()
    {
        return segmentType;
    }

    /**
     * Sets the value of the segmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentType(String value)
    {
        this.segmentType = value;
    }

    /**
     * Gets the value of the segmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentNumber()
    {
        return segmentNumber;
    }

    /**
     * Sets the value of the segmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentNumber(String value)
    {
        this.segmentNumber = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId()
    {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value)
    {
        this.id = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndex()
    {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndex(Integer value)
    {
        this.index = value;
    }

    /**
     * Gets the value of the elementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementId()
    {
        return elementId;
    }

    /**
     * Sets the value of the elementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementId(String value)
    {
        this.elementId = value;
    }

    @Override
    public String toString() {
        return "AccountingLineXYZ{" +
            "typeIndicator='" + typeIndicator + '\'' +
            ", fareApplication='" + fareApplication + '\'' +
            ", formOfPaymentCode='" + formOfPaymentCode + '\'' +
            ", linkCode='" + linkCode + '\'' +
            ", accountingVendorCode='" + accountingVendorCode + '\'' +
            ", chargeCategoryCoded='" + chargeCategoryCoded + '\'' +
            ", airlineDesignator='" + airlineDesignator + '\'' +
            ", documentNumber='" + documentNumber + '\'' +
            ", commissionPercentage='" + commissionPercentage + '\'' +
            ", commissionAmount='" + commissionAmount + '\'' +
            ", baseFare='" + baseFare + '\'' +
            ", basePercent='" + basePercent + '\'' +
            ", taxPercentage='" + taxPercentage + '\'' +
            ", taxAmount='" + taxAmount + '\'' +
            ", taxSurchargeCode2='" + taxSurchargeCode2 + '\'' +
            ", gstCode='" + gstCode + '\'' +
            ", gstAmount='" + gstAmount + '\'' +
            ", gstPercent='" + gstPercent + '\'' +
            ", qstCode='" + qstCode + '\'' +
            ", qstAmount='" + qstAmount + '\'' +
            ", qstPercent='" + qstPercent + '\'' +
            ", creditCardNumber='" + creditCardNumber + '\'' +
            ", creditCardCode='" + creditCardCode + '\'' +
            ", passengerName='" + passengerName + '\'' +
            ", numberOfConjunctedDocuments='" + numberOfConjunctedDocuments + '\'' +
            ", numberOfCoupons='" + numberOfCoupons + '\'' +
            ", originalTicketNumber='" + originalTicketNumber + '\'' +
            ", originalDateOfIssue='" + originalDateOfIssue + '\'' +
            ", originalPlaceOfIssue='" + originalPlaceOfIssue + '\'' +
            ", fullPartialExchangeIndicator='" + fullPartialExchangeIndicator + '\'' +
            ", originalInvoice='" + originalInvoice + '\'' +
            ", tarriffBasis='" + tarriffBasis + '\'' +
            ", freeFormText='" + freeFormText + '\'' +
            ", currencyCode='" + currencyCode + '\'' +
            ", segmentType='" + segmentType + '\'' +
            ", segmentNumber='" + segmentNumber + '\'' +
            ", id='" + id + '\'' +
            ", index=" + index +
            ", elementId='" + elementId + '\'' +
            '}';
    }
}
