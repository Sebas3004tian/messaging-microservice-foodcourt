package com.foodcourt.messaging_microservice_foodcourt.application.handler.impl;

import com.foodcourt.messaging_microservice_foodcourt.application.dto.request.SendSmsRequestDto;
import com.foodcourt.messaging_microservice_foodcourt.application.handler.ISmsHandler;
import com.foodcourt.messaging_microservice_foodcourt.application.mapper.ISmsRequestMapper;
import com.foodcourt.messaging_microservice_foodcourt.domain.api.ISmsServicePort;
import com.foodcourt.messaging_microservice_foodcourt.domain.model.Sms;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SmsHandler implements ISmsHandler {

    private final ISmsServicePort smsServicePort;

    private final ISmsRequestMapper smsRequestMapper;

    @Override
    public void sendSms(SendSmsRequestDto sendSmsRequestDto){
        Sms sms = smsRequestMapper.toSms(sendSmsRequestDto);
        smsServicePort.sendSms(sms);

    }

}
