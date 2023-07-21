package com.example.chainofresponsibility.exception;

public class StringException extends ValidationChainException {
    public StringException(String message) {
        super(message);
    }
}
