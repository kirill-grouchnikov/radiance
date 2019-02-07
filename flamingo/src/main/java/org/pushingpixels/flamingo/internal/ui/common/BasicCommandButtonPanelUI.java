/*
 * Copyright (c) 2005-2019 Flamingo Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Flamingo Kirill Grouchnikov nor the names of
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
package org.pushingpixels.flamingo.internal.ui.common;

import org.pushingpixels.flamingo.api.common.*;
import org.pushingpixels.flamingo.api.common.model.CommandPanelPresentationModel;
import org.pushingpixels.substance.api.SubstanceCortex;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.plaf.UIResource;
import java.awt.*;

/**
 * Basic UI for command button panel {@link JCommandButtonPanel}.
 *
 * @author Kirill Grouchnikov
 */
public abstract class BasicCommandButtonPanelUI extends CommandButtonPanelUI {
    /**
     * Client property to mark the the command button panel to not draw the background fill
     */
    public static final String SKIP_BACKGROUND_FILL =
            "radiance.flamingo.internal.commandButtonPanel.ui.skipBackgroundFill";

    /**
     * The associated command button panel.
     */
    protected JCommandButtonPanel buttonPanel;

    /**
     * Labels of the button panel groups.
     */
    protected JLabel[] groupLabels;

    /**
     * Bounds of button panel groups.
     */
    private Rectangle[] groupRects;

    private ChangeListener contentModelChangeListener;

    private ChangeListener presentationModelChangeListener;

    /**
     * Default insets of button panel groups.
     */
    protected static final Insets GROUP_INSETS = new Insets(4, 4, 4, 4);

    @Override
    public void installUI(JComponent c) {
        this.buttonPanel = (JCommandButtonPanel) c;

        installDefaults();
        installComponents();
        installListeners();
    }

    /**
     * Installs defaults on the associated button panel.
     */
    protected void installDefaults() {
        this.buttonPanel.setLayout(this.createLayoutManager());
        Font currFont = this.buttonPanel.getFont();
        if ((currFont == null) || (currFont instanceof UIResource)) {
            Font controlFont = SubstanceCortex.GlobalScope.getFontPolicy()
                    .getFontSet().getControlFont();
            this.buttonPanel.setFont(controlFont.deriveFont(Font.BOLD, controlFont.getSize() + 1));
        }
    }

    /**
     * Installs sub-components on the associated button panel.
     */
    protected void installComponents() {
        this.recomputeGroupHeaders();
    }

    /**
     * Installs listeners on the associated button panel.
     */
    protected void installListeners() {
        this.presentationModelChangeListener = (ChangeEvent event) ->
                SwingUtilities.invokeLater(() -> {
                    if (buttonPanel != null) {
                        recomputeGroupHeaders();

                        int groupCount = (groupLabels != null) ? groupLabels.length : 0;

                        CommandPanelPresentationModel presentationModel =
                                buttonPanel.getProjection().getPresentationModel();
                        for (int i = 0; i < groupCount; i++) {
                            for (AbstractCommandButton button :
                                    buttonPanel.getGroupButtons(i)) {
                                button.setIconDimension(
                                        presentationModel.getCommandIconDimension());
                                button.setPresentationState(
                                        presentationModel.getCommandPresentationState());
                            }
                        }

                        buttonPanel.setLayout(createLayoutManager());
                        buttonPanel.revalidate();
                        buttonPanel.doLayout();
                    }
                });
        this.buttonPanel.getProjection().getPresentationModel().addChangeListener(
                this.presentationModelChangeListener);

        this.contentModelChangeListener = (ChangeEvent e) ->
                SwingUtilities.invokeLater(() -> {
                    if (buttonPanel != null) {
                        recomputeGroupHeaders();
                        buttonPanel.revalidate();
                        buttonPanel.doLayout();
                    }
                });
        this.buttonPanel.getProjection().getContentModel().addChangeListener(
                this.contentModelChangeListener);
    }

