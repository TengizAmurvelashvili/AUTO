package com.proxima.auto.web.screens.country;

import com.haulmont.cuba.gui.screen.*;
import com.proxima.auto.entity.Country;

@UiController("auto_Country.edit")
@UiDescriptor("country-edit.xml")
@EditedEntityContainer("countryDc")
@LoadDataBeforeShow
public class CountryEdit extends StandardEditor<Country> {
}