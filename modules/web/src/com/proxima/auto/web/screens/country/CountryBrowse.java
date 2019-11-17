package com.proxima.auto.web.screens.country;

import com.haulmont.cuba.gui.screen.*;
import com.proxima.auto.entity.Country;

@UiController("auto_Country.browse")
@UiDescriptor("country-browse.xml")
@LookupComponent("countriesTable")
@LoadDataBeforeShow
public class CountryBrowse extends StandardLookup<Country> {
}