    @Override
    public void uninstallUI(JComponent c) {
        c.setLayout(null);

        uninstallListeners();
        uninstallComponents();
        uninstallDefaults();
        this.buttonPanel = null;
    }

    /**
     * Uninstalls defaults from the associated button panel.
     */
    protected void uninstallDefaults() {
    }

    /**
     * Uninstalls sub-components from the associated button panel.
     */
    protected void uninstallComponents() {
        if (this.groupLabels != null) {
            for (JLabel groupLabel : this.groupLabels) {
                this.buttonPanel.remove(groupLabel);
            }
        }
    }

    /**
     * Uninstalls listeners from the associated button panel.
     */
    protected void uninstallListeners() {
        this.buttonPanel.getProjection().getPresentationModel().removeChangeListener(
                this.presentationModelChangeListener);
        this.presentationModelChangeListener = null;

        this.buttonPanel.getProjection().getContentModel().removeChangeListener(
                this.contentModelChangeListener);
        this.contentModelChangeListener = null;
    }

    /**
     * Returns the layout manager for the associated button panel.
     *
     * @return The layout manager for the associated button panel.
     */
    protected LayoutManager createLayoutManager() {
        CommandPanelPresentationModel panelPresentationModel =
                this.buttonPanel.getProjection().getPresentationModel();
        if ((panelPresentationModel != null)
                && (panelPresentationModel.getLayoutKind() ==
                CommandPanelPresentationModel.LayoutKind.COLUMN_FILL)) {
            return new ColumnFillLayout();
        } else {
            return new RowFillLayout();
        }
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        boolean skipBackgroundFill = Boolean.TRUE.equals(
                this.buttonPanel.getClientProperty(SKIP_BACKGROUND_FILL));

        if (!skipBackgroundFill) {
            Color bg = this.buttonPanel.getBackground();
            g.setColor(bg);
            g.fillRect(0, 0, c.getWidth(), c.getHeight());
        }

        int groupCount = (groupLabels != null) ? groupLabels.length : 0;

        for (int i = 0; i < groupCount; i++) {
            Rectangle groupRect = this.groupRects[i];
            if (!skipBackgroundFill) {
                this.paintGroupBackground(g, i, groupRect.x, groupRect.y, groupRect.width,
                        groupRect.height);
            }

            if (this.groupLabels[i].isVisible()) {
                Rectangle groupTitleBackground = this.groupLabels[i].getBounds();
                this.paintGroupTitleBackground(g, i, groupRect.x,
                        groupTitleBackground.y - getGroupInsets().top, groupRect.width,
                        groupTitleBackground.height + getGroupInsets().top + getLayoutGap());
            }
        }
    }

    /**
     * Paints the background of the specified button panel group.
     *
     * @param g          Graphics context.
     * @param groupIndex Group index.
     * @param x          X coordinate of the button group bounds.
     * @param y          Y coordinate of the button group bounds.
     * @param width      Width of the button group bounds.
     * @param height     Height of the button group bounds.
     */
    protected abstract void paintGroupBackground(Graphics g, int groupIndex, int x, int y,
            int width, int height);

    /**
     * Paints the background of the title of specified button panel group.
     *
     * @param g          Graphics context.
     * @param groupIndex Group index.
     * @param x          X coordinate of the button group title bounds.
     * @param y          Y coordinate of the button group title bounds.
     * @param width      Width of the button group title bounds.
     * @param height     Height of the button group title bounds.
     */
    protected abstract void paintGroupTitleBackground(Graphics g, int groupIndex, int x, int y,
            int width, int height);

    /**
     * Returns the height of the group title strip.
     *
     * @param groupIndex Group index.
     * @return The height of the title strip of the specified group.
     */
    protected abstract int getGroupTitleHeight(int groupIndex);

    /**
     * Returns the insets of button panel groups.
     *
     * @return The insets of button panel groups.
     */
    protected abstract Insets getGroupInsets();

    /**
     * Row-fill layout for the button panel.
     *
     * @author Kirill Grouchnikov
     */
    protected class RowFillLayout implements LayoutManager {
        @Override
        public void addLayoutComponent(String name, Component comp) {
        }

