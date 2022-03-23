package com.nttdata.bootcamp.exchangerate.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.bootcamp.exchangerate.model.ExchangeRate;
import com.nttdata.bootcamp.exchangerate.repository.ExchangeRateRepository;
import com.nttdata.bootcamp.exchangerate.service.ExchangeRateService;

@Service
public class ExchangeRateServiceImpl implements ExchangeRateService{
	
	@Autowired
	ExchangeRateRepository exchangeRateRepository;

	@Override
	public void createExchangeRate(ExchangeRate e) {
		exchangeRateRepository.save(e).subscribe();
	}

}
