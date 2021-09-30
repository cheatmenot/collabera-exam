package com.eycads.collaberaexam.service;

import com.eycads.collaberaexam.exception.ParseException;
import com.eycads.collaberaexam.mapper.AccountingMapper;
import com.eycads.collaberaexam.model.from.AccountingLineXYZ;
import com.eycads.collaberaexam.model.to.AccountingLine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountingService {

  private final AccountingMapper mapper;

  @Autowired
  AccountingService(AccountingMapper mapper){
    this.mapper = mapper;
  }

  public AccountingLine postAccounting(AccountingLineXYZ reqXML){
    try {
      return mapper.map(reqXML);
    }
    catch (Exception e){
      throw new ParseException(e);
    }
  }

}
