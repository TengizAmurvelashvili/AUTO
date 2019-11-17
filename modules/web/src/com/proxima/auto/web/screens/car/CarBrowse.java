package com.proxima.auto.web.screens.car;

import com.haulmont.cuba.gui.screen.*;
import com.proxima.auto.entity.Car;

@UiController("auto_Car.browse")
@UiDescriptor("car-browse.xml")
@LookupComponent("carsTable")
@LoadDataBeforeShow
public class CarBrowse extends StandardLookup<Car> {
}