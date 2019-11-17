package com.proxima.auto.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|name")
@Table(name = "AUTO_CUSTOMER")
@Entity(name = "auto_Customer")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = -3765422783238362151L;

    @NotNull
    @Column(name = "CODE", nullable = false, unique = true)
    protected String code;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @Lob
    @Column(name = "ORGANISATION_NAME")
    protected String organisationName;

    @Lob
    @Column(name = "FIRST_NAME_AND_LAST_NAME")
    protected String firstNameAndLastName;

    @Lob
    @Column(name = "ORGANISATION_TAX_ID_AND_ADDRESS")
    protected String organisationTaxIdAndAddress;

    @Column(name = "TELEPHONE_NUMBER")
    protected String telephoneNumber;

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getOrganisationTaxIdAndAddress() {
        return organisationTaxIdAndAddress;
    }

    public void setOrganisationTaxIdAndAddress(String organisationTaxIdAndAddress) {
        this.organisationTaxIdAndAddress = organisationTaxIdAndAddress;
    }

    public String getFirstNameAndLastName() {
        return firstNameAndLastName;
    }

    public void setFirstNameAndLastName(String firstNameAndLastName) {
        this.firstNameAndLastName = firstNameAndLastName;
    }

    public String getOrganisationName() {
        return organisationName;
    }

    public void setOrganisationName(String organisationName) {
        this.organisationName = organisationName;
    }

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