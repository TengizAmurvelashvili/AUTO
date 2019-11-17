package com.proxima.auto.web.screens.color;

import com.haulmont.cuba.gui.screen.*;
import com.proxima.auto.entity.Color;

@UiController("auto_Color.browse")
@UiDescriptor("color-browse.xml")
@LookupComponent("colorsTable")
@LoadDataBeforeShow
public class ColorBrowse extends StandardLookup<Color> {
}