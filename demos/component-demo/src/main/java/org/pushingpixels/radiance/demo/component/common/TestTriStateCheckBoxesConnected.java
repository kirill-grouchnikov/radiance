/*
 * Copyright (c) 2005-2022 Radiance Kirill Grouchnikov. All Rights Reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  o Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  o Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 *  o Neither the name of the copyright holder nor the names of
 *    its contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.pushingpixels.radiance.demo.component.common;

import com.jgoodies.forms.builder.FormBuilder;
import com.jgoodies.forms.factories.Paddings;
import org.pushingpixels.radiance.common.api.model.TriStateButtonModel;
import org.pushingpixels.radiance.common.api.model.TriStateSelectionCycler;
import org.pushingpixels.radiance.component.api.common.model.TriStateCheckBoxContentModel;
import org.pushingpixels.radiance.component.api.common.model.TriStateCheckboxPresentationModel;
import org.pushingpixels.radiance.component.api.common.projection.TriStateCheckBoxProjection;
import org.pushingpixels.radiance.demo.component.svg.logo.RadianceLogo;
import org.pushingpixels.radiance.demo.theming.main.check.selector.RadianceLocaleSelector;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.skin.MarinerSkin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Locale;
import java.util.ResourceBundle;

public class TestTriStateCheckBoxesConnected extends JFrame {
    private Locale currLocale;
    private ResourceBundle resourceBundle;

    private TriStateCheckBoxContentModel triStateCheckBoxContentModel;

    private TestTriStateCheckBoxesConnected() {
        super("Tests for tri-state checkboxes");

        this.setIconImage(RadianceLogo.getLogoImage(this,
                RadianceThemingCortex.GlobalScope.getCurrentSkin().getColorScheme(
                        RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                        RadianceThemingSlices.ColorSchemeAssociationKind.FILL,
                        ComponentState.ENABLED)));

        currLocale = Locale.getDefault();
        resourceBundle = ResourceBundle
                .getBundle("org.pushingpixels.radiance.demo.component.resource.Resources", currLocale);

        JCheckBox checkBoxChild1 = new JCheckBox("child 1");
        JCheckBox checkBoxChild2 = new JCheckBox("child 2");

        this.triStateCheckBoxContentModel = TriStateCheckBoxContentModel.builder()
                .setText("tri-state box")
                .setSelectionState(TriStateButtonModel.SelectionState.OFF)
                .setSelectionCycler(currState -> {
                    // Only cycle between ON and OFF states for user-facing interaction
                    if (currState == TriStateButtonModel.SelectionState.OFF) {
                        return TriStateButtonModel.SelectionState.ON;
                    } else {
                        return TriStateButtonModel.SelectionState.OFF;
                    }
                })
                .setSelectionChangeListener(e -> {
                    System.out.println("New selection state is " + e.getSelectionStateChange());
                    if (e.getSelectionStateChange() == TriStateButtonModel.SelectionState.OFF) {
                        // OFF -> deselect both child checkboxes
                        checkBoxChild1.setSelected(false);
                        checkBoxChild2.setSelected(false);
                    } else if (e.getSelectionStateChange() == TriStateButtonModel.SelectionState.ON) {
                        // ON -> select both child checkboxes
                        checkBoxChild1.setSelected(true);
                        checkBoxChild2.setSelected(true);
                    }
                })
                .build();

        // Note that here we're using action listeners on the child checkboxes and not item
        // listeners. The reason to not use item listeners is that they get fired on any change
        // to the underlying model, including during our selection change logic on the primary
        // tri-state checkbox. As that logic selects / deselects the child checkboxes one after
        // another in a non-atomic fashion, we will end up with our primary tri-state checkbox
        // moving to the INDETERMINATE state in the middle of that update. It can be worked around
        // with an explicit guard (semaphore, count down latch), it's easier to do this with
        // the action listener that gets fired on user-initiated interaction only.

        checkBoxChild1.addActionListener(e -> {
            boolean isChild1Selected = checkBoxChild1.isSelected();
            boolean isChild2Selected = checkBoxChild2.isSelected();
            if (isChild1Selected && isChild2Selected) {
                // Both child checkboxes selected -> ON
                triStateCheckBoxContentModel.setSelectionState(TriStateButtonModel.SelectionState.ON);
            } else if (!isChild1Selected && !isChild2Selected) {
                // Both child checkboxes deselected -> OFF
                triStateCheckBoxContentModel.setSelectionState(TriStateButtonModel.SelectionState.OFF);
            } else {
                // One is selected, the other is deselected -> INDETERMINATE
                triStateCheckBoxContentModel.setSelectionState(TriStateButtonModel.SelectionState.INDETERMINATE);
            }
        });

        checkBoxChild2.addActionListener(e -> {
            boolean isChild1Selected = checkBoxChild1.isSelected();
            boolean isChild2Selected = checkBoxChild2.isSelected();
            if (isChild1Selected && isChild2Selected) {
                // Both child checkboxes selected -> ON
                triStateCheckBoxContentModel.setSelectionState(TriStateButtonModel.SelectionState.ON);
            } else if (!isChild1Selected && !isChild2Selected) {
                // Both child checkboxes deselected -> OFF
                triStateCheckBoxContentModel.setSelectionState(TriStateButtonModel.SelectionState.OFF);
            } else {
                // One is selected, the other is deselected -> INDETERMINATE
                triStateCheckBoxContentModel.setSelectionState(TriStateButtonModel.SelectionState.INDETERMINATE);
            }
        });

        FormBuilder builder = FormBuilder.create().
                columns("left:pref, 10dlu, left:pref").
                rows("p, $lg, p").
                padding(Paddings.DLU7);

        builder.add(new TriStateCheckBoxProjection(
                this.triStateCheckBoxContentModel,
                TriStateCheckboxPresentationModel.builder().build()
        ).buildComponent()).xy(1, 1);
        builder.add(checkBoxChild1).xy(3, 1);
        builder.add(checkBoxChild2).xy(3, 3);

        this.add(builder.build(), BorderLayout.CENTER);

        JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        controlPanel.add(new RadianceLocaleSelector(false, selected -> {
            currLocale = selected;
            resourceBundle = ResourceBundle.getBundle(
                    "org.pushingpixels.radiance.demo.component.resource.Resources", currLocale);

            Window window = SwingUtilities.getWindowAncestor(TestTriStateCheckBoxesConnected.this);
            window.applyComponentOrientation(ComponentOrientation.getOrientation(currLocale));
            SwingUtilities.updateComponentTreeUI(window);
        }));

        JButton changeText = new JButton("change text");
        changeText.addActionListener(e -> triStateCheckBoxContentModel.setText("new text!"));
        controlPanel.add(changeText);

        JCheckBox isEnabled = new JCheckBox("is enabled");
        isEnabled.setSelected(true);
        isEnabled.addChangeListener(e -> triStateCheckBoxContentModel.setEnabled(isEnabled.isSelected()));
        controlPanel.add(isEnabled);

        this.add(controlPanel, BorderLayout.SOUTH);

        this.setSize(500, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            RadianceThemingCortex.GlobalScope.setSkin(new MarinerSkin());

            new TestTriStateCheckBoxesConnected().setVisible(true);
        });
    }
}
