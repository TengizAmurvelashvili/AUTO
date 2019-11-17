package com.proxima.auto.web.screens.manufacturer;

import com.haulmont.cuba.gui.components.PickerField;
import com.haulmont.cuba.gui.screen.*;
import com.proxima.auto.entity.Country;
import com.proxima.auto.entity.Manufacturer;

import javax.inject.Inject;

@UiController("auto_Manufacturer.edit")
@UiDescriptor("manufacturer-edit.xml")
@EditedEntityContainer("manufacturerDc")
@LoadDataBeforeShow
public class ManufacturerEdit extends StandardEditor<Manufacturer> {

}