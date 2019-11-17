package com.proxima.auto.web.screens.customer;

import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.cuba.gui.xml.layout.ComponentsFactory;
import com.proxima.auto.entity.Customer;
import com.proxima.auto.service.ProximaService;

import javax.inject.Inject;

@UiController("auto_Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("customersTable")
@LoadDataBeforeShow
public class CustomerBrowse extends StandardLookup<Customer> {
    @Inject
    private GroupTable<Customer> customersTable;
    @Inject
    private ComponentsFactory componentsFactory;
    @Inject
    private ProximaService proximaService;

    public Component generateOrderQtyCell(Customer entity) {
        Label label = componentsFactory.createComponent(Label.class);
        label.setValue(proximaService.getOrderQty(entity));
        return label;
    }

}