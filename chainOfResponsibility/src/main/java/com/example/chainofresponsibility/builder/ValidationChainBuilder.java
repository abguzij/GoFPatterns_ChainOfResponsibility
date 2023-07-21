package com.example.chainofresponsibility.builder;

import com.example.chainofresponsibility.validation.Validatable;
import com.example.chainofresponsibility.validation.Validator;

public interface ValidationChainBuilder<T extends Validatable> {
    ValidationChainBuilder<T> addValidator(Validator<T> validator);
    Validator<T> buildValidationChain();
}
