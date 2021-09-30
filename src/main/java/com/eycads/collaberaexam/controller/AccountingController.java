package com.eycads.collaberaexam.controller;

import com.eycads.collaberaexam.model.from.AccountingLineXYZ;
import com.eycads.collaberaexam.model.to.AccountingLine;
import com.eycads.collaberaexam.service.AccountingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/accounting")
public class AccountingController {

  private final AccountingService accountingService;

  @Autowired
  AccountingController(AccountingService accountingService){
    this.accountingService = accountingService;
  }

  @PostMapping(
      consumes = MediaType.APPLICATION_XML_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<AccountingLine> post(
      @RequestBody AccountingLineXYZ reqXML
  ){
    System.out.println("reqXML: " + reqXML);
    AccountingLine response = accountingService.postAccounting(reqXML);
    return new ResponseEntity<>(response, HttpStatus.OK);
  }

}
