package com.example.chainofresponsibility.validation;

import com.example.chainofresponsibility.exception.ValidationChainException;

public interface Validator<ValidationTargetType extends Validatable> {
    void setNextValidator(Validator<ValidationTargetType> validator);
    void validate(ValidationTargetType validationTargetType) throws ValidationChainException;
}
