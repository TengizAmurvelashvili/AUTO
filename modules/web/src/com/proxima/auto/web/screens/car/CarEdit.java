package com.proxima.auto.web.screens.car;

import com.haulmont.cuba.core.global.TimeSource;
import com.haulmont.cuba.gui.ScreenBuilders;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.PickerField;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.proxima.auto.entity.Car;
import com.proxima.auto.entity.Manufacturer;
import com.proxima.auto.entity.Model;
import com.proxima.auto.entity.Option;
import com.proxima.auto.web.screens.model.ModelBrowse;
import com.proxima.auto.web.screens.option.OptionBrowse;

import javax.inject.Inject;
import javax.validation.constraints.Null;
import java.math.BigDecimal;

@UiController("auto_Car.edit")
@UiDescriptor("car-edit.xml")
@EditedEntityContainer("carDc")
@LoadDataBeforeShow
public class CarEdit extends StandardEditor<Car> {
    @Inject
    private PickerField<Model> modelField;
    @Inject
    private ScreenBuilders screenBuilders;
    @Inject
    private PickerField<Manufacturer> manufacturerField;
    @Inject
    private PickerField<Option> optionField;
    @Inject
    private TextField<Integer> issueYearField;
    @Inject
    private TextField<String> nameField;
    @Inject
    private TimeSource timeSource;
    @Inject
    private TextField<BigDecimal> priceField;

    private void showModel() {
        ModelBrowse modelBrowse = screenBuilders.lookup(modelField)
                .withScreenClass(ModelBrowse.class)
                .build();
        modelBrowse.setManuf(manufacturerField.getValue().getCode());
        modelBrowse.show();
    }

    @Subscribe
    public void onInitEntity(InitEntityEvent<Car> event) {
        issueYearField.setValue(timeSource.now().getYear());

    }

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        issueYearField.setValue(timeSource.now().getYear());

    }

    private void showOption() {
        OptionBrowse optionBrowse = screenBuilders.lookup(optionField)
                .withScreenClass(OptionBrowse.class)
                .build();
        optionBrowse.setModel(modelField.getValue().getName());
        optionBrowse.show();
    }

    private void controlsEnable(Boolean all, @Null String modelControl, @Null String optionControl) {

        if (!manufacturerField.isEmpty()) {
            modelField.setEnabled(true);
        }
        if (!modelField.isEmpty()) {
            optionField.setEnabled(true);
        }
    }

    @Subscribe(id = "modelsDl", target = Target.DATA_LOADER)
    public void onModelsDlPostLoad(CollectionLoader.PostLoadEvent event) {
        this.controlsEnable(true, null, null);
    }

    @Subscribe("manufacturerField")
    public void onManufacturerFieldValueChange(HasValue.ValueChangeEvent<Manufacturer> event) {
        this.controlsEnable(false, event.getComponent().getId(), null);
    }

    @Subscribe("modelField")
    public void onModelFieldValueChange(HasValue.ValueChangeEvent<Model> event) {
        this.controlsEnable(false, null, event.getComponent().getId());
    }

    @Subscribe("modelField.lookup")
    public void onModelFieldLookup(Action.ActionPerformedEvent event) {
        this.showModel();
    }

    @Subscribe("optionField.lookup")
    public void onOptionFieldLookup(Action.ActionPerformedEvent event) {
        this.showOption();
    }

    @Subscribe("optionField")
    public void onOptionFieldValueChange(HasValue.ValueChangeEvent<Option> event) {
        if (!optionField.isEmpty()) {
            priceField.setValue(optionField.getValue().getPrice());
            this.updateName();
        }
    }

    private void updateName() {
        //  nameField.setValue(manufacturerField.getValue().getCode()+"/"+modelField.getValue().getName()+"/"+optionField.getValue().getName());
    }
}