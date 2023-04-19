package com.cpeplus.DDDMicroServ.entity;

public class DiscountCountryWise {
    private Long DiscountId;
    private String discountCode;
    private Long discountAmount;
    private Long countryId;
    private CountryEntity countryEntity;

    public Long getDiscountId() {
        return DiscountId;
    }

    public void setDiscountId(Long discountId) {
        DiscountId = discountId;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    public Long getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Long discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public CountryEntity getCountryEntity() {
        return countryEntity;
    }

    public void setCountryEntity(CountryEntity countryEntity) {
        this.countryEntity = countryEntity;
    }
}
