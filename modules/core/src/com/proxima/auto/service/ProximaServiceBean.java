package com.proxima.auto.service;

import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Query;
import com.haulmont.cuba.core.Transaction;
import com.proxima.auto.entity.Car;
import com.proxima.auto.entity.Customer;
import com.proxima.auto.entity.Manufacturer;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.math.BigDecimal;

@Service(ProximaService.NAME)
public class ProximaServiceBean implements ProximaService {
    @Inject
    private Persistence persistence;

    @Override
    public Long getModelQty(Manufacturer manufacturer) {
        Long ret;
        try (Transaction tx = persistence.createTransaction()) {
            EntityManager em = persistence.getEntityManager();
            Query query = em.createQuery("select count(o) from auto_Model o where o.manufacturer=:manufacturer");
            query.setParameter("manufacturer", manufacturer);
            ret = (Long) query.getFirstResult();
            tx.commit();
        }
        return ret;
    }

    @Override
    public Long getOrderQty(Customer customer) {
        Long ret;
        try (Transaction tx = persistence.createTransaction()) {
            EntityManager em = persistence.getEntityManager();
            Query query = em.createQuery("select count(o) from auto_Order o where o.customer=:customer");
            query.setParameter("customer", customer);
            ret = (Long) query.getFirstResult();
            tx.commit();
        }
        return ret;
    }

    @Override
    public BigDecimal getCarPrice(Car car) {
        BigDecimal ret=BigDecimal.ZERO;
        try (Transaction tx = persistence.createTransaction()) {
            EntityManager em = persistence.getEntityManager();
            Query query = em.createQuery("select o.price from auto_Car o where o.Id=:carId");
            query.setParameter("carId", car.getId());
            ret = (BigDecimal) query.getFirstResult();
            tx.commit();
        }
        return ret;
    }
}