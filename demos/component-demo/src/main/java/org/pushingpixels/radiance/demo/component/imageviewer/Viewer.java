package org.pushingpixels.radiance.demo.component.imageviewer;

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.component.api.bcb.BreadcrumbItem;
import org.pushingpixels.radiance.component.api.bcb.core.BreadcrumbFileSelector;
import org.pushingpixels.radiance.component.api.common.AbstractFileViewPanel;
import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState;
import org.pushingpixels.radiance.demo.component.icon.ImageWrapperRadianceIcon;
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

public class Viewer extends JFrame {
    private BreadcrumbFileSelector bar;

    private AbstractFileViewPanel<File> fileViewPanel;

    private JSlider iconSizeSlider;

    private Viewer() {
        super("Image Viewer");
        this.setIconImage(RadianceLogo.getLogoImage(this,
                RadianceThemingCortex.GlobalScope.getCurrentSkin().getColorScheme(
                        RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                        RadianceThemingSlices.ColorSchemeAssociationKind.FILL,
                        ComponentState.ENABLED)));

        this.bar = new BreadcrumbFileSelector();

        this.bar.getContentModel().addPathListener(
                event -> SwingUtilities.invokeLater(() -> {
                    final List<BreadcrumbItem<File>> newPath = event.getSource().getItems();
                    System.out.println("New path is ");
                    for (BreadcrumbItem<File> item : newPath) {
                        // String[] values = item.getValue();
                        System.out.println("\t" + item.getData().getAbsolutePath());
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

        int initialSize = 100;
        this.fileViewPanel = new AbstractFileViewPanel<>(64) {
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
                return ImageWrapperRadianceIcon.getIcon(stream, dimension);
            }

            @Override
            protected boolean toShowFile(BreadcrumbItem<File> item) {
                String fileName = item.getData().getName().toLowerCase();
                return fileName.endsWith(".jpeg") || fileName.endsWith(".jpg")
                        || fileName.endsWith(".gif") || fileName.endsWith(".png")
                        || fileName.endsWith(".bmp");

            }
        };

        JScrollPane jsp = new JScrollPane(this.fileViewPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        this.add(jsp, BorderLayout.CENTER);

        this.iconSizeSlider = new JSlider();
        this.iconSizeSlider.setMinimum(50);
        this.iconSizeSlider.setMaximum(200);
        this.iconSizeSlider.setSnapToTicks(true);
        this.iconSizeSlider.setPaintLabels(true);
        this.iconSizeSlider.setPaintTicks(true);
        this.iconSizeSlider.setMajorTickSpacing(50);
        this.iconSizeSlider.setMinorTickSpacing(10);
        this.iconSizeSlider.setValue(initialSize);
        this.iconSizeSlider.addChangeListener(changeEvent -> {
            if (!iconSizeSlider.getModel().getValueIsAdjusting()) {
                if (iconSizeSlider.getValue() != fileViewPanel.getProjection()
                        .getPresentationModel().getCommandIconDimension()) {
                    SwingUtilities.invokeLater(() ->
                            fileViewPanel.getProjection().getPresentationModel()
                                    .setCommandIconDimension(iconSizeSlider.getValue()));
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

            Viewer test = new Viewer();
            test.setSize(400, 400);
            test.setLocationRelativeTo(null);
            test.setVisible(true);
            test.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        });
    }
}
