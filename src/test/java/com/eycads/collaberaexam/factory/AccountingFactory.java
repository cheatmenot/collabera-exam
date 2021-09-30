package com.eycads.collaberaexam.factory;

import com.eycads.collaberaexam.mapper.AccountingMapper;
import com.eycads.collaberaexam.model.from.AccountingLineXYZ;
import com.eycads.collaberaexam.model.to.AccountingLine;
import com.eycads.collaberaexam.model.to.AccountingLineStatus;
import com.eycads.collaberaexam.model.to.MonetaryAmount;
import com.eycads.collaberaexam.model.to.MonetaryPercentage;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;

public class AccountingFactory {

  public static AccountingLineXYZ createValidAccountingLineXYZRequest(){
    AccountingLineXYZ request = new AccountingLineXYZ();
    request.setIndex(1);
    request.setTypeIndicator("TYPE-01");
    request.setFareApplication("ONE");
    request.setFormOfPaymentCode("FormOfPaymentCode0");
    request.setLinkCode("01");
    request.setAccountingVendorCode("ABC");
    request.setChargeCategoryCoded("TEST");
    request.setAirlineDesignator("AA");
    request.setDocumentNumber("3889081143");
    request.setCommissionPercentage("2");
    request.setCommissionAmount("2");
    request.setBaseFare("123.00");
    request.setTaxPercentage("1");
    request.setTaxAmount("201.38");
    request.setTaxSurchargeCode2("VAT");
    request.setGSTCode("GST");
    request.setGSTAmount("10");
    request.setGSTPercent("1");
    request.setQSTCode("QST");
    request.setQSTAmount("10");
    request.setQSTPercent("1");
    request.setCreditCardNumber("123456789");
    request.setCreditCardCode("AX0");
    request.setPassengerName("Thanos");
    request.setNumberOfConjunctedDocuments("15-FEE-EXP$08");
    request.setOriginalTicketNumber("123456");
    request.setOriginalInvoice("00001");
    request.setFreeFormText("HELLO WORLD");
    request.setCurrencyCode("USD");
    request.setSegmentNumber("1,2,3");
    return request;
  }

  public static AccountingLine createValidAccountingLineResponse(AccountingMapper accountingMapper){
    MonetaryAmount totalTaxSurcharge = accountingMapper.getMonetaryAmount(
        accountingMapper.addAmount("10", "10").toString(), "USD");
    MonetaryPercentage percentage = MonetaryPercentage.builder()
        .percentage(new BigDecimal("2"))
        .amount(accountingMapper.getMonetaryAmount("2", "USD"))
        .build();
    return AccountingLine.builder()
        .typeIndicator("TYPE-01")
        .accountingLineStatus(AccountingLineStatus.ACTIVE)
        .accountingVendorCode("ABC")
        .chargeCategoryCode("TEST")
        .invoiceNumber("00001")
        .linkCode("01")
        .numberOfConjunctedDocuments("15-FEE-EXP$08")
        .originalTicketNumber("123456")
        .receiptNumber("3889081143")
        .segmentRefIDList(Arrays.asList("1", "2", "3"))
        .travelerName("Thanos")
        .travelerRefIDList(Collections.singletonList("1"))
        .typeIndicator("TYPE-01")
        .elementNumber("1")
        .fareApplication("ONE")
        .baseFare(accountingMapper.getMonetaryAmount("123.00", "USD"))
        .taxAmount(accountingMapper.getMonetaryAmount("201.38", "USD"))
        .totalTaxSurcharge(totalTaxSurcharge)
        .totalTaxAmount(accountingMapper.getMonetaryAmount(
            accountingMapper.addAmount("201.38", totalTaxSurcharge.getFormattedValue()).toString(), "USD"))
        .gstAmount(accountingMapper.getMonetaryAmount("10", "USD"))
        .gstCode("GST")
        .qstAmount(accountingMapper.getMonetaryAmount("10", "USD"))
        .qstCode("QST")
        .commission(percentage)
        .freeFormText("HELLO WORLD")
        .build();
  }

  public static String createXMLString(){
    return "<AccountingLine id=\"572\" index=\"1\" op=\"C\" elementId=\"PNR-572\">\n" +
        "    <TypeIndicator>TYPE-01</TypeIndicator>\n" +
        "    <FareApplication>ONE</FareApplication>\n" +
        "    <FormOfPaymentCode>FormOfPaymentCode0</FormOfPaymentCode>\n" +
        "    <LinkCode>01</LinkCode>\n" +
        "    <AccountingVendorCode>ABC</AccountingVendorCode>\n" +
        "    <ChargeCategoryCoded>TEST</ChargeCategoryCoded>\n" +
        "    <AirlineDesignator>AA</AirlineDesignator>\n" +
        "    <DocumentNumber>3889081143</DocumentNumber>\n" +
        "    <CommissionPercentage>2</CommissionPercentage>\n" +
        "    <CommissionAmount>2</CommissionAmount>\n" +
        "    <BaseFare>1252.31</BaseFare>\n" +
        "    <TaxPercentage>1</TaxPercentage>\n" +
        "    <TaxAmount>201.38</TaxAmount>\n" +
        "    <TaxSurchargeCode2>VAT</TaxSurchargeCode2>\n" +
        "    <GSTCode>GST</GSTCode>\n" +
        "    <GSTAmount>10</GSTAmount>\n" +
        "    <GSTPercent>1</GSTPercent>\n" +
        "    <QSTCode>QST</QSTCode>\n" +
        "    <QSTAmount>10</QSTAmount>\n" +
        "    <QSTPercent>1</QSTPercent>\n" +
        "    <CreditCardNumber>123456789</CreditCardNumber>\n" +
        "    <CreditCardCode>AX0</CreditCardCode>\n" +
        "    <PassengerName>Thanos</PassengerName>\n" +
        "    <NumberOfConjunctedDocuments>15-FEE-EXP$08</NumberOfConjunctedDocuments>\n" +
        "    <NumberOfCoupons>1</NumberOfCoupons>\n" +
        "    <OriginalTicketNumber>123456</OriginalTicketNumber>\n" +
        "    <OriginalDateOfIssue>2021-01-28</OriginalDateOfIssue>\n" +
        "    <OriginalPlaceOfIssue>MNL</OriginalPlaceOfIssue>\n" +
        "    <FullPartialExchangeIndicator>PART</FullPartialExchangeIndicator>\n" +
        "    <OriginalInvoice>00001</OriginalInvoice>\n" +
        "    <TarriffBasis>TarriffBasis0</TarriffBasis>\n" +
        "    <FreeFormText>HELLO WORLD</FreeFormText>\n" +
        "    <CurrencyCode>USD</CurrencyCode>\n" +
        "    <SegmentType>AIR</SegmentType>\n" +
        "    <SegmentNumber>1,2,3</SegmentNumber>\n" +
        "</AccountingLine>";
  }
}
