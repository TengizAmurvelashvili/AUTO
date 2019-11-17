package com.proxima.auto.web.screens.customer;

import com.haulmont.cuba.core.app.UniqueNumbersService;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.screen.*;
import com.proxima.auto.entity.Customer;

import javax.inject.Inject;

@UiController("auto_Customer.edit")
@UiDescriptor("customer-edit.xml")
@EditedEntityContainer("customerDc")
@LoadDataBeforeShow
public class CustomerEdit extends StandardEditor<Customer> {
    @Inject
    private UniqueNumbersService uniqueNumbersService;
    @Inject
    private TextField<String> codeField;

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        codeField.setValue("CUS-" + String.valueOf(uniqueNumbersService.getNextNumber("Customer")));
    }
}