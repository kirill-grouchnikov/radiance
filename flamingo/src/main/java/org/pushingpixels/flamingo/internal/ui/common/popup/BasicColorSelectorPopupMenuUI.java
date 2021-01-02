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
package org.pushingpixels.flamingo.internal.ui.common.popup;

import org.pushingpixels.flamingo.api.common.popup.JColorSelectorPopupMenu;

import javax.swing.*;
import java.awt.*;

public abstract class BasicColorSelectorPopupMenuUI extends BasicCommandPopupMenuUI {
    public abstract int getColorSelectorCellSize();

    public abstract int getColorSelectorCellGap();

    private int columnOfFocusedColorSelector = 0;
    private int indexOfMenuComponentWithFocus = -1;

    @Override
    protected boolean hasLeadingButtonPanel() {
        return false;
    }

    @Override
    protected ScrollableCommandButtonPanel createScrollableButtonPanel() {
        return null;
    }

    @Override
    protected int getMaxVisibleMenuCommands() {
        return 0;
    }

    @Override
    public void focusFirst() {
        java.util.List<Component> popupMenuComponents = this.popupMenu.getMenuComponents();
        if (!popupMenuComponents.isEmpty()) {
            Component first = popupMenuComponents.get(0);
            if (first instanceof JColorSelectorPanel) {
                JColorSelectorPanel colorSelectorPanel = (JColorSelectorPanel) first;
                JPanel colorSelectionContainer = colorSelectorPanel.getColorSelectionContainer();
                if (colorSelectionContainer instanceof ColorSelectorPopupMenuSingleRowSelector) {
                    ((ColorSelectorPopupMenuSingleRowSelector) colorSelectionContainer).focusOn(
                            this.columnOfFocusedColorSelector);
                } else {
                    ((ColorSelectorPopupMenuMultiRowSelector) colorSelectionContainer).focusOn(
                            0, this.columnOfFocusedColorSelector);
                }
            } else {
                first.requestFocus();
                this.menuItemsPanel.scrollToIfNecessary(first.getY(), first.getHeight());
            }
            this.indexOfMenuComponentWithFocus = 0;
        }
    }

    @Override
    public void focusLast() {
        super.focusLast();
    }

    @Override
    public void focusDown() {
        if (this.indexOfMenuComponentWithFocus < 0) {
            this.focusFirst();
            return;
        }

        java.util.List<Component> popupMenuComponents = this.popupMenu.getMenuComponents();

        Component currMenuComponentWithFocus =
                popupMenuComponents.get(this.indexOfMenuComponentWithFocus);
        if (currMenuComponentWithFocus instanceof JColorSelectorPanel) {
            JPanel colorSelectionContainer = ((JColorSelectorPanel) currMenuComponentWithFocus)
                    .getColorSelectionContainer();
            if (colorSelectionContainer instanceof ColorSelectorPopupMenuMultiRowSelector) {
                // Multi-row selector. Check to see if we can move the focus down one row
                // inside it.
                if (((ColorSelectorPopupMenuMultiRowSelector) colorSelectionContainer).focusDown()) {
                    return;
                }
            }
        }

        // Find next focusable down
        int currMenuComponentIndex = this.indexOfMenuComponentWithFocus + 1;
        while (currMenuComponentIndex <= (popupMenuComponents.size() - 1)) {
            Component currMenuComponent = popupMenuComponents.get(currMenuComponentIndex);

            if (currMenuComponent instanceof JSeparator) {
                currMenuComponentIndex++;
                continue;
            }

            this.indexOfMenuComponentWithFocus = currMenuComponentIndex;
            if (currMenuComponent instanceof JColorSelectorPanel) {
                JColorSelectorPanel colorSelectorPanel =
                        (JColorSelectorPanel) currMenuComponent;
                JPanel colorSelectionContainer = colorSelectorPanel.getColorSelectionContainer();
                if (colorSelectionContainer instanceof ColorSelectorPopupMenuSingleRowSelector) {
                    ColorSelectorPopupMenuSingleRowSelector singleRowSelector =
                            (ColorSelectorPopupMenuSingleRowSelector) colorSelectionContainer;
                    int entryCount = singleRowSelector.getEntryCount();
                    if (entryCount == 0) {
                        currMenuComponentIndex++;
                        continue;
                    }
                    this.columnOfFocusedColorSelector = Math.min(this.columnOfFocusedColorSelector,
                            entryCount - 1);
                    singleRowSelector.focusOn(this.columnOfFocusedColorSelector);
                } else {
                    ((ColorSelectorPopupMenuMultiRowSelector) colorSelectionContainer).focusOn(
                            0, this.columnOfFocusedColorSelector);
                }
            } else {
                currMenuComponent.requestFocus();
                this.menuItemsPanel.scrollToIfNecessary(currMenuComponent.getY(),
                        currMenuComponent.getHeight());
            }
            break;
        }
    }

