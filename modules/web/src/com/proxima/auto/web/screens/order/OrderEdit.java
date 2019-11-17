package com.proxima.auto.web.screens.order;

import com.haulmont.cuba.core.app.UniqueNumbersService;
import com.haulmont.cuba.gui.components.PickerField;
import com.haulmont.cuba.gui.components.TextArea;
import com.haulmont.cuba.gui.components.ValidationException;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import com.proxima.auto.entity.Car;
import com.proxima.auto.entity.Order;

import javax.inject.Inject;
import javax.validation.Validation;
import java.math.BigDecimal;

@UiController("auto_Order.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
@LoadDataBeforeShow
public class OrderEdit extends StandardEditor<Order> {
    @Inject
    private InstanceContainer<Order> orderDc;
    @Inject
    private PickerField<Car> carField;
    @Inject
    private TextArea<String> orderNumberField;
    @Inject
    private UniqueNumbersService uniqueNumbersService;
    @Install(to = "priceField", subject = "validator")
    private void priceFieldValidator(BigDecimal bigDecimal) {
        BigDecimal amount=carField.getValue().getPrice();
        if(bigDecimal.compareTo(amount)==-1){
            throw new ValidationException("Error Amount");
        }
    }
    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        orderNumberField.setValue("ORD-" + String.valueOf(uniqueNumbersService.getNextNumber("Order")));
    }

}