/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.component.internal.ui.common.popup;

import org.pushingpixels.radiance.component.api.common.popup.JColorSelectorPopupMenu;
import org.pushingpixels.radiance.component.api.common.popup.model.ColorSelectorPopupMenuContentModel;

import javax.swing.*;
import java.awt.*;

public class ColorSelectorPopupMenuSingleRowSelector extends JPanel {
    public ColorSelectorPopupMenuSingleRowSelector(
            final JColorSelectorPopupMenu colorSelectorPopupMenu,
            final Color... colors) {
        ColorSelectorPopupMenuContentModel contentModel =
                colorSelectorPopupMenu.getProjection().getContentModel();
        final JColorSelectorComponent[] comps = new JColorSelectorComponent[colors.length];
        for (int i = 0; i < colors.length; i++) {
            comps[i] = new JColorSelectorComponent(colors[i],
                    contentModel.getColorPreviewListener(),
                    contentModel.getColorActivationListener());
            comps[i].addColorActivationListener(JColorSelectorPopupMenu::addColorToRecentlyUsed);
            this.add(comps[i]);
        }

        this.setLayout(new LayoutManager() {
            @Override
            public void addLayoutComponent(String name, Component comp) {
            }

            @Override
            public void removeLayoutComponent(Component comp) {
            }

            @Override
            public Dimension minimumLayoutSize(Container parent) {
                return new Dimension(10, 10);
            }

            @Override
            public Dimension preferredLayoutSize(Container parent) {
                BasicColorSelectorPopupMenuUI ui =
                        (BasicColorSelectorPopupMenuUI) colorSelectorPopupMenu.getUI();
                int gap = ui.getColorSelectorCellGap();
                int size = ui.getColorSelectorCellSize();
                return new Dimension(colors.length * size
                        + (colors.length + 1) * gap, size + 2 * gap);
            }

            @Override
            public void layoutContainer(Container parent) {
                BasicColorSelectorPopupMenuUI ui =
                        (BasicColorSelectorPopupMenuUI) colorSelectorPopupMenu.getUI();
                int gap = ui.getColorSelectorCellGap();
                int size = ui.getColorSelectorCellSize();

                if (parent.getComponentOrientation().isLeftToRight()) {
                    int x = gap;
                    int y = gap;
                    for (int i = 0; i < colors.length; i++) {
                        comps[i].setBounds(x, y, size, size);
                        x += (size + gap);
                    }
                } else {
                    int x = getWidth() - gap;
                    int y = gap;
                    for (int i = 0; i < colors.length; i++) {
                        comps[i].setBounds(x - size, y, size, size);
                        x -= (size + gap);
                    }
                }
            }
        });
    }

    public void focusOn(int column) {
        this.getComponent(column).requestFocus();
    }

    public int getEntryCount() {
        return this.getComponentCount();
    }
}
