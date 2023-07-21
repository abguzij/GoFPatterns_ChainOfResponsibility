package com.example.chainofresponsibility.service;

import com.example.chainofresponsibility.entity.WannaBeAnEntity;
import com.example.chainofresponsibility.exception.ValidationChainException;

public interface ValidationService {
    void validateOnlyInteger(WannaBeAnEntity entity) throws ValidationChainException;

    void validateStringNInteger(WannaBeAnEntity entity) throws ValidationChainException;

    void validateAll(WannaBeAnEntity entity) throws ValidationChainException;
}
