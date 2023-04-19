package com.cpeplus.DDDMicroServ.service.Impl;

import com.cpeplus.DDDMicroServ.entity.CountryEntity;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class apicall {

    @Autowired
    RestTemplate restTemplate;

    private static final String moMicroserviceBaseURL = "http://MO-SERVICE";

    @CircuitBreaker(name = "moservicecall",fallbackMethod="getCountryDetailsForDiscountIdFallbk")
    public CountryEntity getCountryDetailsForDiscountId(Long CountryId){
        CountryEntity countryEntity = restTemplate.getForObject(
                moMicroserviceBaseURL + "/mo/id?id={CountryId}",CountryEntity.class, CountryId);
        return countryEntity;
    }

    public CountryEntity getCountryDetailsForDiscountIdFallbk(Exception ex){
        CountryEntity countryEntity = new CountryEntity();
        countryEntity.setCountryId(1L);
        countryEntity.setCountryName("Default- Issue with Maintainance Options Micro Service");
        return countryEntity;
    }

}
