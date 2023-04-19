package com.cpeplus.MaintainanceOptions.repository;

import com.cpeplus.MaintainanceOptions.entity.MOEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MOEntityRepository extends JpaRepository <MOEntity, Long> {
    MOEntity getByCountryCode(String CountryCode);
}
