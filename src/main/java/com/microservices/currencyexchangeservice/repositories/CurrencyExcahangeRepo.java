package com.microservices.currencyexchangeservice.repositories;

import com.microservices.currencyexchangeservice.model.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExcahangeRepo extends JpaRepository<CurrencyExchange, Integer> {

    CurrencyExchange findByFromAndTo(String from, String to);

}
