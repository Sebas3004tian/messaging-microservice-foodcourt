package com.foodcourt.messaging_microservice_foodcourt.domain.usecase;

import com.foodcourt.messaging_microservice_foodcourt.domain.api.ISmsServicePort;
import com.foodcourt.messaging_microservice_foodcourt.domain.model.Sms;
import com.foodcourt.messaging_microservice_foodcourt.domain.spi.ISmsProviderPort;

public class SmsUseCase implements ISmsServicePort {

    private final ISmsProviderPort smsProviderPort;

    public SmsUseCase(ISmsProviderPort smsProviderPort) {
        this.smsProviderPort = smsProviderPort;
    }

    @Override
    public void sendSms(Sms sms){
        smsProviderPort.sendSms(sms);
    }

}
