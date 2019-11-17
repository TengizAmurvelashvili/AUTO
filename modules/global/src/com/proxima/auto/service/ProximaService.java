package com.proxima.auto.service;

import com.proxima.auto.entity.Car;
import com.proxima.auto.entity.Country;
import com.proxima.auto.entity.Customer;
import com.proxima.auto.entity.Manufacturer;

import java.math.BigDecimal;


public interface ProximaService {
    String NAME = "auto_ProximaService";

    Long getModelQty(Manufacturer manufacturer);
    Long getOrderQty(Customer customer);

    Country getCountryCode();

}