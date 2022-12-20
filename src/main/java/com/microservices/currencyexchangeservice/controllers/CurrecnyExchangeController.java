package com.microservices.currencyexchangeservice.controllers;

import com.microservices.currencyexchangeservice.model.CurrencyExchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrecnyExchangeController {

    @Autowired
    private Environment environment;

    @GetMapping("/currency-exchange/{from}/to/{to}")
    public CurrencyExchange retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {

        CurrencyExchange currencyExchange = new CurrencyExchange(100L, from, to, BigDecimal.valueOf(50));
        String port = environment.getProperty("local.server.port");
        currencyExchange.setEnvironment(port);
        return currencyExchange;
    }
}