        @Override
        public void removeLayoutComponent(Component comp) {
        }

        @Override
        public void layoutContainer(Container parent) {
            Insets bInsets = parent.getInsets();
            Insets groupInsets = getGroupInsets();
            int left = bInsets.left;
            int right = bInsets.right;

            int y = bInsets.top;

            JCommandButtonPanel panel = (JCommandButtonPanel) parent;
            boolean ltr = panel.getComponentOrientation().isLeftToRight();

            // compute max width of buttons
            int maxButtonWidth = 0;
            int maxButtonHeight = 0;
            int groupCount = (groupLabels != null) ? groupLabels.length : 0;

            for (int i = 0; i < groupCount; i++) {
                for (AbstractCommandButton button : panel.getGroupButtons(i)) {
                    maxButtonWidth = Math.max(maxButtonWidth, button.getPreferredSize().width);
                    maxButtonHeight = Math.max(maxButtonHeight, button.getPreferredSize().height);
                }
            }
            groupRects = new Rectangle[groupCount];

            int gap = getLayoutGap();
            int maxWidth = parent.getWidth() - bInsets.left - bInsets.right - groupInsets.left
                    - groupInsets.right;
            // for N buttons, there are N-1 gaps. Add the gap to the
            // available width and divide by the max button width + gap.
            int buttonsInRow = (maxButtonWidth == 0) ? 0
                    : (maxWidth + gap) / (maxButtonWidth + gap);
            int maxButtonColumnsToUse = panel.getProjection().getPresentationModel()
                    .getMaxColumns();
            if (maxButtonColumnsToUse > 0) {
                buttonsInRow = Math.min(buttonsInRow, maxButtonColumnsToUse);
            }

            for (int i = 0; i < groupCount; i++) {
                int topGroupY = y;
                y += groupInsets.top;

                JLabel groupLabel = groupLabels[i];
                if (buttonPanel.getProjection().getPresentationModel().isToShowGroupLabels()) {
                    int labelWidth = groupLabel.getPreferredSize().width;
                    int labelHeight = getGroupTitleHeight(i);
                    if (groupLabel.getComponentOrientation().isLeftToRight()) {
                        groupLabel.setBounds(left + groupInsets.left, y, labelWidth, labelHeight);
                    } else {
                        groupLabel.setBounds(
                                parent.getWidth() - right - groupInsets.right - labelWidth, y,
                                labelWidth, labelHeight);
                    }
                    y += labelHeight + gap;
                }

                int buttonRows = (buttonsInRow == 0) ? 0
                        : (int) (Math.ceil((double) panel.getGroupButtons(i).size()
                        / buttonsInRow));
                if (maxButtonColumnsToUse > 0) {
                    buttonsInRow = Math.min(buttonsInRow, maxButtonColumnsToUse);
                }

                // spread the buttons so that we don't have extra space
                // on the right
                int actualButtonWidth = (buttonRows > 1)
                        ? (maxWidth - (buttonsInRow - 1) * gap) / buttonsInRow
                        : maxButtonWidth;
                if (maxButtonColumnsToUse == 1)
                    actualButtonWidth = maxWidth;

                if (ltr) {
                    int currX = left + groupInsets.left;
                    for (AbstractCommandButton button : panel.getGroupButtons(i)) {
                        int endX = currX + actualButtonWidth;
                        if (endX > (parent.getWidth() - right - groupInsets.right)) {
                            currX = left + groupInsets.left;
                            y += maxButtonHeight;
                            y += gap;
                        }
                        button.setBounds(currX, y, actualButtonWidth, maxButtonHeight);
                        currX += actualButtonWidth;
                        currX += gap;
                    }
                } else {
                    int currX = parent.getWidth() - right - groupInsets.right;
                    for (AbstractCommandButton button : panel.getGroupButtons(i)) {
                        int startX = currX - actualButtonWidth;
                        if (startX < (left + groupInsets.left)) {
                            currX = parent.getWidth() - right - groupInsets.right;
                            y += maxButtonHeight;
                            y += gap;
                        }
                        button.setBounds(currX - actualButtonWidth, y, actualButtonWidth,
                                maxButtonHeight);
                        currX -= actualButtonWidth;
                        currX -= gap;
                    }
                }

                y += maxButtonHeight + groupInsets.bottom;
                int bottomGroupY = y;
                groupRects[i] = new Rectangle(left, topGroupY, (parent.getWidth() - left - right),
                        (bottomGroupY - topGroupY));
            }
        }

