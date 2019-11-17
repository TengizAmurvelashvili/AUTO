package com.proxima.auto.web.screens.option;

import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.proxima.auto.entity.Option;

import javax.inject.Inject;

@UiController("auto_Option.browse")
@UiDescriptor("option-browse.xml")
@LookupComponent("optionsTable")
@LoadDataBeforeShow
public class OptionBrowse extends StandardLookup<Option> {
    @Inject
    private CollectionLoader<Option> optionsDl;
    private String model;

    public void setModel(String model) {
        this.model = model;
    }

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        if (model != null) {
            optionsDl.setParameter("model", model);
        } else {
            optionsDl.setParameter("model", "%");
        }
        optionsDl.load();
    }
}