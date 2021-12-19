package com.example.fraud.controller;

import com.example.clients.fraud.FraudCheckResponse;
import com.example.fraud.service.FraudCheckService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/fraud-check")
@Slf4j
public class FraudCheckController {

    private final FraudCheckService fraudCheckService;

    @GetMapping( "/{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable("customerId") Long customerId){
        log.info("Log check for customer with ID: {}", customerId);
        return new FraudCheckResponse(fraudCheckService.isFraudulentCustomer(customerId));
    }
}