        @Override
        public Dimension minimumLayoutSize(Container parent) {
            return new Dimension(20, 20);
        }

        @Override
        public Dimension preferredLayoutSize(Container parent) {
            JCommandButtonPanel panel = (JCommandButtonPanel) parent;

            int maxButtonColumnsToUse = panel.getProjection().getPresentationModel()
                    .getMaxColumns();

            Insets bInsets = parent.getInsets();
            Insets groupInsets = getGroupInsets();
            int insetsWidth = bInsets.left + groupInsets.left + bInsets.right + groupInsets.right;

            // compute max width of buttons
            int maxButtonWidth = 0;
            int maxButtonHeight = 0;
            int groupCount = (groupLabels != null) ? groupLabels.length : 0;
            for (int i = 0; i < groupCount; i++) {
                for (AbstractCommandButton button : panel.getGroupButtons(i)) {
                    maxButtonWidth = Math.max(maxButtonWidth, button.getPreferredSize().width);
                    maxButtonHeight = Math.max(maxButtonHeight, button.getPreferredSize().height);
                }
            }

            // total height
            int gap = getLayoutGap();
            boolean usePanelWidth = (maxButtonColumnsToUse <= 0);
            int availableWidth = panel.getWidth();
            availableWidth -= insetsWidth;

            if (usePanelWidth) {
                // this hasn't been set. Compute using the available width
                maxButtonColumnsToUse = (availableWidth + gap) / (maxButtonWidth + gap);
            }
            int height = bInsets.top + bInsets.bottom;
            // System.out.print(height + "[" + maxButtonColumnsToUse + "]");
            for (int i = 0; i < groupCount; i++) {
                if (groupLabels[i].isVisible()) {
                    height += (getGroupTitleHeight(i) + gap);
                }

                height += (groupInsets.top + groupInsets.bottom);

                int buttonRows = (int) (Math.ceil((double) panel.getGroupButtons(i).size()
                        / maxButtonColumnsToUse));
                height += buttonRows * maxButtonHeight + (buttonRows - 1) * gap;
                // System.out.print(" " + height);
            }
            int prefWidth = usePanelWidth ? availableWidth
                    : maxButtonColumnsToUse * maxButtonWidth + (maxButtonColumnsToUse - 1) * gap
                    + bInsets.left + bInsets.right + groupInsets.left + groupInsets.right;
            return new Dimension(Math.max(10, prefWidth), Math.max(10, height));
        }
    }

    /**
     * Column-fill layout for the button panel.
     *
     * @author Kirill Grouchnikov
     */
    protected class ColumnFillLayout implements LayoutManager {
        @Override
        public void addLayoutComponent(String name, Component comp) {
        }

        @Override
        public void removeLayoutComponent(Component comp) {
        }

