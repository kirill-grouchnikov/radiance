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
package org.pushingpixels.flamingo.internal.utils;

import org.pushingpixels.flamingo.api.common.*;
import org.pushingpixels.flamingo.api.common.model.*;
import org.pushingpixels.flamingo.api.common.popup.PopupPanelManager;
import org.pushingpixels.flamingo.api.ribbon.*;
import org.pushingpixels.flamingo.api.ribbon.resize.*;
import org.pushingpixels.flamingo.internal.ui.ribbon.*;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.internal.utils.*;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * Helper utilities for Flamingo project. This class is for internal use only.
 *
 * @author Kirill Grouchnikov
 */
public class FlamingoUtilities {
    public static final String TASKBAR_PROJECTION =
            "radiance.flamingo.internal.ribbon.taskbarProjection";

    public static final String TASKBAR_COMMAND =
            "radiance.flamingo.internal.ribbon.taskbarCommand";

    public static int getHLayoutGap(AbstractCommandButton commandButton) {
        Font font = commandButton.getFont();
        return (int) Math.ceil(commandButton.getHGapScaleFactor() * (font.getSize() - 4) / 4);
    }

    public static int getVLayoutGap(AbstractCommandButton commandButton) {
        Font font = commandButton.getFont();
        return (int) Math.ceil(commandButton.getVGapScaleFactor() * (font.getSize() - 4) / 4);
    }

    public static boolean hasPopupAction(AbstractCommandButton commandButton) {
        if (commandButton instanceof JCommandButton) {
            JCommandButton jcb = (JCommandButton) commandButton;
            return jcb.getCommandButtonKind().hasPopup();
        }
        return false;
    }

    public static boolean isShowingMinimizedRibbonInPopup(JRibbon ribbon) {
        List<PopupPanelManager.PopupInfo> popups = PopupPanelManager.defaultManager()
                .getShownPath();
        if (popups.size() == 0) {
            return false;
        }

        for (PopupPanelManager.PopupInfo popup : popups) {
            JComponent originator = popup.getPopupOriginator();
            if (originator instanceof JRibbonTaskToggleButton) {
                return (ribbon == SwingUtilities.getAncestorOfClass(JRibbon.class, originator));
            }
        }
        return false;
    }

    public static void checkResizePoliciesConsistency(AbstractRibbonBand ribbonBand) {
        Insets ins = ribbonBand.getInsets();
        AbstractBandControlPanel controlPanel = ribbonBand.getControlPanel();
        if (controlPanel == null) {
            return;
        }
        int height = controlPanel.getPreferredSize().height
                + ribbonBand.getUI().getBandTitleHeight() + ins.top + ins.bottom;
        List<RibbonBandResizePolicy> resizePolicies = ribbonBand.getResizePolicies();
        checkResizePoliciesConsistencyBase(ribbonBand);
        for (int i = 0; i < (resizePolicies.size() - 1); i++) {
            RibbonBandResizePolicy policy1 = resizePolicies.get(i);
            RibbonBandResizePolicy policy2 = resizePolicies.get(i + 1);
            int width1 = policy1.getPreferredWidth(height, 4);
            int width2 = policy2.getPreferredWidth(height, 4);
            if (width1 < width2) {
                // create the trace message
                StringBuilder builder = new StringBuilder();
                builder.append("Inconsistent preferred widths\n");
                builder.append("Ribbon band '" + ribbonBand.getTitle()
                        + "' has the following resize policies\n");
                for (int j = 0; j < resizePolicies.size(); j++) {
                    RibbonBandResizePolicy policy = resizePolicies.get(j);
                    int width = policy.getPreferredWidth(height, 4);
                    builder.append("\t" + policy.getClass().getName() + " with preferred width "
                            + width + "\n");
                }
                builder.append(policy1.getClass().getName() + " with pref width " + width1
                        + " is followed by resize policy " + policy2.getClass().getName()
                        + " with larger pref width\n");

                throw new IllegalStateException(builder.toString());
            }
        }
    }

    private static void checkResizePoliciesConsistencyBase(AbstractRibbonBand ribbonBand) {
        List<RibbonBandResizePolicy> resizePolicies = ribbonBand.getResizePolicies();
        if (resizePolicies.size() == 0) {
            throw new IllegalStateException("Must have at least one resize policy");
        }
        if ((resizePolicies.size() == 1)
                && (resizePolicies.get(0) instanceof CoreRibbonResizePolicies.IconRibbonBandResizePolicy)) {
            throw new IllegalStateException(
                    "When icon resize policy is present, must have at least one another resize policy.");
        }
        for (int i = 0; i < resizePolicies.size(); i++) {
            RibbonBandResizePolicy policy = resizePolicies.get(i);
            boolean isIcon = policy instanceof CoreRibbonResizePolicies.IconRibbonBandResizePolicy;
            if (isIcon && (i < (resizePolicies.size() - 1))) {
                throw new IllegalStateException("Icon resize policy must be the last in the list");
            }
        }
    }

    public static int getScaledSize(int baseSize, int componentFontSize, double scaleFactor,
            int stepQuantizationSize) {
        int fontDelta = Math.max(0, componentFontSize - 16);
        int stepCount = fontDelta / stepQuantizationSize;
        return baseSize + (int) (scaleFactor * stepCount * stepQuantizationSize);
    }

    public static int getCommandButtonSmallIconSize(int fontSize) {
        return FlamingoUtilities.getScaledSize(16, fontSize, 1.0, 4);
    }

    public static int getTaskToggleButtonHeight(JRibbon ribbon) {
        Font titleFont = SubstanceCortex.GlobalScope.getFontPolicy().getFontSet()
                .getWindowTitleFont();
        FontMetrics fm = SubstanceMetricsUtilities.getFontMetrics(titleFont);
        int fontHeight = fm.getHeight();
        fontHeight += 7;
        int iconHeight = 0;
        if (ribbon.getRootPane().getWindowDecorationStyle() == JRootPane.FRAME) {
            iconHeight = SubstanceSizeUtils.getTitlePaneIconSize();
        }

        return Math.max(fontHeight, iconHeight) - 2;
    }

    public static boolean existsInMenu(Command command, CommandMenuContentModel menuContentModel) {
        for (CommandGroup group : menuContentModel.getCommandGroups()) {
            for (Command secondary : group.getCommands()) {
                if (secondary == command) {
                    return true;
                }
                CommandMenuContentModel secondaryMenuContentModel =
                        secondary.getSecondaryContentModel();
                if (secondaryMenuContentModel != null) {
                    if (existsInMenu(command, secondaryMenuContentModel)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
