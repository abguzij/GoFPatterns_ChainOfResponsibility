package com.example.chainofresponsibility.validation.impl;

import com.example.chainofresponsibility.entity.WannaBeAnEntity;
import com.example.chainofresponsibility.exception.BooleanException;
import com.example.chainofresponsibility.exception.ValidationChainException;
import com.example.chainofresponsibility.validation.AbstractValidator;

public class BooleanValidator extends AbstractValidator<WannaBeAnEntity> {
    @Override
    public void validate(WannaBeAnEntity validationTarget) throws ValidationChainException {
        if(validationTarget.getaBoolean().equals(Boolean.FALSE)){
            throw new BooleanException("Не может быть FALSE !!!");
        }
        super.validate(validationTarget);
    }
}
