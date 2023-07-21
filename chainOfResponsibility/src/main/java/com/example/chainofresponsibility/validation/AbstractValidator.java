package com.example.chainofresponsibility.validation;

import com.example.chainofresponsibility.exception.ValidationChainException;

import java.util.Objects;

public abstract class AbstractValidator<ValidationTargetType extends Validatable>
        implements Validator<ValidationTargetType>
{
    private Validator<ValidationTargetType> next;

    @Override
    public void setNextValidator(Validator<ValidationTargetType> validator) {
        this.next = validator;
    }

    @Override
    public void validate(ValidationTargetType validationTarget) throws ValidationChainException {
        if (Objects.nonNull(next)) {
            next.validate(validationTarget);
        }
    }
}
