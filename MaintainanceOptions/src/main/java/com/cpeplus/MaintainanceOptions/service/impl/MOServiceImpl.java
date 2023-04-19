package com.cpeplus.MaintainanceOptions.service.impl;

import com.cpeplus.MaintainanceOptions.entity.MOEntity;
import com.cpeplus.MaintainanceOptions.repository.MOEntityRepository;
import com.cpeplus.MaintainanceOptions.service.MOService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MOServiceImpl implements MOService {
    @Autowired  MOEntityRepository moEntityRepository;

    private static final Logger logger = LoggerFactory.getLogger(MOServiceImpl.class);


    @Override
    public MOEntity getById(Long CountryId) {
        MOEntity obj = moEntityRepository.findById(CountryId).orElse(null);
        logger.info("At MOServiceImpl");
        return obj;
    }

    @Override
    public MOEntity getByCountryCode(String CountryCode) {
        MOEntity obj = moEntityRepository.getByCountryCode(CountryCode);
        return obj;
    }

    @Override
    public boolean save(MOEntity moEntity) {
        moEntityRepository.save(moEntity);
        return true;
    }
}
