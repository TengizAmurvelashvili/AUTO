package com.proxima.auto.web.screens.color;

import com.haulmont.cuba.gui.screen.*;
import com.proxima.auto.entity.Color;

@UiController("auto_Color.edit")
@UiDescriptor("color-edit.xml")
@EditedEntityContainer("colorDc")
@LoadDataBeforeShow
public class ColorEdit extends StandardEditor<Color> {
}