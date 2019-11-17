package com.proxima.auto.config;

import com.haulmont.cuba.core.config.Config;
import com.haulmont.cuba.core.config.Property;
import com.haulmont.cuba.core.config.Source;
import com.haulmont.cuba.core.config.SourceType;
import com.haulmont.cuba.core.config.defaults.Default;

@Source(type = SourceType.DATABASE)
public abstract class CountryConfig implements Config {
    @Property("homework.country")
    @Default("Geo")
    public abstract String getCountryDefault();
}