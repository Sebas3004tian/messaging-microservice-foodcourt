package com.foodcourt.messaging_microservice_foodcourt.domain.api;

import com.foodcourt.messaging_microservice_foodcourt.domain.model.Sms;

public interface ISmsServicePort {
    void sendSms (Sms sms);
}
