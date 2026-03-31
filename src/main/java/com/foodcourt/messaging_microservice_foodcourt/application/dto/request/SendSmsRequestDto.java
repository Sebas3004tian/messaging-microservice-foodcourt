package com.foodcourt.messaging_microservice_foodcourt.application.dto.request;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SendSmsRequestDto {

    @NotBlank(message="The phone number cannot be empty")
    @Pattern(regexp = "^\\+?\\d{1,13}$", message = "Invalid phone number")
    private String phoneNumber;

    @NotBlank(message="The message cannot be empty")
    private String message;

}
