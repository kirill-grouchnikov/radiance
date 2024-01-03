/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.component.internal.ui.common;

import org.pushingpixels.radiance.component.api.common.CommandAction;
import org.pushingpixels.radiance.component.api.common.JCommandButton;
import org.pushingpixels.radiance.component.api.common.JCommandButtonStrip;
import org.pushingpixels.radiance.component.api.common.model.Command;
import org.pushingpixels.radiance.component.api.common.model.CommandButtonPresentationModel;
import org.pushingpixels.radiance.component.api.common.model.CommandGroup;
import org.pushingpixels.radiance.component.api.common.model.CommandStripPresentationModel;
import org.pushingpixels.radiance.component.api.common.projection.CommandButtonProjection;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ComponentUI;
import java.awt.*;
import java.util.List;
import java.util.*;

/**
 * Basic UI for button strip {@link JCommandButtonStrip}.
 *
 * @author Kirill Grouchnikov
 */
public class BasicCommandButtonStripUI extends CommandButtonStripUI {
    /**
     * The associated button strip.
     */
    private JCommandButtonStrip buttonStrip;

    private CommandGroup.CommandGroupListener commandGroupListener;

    private Map<Command, JCommandButton> commandButtonMap = new HashMap<>();

    public static ComponentUI createUI(JComponent c) {
        return new BasicCommandButtonStripUI();
    }

    @Override
    public void installUI(JComponent c) {
        this.buttonStrip = (JCommandButtonStrip) c;
        installDefaults();
        installComponents();
        installListeners();
    }

    @Override
    public void uninstallUI(JComponent c) {
        uninstallListeners();
        uninstallComponents();
        uninstallDefaults();

        c.setLayout(null);

        this.buttonStrip = null;
    }

    /**
     * Installs listeners on the associated button strip.
     */
    protected void installListeners() {
        this.commandGroupListener = new CommandGroup.CommandGroupListener() {
            private void resync() {
                buttonStrip.removeAll();
                commandButtonMap.clear();
                syncButtons();
            }

            @Override
            public void onCommandAdded(Command command) {
                resync();
            }

            @Override
            public void onCommandRemoved(Command command) {
                resync();
            }

            @Override
            public void onAllCommandsRemoved(List<Command> commands) {
                resync();
            }
        };
        this.buttonStrip.getProjection().getContentModel().addCommandGroupListener(this.commandGroupListener);
    }

    /**
     * Uninstalls listeners from the associated button strip.
     */
    protected void uninstallListeners() {
        this.buttonStrip.getProjection().getContentModel().removeCommandGroupListener(
                this.commandGroupListener);
        this.commandGroupListener = null;
    }

    /**
     * Installs defaults on the associated button strip.
     */
    protected void installDefaults() {
        this.buttonStrip.setBorder(new EmptyBorder(0, 0, 0, 0));
    }

    /**
     * Uninstalls defaults from the associated button strip.
     */
    protected void uninstallDefaults() {
    }

    /**
     * Installs subcomponents on the associated button strip.
     */
    protected void installComponents() {
        this.buttonStrip.setLayout(createLayoutManager());

        syncButtons();
    }

