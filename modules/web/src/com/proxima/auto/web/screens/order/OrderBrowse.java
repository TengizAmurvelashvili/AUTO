package com.proxima.auto.web.screens.order;

import com.haulmont.cuba.gui.screen.*;
import com.proxima.auto.entity.Order;

@UiController("auto_Order.browse")
@UiDescriptor("order-browse.xml")
@LookupComponent("ordersTable")
@LoadDataBeforeShow
public class OrderBrowse extends StandardLookup<Order> {
}