    @Override
    public void focusUp() {
        if (this.indexOfMenuComponentWithFocus < 0) {
            this.focusLast();
            return;
        }

        java.util.List<Component> popupMenuComponents = this.popupMenu.getMenuComponents();

        Component currMenuComponentWithFocus =
                popupMenuComponents.get(this.indexOfMenuComponentWithFocus);
        if (currMenuComponentWithFocus instanceof JColorSelectorPanel) {
            JPanel colorSelectionContainer = ((JColorSelectorPanel) currMenuComponentWithFocus)
                    .getColorSelectionContainer();
            if (colorSelectionContainer instanceof ColorSelectorPopupMenuMultiRowSelector) {
                // Multi-row selector. Check to see if we can move the focus up one row
                // inside it.
                if (((ColorSelectorPopupMenuMultiRowSelector) colorSelectionContainer).focusUp()) {
                    return;
                }
            }
        }

        // Find next focusable up
        int currMenuComponentIndex = this.indexOfMenuComponentWithFocus - 1;
        while (currMenuComponentIndex >= 0) {
            Component currMenuComponent = popupMenuComponents.get(currMenuComponentIndex);

            if (currMenuComponent instanceof JSeparator) {
                currMenuComponentIndex--;
                continue;
            }

            this.indexOfMenuComponentWithFocus = currMenuComponentIndex;
            if (currMenuComponent instanceof JColorSelectorPanel) {
                JColorSelectorPanel colorSelectorPanel =
                        (JColorSelectorPanel) currMenuComponent;
                JPanel colorSelectionContainer = colorSelectorPanel.getColorSelectionContainer();
                if (colorSelectionContainer instanceof ColorSelectorPopupMenuSingleRowSelector) {
                    ColorSelectorPopupMenuSingleRowSelector singleRowSelector =
                            (ColorSelectorPopupMenuSingleRowSelector) colorSelectionContainer;
                    int entryCount = singleRowSelector.getEntryCount();
                    if (entryCount == 0) {
                        currMenuComponentIndex--;
                        continue;
                    }
                    this.columnOfFocusedColorSelector = Math.min(this.columnOfFocusedColorSelector,
                            entryCount - 1);
                    singleRowSelector.focusOn(this.columnOfFocusedColorSelector);
                } else {
                    ColorSelectorPopupMenuMultiRowSelector multiRowSelector =
                            (ColorSelectorPopupMenuMultiRowSelector) colorSelectionContainer;
                    multiRowSelector.focusOn(multiRowSelector.getRowCount() - 1,
                            this.columnOfFocusedColorSelector);
                }
            } else {
                currMenuComponent.requestFocus();
                this.menuItemsPanel.scrollToIfNecessary(currMenuComponent.getY(),
                        currMenuComponent.getHeight());
            }
            break;
        }
    }

    @Override
    public void focusLeft() {
        if (this.indexOfMenuComponentWithFocus >= 0) {
            Component menuComponentWithFocus = this.popupMenu.getMenuComponents().get(
                    this.indexOfMenuComponentWithFocus);
            if (menuComponentWithFocus instanceof JColorSelectorPanel) {
                this.columnOfFocusedColorSelector = Math.max(this.columnOfFocusedColorSelector - 1,
                        0);

                JColorSelectorPanel colorSelectorPanel =
                        (JColorSelectorPanel) menuComponentWithFocus;
                JPanel colorSelectionContainer = colorSelectorPanel.getColorSelectionContainer();
                if (colorSelectionContainer instanceof ColorSelectorPopupMenuSingleRowSelector) {
                    ColorSelectorPopupMenuSingleRowSelector singleRowSelector =
                            (ColorSelectorPopupMenuSingleRowSelector) colorSelectionContainer;
                    int entryCount = singleRowSelector.getEntryCount();
                    this.columnOfFocusedColorSelector = Math.min(this.columnOfFocusedColorSelector,
                            entryCount - 1);
                    singleRowSelector.focusOn(this.columnOfFocusedColorSelector);
                } else {
                    ((ColorSelectorPopupMenuMultiRowSelector) colorSelectionContainer).focusLeft();
                }
            }
        }
    }

    @Override
    public void focusRight() {
        if (this.indexOfMenuComponentWithFocus >= 0) {
            Component menuComponentWithFocus = this.popupMenu.getMenuComponents().get(
                    this.indexOfMenuComponentWithFocus);
            if (menuComponentWithFocus instanceof JColorSelectorPanel) {
                int columnCount = ((JColorSelectorPopupMenu) this.popupMenu).getProjection().
                        getPresentationModel().getColorColumns();
                this.columnOfFocusedColorSelector = Math.min(this.columnOfFocusedColorSelector + 1,
                        columnCount - 1);

                JColorSelectorPanel colorSelectorPanel =
                        (JColorSelectorPanel) menuComponentWithFocus;
                JPanel colorSelectionContainer = colorSelectorPanel.getColorSelectionContainer();
                if (colorSelectionContainer instanceof ColorSelectorPopupMenuSingleRowSelector) {
                    ColorSelectorPopupMenuSingleRowSelector singleRowSelector =
                            (ColorSelectorPopupMenuSingleRowSelector) colorSelectionContainer;
                    int entryCount = singleRowSelector.getEntryCount();
                    this.columnOfFocusedColorSelector = Math.min(this.columnOfFocusedColorSelector,
                            entryCount - 1);
                    singleRowSelector.focusOn(this.columnOfFocusedColorSelector);
                } else {
                    ((ColorSelectorPopupMenuMultiRowSelector) colorSelectionContainer).focusRight();
                }
            }
        }
    }
}
