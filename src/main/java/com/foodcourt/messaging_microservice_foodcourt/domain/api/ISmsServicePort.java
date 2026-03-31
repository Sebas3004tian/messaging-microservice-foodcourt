package com.foodcourt.messaging_microservice_foodcourt.domain.api;

import com.foodcourt.messaging_microservice_foodcourt.domain.model.Sms;

public interface ISmsServicePort {
    String sendSms (Sms sms);
}
