package com.nttdata.bootcamp.exchangerate.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.nttdata.bootcamp.exchangerate.model.ExchangeRate;
import com.nttdata.bootcamp.exchangerate.service.ExchangeRateService;

@Component
public class ExchangeRateKafkaConsumer {
	Logger logger = LoggerFactory.getLogger(ExchangeRateKafkaConsumer.class);
	
	@Autowired
	ExchangeRateService exchangeRateService;

    @KafkaListener(topics = "topicobootcamp" , groupId = "group_id")
    public void consume(String message) {
    	logger.info("Obteniendo tipo de cambio {}", message);
    	final Gson gson = new Gson();
        final ExchangeRate exchangeRate = gson.fromJson(message, ExchangeRate.class);
    	exchangeRateService.createExchangeRate(exchangeRate);
    	logger.info("Successfully!!!");
    }
}
