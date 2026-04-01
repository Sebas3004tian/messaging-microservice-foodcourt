package com.foodcourt.messaging_microservice_foodcourt.infrastructure.exception;

public class UnauthorizedException extends RuntimeException {
    public UnauthorizedException() {
        super("You are not of this restaurant");
    }
}
