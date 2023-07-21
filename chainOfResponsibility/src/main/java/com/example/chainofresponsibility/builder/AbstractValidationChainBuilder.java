package com.example.chainofresponsibility.builder;

import com.example.chainofresponsibility.builder.ValidationChainBuilder;
import com.example.chainofresponsibility.validation.Validatable;
import com.example.chainofresponsibility.validation.Validator;

import java.util.Objects;

public abstract class AbstractValidationChainBuilder<T extends Validatable>
        implements ValidationChainBuilder<T>
{
    private Validator<T> head;
    private Validator<T> tail;

    public AbstractValidationChainBuilder() {
        this.head = null;
        this.tail = null;
    }

    @Override
    public ValidationChainBuilder<T> addValidator(Validator<T> validator) {
        if(Objects.isNull(this.head)){
            this.head = validator;
            this.tail = this.head;
            return this;
        }
        this.tail.setNextValidator(validator);
        this.tail = validator;
        return this;
    }

    @Override
    public Validator<T> buildValidationChain() {
        return this.head;
    }
}
