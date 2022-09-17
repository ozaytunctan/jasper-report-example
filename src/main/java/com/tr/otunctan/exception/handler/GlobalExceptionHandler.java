package com.tr.otunctan.exception.handler;

import com.tr.otunctan.exception.JasperException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({JasperException.class})
    public String jasperException(JasperException ex) {
        return ex.getMessage();
    }
}
