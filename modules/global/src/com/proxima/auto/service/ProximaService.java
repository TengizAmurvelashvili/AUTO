package com.proxima.auto.service;

import com.proxima.auto.entity.Customer;
import com.proxima.auto.entity.Manufacturer;


public interface ProximaService {
    String NAME = "auto_ProximaService";

    Long getModelQty(Manufacturer manufacturer);

    Long getOrderQty(Customer customer);
}