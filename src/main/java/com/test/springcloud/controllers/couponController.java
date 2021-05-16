package com.test.springcloud.controllers;

import com.test.springcloud.model.Coupon;
import com.test.springcloud.repos.couponRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/couponapi")
public class couponController {

    @Autowired
    couponRepo repo;

    @RequestMapping(value = "/coupons",method = RequestMethod.POST)
    public Coupon create(@RequestBody  Coupon coupon)
    {
        return repo.save(coupon);
    }


    @RequestMapping(value = "/coupons/{code}",method = RequestMethod.GET)
    public Coupon create(@PathVariable("code") String code)
    {
        return repo.findByCode(code);
    }

}
