package com.cpeplus.DDDMicroServ.service;

import com.cpeplus.DDDMicroServ.entity.DDDEntity;
import com.cpeplus.DDDMicroServ.entity.DiscountCountryWise;

public interface DDDService {

    DDDEntity getById(Long DiscountId);
    DDDEntity getByDiscountCode(String DiscountCode);
    boolean save(DDDEntity dddEntity);
    DiscountCountryWise getdiscountwithcountry(Long DiscountId);
}
