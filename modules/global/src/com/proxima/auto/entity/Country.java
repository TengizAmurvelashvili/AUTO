package com.proxima.auto.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|country")
@Table(name = "AUTO_COUNTRY")
@Entity(name = "auto_Country")
public class Country extends StandardEntity {
    private static final long serialVersionUID = -6152631403288992698L;

    @NotNull
    @Column(name = "CODE", nullable = false, unique = true, length = 3)
    protected String code;

    @NotNull
    @Column(name = "COUNTRY", nullable = false, unique = true)
    protected String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}