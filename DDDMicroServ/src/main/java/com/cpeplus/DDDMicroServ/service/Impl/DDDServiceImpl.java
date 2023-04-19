package com.cpeplus.DDDMicroServ.service.Impl;


import com.cpeplus.DDDMicroServ.entity.CountryEntity;
import com.cpeplus.DDDMicroServ.entity.DDDEntity;
import com.cpeplus.DDDMicroServ.entity.DiscountCountryWise;
import com.cpeplus.DDDMicroServ.repository.DDDEntiryRepository;
import com.cpeplus.DDDMicroServ.service.DDDService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DDDServiceImpl implements DDDService {

    @Autowired DDDEntiryRepository dddEntityRepository;
    @Autowired apicall apicallobj;
    private static final Logger logger = LoggerFactory.getLogger(DDDServiceImpl.class);

    @Override
    public DDDEntity getById(Long DiscountId) {
        DDDEntity obj = dddEntityRepository.findById(DiscountId).orElse(null);
        logger.info("At DDDServiceImpl");
        return obj;
    }

    @Override
    public DDDEntity getByDiscountCode(String DiscountCode) {
        DDDEntity obj = dddEntityRepository.getByDiscountCode(DiscountCode);
        return obj;
    }

    @Override
    public boolean save(DDDEntity dddEntity) {
        dddEntityRepository.save(dddEntity);
        return true;
    }

    @Override
    public DiscountCountryWise getdiscountwithcountry(Long DiscountId) {
        DDDEntity obj = dddEntityRepository.findById(DiscountId).orElse(null);
        CountryEntity countryEntity = apicallobj.getCountryDetailsForDiscountId(obj.getCountryId());

        DiscountCountryWise discountCountryWise = new DiscountCountryWise();
        BeanUtils.copyProperties(obj,discountCountryWise);
        discountCountryWise.setCountryEntity(countryEntity);

        return discountCountryWise;
    }
}
