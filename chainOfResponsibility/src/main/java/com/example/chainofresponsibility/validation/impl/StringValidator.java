package com.example.chainofresponsibility.validation.impl;

import com.example.chainofresponsibility.entity.WannaBeAnEntity;
import com.example.chainofresponsibility.exception.StringException;
import com.example.chainofresponsibility.exception.ValidationChainException;
import com.example.chainofresponsibility.validation.AbstractValidator;

public class StringValidator extends AbstractValidator<WannaBeAnEntity> {
    @Override
    public void validate(WannaBeAnEntity validationTarget) throws ValidationChainException {
        if(validationTarget.getString().isEmpty()){
            throw new StringException("Строка не может быть пустой!");
        }
        super.validate(validationTarget);
    }
}
