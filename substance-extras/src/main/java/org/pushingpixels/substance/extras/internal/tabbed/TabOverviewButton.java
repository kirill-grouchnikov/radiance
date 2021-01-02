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
package org.pushingpixels.substance.extras.internal.tabbed;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceSizeUtils;
import org.pushingpixels.substance.internal.utils.icon.TransitionAwareIcon;

import javax.swing.*;
import javax.swing.plaf.UIResource;
import java.awt.*;

/**
 * Button that activates the tab overview dialog.
 *
 * @author Kirill Grouchnikov
 */
public class TabOverviewButton extends JButton implements UIResource {
    /**
     * Client property name for locking undesired bound set.
     */
    private static final String OWN_BOUNDS = "substance.extras.ownBounds";

    /**
     * Creates a new tab overview button.
     *
     * @param tabPane The owner tabbed pane.
     */
    public TabOverviewButton(final JTabbedPane tabPane) {
        this.setFocusable(false);

        int dimension = SubstanceSizeUtils.getControlFontSize();
        this.setIcon(new TransitionAwareIcon(this,
                scheme -> SubstanceCortex.GlobalScope.getIconPack().getInspectIcon(dimension, scheme),
                "substance.widget.extras.taboverview"));
        SubstanceCoreUtilities.markButtonAsFlat(this);
        this.setToolTipText(
                TabPreviewUtilities.getLabelBundle().getString("TabbedPane.overviewButtonTooltip"));

        this.addActionListener(actionEvent -> TabOverviewDialog.getOverviewDialog(tabPane).setVisible(true));
    }

    @Override
    public void setBounds(int x, int y, int width, int height) {
        if (Boolean.TRUE.equals(this.getClientProperty(TabOverviewButton.OWN_BOUNDS)))
            super.setBounds(x, y, width, height);
    }

    /**
     * Updates the location of <code>this</code> tab overview button.
     *
     * @param tabbedPane    Tabbed pane.
     * @param tabAreaInsets Tab area insets.
     */
    public void updateLocation(JTabbedPane tabbedPane, Insets tabAreaInsets) {
        if (tabbedPane == null)
            return;

        // Lock the button for the bounds change
        this.putClientProperty(TabOverviewButton.OWN_BOUNDS, Boolean.TRUE);
        int buttonSize = SubstanceSizeUtils.getLookupButtonSize();

        switch (tabbedPane.getTabPlacement()) {
            case SwingConstants.TOP:
                if (tabbedPane.getComponentOrientation().isLeftToRight())
                    this.setBounds(2, tabAreaInsets.top, buttonSize, buttonSize);
                else
                    this.setBounds(tabbedPane.getBounds().width - tabAreaInsets.right - buttonSize - 2,
                            tabAreaInsets.top, buttonSize, buttonSize);
                break;
            case SwingConstants.BOTTOM:
                if (tabbedPane.getComponentOrientation().isLeftToRight())
                    this.setBounds(2,
                            tabbedPane.getBounds().height - tabAreaInsets.bottom - buttonSize - 4,
                            buttonSize, buttonSize);
                else
                    this.setBounds(tabbedPane.getBounds().width - tabAreaInsets.right - buttonSize - 2,
                            tabbedPane.getBounds().height - tabAreaInsets.bottom - buttonSize - 4,
                            buttonSize, buttonSize);
                break;
            case SwingConstants.LEFT:
                this.setBounds(2, tabAreaInsets.top - 1, buttonSize, buttonSize);
                break;
            case SwingConstants.RIGHT:
                this.setBounds(tabbedPane.getBounds().width - tabAreaInsets.right - buttonSize - 2,
                        tabAreaInsets.top - 1, buttonSize, buttonSize);
                break;
        }
        // Unlock the button for the bounds change
        this.putClientProperty(TabOverviewButton.OWN_BOUNDS, null);
    }
}
