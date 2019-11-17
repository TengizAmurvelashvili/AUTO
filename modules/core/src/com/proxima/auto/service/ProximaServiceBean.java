package com.proxima.auto.service;

import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Query;
import com.haulmont.cuba.core.Transaction;
import com.haulmont.cuba.core.global.UserSessionSource;
import com.haulmont.cuba.security.entity.User;
import com.proxima.auto.config.CountryConfig;
import com.proxima.auto.entity.*;
import org.apache.poi.ss.formula.functions.Count;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.math.BigDecimal;

@Service(ProximaService.NAME)
public class ProximaServiceBean implements ProximaService {
    @Inject
    private Persistence persistence;
    @Inject
    private UserSessionSource userSessionSource;
    @Inject
    private CountryConfig countryConfig;

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
    public Country getCountryCode() {
        User user = userSessionSource.getUserSession().getUser();
        Country ret;
        try (Transaction tx = persistence.createTransaction()) {
            EntityManager em = persistence.getEntityManager();
            Query query = em.createQuery("select o.countryCode from auto_UserExt o where o.id=:userId");
            query.setParameter("userId", user.getId());
            ret = (Country) query.getFirstResult();
            tx.commit();
        }
        if (ret == null) {
            try (Transaction tx = persistence.createTransaction()) {
                EntityManager em = persistence.getEntityManager();
                Query query = em.createQuery("select c from auto_Country c where c.code=:code");
                query.setParameter("code", countryConfig.getCountryDefault());
                ret = (Country) query.getFirstResult();
                tx.commit();
            }
            return ret;
        }
        else {
            return ret;
        }
    }

}
