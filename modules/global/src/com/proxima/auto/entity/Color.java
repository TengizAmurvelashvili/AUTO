package com.proxima.auto.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|name")
@Table(name = "AUTO_COLOR")
@Entity(name = "auto_Color")
public class Color extends StandardEntity {
    private static final long serialVersionUID = -8105151966544940008L;

    @NotNull
    @Column(name = "CODE", nullable = false, unique = true)
    protected String code;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true)
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}