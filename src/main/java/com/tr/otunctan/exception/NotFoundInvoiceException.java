package com.tr.otunctan.exception;

public class NotFoundInvoiceException extends RuntimeException{

    public NotFoundInvoiceException(String message){
        super(message);
    }
}
