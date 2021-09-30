package com.eycads.collaberaexam.controller;
import com.eycads.collaberaexam.exception.ParseException;
import com.eycads.collaberaexam.model.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvice {

  @ExceptionHandler(ParseException.class)
  public ResponseEntity<ErrorResponse> handleRuntimeException(ParseException e){
    HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
    ErrorResponse response = new ErrorResponse();
    response.setCode("PARSE_EXCEPTION");
    response.setMessage(e.getMessage());
    return ResponseEntity
        .status(status)
        .body(response);
  }

  @ExceptionHandler(RuntimeException.class)
  public ResponseEntity<ErrorResponse> handleRuntimeException(RuntimeException e){
    HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
    ErrorResponse response = new ErrorResponse();
    response.setCode("RUNTIME_EXCEPTION");
    response.setMessage(e.getMessage());
    return ResponseEntity
        .status(status)
        .body(response);
  }

}
