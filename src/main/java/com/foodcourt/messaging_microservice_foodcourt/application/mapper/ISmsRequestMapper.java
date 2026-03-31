package com.foodcourt.messaging_microservice_foodcourt.application.mapper;

import com.foodcourt.messaging_microservice_foodcourt.application.dto.request.SendSmsRequestDto;
import com.foodcourt.messaging_microservice_foodcourt.domain.model.Sms;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ISmsRequestMapper {
    Sms toSms(SendSmsRequestDto sendSmsRequestDto);
}
