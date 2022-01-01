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
package org.pushingpixels.radiance.demo.component.bcb;

import org.pushingpixels.radiance.component.api.bcb.BreadcrumbItem;
import org.pushingpixels.radiance.component.api.bcb.core.BreadcrumbFileSelector;
import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState;
import org.pushingpixels.radiance.demo.component.ExplorerFileViewPanel;
import org.pushingpixels.radiance.demo.component.svg.logo.RadianceLogo;
import org.pushingpixels.radiance.demo.theming.main.check.selector.RadianceSkinSelector;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.combo.WidestComboPopupPrototype;
import org.pushingpixels.radiance.theming.api.skin.BusinessSkin;
import org.pushingpixels.radiance.theming.api.skin.SkinInfo;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.List;

public class BreadCrumbTest extends JFrame {
    protected BreadcrumbFileSelector bar;

    private ExplorerFileViewPanel<File> filePanel;

    private BreadCrumbTest() {
        super("BreadCrumb test");

        this.bar = new BreadcrumbFileSelector();
        this.bar.getModel().addPathListener(
                event -> SwingUtilities.invokeLater(() -> {
                    final List<BreadcrumbItem<File>> newPath = event.getSource().getItems();
                    System.out.println("New path is ");
                    for (BreadcrumbItem<File> item : newPath) {
                        System.out.println("\t" + item.getData().getAbsolutePath());
                    }

                    if (newPath.size() > 0) {
                        SwingWorker<List<BreadcrumbItem<File>>, Void> worker = new SwingWorker<>() {
                            @Override
                            protected List<BreadcrumbItem<File>> doInBackground() {
                                return bar.getContentProvider().getLeaves(newPath);
                            }

                            @Override
                            protected void done() {
                                try {
                                    List<BreadcrumbItem<File>> leaves = get();
                                    filePanel.setFolder(leaves);
                                } catch (Exception exc) {
                                }
                            }
                        };
                        worker.execute();
                    }
                }));

        this.setLayout(new BorderLayout());
        RadianceThemingCortex.ComponentOrParentChainScope.setDecorationType(bar,
                RadianceThemingSlices.DecorationAreaType.HEADER);
        this.add(bar, BorderLayout.NORTH);

        this.filePanel = new ExplorerFileViewPanel<>(bar, CommandButtonPresentationState.MEDIUM);
        JScrollPane fileListScrollPane = new JScrollPane(this.filePanel);
        this.add(fileListScrollPane, BorderLayout.CENTER);

        JPanel controls = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        RadianceThemingCortex.ComponentOrParentChainScope.setDecorationType(controls,
                RadianceThemingSlices.DecorationAreaType.FOOTER);

        RadianceSkinSelector skinSelector = new RadianceSkinSelector();
        RadianceThemingCortex.ComponentScope.setComboBoxPopupFlyoutOrientation(skinSelector,
                SwingUtilities.NORTH);
        RadianceThemingCortex.ComponentScope.setComboBoxPrototypeCallback(skinSelector,
                new WidestComboPopupPrototype<SkinInfo>());
        skinSelector.setToolTipText("Radiance skin");
        controls.add(skinSelector);

        JButton setPath = new JButton("Select and set path...");
        setPath.addActionListener(actionEvent -> SwingUtilities.invokeLater(() -> {
            JFileChooser folderChooser = new JFileChooser();
            folderChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            if (folderChooser.showOpenDialog(BreadCrumbTest.this) == JFileChooser.APPROVE_OPTION) {
                File selected = folderChooser.getSelectedFile();
                bar.setPath(selected);
            }
        }));
        controls.add(setPath);
        this.add(controls, BorderLayout.SOUTH);
    }

    /**
     * Main method for testing.
     *
     * @param args Ignored.
     */
    public static void main(String... args) {
        SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            RadianceThemingCortex.GlobalScope.setSkin(new BusinessSkin());

            BreadCrumbTest test = new BreadCrumbTest();
            test.setIconImage(RadianceLogo.getLogoImage(test,
                    RadianceThemingCortex.GlobalScope.getCurrentSkin().getColorScheme(
                            RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                            RadianceThemingSlices.ColorSchemeAssociationKind.FILL,
                            ComponentState.ENABLED)));
            RadianceThemingCortex.GlobalScope.registerSkinChangeListener(() -> SwingUtilities.invokeLater(
                    () -> test.setIconImage(RadianceLogo.getLogoImage(test,
                            RadianceThemingCortex.ComponentScope.getCurrentSkin(test.getRootPane())
                                    .getColorScheme(RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                                            RadianceThemingSlices.ColorSchemeAssociationKind.FILL, ComponentState.ENABLED)))));
            test.setSize(550, 385);
            test.setLocationRelativeTo(null);
            test.setVisible(true);
            test.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        });
    }
}
