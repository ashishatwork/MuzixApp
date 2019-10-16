package com.stackroute.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class AdviceController {
    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<String> exceptionHandler(Exception ex) {
        return new ResponseEntity<>("Exception Handled Globally " + ex.getMessage(), HttpStatus.CONFLICT);
    }

}
