package com.proxima.auto.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@NamePattern("%s|name")
@Table(name = "AUTO_OPTION")
@Entity(name = "auto_Option")
public class Option extends StandardEntity {
    private static final long serialVersionUID = -6093488545196393383L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @Column(name = "PRICE")
    protected BigDecimal price;

    @Column(name = "CAR_TYPE")
    protected String carType;

    @Lob
    @Column(name = "NOTE")
    protected String note;

    @Lookup(type = LookupType.SCREEN, actions = {"lookup", "clear"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MODEL_ID")
    protected Model model;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public CarType getCarType() {
        return carType == null ? null : CarType.fromId(carType);
    }

    public void setCarType(CarType carType) {
        this.carType = carType == null ? null : carType.getId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}