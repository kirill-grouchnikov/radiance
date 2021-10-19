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
package org.pushingpixels.radiance.components.internal.ui.ribbon;

import org.pushingpixels.radiance.components.api.common.CommandButtonPresentationState;
import org.pushingpixels.radiance.components.api.common.JCommandButton;
import org.pushingpixels.radiance.components.api.common.JCommandButtonStrip;
import org.pushingpixels.radiance.components.api.ribbon.AbstractRibbonBand;
import org.pushingpixels.radiance.components.api.ribbon.JRibbonBand;
import org.pushingpixels.radiance.components.api.ribbon.resize.CoreRibbonResizePolicies;
import org.pushingpixels.radiance.components.api.ribbon.resize.RibbonBandResizePolicy;
import org.pushingpixels.radiance.components.internal.ui.ribbon.BasicRibbonBandUI.CollapsedButtonPopupPanel;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Basic UI for control panel of ribbon band {@link JBandControlPanel}.
 * 
 * @author Kirill Grouchnikov
 */
public abstract class BasicBandControlPanelUI extends AbstractBandControlPanelUI {
    private JSeparator[] groupSeparators;

    private JLabel[] groupLabels;

    private ChangeListener changeListener;

    /**
     * Invoked by <code>installUI</code> to create a layout manager object to manage the
     * {@link JBandControlPanel}.
     * 
     * @return a layout manager object
     */
    @Override
    protected LayoutManager createLayoutManager() {
        return new ControlPanelLayout();
    }

    @Override
    protected void installListeners() {
        super.installListeners();

        this.changeListener = changeEvent -> {
            syncGroupHeaders();
            controlPanel.revalidate();
        };
        ((JBandControlPanel) this.controlPanel).addChangeListener(this.changeListener);
    }

    @Override
    protected void uninstallListeners() {
        ((JBandControlPanel) this.controlPanel).removeChangeListener(this.changeListener);
        this.changeListener = null;

        super.uninstallListeners();
    }

    @Override
    protected void installComponents() {
        super.installComponents();

        this.syncGroupHeaders();
    }

    @Override
    protected void uninstallComponents() {
        if (this.groupSeparators != null) {
            for (JSeparator groupSeparator : this.groupSeparators) {
                this.controlPanel.remove(groupSeparator);
            }
        }
        if (this.groupLabels != null) {
            for (JLabel groupLabel : this.groupLabels) {
                if (groupLabel != null)
                    this.controlPanel.remove(groupLabel);
            }
        }

        super.uninstallComponents();
    }

    protected void syncGroupHeaders() {
        if (this.groupSeparators != null) {
            for (JSeparator groupSeparator : this.groupSeparators) {
                this.controlPanel.remove(groupSeparator);
            }
        }
        if (this.groupLabels != null) {
            for (JLabel groupLabel : this.groupLabels) {
                if (groupLabel != null)
                    this.controlPanel.remove(groupLabel);
            }
        }

        int groupCount = ((JBandControlPanel) this.controlPanel).getControlPanelGroupCount();
        if (groupCount > 1) {
            this.groupSeparators = new JSeparator[groupCount - 1];
            for (int i = 0; i < groupCount - 1; i++) {
                this.groupSeparators[i] = new JSeparator(JSeparator.VERTICAL);
                this.controlPanel.add(this.groupSeparators[i]);
            }
        }
        if (groupCount > 0) {
            this.groupLabels = new JLabel[groupCount];
            for (int i = 0; i < groupCount; i++) {
                String title = ((JBandControlPanel) this.controlPanel).getControlPanelGroupTitle(i);
                if (title != null) {
                    this.groupLabels[i] = new JLabel(title);
                    this.controlPanel.add(this.groupLabels[i]);
                }
            }
        }

    }

    /**
     * Layout for the control panel of ribbon band.
     * 
     * @author Kirill Grouchnikov
     */
    private class ControlPanelLayout implements LayoutManager {
        @Override
        public void addLayoutComponent(String name, Component c) {
        }

        @Override
        public void removeLayoutComponent(Component c) {
        }

        @Override
        public Dimension preferredLayoutSize(Container c) {
            // The height of ribbon band control panel is
            // computed based on the preferred height of a command
            // button in BIG state.
            int buttonHeight = forSizing.getPreferredSize().height;
            int vGap = getLayoutGap() * 3 / 4;
            int minusGaps = buttonHeight - 2 * vGap;
            switch (minusGaps % 3) {
            case 1:
                buttonHeight += 2;
                break;
            case 2:
                buttonHeight++;
                break;
            }

            Insets ins = c.getInsets();

            // System.out.println("Control panel pref = "
            // + (buttonHeight + ins.top + ins.bottom));

            return new Dimension(c.getWidth() + ins.left + ins.right, buttonHeight + ins.top + ins.bottom);
        }

