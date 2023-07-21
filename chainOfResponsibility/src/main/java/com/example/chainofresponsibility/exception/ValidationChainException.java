package com.example.chainofresponsibility.exception;

public class ValidationChainException extends Exception {
    public ValidationChainException(String message) {
        super("Ошибка при валидации! Ошибка: "+ message);
    }
}
