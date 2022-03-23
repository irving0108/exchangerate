package com.nttdata.bootcamp.exchangerate.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.nttdata.bootcamp.exchangerate.model.ExchangeRate;

public interface ExchangeRateRepository extends ReactiveMongoRepository<ExchangeRate, String>{

}