        @Override
        public Dimension minimumLayoutSize(Container c) {
            return this.preferredLayoutSize(c);
        }

        @Override
        public void layoutContainer(Container c) {
            // System.out.println("Control panel real = " + c.getHeight());

            AbstractRibbonBand ribbonBand = ((JBandControlPanel) c).getRibbonBand();
            RibbonBandResizePolicy currentResizePolicy = ribbonBand.getCurrentResizePolicy();
            if (currentResizePolicy == null)
                return;

            boolean ltr = c.getComponentOrientation().isLeftToRight();

            // need place for border
            Insets ins = c.getInsets();
            int gap = getLayoutGap();
            int x = ltr ? ins.left + gap / 2 : c.getWidth() - ins.right - gap / 2;
            int availableHeight = c.getHeight() - ins.top - ins.bottom;

            if (SwingUtilities.getAncestorOfClass(CollapsedButtonPopupPanel.class, c) != null) {
                // install the most permissive resize policy on the popup
                // panel of a collapsed ribbon band
                List<RibbonBandResizePolicy> resizePolicies = ribbonBand.getResizePolicies();
                resizePolicies.get(0).install(availableHeight, gap);
            } else {
                if (currentResizePolicy instanceof CoreRibbonResizePolicies.IconRibbonBandResizePolicy) {
                    return;
                }

                // Installs the resize policy - this updates the presentation
                // priority of all the galleries and buttons
                currentResizePolicy.install(availableHeight, gap);
            }

            List<Component> focusSequence = new ArrayList<>();

            int controlPanelGroupIndex = 0;
            for (JBandControlPanel.ControlPanelGroup controlPanelGroup : ((JBandControlPanel) controlPanel)
                    .getControlPanelGroups()) {
                // handle the group separators
                if (controlPanelGroupIndex > 0) {
                    int prefW = groupSeparators[controlPanelGroupIndex - 1]
                            .getPreferredSize().width;
                    int sepX = ltr ? x - gap + (gap - prefW) / 2 : x + gap / 2 - (gap - prefW) / 2;
                    groupSeparators[controlPanelGroupIndex - 1].setBounds(sepX, ins.top, prefW,
                            availableHeight);
                }

                boolean hasLeadingComponent = false;
                boolean isCoreContent = controlPanelGroup.isCoreContent();
                if (isCoreContent) {
                    // how much vertical space is available in each row?
                    int singleRowHeight = availableHeight / 3;

                    boolean hasTitle = (controlPanelGroup.getGroupTitle() != null);
                    int maxWidthInCurrColumn = 0;
                    if (hasTitle) {
                        JLabel titleLabel = groupLabels[controlPanelGroupIndex];
                        int pw = titleLabel.getPreferredSize().width;
                        int titleLabelHeight = Math.min(singleRowHeight - gap / 4,
                                titleLabel.getPreferredSize().height);
                        int yNudge = singleRowHeight - titleLabelHeight;
                        int baseline = (titleLabelHeight > 0)
                                ? titleLabel.getBaseline(pw, titleLabelHeight)
                                : 0;
                        if (ltr) {
                            titleLabel.setBounds(x + gap,
                                    ins.top + yNudge - titleLabelHeight + baseline, pw,
                                    titleLabelHeight);
                        } else {
                            titleLabel.setBounds(x - gap - pw,
                                    ins.top + yNudge - titleLabelHeight + baseline, pw,
                                    titleLabelHeight);
                        }
                        maxWidthInCurrColumn = gap + pw;
                    }
                    List<JRibbonComponent> ribbonComps = controlPanelGroup.getRibbonComps();
                    List<JRibbonComponent> currColumn = new ArrayList<>();

                    // if a group has a title, then the core components in that
                    // group will take two rows instead of three
                    int startingRow = hasTitle ? 1 : 0;
                    int rowIndex = startingRow;

                    for (int i = 0; i < ribbonComps.size(); i++) {
                        JRibbonComponent coreComp = ribbonComps.get(i);
                        int prefWidth = coreComp.getPreferredSize().width;
                        int rowSpan = 1;

                        // do we need to start a new column?
                        int nextRowIndex = rowIndex + rowSpan;
                        if (nextRowIndex > 3) {
                            if (ltr) {
                                if (hasLeadingComponent)
                                    x += gap;
                                x += maxWidthInCurrColumn;
                            } else {
                                if (hasLeadingComponent)
                                    x -= gap;
                                x -= maxWidthInCurrColumn;
                            }
                            hasLeadingComponent = true;
                            maxWidthInCurrColumn = 0;
                            rowIndex = startingRow;
                            currColumn.clear();
                        }

                        // how much vertical space does a component get?
                        int compHeight = Math.min(rowSpan * singleRowHeight - gap / 4,
                                coreComp.getPreferredSize().height);
                        int yNudge = rowSpan * singleRowHeight - compHeight;
                        int y = rowIndex * singleRowHeight + ins.top;

                        if (ltr) {
                            coreComp.setBounds(x, y + yNudge, prefWidth, compHeight);
                        } else {
                            coreComp.setBounds(x - prefWidth, y + yNudge, prefWidth, compHeight);
                        }
                        focusSequence.add(coreComp.getMainComponent());
                        maxWidthInCurrColumn = Math.max(maxWidthInCurrColumn, prefWidth);
                        currColumn.add(coreComp);

                        coreComp.putClientProperty(TOP_ROW,
                                Boolean.valueOf(rowIndex == 0));
                        coreComp.putClientProperty(MID_ROW,
                                Boolean.valueOf((rowIndex > 0) && (rowIndex < 2)));
                        coreComp.putClientProperty(BOTTOM_ROW,
                                Boolean.valueOf(rowIndex == 2));

                        // scan the components in this column and make them to
                        // have the same width as the widest component in this
                        // column
                        for (JRibbonComponent comp : currColumn) {
                            Rectangle bounds = comp.getBounds();
                            if (ltr) {
                                comp.setBounds(bounds.x, bounds.y, maxWidthInCurrColumn,
                                        bounds.height);
                            } else {
                                comp.setBounds(bounds.x + bounds.width - maxWidthInCurrColumn,
                                        bounds.y, maxWidthInCurrColumn, bounds.height);
                            }
                            comp.doLayout();
                        }

                        // System.out
                        // .println(rowSpan + ":" + coreComp.getBounds());

                        rowIndex += rowSpan;
                    }
                    if ((rowIndex > 0) && (rowIndex <= 3)) {
                        if (ltr) {
                            if (hasLeadingComponent)
                                x += gap;
                            x += maxWidthInCurrColumn;
                        } else {
                            if (hasLeadingComponent)
                                x -= gap;
                            x -= maxWidthInCurrColumn;
                        }
                        hasLeadingComponent = true;
                    }
                } else {
                    // The galleries
                    for (JRibbonBand.PresentationPriority elementPriority : JRibbonBand.PresentationPriority.values()) {
                        for (JRibbonGallery gallery :
                                controlPanelGroup.getRibbonGalleries(elementPriority)) {
                            int pw = gallery.getPreferredWidth(gallery.getPresentationPriority(),
                                    availableHeight);
                            if (ltr) {
                                gallery.setBounds(x, ins.top, pw, availableHeight);
                                if (hasLeadingComponent)
                                    x += gap;
                                x += pw;
                            } else {
                                gallery.setBounds(x - pw, ins.top, pw, availableHeight);
                                if (hasLeadingComponent)
                                    x -= gap;
                                x -= pw;
                            }
                            hasLeadingComponent = true;
                            for (int ci = 0; ci < gallery.getComponentCount(); ci++) {
                                Component child = gallery.getComponent(ci);
                                if (child instanceof JCommandButtonStrip) {
                                    JCommandButtonStrip strip = (JCommandButtonStrip) child;
                                    for (int si = 0; si < strip.getButtonCount(); si++) {
                                        focusSequence.add(strip.getButton(si));
                                    }
                                } else {
                                    focusSequence.add(child);
                                }
                            }
                        }
                    }

                    Map<CommandButtonPresentationState, List<JCommandButton>> buttonMap = new HashMap<>();
                    for (JRibbonBand.PresentationPriority elementPriority : JRibbonBand.PresentationPriority.values()) {
                        for (JCommandButton commandButton : controlPanelGroup
                                .getRibbonButtons(elementPriority)) {
                            CommandButtonPresentationState state = commandButton.getPresentationState();
                            if (buttonMap.get(state) == null) {
                                buttonMap.put(state, new ArrayList<>());
                            }
                            buttonMap.get(state).add(commandButton);
                        }
                    }

                    List<JCommandButton> bigs = buttonMap.get(CommandButtonPresentationState.BIG);
                    if (bigs != null) {
                        for (JCommandButton bigButton : bigs) {
                            // Big buttons
                            int bigButtonWidth = bigButton.getPreferredSize().width;
                            if (hasLeadingComponent) {
                                if (ltr) {
                                    x += gap;
                                } else {
                                    x -= gap;
                                }
                            }
                            if (ltr) {
                                bigButton.setBounds(x, ins.top, bigButtonWidth, availableHeight);
                            } else {
                                bigButton.setBounds(x - bigButtonWidth, ins.top, bigButtonWidth,
                                        availableHeight);
                            }
                            focusSequence.add(bigButton);
                            bigButton.putClientProperty(TOP_ROW, Boolean.FALSE);
                            bigButton.putClientProperty(MID_ROW, Boolean.FALSE);
                            bigButton.putClientProperty(BOTTOM_ROW, Boolean.FALSE);
                            if (ltr) {
                                x += bigButtonWidth;
                            } else {
                                x -= bigButtonWidth;
                            }
                            hasLeadingComponent = true;
                        }
                    }

                    // Medium buttons
                    int vGap = gap * 3 / 4;
                    int medSmallButtonHeight = (availableHeight - 2 * vGap) / 3;

                    int index3 = 0;
                    int maxWidth3 = 0;
                    List<JCommandButton> mediums = buttonMap
                            .get(CommandButtonPresentationState.MEDIUM);
                    if (mediums != null) {
                        for (JCommandButton mediumButton : mediums) {
                            int medWidth = mediumButton.getPreferredSize().width;
                            maxWidth3 = Math.max(maxWidth3, medWidth);

                            if (hasLeadingComponent && (index3 == 0)) {
                                if (ltr) {
                                    x += gap;
                                } else {
                                    x -= gap;
                                }
                            }
                            int buttonTop = (medSmallButtonHeight + vGap) * index3;
                            int buttonBottom = (medSmallButtonHeight + vGap) * (index3 + 1) - vGap;
                            if (ltr) {
                                mediumButton.setBounds(x, ins.top + buttonTop, medWidth,
                                        buttonBottom - buttonTop);
                            } else {
                                mediumButton.setBounds(x - medWidth, ins.top + buttonTop, medWidth,
                                        buttonBottom - buttonTop);
                            }
                            focusSequence.add(mediumButton);
                            mediumButton.putClientProperty(TOP_ROW, Boolean.valueOf(index3 == 0));
                            mediumButton.putClientProperty(MID_ROW, Boolean.valueOf(index3 == 1));
                            mediumButton.putClientProperty(BOTTOM_ROW,
                                    Boolean.valueOf(index3 == 2));

                            index3++;
                            if (index3 == 3) {
                                // last button in threesome
                                index3 = 0;
                                if (ltr) {
                                    x += maxWidth3;
                                } else {
                                    x -= maxWidth3;
                                }
                                hasLeadingComponent = true;
                                maxWidth3 = 0;
                            }
                        }
                    }
                    // at this point, maxWidth3 may be non-null. We can safely
                    // add it, since in this case there will be no buttons
                    // left in lowButtons
                    if (maxWidth3 > 0) {
                        if (ltr) {
                            x += maxWidth3;
                        } else {
                            x -= maxWidth3;
                        }
                        hasLeadingComponent = true;
                    }

                    index3 = 0;
                    maxWidth3 = 0;
                    List<JCommandButton> smalls = buttonMap
                            .get(CommandButtonPresentationState.SMALL);
                    if (smalls != null) {
                        for (JCommandButton smallButton : smalls) {
                            int lowWidth = smallButton.getPreferredSize().width;
                            maxWidth3 = Math.max(maxWidth3, lowWidth);
                            if (hasLeadingComponent && (index3 == 0)) {
                                if (ltr) {
                                    x += gap;
                                } else {
                                    x -= gap;
                                }
                            }
                            int buttonTop = (medSmallButtonHeight + vGap) * index3;
                            int buttonBottom = (medSmallButtonHeight + vGap) * (index3 + 1) - vGap;
                            if (ltr) {
                                smallButton.setBounds(x, ins.top + buttonTop, lowWidth,
                                        buttonBottom - buttonTop);
                            } else {
                                smallButton.setBounds(x - lowWidth, ins.top + buttonTop, lowWidth,
                                        buttonBottom - buttonTop);
                            }
                            focusSequence.add(smallButton);
                            smallButton.putClientProperty(TOP_ROW, Boolean.valueOf(index3 == 0));
                            smallButton.putClientProperty(MID_ROW, Boolean.valueOf(index3 == 1));
                            smallButton.putClientProperty(BOTTOM_ROW, Boolean.valueOf(index3 == 2));

                            index3++;
                            if (index3 == 3) {
                                // last button in threesome
                                index3 = 0;
                                if (ltr) {
                                    x += maxWidth3;
                                } else {
                                    x -= maxWidth3;
                                }
                                hasLeadingComponent = true;
                                maxWidth3 = 0;
                            }
                        }
                    }
                    if ((index3 < 3) && (maxWidth3 > 0)) {
                        if (ltr) {
                            x += maxWidth3;
                        } else {
                            x -= maxWidth3;
                        }
                        hasLeadingComponent = true;
                    }
                }
                // space for the separator
                if (ltr) {
                    x += gap * 3 / 2;
                } else {
                    x -= gap * 3 / 2;
                }
                controlPanelGroupIndex++;
            }
            c.setFocusTraversalPolicyProvider(true);
            c.setFocusTraversalPolicy(new SequentialFocusTraversalPolicy(focusSequence));
        }
    }
}
