package com.example.chainofresponsibility.controller.advice;

import com.example.chainofresponsibility.controller.TestController;
import com.example.chainofresponsibility.exception.BooleanException;
import com.example.chainofresponsibility.exception.IntegerException;
import com.example.chainofresponsibility.exception.StringException;
import com.example.chainofresponsibility.response.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(basePackageClasses = TestController.class)
public class TestControllerAdvice {
    @ExceptionHandler(value = IntegerException.class)
    public ErrorResponse handleIntegerException(IntegerException e) {
        return new ErrorResponse().setHttpStatus(HttpStatus.BAD_REQUEST).setMessage(e.getMessage());
    }

    @ExceptionHandler(value = StringException.class)
    public ErrorResponse handleStringException(StringException e) {
        return new ErrorResponse().setHttpStatus(HttpStatus.BAD_REQUEST).setMessage(e.getMessage());
    }

    @ExceptionHandler(value = BooleanException.class)
    public ErrorResponse handleBooleanException(BooleanException e) {
        return new ErrorResponse().setHttpStatus(HttpStatus.BAD_REQUEST).setMessage(e.getMessage());
    }
}
