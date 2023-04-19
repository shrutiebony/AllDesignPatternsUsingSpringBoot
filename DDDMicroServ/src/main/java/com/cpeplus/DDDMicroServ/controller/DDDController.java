package com.cpeplus.DDDMicroServ.controller;

import com.cpeplus.DDDMicroServ.entity.DDDEntity;
import com.cpeplus.DDDMicroServ.entity.DiscountCountryWise;
import com.cpeplus.DDDMicroServ.service.DDDService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ddd")
public class DDDController {

    @Autowired
    DDDService dddService;
    private static final Logger logger = LoggerFactory.getLogger(DDDController.class);

    @GetMapping("/id")
    public DDDEntity getById(@RequestParam(value="id",defaultValue = "1L") Long DiscountId){
        logger.info("At DDDController");
        return dddService.getById(DiscountId);
    }

    @RequestMapping(value = "/code",method = RequestMethod.GET)
    public DDDEntity getByDiscountCode(@RequestParam(value="code",defaultValue = "Default") String DiscountCode){
        return dddService.getByDiscountCode(DiscountCode);
    }

    @PostMapping("/save")
    public boolean saveDiscount(@RequestBody(required=true) DDDEntity dddEntity){
        return dddService.save(dddEntity);
    }

    @GetMapping("/discountwithcountry")
    public DiscountCountryWise getdiscountwithcountry(@RequestParam(value="id",defaultValue = "1L") Long DiscountId){
        return dddService.getdiscountwithcountry(DiscountId);
    }
}
