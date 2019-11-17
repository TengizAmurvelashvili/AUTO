package com.proxima.auto.web.screens.model;

import com.haulmont.cuba.gui.screen.*;
import com.proxima.auto.entity.Model;

@UiController("auto_Model.edit")
@UiDescriptor("model-edit.xml")
@EditedEntityContainer("modelDc")
@LoadDataBeforeShow
public class ModelEdit extends StandardEditor<Model> {
}