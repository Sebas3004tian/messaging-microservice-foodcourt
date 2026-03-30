package com.foodcourt.messaging_microservice_foodcourt.application.handler;

import com.foodcourt.messaging_microservice_foodcourt.application.dto.request.SendSmsRequestDto;

public interface ISmsHandler {
    void sendSms(SendSmsRequestDto sendSmsRequestDto);
}
