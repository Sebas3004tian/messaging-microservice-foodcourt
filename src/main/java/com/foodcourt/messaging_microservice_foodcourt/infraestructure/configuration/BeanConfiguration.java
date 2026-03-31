package com.foodcourt.messaging_microservice_foodcourt.infraestructure.configuration;

import com.foodcourt.messaging_microservice_foodcourt.domain.api.ISmsServicePort;
import com.foodcourt.messaging_microservice_foodcourt.domain.spi.ISmsProviderPort;
import com.foodcourt.messaging_microservice_foodcourt.domain.usecase.SmsUseCase;
import com.foodcourt.messaging_microservice_foodcourt.infraestructure.output.twilio.adapter.TwilioAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    @Value("${twilio.accountSid}")
    private String accountSid;

    @Value("${twilio.authToken}")
    private String authToken;

    @Value("${twilio.fromPhone}")
    private String fromPhone;

    @Bean
    public ISmsProviderPort smsProviderPort() {
        return new TwilioAdapter(accountSid, authToken, fromPhone);
    }

    @Bean
    public ISmsServicePort smsServicePort(){
        return new SmsUseCase(
                smsProviderPort()
        );
    }

}