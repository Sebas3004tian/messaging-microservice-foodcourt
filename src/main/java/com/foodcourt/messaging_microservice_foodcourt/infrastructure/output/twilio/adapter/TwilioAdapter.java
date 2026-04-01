package com.foodcourt.messaging_microservice_foodcourt.infrastructure.output.twilio.adapter;

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

        //Twilio.init(accountSid, authToken);
    }

    /*@Override
    public String sendSms(Sms sms) {
        Message message = Message.creator(
                new PhoneNumber(sms.getPhoneNumber()),
                new PhoneNumber(fromPhone),
                sms.getMessage()
        ).create();
       return message.getBody();
    }*/

    @Override
    public String sendSms(Sms sms) {
        return "SMS Sent Successfully!\n" +
                "SID: " + accountSid + "\n" +
                "From: " + fromPhone + " -> To: " + sms.getPhoneNumber() + "\n" +
                "Content: \"" + sms.getMessage() + "\"";
    }
}
