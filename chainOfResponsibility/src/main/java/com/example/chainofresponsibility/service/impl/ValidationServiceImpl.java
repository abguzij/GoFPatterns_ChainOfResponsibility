package com.example.chainofresponsibility.service.impl;

import com.example.chainofresponsibility.builder.impl.WannaBeAnEntityValidationChainBuilder;
import com.example.chainofresponsibility.builder.impl.WannaBeAnEntityValidationChainDirector;
import com.example.chainofresponsibility.entity.WannaBeAnEntity;
import com.example.chainofresponsibility.exception.ValidationChainException;
import com.example.chainofresponsibility.service.ValidationService;
import com.example.chainofresponsibility.validation.AbstractValidator;
import com.example.chainofresponsibility.validation.impl.IntegerValidator;
import com.example.chainofresponsibility.validation.impl.StringValidator;
import org.springframework.stereotype.Service;

@Service
public class ValidationServiceImpl implements ValidationService {
    @Override
    public void validateOnlyInteger(WannaBeAnEntity entity) throws ValidationChainException {
        AbstractValidator<WannaBeAnEntity> validator = new IntegerValidator();
        validator.validate(entity);
    }

    @Override
    public void validateStringNInteger(WannaBeAnEntity entity) throws ValidationChainException {
        WannaBeAnEntityValidationChainBuilder builder = new WannaBeAnEntityValidationChainBuilder();
        builder
                .addValidator(new IntegerValidator())
                .addValidator(new StringValidator());
        builder
                .buildValidationChain()
                .validate(entity);
    }

    @Override
    public void validateAll(WannaBeAnEntity entity) throws ValidationChainException {
        WannaBeAnEntityValidationChainDirector.buildAllTypesValidator().validate(entity);
    }
}
