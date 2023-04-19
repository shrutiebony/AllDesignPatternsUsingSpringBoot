package com.cpeplus.MaintainanceOptions.controller;

import com.cpeplus.MaintainanceOptions.entity.MOEntity;
import com.cpeplus.MaintainanceOptions.service.MOService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mo")
public class MOController {

    @Autowired
    MOService moService;
    private static final Logger logger = LoggerFactory.getLogger(MOController.class);

    @GetMapping("/id")
    public MOEntity getById(@RequestParam(value="id",defaultValue = "1L") Long CountryId){
        logger.info("At MOController");
        return moService.getById(CountryId);
    }

    @RequestMapping(value = "/code",method = RequestMethod.GET)
    public MOEntity getByCountryCode(@RequestParam(value="code",defaultValue = "IN") String CountryCode){
        return moService.getByCountryCode(CountryCode);
    }

    @PostMapping("/save")
    public boolean saveCountry(@RequestBody(required=true) MOEntity moEntity){
       return moService.save(moEntity);
    }

}
