package org.pushingpixels.radiance.demo.component.imageviewer;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.component.api.bcb.BreadcrumbItem;
import org.pushingpixels.radiance.component.api.bcb.core.BreadcrumbFileSelector;
import org.pushingpixels.radiance.component.api.common.AbstractFileViewPanel;
import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState;
import org.pushingpixels.radiance.demo.component.icon.IcoWrapperRadianceIcon;
import org.pushingpixels.radiance.demo.component.svg.logo.RadianceLogo;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.skin.BusinessSkin;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

public class IcoViewer extends JFrame {
    private BreadcrumbFileSelector bar;

    private AbstractFileViewPanel<File> fileViewPanel;

    private JSlider iconSizeSlider;

    private int currIconSize;

    private IcoViewer() {
        super("ICO Viewer");
        this.setIconImage(RadianceLogo.getLogoImage(this,
                RadianceThemingCortex.GlobalScope.getCurrentSkin().getColorScheme(
                        RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                        RadianceThemingSlices.ColorSchemeAssociationKind.FILL,
                        ComponentState.ENABLED)));

        this.bar = new BreadcrumbFileSelector();

        this.bar.getContentModel()
                .addPathListener(
                        event -> SwingUtilities.invokeLater(() -> {
                            final List<BreadcrumbItem<File>> newPath = event.getSource().getItems();
                            System.out.println("New path is ");
                            for (BreadcrumbItem<File> item : newPath) {
                                // String[] values = item.getValue();
                                System.out.println("\t" + item.getData().getAbsolutePath());
                            }

                            if (!newPath.isEmpty()) {
                                SwingWorker<List<BreadcrumbItem<File>>, Void> worker = new
                                        SwingWorker<>() {
                                            @Override
                                            protected List<BreadcrumbItem<File>> doInBackground() {
                                                return bar.getContentProvider().getLeaves(newPath);
                                            }

                                            @Override
                                            protected void done() {
                                                try {
                                                    fileViewPanel.setFolder(get());
                                                } catch (Exception exc) {
                                                }
                                            }
                                        };
                                worker.execute();
                            }
                        }));

        this.setLayout(new BorderLayout());
        this.add(bar, BorderLayout.NORTH);

        int initialSize = 32;
        this.fileViewPanel = new AbstractFileViewPanel<>(new Dimension(32, 32)) {
            @Override
            protected InputStream getLeafContent(File leaf) {
                try {
                    return new FileInputStream(leaf);
                } catch (Exception exc) {
                    exc.printStackTrace();
                    return null;
                }
            }

            @Override
            protected RadianceIcon getRadianceIcon(AbstractFileViewPanel.Leaf leaf,
                    InputStream stream, CommandButtonPresentationState state, Dimension dimension) {
                int prefSize = state.getPreferredIconSize();
                if (prefSize > 0) {
                    dimension = new Dimension(prefSize, prefSize);
                }
                return IcoWrapperRadianceIcon.getIcon(stream,
                        RadianceCommonCortex.getScaleFactor(fileViewPanel), dimension);
            }

            @Override
            protected boolean toShowFile(BreadcrumbItem<File> item) {
                return item.getData().getName().endsWith(".ico");
            }
        };

        JScrollPane jsp = new JScrollPane(this.fileViewPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        this.add(jsp, BorderLayout.CENTER);

        this.iconSizeSlider = new JSlider();
        this.iconSizeSlider.setMinimum(16);
        this.iconSizeSlider.setMaximum(256);
        this.iconSizeSlider.setSnapToTicks(true);
        this.iconSizeSlider.setPaintLabels(true);
        this.iconSizeSlider.setPaintTicks(true);
        this.iconSizeSlider.setMajorTickSpacing(64);
        this.iconSizeSlider.setMinorTickSpacing(16);
        this.iconSizeSlider.setValue(initialSize);
        this.currIconSize = initialSize;
        this.iconSizeSlider.addChangeListener(changeEvent -> {
            if (!iconSizeSlider.getModel().getValueIsAdjusting()) {
                int newValue = iconSizeSlider.getValue();
                if (newValue != currIconSize) {
                    currIconSize = newValue;
                    SwingUtilities.invokeLater(() -> {
                        fileViewPanel.getProjection().getPresentationModel()
                                .setCommandIconDimension(new Dimension(currIconSize, currIconSize));
                        invalidate();
                        doLayout();
                    });
                }
            }
        });
        this.add(this.iconSizeSlider, BorderLayout.SOUTH);
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

            IcoViewer test = new IcoViewer();
            test.setSize(800, 650);
            test.setLocationRelativeTo(null);
            test.setVisible(true);
            test.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        });
    }
}
