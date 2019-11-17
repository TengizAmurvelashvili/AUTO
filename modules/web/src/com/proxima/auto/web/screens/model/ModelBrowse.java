package com.proxima.auto.web.screens.model;

import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.proxima.auto.entity.Model;

import javax.inject.Inject;

@UiController("auto_Model.browse")
@UiDescriptor("model-browse.xml")
@LookupComponent("modelsTable")
@LoadDataBeforeShow
public class ModelBrowse extends StandardLookup<Model> {
    private String mnf;
    @Inject
    private CollectionLoader<Model> modelsDl;

    public void setManuf(String manuf) {
        this.mnf = manuf;
    }

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        if (mnf != null) {
            modelsDl.setParameter("manufacturer", mnf);
        } else {
            modelsDl.setParameter("manufacturer", "%");
        }
        modelsDl.load();
    }
}