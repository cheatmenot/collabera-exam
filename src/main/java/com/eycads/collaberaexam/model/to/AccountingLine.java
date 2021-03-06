package com.eycads.collaberaexam.model.to;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@XmlRootElement(name = "accountingLine")
@XmlAccessorType(XmlAccessType.FIELD)
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@ToString
public class AccountingLine implements Serializable
{
    private static final long serialVersionUID = 8768848284389900534L;

    private String accountingLineID;

    private AccountingLineStatus accountingLineStatus;

    private String accountingVendorCode;

    private String airlineCode;

    private String chargeCategoryCode;

    private String formattedReceiptNumber;

    private String invoiceNumber;

    private String linkCode;

    private String numberOfConjunctedDocuments;

    private String originalTicketNumber;

    private String receiptNumber;

    private List<String> segmentRefIDList;

    private String travelerName;

    private List<String> travelerRefIDList;

    private String typeIndicator;

    private String elementNumber;

    private String fareApplication;

    private MonetaryAmount baseFare;

    private MonetaryAmount taxAmount;

    private MonetaryAmount totalTaxAmount;

    private MonetaryAmount totalTaxSurcharge;

    private MonetaryAmount gstAmount;

    private String gstCode;

    private MonetaryAmount qstAmount;

    private String qstCode;

    private MonetaryPercentage commission;

    private String freeFormText;

}
