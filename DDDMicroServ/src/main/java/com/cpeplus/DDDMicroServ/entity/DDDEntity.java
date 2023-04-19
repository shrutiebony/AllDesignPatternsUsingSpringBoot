package com.cpeplus.DDDMicroServ.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DDDEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long DiscountId;
    private String discountCode;
    private Long discountAmount;
    private Long countryId;

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
}
