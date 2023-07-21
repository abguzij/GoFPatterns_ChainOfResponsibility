package com.example.chainofresponsibility.builder.impl;

import com.example.chainofresponsibility.entity.WannaBeAnEntity;
import com.example.chainofresponsibility.validation.Validator;
import com.example.chainofresponsibility.validation.impl.BooleanValidator;
import com.example.chainofresponsibility.validation.impl.IntegerValidator;
import com.example.chainofresponsibility.validation.impl.StringValidator;

public class WannaBeAnEntityValidationChainDirector {
    public static Validator<WannaBeAnEntity> buildOnlyIntegerValidator() {
        return new WannaBeAnEntityValidationChainBuilder()
                .addValidator(new IntegerValidator())
                .buildValidationChain();
    }

    public static Validator<WannaBeAnEntity> buildAllTypesValidator() {
        return new WannaBeAnEntityValidationChainBuilder()
                .addValidator(new IntegerValidator())
                .addValidator(new StringValidator())
                .addValidator(new BooleanValidator())
                .buildValidationChain();
    }
}