        @Override
        public void layoutContainer(Container parent) {
            Insets bInsets = parent.getInsets();
            Insets groupInsets = getGroupInsets();
            int top = bInsets.top;
            int bottom = bInsets.bottom;

            JCommandButtonPanel panel = (JCommandButtonPanel) parent;
            boolean ltr = panel.getComponentOrientation().isLeftToRight();

            // compute max width of buttons
            int maxButtonWidth = 0;
            int maxButtonHeight = 0;
            int groupCount = panel.getGroupCount();
            for (int i = 0; i < groupCount; i++) {
                for (AbstractCommandButton button : panel.getGroupButtons(i)) {
                    maxButtonWidth = Math.max(maxButtonWidth, button.getPreferredSize().width);
                    maxButtonHeight = Math.max(maxButtonHeight, button.getPreferredSize().height);
                }
            }
            groupRects = new Rectangle[groupCount];

            int gap = getLayoutGap();
            int maxHeight = parent.getHeight() - bInsets.top - bInsets.bottom - groupInsets.top
                    - groupInsets.bottom;
            // for N buttons, there are N-1 gaps. Add the gap to the
            // available width and divide by the max button width + gap.
            int buttonsInRow = (maxButtonHeight == 0) ? 0
                    : (maxHeight + gap) / (maxButtonHeight + gap);

            if (ltr) {
                int x = bInsets.left + groupInsets.left;
                for (int i = 0; i < groupCount; i++) {
                    int leftGroupX = x;
                    x += groupInsets.left;
                    int currY = top + groupInsets.top;

                    int buttonColumns = (buttonsInRow == 0) ? 0
                            : (int) (Math.ceil((double) panel.getGroupButtons(i).size()
                            / buttonsInRow));
                    // spread the buttons so that we don't have extra space
                    // on the bottom
                    int actualButtonHeight = (buttonColumns > 1)
                            ? (maxHeight - (buttonsInRow - 1) * gap) / buttonsInRow
                            : maxButtonWidth;

                    for (AbstractCommandButton button : panel.getGroupButtons(i)) {
                        int endY = currY + actualButtonHeight;
                        if (endY > (parent.getHeight() - bottom - groupInsets.bottom)) {
                            currY = top + groupInsets.top;
                            x += maxButtonWidth;
                            x += gap;
                        }
                        button.setBounds(x, currY, maxButtonWidth, actualButtonHeight);
                        currY += actualButtonHeight;
                        currY += gap;
                    }
                    x += maxButtonWidth + groupInsets.bottom;
                    int rightGroupX = x;
                    groupRects[i] = new Rectangle(leftGroupX, top, (rightGroupX - leftGroupX),
                            (parent.getHeight() - top - bottom));
                }
            } else {
                int x = panel.getWidth() - bInsets.right - groupInsets.right;
                for (int i = 0; i < groupCount; i++) {
                    int rightGroupX = x;
                    x -= groupInsets.left;
                    int currY = top + groupInsets.top;

                    int buttonColumns = (buttonsInRow == 0) ? 0
                            : (int) (Math.ceil((double) panel.getGroupButtons(i).size()
                            / buttonsInRow));
                    // spread the buttons so that we don't have extra space
                    // on the bottom
                    int actualButtonHeight = (buttonColumns > 1)
                            ? (maxHeight - (buttonsInRow - 1) * gap) / buttonsInRow
                            : maxButtonWidth;

                    for (AbstractCommandButton button : panel.getGroupButtons(i)) {
                        int endY = currY + actualButtonHeight;
                        if (endY > (parent.getHeight() - bottom - groupInsets.bottom)) {
                            currY = top + groupInsets.top;
                            x -= maxButtonWidth;
                            x -= gap;
                        }
                        button.setBounds(x - maxButtonWidth, currY, maxButtonWidth,
                                actualButtonHeight);
                        currY += actualButtonHeight;
                        currY += gap;
                    }
                    x -= (maxButtonWidth + groupInsets.bottom);
                    int leftGroupX = x;
                    groupRects[i] = new Rectangle(leftGroupX, top, (rightGroupX - leftGroupX),
                            (parent.getHeight() - top - bottom));
                }
            }
        }

        @Override
        public Dimension minimumLayoutSize(Container parent) {
            return new Dimension(20, 20);
        }

