package com.foodcourt.messaging_microservice_foodcourt.domain.spi;

import com.foodcourt.messaging_microservice_foodcourt.domain.model.Sms;

public interface ISmsProviderPort {
    String sendSms(Sms sms);
}
