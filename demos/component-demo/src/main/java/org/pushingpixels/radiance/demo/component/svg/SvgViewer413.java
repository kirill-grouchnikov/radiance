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
package org.pushingpixels.radiance.demo.component.svg;

import org.pushingpixels.radiance.component.api.bcb.BreadcrumbItem;
import org.pushingpixels.radiance.component.api.bcb.core.BreadcrumbFileSelector;
import org.pushingpixels.radiance.demo.component.svg.logo.RadianceLogo;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.AnimationFacet;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.skin.BusinessSkin;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.io.File;
import java.util.List;
import java.util.logging.Logger;

/**
 * SVG viewer application.
 * Reproducing issue https://github.com/kirill-grouchnikov/radiance/issues/413
 *
 * @author Kirill Grouchnikov
 * @author EUG https://github.com/homebeaver (issue 413)
 */
@SuppressWarnings("serial")
public class SvgViewer413 extends JFrame {
	
	private static final Logger LOG = Logger.getLogger(SvgViewer413.class.getName());

    /**
     * Breadcrumb bar for navigating the local hard disk.
     */
    private BreadcrumbFileSelector bar;

    /**
     * Panel with SVG icons.
     */
    private SvgFileViewPanel svgFileViewPanel;

    /**
     * Slider to resize the SVG icons.
     */
    private JSlider iconSizeSlider;

    /**
     * Current icon size.
     */
    private int currIconSize;

    /**
     * Creates a new SVG viewer application.
     */
    public SvgViewer413() {
        super("SVG File Viewer");
        this.setIconImage(RadianceLogo.getLogoImage(this,
                RadianceThemingCortex.GlobalScope.getCurrentSkin().getColorScheme(
                RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                RadianceThemingSlices.ColorSchemeAssociationKind.FILL,
                        ComponentState.ENABLED)));

        this.bar = new BreadcrumbFileSelector();

//        String dir = this.getClass().getPackageName().replace('.', '/')+'/';
//        String pathPrefix = "bin/main/";
//        File path = new File(pathPrefix+dir); //+"resources/");
//        if (!path.exists()) {
//        	LOG.warning("NOT existing path:"+path);
//        }
//        LOG.info("starting with AbsolutePath="+path.getAbsolutePath());
//        bar.setPath(path);
        this.bar.getContentModel()
                .addPathListener(event -> SwingUtilities.invokeLater(() -> {
                    final List<BreadcrumbItem<File>> newPath = event.getSource().getItems();
                    svgFileViewPanel.cancelMainWorker();
                    System.out.println("New path is ");
                    for (BreadcrumbItem<File> item : newPath) {
                        System.out.println("\t" + FileSystemView.getFileSystemView()
                                .getSystemDisplayName(item.getData()));
                    }

                    if (newPath.size() > 0) {
                        SwingWorker<List<BreadcrumbItem<File>>, Void> worker = new
                                SwingWorker<>() {
                            @Override
                            protected List<BreadcrumbItem<File>> doInBackground() {
                                return bar.getContentProvider().getLeaves(newPath);
                            }

                            @Override
                            protected void done() {
                                try {
                                    svgFileViewPanel.setFolder(get());
                                    svgFileViewPanel.setIconDimension(currIconSize);
                                } catch (Exception exc) {
                                    exc.printStackTrace();
                                }
                            }
                        };
                        worker.execute();
                    }
                }));

        this.setLayout(new BorderLayout());
        this.add(bar, BorderLayout.NORTH);

        int initialSize = 32;
        this.svgFileViewPanel = new SvgFileViewPanel(bar.getContentProvider(), initialSize);
        JScrollPane jsp = new JScrollPane(this.svgFileViewPanel,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        this.add(jsp, BorderLayout.CENTER);

        this.iconSizeSlider = new JSlider();
        this.iconSizeSlider.setMinimum(16);
        this.iconSizeSlider.setMaximum(128);
        this.iconSizeSlider.setSnapToTicks(true);
        this.iconSizeSlider.setPaintLabels(true);
        this.iconSizeSlider.setPaintTicks(true);
        this.iconSizeSlider.setMajorTickSpacing(32);
        this.iconSizeSlider.setMinorTickSpacing(8);
        this.iconSizeSlider.setValue(initialSize);
        this.currIconSize = initialSize;
        this.iconSizeSlider.addChangeListener(changeEvent -> {
            if (!iconSizeSlider.getModel().getValueIsAdjusting()) {
                int newValue = iconSizeSlider.getValue();
                if (newValue != currIconSize) {
                    currIconSize = newValue;
                    LOG.info("currIconSize newValue="+newValue);
                    SwingUtilities
                            .invokeLater(() -> svgFileViewPanel.setIconDimension(currIconSize));
                }
            }
        });
        this.add(this.iconSizeSlider, BorderLayout.SOUTH);
    }

    /**
     * The main method to run the SVG viewer.
     *
     * @param args Ignored.
     */
    public static void main(String... args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        AnimationFacet facet = RadianceThemingSlices.AnimationFacet.GHOSTING_ICON_ROLLOVER;
        LOG.info("setDefaultLookAndFeelDecorated to true, Allows animations of GHOSTING_ICON_ROLLOVER facet:"+facet);
        RadianceThemingCortex.GlobalScope.allowAnimations(facet);

        SwingUtilities.invokeLater(() -> {
            RadianceThemingCortex.GlobalScope.setSkin(new BusinessSkin());
            SvgViewer413 test = new SvgViewer413();
            test.setSize(640, 480);
            test.setLocationRelativeTo(null);
            test.setVisible(true);
            test.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        });
    }
}
