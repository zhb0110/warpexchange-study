package com.itranswarp.exchange;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itranswarp.exchange.client.RestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TradingApiApplication {


    public static void main(String[] args) {
        SpringApplication.run(TradingApiApplication.class, args);
//        System.out.println("Hello world!");
    }

    @Bean
    public RestClient createTradingEngineRestClient(
            @Value("#{exchangeConfiguration.apiEndpoints.tradingEngineApi}") String tradingEngineApiEndpoint,
            @Autowired ObjectMapper objectMapper) {
        return new RestClient.Builder(tradingEngineApiEndpoint).build(objectMapper);
    }
}