package com.eycads.collaberaexam.service;

import com.eycads.collaberaexam.exception.ParseException;
import com.eycads.collaberaexam.factory.AccountingFactory;
import com.eycads.collaberaexam.mapper.AccountingMapper;
import com.eycads.collaberaexam.model.from.AccountingLineXYZ;
import com.eycads.collaberaexam.model.to.AccountingLine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AccountingServiceTest {

  @InjectMocks
  public AccountingService accountingService;

  @Mock
  public AccountingMapper accountingMapper;

  @Test
  public void postAccountingSuccessTest(){
    Mockito
        .when(accountingMapper.map(Mockito.any()))
        .thenReturn(new AccountingLine());
    AccountingLine accountingLine =
        accountingService.postAccounting(AccountingFactory.createValidAccountingLineXYZRequest());
    System.out.println("accountingLine: " + accountingLine);
  }

  @Test
  public void postAccountingFailedTest(){
    Mockito.doThrow(new ParseException(new NumberFormatException("For input string: \"A\"")))
        .when(accountingMapper).map(Mockito.any(AccountingLineXYZ.class));
    Exception e = Assertions.assertThrows(ParseException.class, () -> {
      accountingService.postAccounting(AccountingFactory.createValidAccountingLineXYZRequest());
    });
    System.out.println("accountingLine: " + e.getMessage());
  }

}
