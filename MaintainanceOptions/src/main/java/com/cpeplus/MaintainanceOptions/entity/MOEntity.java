package com.cpeplus.MaintainanceOptions.entity;

import com.sun.javafx.beans.IDProperty;
import jdk.nashorn.internal.ir.annotations.Immutable;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MOEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long CountryId;
    private String countryCode;
    private String countryName;

    public Long getCountryId() {
        return CountryId;
    }

    public void setCountryId(Long countryId) {
        CountryId = countryId;
    }

    public String getcountryCode() {
        return countryCode;
    }

    public void setcountryCode(String CountryCode) {
        countryCode = CountryCode;
    }

    public String getcountryName() {
        return countryName;
    }

    public void setcountryName(String CountryName) {
        countryName = CountryName;
    }
}
