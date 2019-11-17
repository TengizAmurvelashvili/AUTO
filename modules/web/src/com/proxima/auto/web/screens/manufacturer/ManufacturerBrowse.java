package com.proxima.auto.web.screens.manufacturer;

import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.cuba.gui.xml.layout.ComponentsFactory;
import com.proxima.auto.entity.Manufacturer;
import com.proxima.auto.service.ProximaService;

import javax.inject.Inject;

@UiController("auto_Manufacturer.browse")
@UiDescriptor("manufacturer-browse.xml")
@LookupComponent("manufacturersTable")
@LoadDataBeforeShow
public class ManufacturerBrowse extends StandardLookup<Manufacturer> {
    @Inject
    private ComponentsFactory componentsFactory;
    @Inject
    private ProximaService proximaService;

    public Component generateModelQtyCell(Manufacturer entity) {
        Label label = componentsFactory.createComponent(Label.class);
        label.setValue(proximaService.getModelQty(entity));
        return label;
    }
}