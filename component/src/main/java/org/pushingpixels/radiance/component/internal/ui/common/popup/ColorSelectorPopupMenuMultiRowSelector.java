/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import org.pushingpixels.radiance.component.api.common.popup.JColorSelectorPopupMenuPanel;
import org.pushingpixels.radiance.component.api.common.popup.model.ColorSelectorPopupMenuContentModel;

import javax.swing.*;
import java.awt.*;

public class ColorSelectorPopupMenuMultiRowSelector extends JPanel {
    private static final int SECONDARY_ROWS = 5;

    private final int columnCount;

    public ColorSelectorPopupMenuMultiRowSelector(final JColorSelectorPopupMenuPanel colorSelectorPopupMenu,
            final Color... colors) {
        this.columnCount = colors.length;
        ColorSelectorPopupMenuContentModel contentModel =
                colorSelectorPopupMenu.getProjection().getContentModel();
        final JColorSelectorComponent[][] comps =
                new JColorSelectorComponent[colors.length][1 + SECONDARY_ROWS];
        for (int i = 0; i < colors.length; i++) {
            Color primary = colors[i];

            comps[i][0] = new JColorSelectorComponent(primary,
                    contentModel.getColorPreviewListener(),
                    contentModel.getColorActivationListener());
            comps[i][0].addColorActivationListener(JColorSelectorPopupMenuPanel::addColorToRecentlyUsed);
            this.add(comps[i][0]);

            float[] primaryHsb = new float[3];
            Color.RGBtoHSB(primary.getRed(), primary.getGreen(), primary.getBlue(), primaryHsb);

            for (int row = 1; row <= SECONDARY_ROWS; row++) {
                float bFactor = (float) (row - 1) / (float) (SECONDARY_ROWS);
                bFactor = (float) Math.pow(bFactor, 1.4f);
                float brightness = 1.0f - bFactor;

                if (primaryHsb[1] == 0.0f) {
                    // special handling for gray scale
                    float max = 0.5f + 0.5f * primaryHsb[2];
                    brightness = max * (SECONDARY_ROWS - row + 1) / SECONDARY_ROWS;
                }

                Color secondary = new Color(Color.HSBtoRGB(primaryHsb[0],
                        primaryHsb[1] * (row + 1) / (SECONDARY_ROWS + 1), brightness));

                comps[i][row] = new JColorSelectorComponent(secondary,
                        contentModel.getColorPreviewListener(),
                        contentModel.getColorActivationListener());
                comps[i][row].setTopOpen(row > 1);
                comps[i][row].setBottomOpen(row < SECONDARY_ROWS);
                comps[i][row].addColorActivationListener(JColorSelectorPopupMenuPanel::addColorToRecentlyUsed);
                this.add(comps[i][row]);
            }
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
                BasicColorSelectorPopupMenuPanelUI ui =
                        (BasicColorSelectorPopupMenuPanelUI) colorSelectorPopupMenu.getUI();
                int gap = ui.getColorSelectorCellGap();
                int size = ui.getColorSelectorCellSize();
                return new Dimension(colors.length * size + (colors.length + 1) * gap,
                        gap + size + gap + SECONDARY_ROWS * size + gap);
            }

            @Override
            public void layoutContainer(Container parent) {
                BasicColorSelectorPopupMenuPanelUI ui =
                        (BasicColorSelectorPopupMenuPanelUI) colorSelectorPopupMenu.getUI();
                int gap = ui.getColorSelectorCellGap();
                int size = ui.getColorSelectorCellSize();

                if (parent.getComponentOrientation().isLeftToRight()) {
                    int y = gap;
                    for (int row = 0; row <= SECONDARY_ROWS; row++) {
                        int x = gap;
                        for (int i = 0; i < colors.length; i++) {
                            comps[i][row].setBounds(x, y, size, size);
                            x += (size + gap);
                        }
                        y += size;
                        if (row == 0) {
                            y += gap;
                        }
                    }
                } else {
                    int y = gap;

                    for (int row = 0; row <= SECONDARY_ROWS; row++) {
                        int x = getWidth() - gap;
                        for (int i = 0; i < colors.length; i++) {
                            comps[i][row].setBounds(x - size, y, size, size);
                            x -= (size + gap);
                        }
                        y += size;
                        if (row == 0) {
                            y += gap;
                        }
                    }
                }
            }
        });
    }

    public void focusOn(int row, int column) {
        this.getComponent(column * (SECONDARY_ROWS + 1) + row).requestFocus();
    }

    private enum FocusMoveDirection {
        UP, DOWN, LEFT, RIGHT
    }

    private boolean focusMove(FocusMoveDirection focusMoveDirection) {
        for (int row = 0; row <= SECONDARY_ROWS; row++) {
            for (int column = 0; column < this.columnCount; column++) {
                if (this.getComponent(column * (SECONDARY_ROWS + 1) + row).hasFocus()) {
                    switch (focusMoveDirection) {
                        case UP:
                            if (row > 0) {
                                this.focusOn(row - 1, column);
                                return true;
                            }
                            return false;
                        case DOWN:
                            if (row < (SECONDARY_ROWS)) {
                                this.focusOn(row + 1, column);
                                return true;
                            }
                            return false;
                        case LEFT:
                            if (column > 0) {
                                this.focusOn(row, column - 1);
                                return true;
                            }
                            return false;
                        case RIGHT:
                            if (column < (this.columnCount - 1)) {
                                this.focusOn(row, column + 1);
                                return true;
                            }
                            return false;
                    }
                }
            }
        }
        return false;
    }

    public boolean focusUp() {
        return this.focusMove(FocusMoveDirection.UP);
    }

    public boolean focusDown() {
        return this.focusMove(FocusMoveDirection.DOWN);
    }

    public boolean focusRight() {
        return this.focusMove(FocusMoveDirection.RIGHT);
    }

    public boolean focusLeft() {
        return this.focusMove(FocusMoveDirection.LEFT);
    }

    public int getRowCount() {
        return 1 + SECONDARY_ROWS;
    }

}