    /**
     * Uninstalls subcomponents from the associated ribbon.
     */
    protected void uninstallComponents() {
        CommandGroup commandGroupModel = this.buttonStrip.getProjection().getContentModel();
        for (Command command : commandGroupModel.getCommands()) {
            JCommandButton commandButton = commandButtonMap.get(command);
            CommandAction commandListener = command.getAction();
            if (commandListener != null) {
                commandButton.removeCommandListener(commandListener);
            }
            this.buttonStrip.remove(commandButton);
        }
        this.commandButtonMap.clear();
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    private void syncButtons() {
        CommandStripPresentationModel stripPresentationModel =
                this.buttonStrip.getProjection().getPresentationModel();
        boolean isHorizontal = (this.buttonStrip.getProjection().getPresentationModel().getOrientation() ==
                CommandStripPresentationModel.StripOrientation.HORIZONTAL);
        RadianceThemingSlices.Side leadingSide = isHorizontal ? RadianceThemingSlices.Side.LEADING
                : RadianceThemingSlices.Side.TOP;
        RadianceThemingSlices.Side trailingSide = isHorizontal ? RadianceThemingSlices.Side.TRAILING
                : RadianceThemingSlices.Side.BOTTOM;

        CommandGroup commandGroupModel = this.buttonStrip.getProjection().getContentModel();
        List<Command> commands = commandGroupModel.getCommands();
        int commandCount = commands.size();
        for (int i = 0; i < commandCount; i++) {
            Command command = commands.get(i);

            Set<RadianceThemingSlices.Side> straightSides = new HashSet<>();
            if (commandCount > 1) {
                if (i == 0) {
                    straightSides.add(trailingSide);
                } else if (i == (commandCount - 1)) {
                    straightSides.add(leadingSide);
                } else {
                    straightSides.add(leadingSide);
                    straightSides.add(trailingSide);
                }
            }

            Set<RadianceThemingSlices.Side> openSides = new HashSet<>();
            if ((commandCount > 1) && (i > 0)) {
                openSides.add(leadingSide);
            }

            CommandButtonPresentationModel presentation = CommandButtonPresentationModel.builder()
                    .setPresentationState(stripPresentationModel.getCommandPresentationState())
                    .setContentPadding(stripPresentationModel.getCommandContentPadding())
                    .setSides(RadianceThemingSlices.Sides.builder()
                            .setOpenSides(openSides)
                            .setStraightSides(straightSides).build())
                    .setIconFilterStrategies(
                            stripPresentationModel.getActiveIconFilterStrategy(),
                            stripPresentationModel.getEnabledIconFilterStrategy(),
                            stripPresentationModel.getDisabledIconFilterStrategy())
                    .setHorizontalGapScaleFactor(
                            stripPresentationModel.getHorizontalGapScaleFactor())
                    .setVerticalGapScaleFactor(
                            stripPresentationModel.getVerticalGapScaleFactor())
                    .setBackgroundAppearanceStrategy(
                            stripPresentationModel.getBackgroundAppearanceStrategy())
                    .setFocusable(stripPresentationModel.isFocusable())
                    .setToDismissPopupsOnActivation(
                            stripPresentationModel.isToDismissPopupsOnActivation())
                    .build();
            CommandButtonPresentationModel.Overlay extraOverlay =
                    this.buttonStrip.getProjection().getCommandOverlays().get(command);
            if (extraOverlay != null) {
                presentation = presentation.overlayWith(extraOverlay);
            }

            CommandButtonProjection<Command> commandProjection = command.project(presentation);
            JCommandButton button = commandProjection.buildComponent();
            button.setComponentOrientation(this.buttonStrip.getComponentOrientation());

            this.buttonStrip.add(button);
            this.commandButtonMap.put(command, button);
        }
    }

    @Override
    public List<JComponent> getFocusSequence() {
        List<JComponent> result = new ArrayList<>();
        for (int i = 0; i < this.buttonStrip.getComponentCount(); i++) {
            result.add((JCommandButton ) this.buttonStrip.getComponent(i));
        }
        return result;
    }

    /**
     * Invoked by <code>installUI</code> to create a layout manager object to manage the
     * {@link JCommandButtonStrip}.
     *
     * @return a layout manager object
     */
    protected LayoutManager createLayoutManager() {
        return new ButtonStripLayout();
    }

    /**
     * Layout for the button strip.
     *
     * @author Kirill Grouchnikov
     */
    private class ButtonStripLayout implements LayoutManager {
        @Override
        public void addLayoutComponent(String name, Component c) {
        }

        @Override
        public void removeLayoutComponent(Component c) {
        }

        @Override
        public Dimension preferredLayoutSize(Container c) {
            int width = 0;
            int height = 0;
            if (buttonStrip.getProjection().getPresentationModel().getOrientation() ==
                    CommandStripPresentationModel.StripOrientation.HORIZONTAL) {
                for (int i = 0; i < buttonStrip.getComponentCount(); i++) {
                    width += buttonStrip.getComponent(i).getPreferredSize().width;
                    height = Math.max(height, buttonStrip.getComponent(i).getPreferredSize().height);
                }
            } else {
                for (int i = 0; i < buttonStrip.getComponentCount(); i++) {
                    height += buttonStrip.getComponent(i).getPreferredSize().height;
                    width = Math.max(width, buttonStrip.getComponent(i).getPreferredSize().width);
                }
            }
            Insets ins = c.getInsets();
            // System.out.println(ins + ":" + width + ":" + height);
            return new Dimension(width + ins.left + ins.right, height + ins.top + ins.bottom);
        }

        @Override
        public Dimension minimumLayoutSize(Container c) {
            return this.preferredLayoutSize(c);
        }

        @Override
        public void layoutContainer(Container c) {
            int buttonCount = buttonStrip.getComponentCount();

            if (buttonCount == 0) {
                return;
            }

            Insets ins = c.getInsets();
            int height = c.getHeight() - ins.top - ins.bottom;
            int width = c.getWidth() - ins.left - ins.right;
            if (buttonStrip.getProjection().getPresentationModel().getOrientation() ==
                    CommandStripPresentationModel.StripOrientation.HORIZONTAL) {
                int totalPreferredWidth = 0;
                for (int i = 0; i < buttonCount; i++) {
                    Component currButton = buttonStrip.getComponent(i);
                    totalPreferredWidth += currButton.getPreferredSize().width;
                }
                int deltaX = (width - totalPreferredWidth) / buttonCount;
                if (buttonStrip.getComponentOrientation().isLeftToRight()) {
                    int x = ins.left;
                    for (int i = 0; i < buttonCount; i++) {
                        Component currButton = buttonStrip.getComponent(i);
                        currButton.setBounds(x, ins.top,
                                currButton.getPreferredSize().width + deltaX, height);
                        x += (currButton.getPreferredSize().width + deltaX);
                    }
                } else {
                    int x = c.getWidth() - ins.right;
                    for (int i = 0; i < buttonCount; i++) {
                        Component currButton = buttonStrip.getComponent(i);
                        int buttonWidth = currButton.getPreferredSize().width + deltaX;
                        currButton.setBounds(x - buttonWidth, ins.top, buttonWidth, height);
                        x -= buttonWidth;
                    }
                }
            } else {
                int totalPreferredHeight = 0;
                for (int i = 0; i < buttonCount; i++) {
                    Component currButton = buttonStrip.getComponent(i);
                    totalPreferredHeight += currButton.getPreferredSize().height;
                }
                float deltaY = (float) (height - totalPreferredHeight)
                        / (float) buttonCount;
                float y = ins.top;
                for (int i = 0; i < buttonCount; i++) {
                    Component currButton = buttonStrip.getComponent(i);
                    float buttonHeight = (currButton.getPreferredSize().height + deltaY);
                    currButton.setBounds(ins.left, (int) y, width, (int) Math.ceil(buttonHeight));
                    y += buttonHeight;
                }
            }
        }
    }
}
