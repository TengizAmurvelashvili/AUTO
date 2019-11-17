package com.proxima.auto.web.screens.option;

import com.haulmont.cuba.gui.screen.*;
import com.proxima.auto.entity.Option;

@UiController("auto_Option.edit")
@UiDescriptor("option-edit.xml")
@EditedEntityContainer("optionDc")
@LoadDataBeforeShow
public class OptionEdit extends StandardEditor<Option> {
}