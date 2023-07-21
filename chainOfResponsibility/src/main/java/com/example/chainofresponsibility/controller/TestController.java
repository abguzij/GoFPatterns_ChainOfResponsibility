package com.example.chainofresponsibility.controller;

import com.example.chainofresponsibility.entity.WannaBeAnEntity;
import com.example.chainofresponsibility.exception.ValidationChainException;
import com.example.chainofresponsibility.service.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tst")
public class TestController {
    private final ValidationService validationService;

    @Autowired
    public TestController(ValidationService validationService) {
        this.validationService = validationService;
    }

    @PostMapping("/int")
    public void getSomeTstValueForIntegerValidation(
            @RequestBody WannaBeAnEntity wannaBeAnEntity
    )
            throws ValidationChainException
    {
        this.validationService.validateOnlyInteger(wannaBeAnEntity);
    }

    @PostMapping("/strint")
    public void getSomeTstValueForStringNIntegerValidation(
            @RequestBody WannaBeAnEntity wannaBeAnEntity
    )
            throws ValidationChainException
    {
        this.validationService.validateStringNInteger(wannaBeAnEntity);
    }

    @PostMapping("/all")
    public void getSomeTstValueForAllValidations(
            @RequestBody WannaBeAnEntity wannaBeAnEntity
    )
            throws ValidationChainException
    {
        this.validationService.validateAll(wannaBeAnEntity);
    }
}
