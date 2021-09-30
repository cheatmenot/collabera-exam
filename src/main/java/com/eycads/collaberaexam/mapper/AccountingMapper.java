package com.eycads.collaberaexam.mapper;

import com.eycads.collaberaexam.model.from.AccountingLineXYZ;
import com.eycads.collaberaexam.model.to.AccountingLine;
import com.eycads.collaberaexam.model.to.AccountingLineStatus;
import com.eycads.collaberaexam.model.to.MonetaryAmount;
import com.eycads.collaberaexam.model.to.MonetaryPercentage;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class AccountingMapper {

  public AccountingLine map(AccountingLineXYZ reqXML){
    List<String> segmentRefIdList = Arrays.stream(reqXML.getSegmentNumber().split(","))
        .collect(Collectors.toList());
    MonetaryAmount totalTaxSurcharge = getMonetaryAmount(
        addAmount(reqXML.getQSTAmount(), reqXML.getGSTAmount()).toString(),
        reqXML.getCurrencyCode());
    MonetaryPercentage percentage = MonetaryPercentage.builder()
        .percentage(new BigDecimal(reqXML.getCommissionPercentage()))
        .amount(getMonetaryAmount(reqXML.getCommissionAmount(), reqXML.getCurrencyCode()))
        .build();
    return AccountingLine.builder()
        .accountingLineID(reqXML.getId())
        .accountingLineStatus(AccountingLineStatus.ACTIVE)
        .accountingVendorCode(reqXML.getAccountingVendorCode())
        .chargeCategoryCode(reqXML.getChargeCategoryCoded())
        .invoiceNumber(reqXML.getOriginalInvoice())
        .linkCode(reqXML.getLinkCode())
        .numberOfConjunctedDocuments(reqXML.getNumberOfConjunctedDocuments())
        .originalTicketNumber(reqXML.getOriginalTicketNumber())
        .receiptNumber(reqXML.getDocumentNumber())
        .segmentRefIDList(segmentRefIdList)
        .travelerName(reqXML.getPassengerName())
        .travelerRefIDList(Collections.singletonList("1"))
        .typeIndicator(reqXML.getTypeIndicator())
        .elementNumber(String.valueOf(reqXML.getIndex()))
        .fareApplication(reqXML.getFareApplication())
        .baseFare(getMonetaryAmount(reqXML.getBaseFare(), reqXML.getCurrencyCode()))
        .taxAmount(getMonetaryAmount(reqXML.getTaxAmount(), reqXML.getCurrencyCode()))
        .totalTaxSurcharge(totalTaxSurcharge)
        .totalTaxAmount(getMonetaryAmount(
            addAmount(reqXML.getTaxAmount(), totalTaxSurcharge.getFormattedValue()).toString(),
            reqXML.getCurrencyCode()))
        .gstAmount(getMonetaryAmount(reqXML.getGSTAmount(), reqXML.getCurrencyCode()))
        .gstCode(reqXML.getGSTCode())
        .qstAmount(getMonetaryAmount(reqXML.getQSTAmount(), reqXML.getCurrencyCode()))
        .qstCode(reqXML.getQSTCode())
        .commission(percentage)
        .freeFormText(reqXML.getFreeFormText())
        .build();
  }

  public Double addAmount(String str1, String str2){
    Double val1 = Double.parseDouble(str1);
    Double val2 = Double.parseDouble(str2);
    return val1 + val2;
  }

  public MonetaryAmount getMonetaryAmount(String value, String currencyCode){
    int numberOfDecimals = 0;
    String[] splitter = value.toString().split("\\.");
    if (splitter.length >= 2){
      numberOfDecimals = splitter[1].length();
    }
    return MonetaryAmount.builder()
        .formattedValue(value)
        .value(Double.parseDouble(value))
        .currencyCode(currencyCode)
        .numberOfDecimals(numberOfDecimals)
        .build();
  }

}
