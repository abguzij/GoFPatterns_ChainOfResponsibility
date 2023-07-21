package com.example.chainofresponsibility.validation.impl;

import com.example.chainofresponsibility.entity.WannaBeAnEntity;
import com.example.chainofresponsibility.exception.IntegerException;
import com.example.chainofresponsibility.exception.ValidationChainException;
import com.example.chainofresponsibility.validation.AbstractValidator;

public class IntegerValidator extends AbstractValidator<WannaBeAnEntity> {
    @Override
    public void validate(WannaBeAnEntity validationTarget) throws ValidationChainException {
        if(validationTarget.getInteger() > 10){
            throw new IntegerException("Число больше 10 !!!");
        }
        super.validate(validationTarget);
    }
}
