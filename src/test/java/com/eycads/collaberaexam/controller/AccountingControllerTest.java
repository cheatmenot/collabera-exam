package com.eycads.collaberaexam.controller;

import com.eycads.collaberaexam.factory.AccountingFactory;
import com.eycads.collaberaexam.model.to.AccountingLine;
import com.eycads.collaberaexam.service.AccountingService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class AccountingControllerTest {

  @MockBean
  private AccountingService service;

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void apiSuccessTest() throws Exception {
    String requestXML = AccountingFactory.createXMLString();

    Mockito
        .when(service.postAccounting(Mockito.any()))
        .thenReturn(new AccountingLine());
//    Mockito.doReturn(new AccountingLine()).when(service).postAccounting(Mockito.any());

    mockMvc.perform(
        post("/api/v1/accounting")
            .content(requestXML)
            .contentType(MediaType.APPLICATION_XML)
        )
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON));
  }

  @Test
  public void apiFailedTest() throws Exception {
    String request = AccountingFactory.createXMLString();

    Mockito
        .when(service.postAccounting(Mockito.any()))
        .thenThrow(new NumberFormatException("For input string: \"A\""));

    mockMvc.perform(
            post("/api/v1/accounting")
                .content(request)
                .contentType(MediaType.APPLICATION_XML)
        )
        .andExpect(status().isInternalServerError())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON));
  }

}
