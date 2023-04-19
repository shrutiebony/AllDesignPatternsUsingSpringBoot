package com.cpeplus.DDDMicroServ.repository;

import com.cpeplus.DDDMicroServ.entity.DDDEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DDDEntiryRepository extends JpaRepository<DDDEntity, Long> {
    DDDEntity getByDiscountCode(String DiscountCode);
}
