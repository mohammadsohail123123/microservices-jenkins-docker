package com.test.springcloud.repos;

import com.test.springcloud.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface couponRepo extends JpaRepository<Coupon,Long> {
    Coupon findByCode(String code);
}
