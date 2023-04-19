package com.cpeplus.MaintainanceOptions.service;


import com.cpeplus.MaintainanceOptions.entity.MOEntity;

public interface MOService {

    MOEntity getById(Long CountryId);
    MOEntity getByCountryCode(String CountryCode);
    boolean save(MOEntity moEntity);

}