        @Override
        public Dimension preferredLayoutSize(Container parent) {
            JCommandButtonPanel panel = (JCommandButtonPanel) parent;

            int maxButtonRowsToUse = panel.getProjection().getPresentationModel().getMaxRows();

            Insets bInsets = parent.getInsets();
            Insets groupInsets = getGroupInsets();
            int insetsHeight = bInsets.top + groupInsets.top + bInsets.bottom + groupInsets.bottom;

            // compute max width of buttons
            int maxButtonWidth = 0;
            int maxButtonHeight = 0;
            int groupCount = panel.getGroupCount();
            for (int i = 0; i < groupCount; i++) {
                for (AbstractCommandButton button : panel.getGroupButtons(i)) {
                    maxButtonWidth = Math.max(maxButtonWidth, button.getPreferredSize().width);
                    maxButtonHeight = Math.max(maxButtonHeight, button.getPreferredSize().height);
                }
            }

            // total width
            int gap = getLayoutGap();
            boolean usePanelHeight = (maxButtonRowsToUse <= 0);

            int availableHeight = panel.getHeight();
            availableHeight -= insetsHeight;
            if (usePanelHeight) {
                // this hasn't been set. Compute using the available
                // height
                maxButtonRowsToUse = (availableHeight + gap) / (maxButtonHeight + gap);
            }
            // go over all groups and see how many columns each one needs
            int width = bInsets.left + bInsets.right;
            for (int i = 0; i < groupCount; i++) {
                width += (groupInsets.left + groupInsets.right);

                int buttonColumns = (int) (Math.ceil((double) panel.getGroupButtons(i).size()
                        / maxButtonRowsToUse));
                width += buttonColumns * maxButtonWidth + (buttonColumns - 1) * gap;
            }
            int prefHeight = usePanelHeight ? availableHeight
                    : maxButtonRowsToUse * maxButtonWidth + (maxButtonRowsToUse - 1) * gap
                    + bInsets.top + bInsets.bottom + groupInsets.top + groupInsets.bottom;
            return new Dimension(Math.max(10, width), Math.max(10, prefHeight));
        }
    }

    /**
     * Returns the layout gap for button panel components.
     *
     * @return The layout gap for button panel components.
     */
    protected int getLayoutGap() {
        return 4;
    }

    /**
     * Recomputes the components for button group headers.
     */
    private void recomputeGroupHeaders() {
        if (this.groupLabels != null) {
            for (JLabel groupLabel : this.groupLabels) {
                this.buttonPanel.remove(groupLabel);
            }
        }

        int groupCount = this.buttonPanel.getGroupCount();
        this.groupLabels = new JLabel[groupCount];
        for (int i = 0; i < groupCount; i++) {
            this.groupLabels[i] = new JLabel(this.buttonPanel.getGroupTitleAt(i));
            this.groupLabels[i].setComponentOrientation(this.buttonPanel.getComponentOrientation());

            this.buttonPanel.add(this.groupLabels[i]);

            this.groupLabels[i].setVisible(
                    this.buttonPanel.getProjection().getPresentationModel().isToShowGroupLabels());
        }
    }

    /**
     * Returns the preferred size of the associated button panel for the specified parameters.
     *
     * @param buttonVisibleRows Target number of visible button rows.
     * @param titleVisibleRows  Target number of visible group title rows.
     * @return The preferred size of the associated button panel for the specified parameters.
     */
    public int getPreferredHeight(int buttonVisibleRows, int titleVisibleRows) {
        Insets bInsets = this.buttonPanel.getInsets();
        Insets groupInsets = getGroupInsets();
        int maxButtonHeight = 0;
        int groupCount = this.buttonPanel.getGroupCount();
        for (int i = 0; i < groupCount; i++) {
            for (AbstractCommandButton button : this.buttonPanel.getGroupButtons(i)) {
                maxButtonHeight = Math.max(maxButtonHeight, button.getPreferredSize().height);
            }
        }

        // total height
        int gap = getLayoutGap();

        // panel insets
        int totalHeight = bInsets.top + bInsets.bottom;
        // height of icon rows
        totalHeight += buttonVisibleRows * maxButtonHeight;
        // gaps between icon rows
        totalHeight += (buttonVisibleRows - 1) * gap;
        // title height
        totalHeight += titleVisibleRows * getGroupTitleHeight(0);
        // title insets
        totalHeight += (titleVisibleRows - 1) * (groupInsets.top + groupInsets.bottom);

        return totalHeight;
    }
}
