package com.foodcourt.messaging_microservice_foodcourt.infraestructure.output.twilio.adapter;

import com.foodcourt.messaging_microservice_foodcourt.domain.model.Sms;
import com.foodcourt.messaging_microservice_foodcourt.domain.spi.ISmsProviderPort;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

@RequiredArgsConstructor
public class TwilioAdapter implements ISmsProviderPort {

    @Value("${twilio.accountSid}")
    private String accountSid;

    @Value("${twilio.authToken}")
    private String authToken;

    @Value("${twilio.fromPhone}")
    private String fromPhone;

    public TwilioAdapter(String accountSid, String authToken, String fromPhone) {
        this.accountSid = accountSid;
        this.authToken = authToken;
        this.fromPhone = fromPhone;

        System.out.println("accountSid = " + accountSid);
        System.out.println("authToken = " + authToken);
        //Twilio.init(accountSid, authToken);
    }

    @Override
    public void sendSms(Sms sms) {
        System.out.println("SMS - " + sms.getPhoneNumber() + " | " + sms.getMessage());
        System.out.println("From phone = " + fromPhone);
        /*Message.creator(
                new PhoneNumber(sms.getPhoneNumber()),
                new PhoneNumber(fromPhone),
                sms.getMessage()
        ).create();*/
    }
}
