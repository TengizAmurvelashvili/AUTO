package com.proxima.auto.web.screens.manufacturer;

import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.PickerField;
import com.haulmont.cuba.gui.screen.*;
import com.proxima.auto.config.CountryConfig;
import com.proxima.auto.entity.Country;
import com.proxima.auto.entity.Manufacturer;
import com.proxima.auto.service.ProximaService;

import javax.inject.Inject;

@UiController("auto_Manufacturer.edit")
@UiDescriptor("manufacturer-edit.xml")
@EditedEntityContainer("manufacturerDc")
@LoadDataBeforeShow
public class ManufacturerEdit extends StandardEditor<Manufacturer> {
    @Inject
    private ProximaService proximaService;
    @Inject
    private PickerField<Country> countryCodeField;
    @Inject
    private Notifications notifications;
    @Inject
    private CountryConfig countryConfig;

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        countryCodeField.setValue(proximaService.getCountryCode());
        notifications.create().withCaption(countryConfig.getCountryDefault()).show();
    }

}