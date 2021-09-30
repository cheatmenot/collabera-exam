package com.eycads.collaberaexam.mapper;

import com.eycads.collaberaexam.factory.AccountingFactory;
import com.eycads.collaberaexam.model.from.AccountingLineXYZ;
import com.eycads.collaberaexam.model.to.AccountingLine;
import com.eycads.collaberaexam.model.to.AccountingLineStatus;
import com.eycads.collaberaexam.model.to.MonetaryAmount;
import com.eycads.collaberaexam.model.to.MonetaryPercentage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;

public class AccountingMapperTest {

  private static AccountingMapper accountingMapper;

  @BeforeAll
  static void beforeAll(){
    accountingMapper = new AccountingMapper();
  }

  @Test
  public void addAmountSuccessTest(){
    Double actual = accountingMapper.addAmount("1", "2");
    Assertions.assertEquals(new Double(3), actual);
  }

  @Test
  public void addAmountFailedTest(){
    Exception e = Assertions.assertThrows(NumberFormatException.class, () -> {
      accountingMapper.addAmount("1", "A");
    });
    Assertions.assertEquals("For input string: \"A\"", e.getMessage());
  }

  @Test
  public void getMonetaryAmountSuccessTest(){
    MonetaryAmount actual = accountingMapper.getMonetaryAmount("123.45", "USD");
    MonetaryAmount expected = MonetaryAmount.builder()
        .formattedValue("123.45")
        .numberOfDecimals(2)
        .value(new Double("123.45"))
        .currencyCode("USD")
        .build();
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void getMonetaryAmountZeroValueTest(){
    MonetaryAmount actual = accountingMapper.getMonetaryAmount("0", "PHP");
    MonetaryAmount expected = MonetaryAmount.builder()
        .formattedValue("0")
        .numberOfDecimals(0)
        .value(new Double("0"))
        .currencyCode("PHP")
        .build();
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void getMonetaryAmountMultipleDecimalsTest(){
    MonetaryAmount actual = accountingMapper.getMonetaryAmount("0.0123", "SGD");
    MonetaryAmount expected = MonetaryAmount.builder()
        .formattedValue("0.0123")
        .numberOfDecimals(4)
        .value(new Double("0.0123"))
        .currencyCode("SGD")
        .build();
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void getMonetaryAmountFailedTest(){
    Exception e = Assertions.assertThrows(NumberFormatException.class, () -> {
      accountingMapper.getMonetaryAmount("1AAAAA", "USD");
    });
    Assertions.assertEquals("For input string: \"1AAAAA\"", e.getMessage());
  }

  @Test
  public void mapSuccessTest(){
    AccountingLineXYZ request = AccountingFactory.createValidAccountingLineXYZRequest();

    AccountingLine actual = accountingMapper.map(request);
    System.out.println("actual: " + actual);

    AccountingLine expected = AccountingFactory.createValidAccountingLineResponse(accountingMapper);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void mapFailedTest() {
    AccountingLineXYZ request = AccountingFactory.createValidAccountingLineXYZRequest();
    request.setBaseFare("BBBBB");

    Exception e = Assertions.assertThrows(NumberFormatException.class, () -> {
      AccountingLine actual = accountingMapper.map(request);
    });
    Assertions.assertEquals("For input string: \"BBBBB\"", e.getMessage());
  }

}
