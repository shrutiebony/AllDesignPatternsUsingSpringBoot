package com.cpeplus.DDDMicroServ.entity;

public class CountryEntity {
    private Long CountryId;
    private String countryName;

    public Long getCountryId() {
        return CountryId;
    }

    public void setCountryId(Long countryId) {
        CountryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
