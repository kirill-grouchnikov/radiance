package org.pushingpixels.radiance.demo.component.ribbon;

import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState;
import org.pushingpixels.radiance.component.api.common.model.*;
import org.pushingpixels.radiance.component.api.common.model.panel.MenuPopupPanelLayoutSpec;
import org.pushingpixels.radiance.component.api.common.popup.model.CommandPopupMenuPresentationModel;
import org.pushingpixels.radiance.component.api.common.projection.CommandButtonProjection;
import org.pushingpixels.radiance.component.api.common.projection.CommandStripProjection;
import org.pushingpixels.radiance.component.api.ribbon.*;
import org.pushingpixels.radiance.component.api.ribbon.model.RibbonApplicationMenuCommand;
import org.pushingpixels.radiance.component.api.ribbon.projection.RibbonApplicationMenuCommandButtonProjection;
import org.pushingpixels.radiance.component.api.ribbon.resize.CoreRibbonResizePolicies;
import org.pushingpixels.radiance.demo.component.svg.material.transcoded.*;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.skin.CeruleanSkin;
import org.pushingpixels.radiance.theming.api.skin.CremeCoffeeSkin;
import org.pushingpixels.radiance.theming.api.skin.TwilightSkin;

import javax.swing.*;
import java.awt.*;
import java.util.Collections;

public class SmallRibbon {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            RadianceThemingCortex.GlobalScope.setSkin(new TwilightSkin());

            JRibbonFrame frame = new JRibbonFrame("Menu Application Test");

            Command start = Command.builder().setIconFactory(skip_previous.factory())
                    .setText("Start").build();
            Command rwd = Command.builder().setIconFactory(fast_rewind.factory())
                    .setText("Rewind").build();
            Command play = Command.builder().setToggle().setIconFactory(play_arrow.factory())
                    .setText("Play").build();
            Command fwd = Command.builder().setIconFactory(fast_forward.factory())
                    .setText("Forward").build();
            Command end = Command.builder().setIconFactory(skip_next.factory())
                    .setText("End").build();

            CommandGroup commandGroup = new CommandGroup(start, rwd, play, fwd, end);
            CommandMenuContentModel popupMenuContentModel = new CommandMenuContentModel(commandGroup);


            CommandPopupMenuPanelPresentationModel popupMenuPanelPresentationModel =
                    CommandPopupMenuPanelPresentationModel.builder()
                            .setIconFilterStrategies(
                                    RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                                    RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                                    RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT)
                            .setLayoutSpec(new MenuPopupPanelLayoutSpec(2, 5))
                            .setCommandPresentationState(CommandButtonPresentationState.BIG).build();
            CommandPopupMenuPresentationModel popupMenuPresentationModel =
                    CommandPopupMenuPresentationModel.builder()
                            .setItemFilterStrategies(
                                    RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                                    RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                                    RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT)
                            .setPanelPresentationModel(popupMenuPanelPresentationModel).build();

            CommandButtonProjection<Command> popupProjection =
                    Command.builder().setText("Popup")
                            .setIconFactory(play_arrow.factory())
                            .setSecondaryContentModel(popupMenuContentModel)
                            .build().project(
                                    CommandButtonPresentationModel.builder()
                                            .setPresentationState(CommandButtonPresentationState.BIG)
                                            .setIconFilterStrategies(
                                                    RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                                                    RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                                                    RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT)
                                            .setPopupMenuPresentationModel(popupMenuPresentationModel).build());
            JRibbonBand popupTestBand = new JRibbonBand("Pop", play_arrow.factory());
            popupTestBand.addRibbonCommand(popupProjection, JRibbonBand.PresentationPriority.TOP);

            popupTestBand.setResizePolicies(Collections.singletonList(
                    new CoreRibbonResizePolicies.Mirror(popupTestBand)));
            frame.getRibbon().addTask(new RibbonTask("Popup", popupTestBand));

            CommandStripProjection stripProjection =
                    new CommandStripProjection(commandGroup,
                            CommandStripPresentationModel.builder()
                                    .setIconFilterStrategies(
                                            RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                                            RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                                            RadianceThemingSlices.IconFilterStrategy.ORIGINAL)
                                    .setHorizontalGapScaleFactor(1.3f)
                                    .setCommandPresentationState(CommandButtonPresentationState.SMALL)
                                    .build());
            JFlowRibbonBand flowRibbonBand = new JFlowRibbonBand("Commands", play_arrow.factory());
            flowRibbonBand.addFlowComponent(stripProjection);
            frame.getRibbon().addTask(new RibbonTask("Command Strip", flowRibbonBand));


            RibbonApplicationMenu ribbonApplicationMenu = new RibbonApplicationMenu(commandGroup);
            RibbonApplicationMenuCommand menuCommand =
                    RibbonApplicationMenuCommand.builder()
                            .setIconFactory(play_arrow.factory()).setText("Play")
                            .setSecondaryContentModel(ribbonApplicationMenu).build();

            RibbonApplicationMenuCommandButtonProjection ribbonApplicationMenuCommandButtonProjection =
                    new RibbonApplicationMenuCommandButtonProjection(menuCommand,
                            CommandButtonPresentationModel.builder()
                                    .setIconFilterStrategies(
                                            RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                                            RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                                            RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT)
                                    .setPopupMenuPresentationModel(popupMenuPresentationModel).build());
            frame.getRibbon().setApplicationMenuCommand(ribbonApplicationMenuCommandButtonProjection);

            JPanel contentPanel = new JPanel(new BorderLayout());
            contentPanel.add(new JLabel("TESTING"), BorderLayout.CENTER);

            frame.getContentPane().add(contentPanel);

            frame.setSize(800, 600);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setVisible(true);

        });
    }
}
