package com.foodcourt.messaging_microservice_foodcourt.infraestructure.exceptionhandler;


public enum ExceptionResponse {
    VALIDATION_ERROR("Validation error");


    private final String message;

    ExceptionResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}