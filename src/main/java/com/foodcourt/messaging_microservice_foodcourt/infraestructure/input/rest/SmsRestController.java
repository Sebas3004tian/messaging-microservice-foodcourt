package com.foodcourt.messaging_microservice_foodcourt.infraestructure.input.rest;

import com.foodcourt.messaging_microservice_foodcourt.application.dto.request.SendSmsRequestDto;
import com.foodcourt.messaging_microservice_foodcourt.application.handler.ISmsHandler;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sms")
@RequiredArgsConstructor
public class SmsRestController {

    private final ISmsHandler smsHandler;

    @PostMapping("/send")
    @Operation(summary = "Send an sms")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Sms sent successfully"),
            @ApiResponse(responseCode = "400", description = "Invalid data"),
            @ApiResponse(responseCode = "403", description = "Access Denied")
    })
    public ResponseEntity<String> sendSms(@Valid @RequestBody SendSmsRequestDto sendSmsRequestDto){
        String smsSent = smsHandler.sendSms(sendSmsRequestDto);
        return ResponseEntity.ok(smsSent);
    }

}
