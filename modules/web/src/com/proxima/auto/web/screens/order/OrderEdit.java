package com.proxima.auto.web.screens.order;

import com.haulmont.cuba.core.app.UniqueNumbersService;
import com.haulmont.cuba.gui.components.TextArea;
import com.haulmont.cuba.gui.screen.*;
import com.proxima.auto.entity.Order;

import javax.inject.Inject;

@UiController("auto_Order.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
@LoadDataBeforeShow
public class OrderEdit extends StandardEditor<Order> {
    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        orderNumberField.setValue("ORD-" + String.valueOf(uniqueNumbersService.getNextNumber("Order")));
    }

    @Inject
    private TextArea<String> orderNumberField;
    @Inject
    private UniqueNumbersService uniqueNumbersService;
}