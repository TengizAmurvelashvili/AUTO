package com.proxima.auto.config;

import com.haulmont.cuba.core.config.Config;
import com.haulmont.cuba.core.config.Property;
import com.haulmont.cuba.core.config.Source;
import com.haulmont.cuba.core.config.SourceType;
import com.haulmont.cuba.core.config.defaults.Default;

@Source(type = SourceType.DATABASE)
public interface CountryConfig extends Config {
    @Property("Auto.country")
    @Default("GEO")
    public abstract String getCountryDefault();
}