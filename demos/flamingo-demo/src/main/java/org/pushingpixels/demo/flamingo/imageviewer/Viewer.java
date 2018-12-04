package org.pushingpixels.demo.flamingo.imageviewer;

import org.pushingpixels.demo.flamingo.svg.logo.RadianceLogo;
import org.pushingpixels.flamingo.api.bcb.*;
import org.pushingpixels.flamingo.api.bcb.core.BreadcrumbFileSelector;
import org.pushingpixels.flamingo.api.common.*;
import org.pushingpixels.flamingo.api.common.icon.ImageWrapperResizableIcon;
import org.pushingpixels.neon.icon.ResizableIcon;
import org.pushingpixels.substance.api.*;
import org.pushingpixels.substance.api.skin.BusinessSkin;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import java.awt.*;
import java.io.*;
import java.util.List;

public class Viewer extends JFrame {
    private BreadcrumbFileSelector bar;

    private AbstractFileViewPanel fileViewPanel;

    private JSlider iconSizeSlider;

    private Viewer() {
        super("Image Viewer");
        this.setIconImage(RadianceLogo.getLogoImage(
                SubstanceCortex.GlobalScope.getCurrentSkin().getColorScheme(
                        SubstanceSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                        SubstanceSlices.ColorSchemeAssociationKind.FILL,
                        ComponentState.ENABLED)));

        this.bar = new BreadcrumbFileSelector();

        this.bar.getModel()
                .addPathListener(
                        (BreadcrumbPathEvent<File> event) -> SwingUtilities.invokeLater(() -> {
                            final List<BreadcrumbItem<File>> newPath = event.getSource().getItems();
                            System.out.println("New path is ");
                            for (BreadcrumbItem<File> item : newPath) {
                                // String[] values = item.getValue();
                                System.out.println("\t" + item.getData().getAbsolutePath());
                            }

                            if (newPath.size() > 0) {
                                SwingWorker<List<StringValuePair<File>>, Void> worker = new
                                        SwingWorker<List<StringValuePair<File>>, Void>() {
                                            @Override
                                            protected List<StringValuePair<File>> doInBackground() {
                                                return bar.getCallback().getLeafs(newPath);
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
        this.fileViewPanel = new AbstractFileViewPanel<File>(64) {
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
            protected ResizableIcon getResizableIcon(AbstractFileViewPanel.Leaf leaf,
                    InputStream stream, CommandButtonPresentationState state, Dimension dimension) {
                int prefSize = state.getPreferredIconSize();
                if (prefSize > 0) {
                    dimension = new Dimension(prefSize, prefSize);
                }
                return ImageWrapperResizableIcon.getIcon(stream, dimension);
            }

            @Override
            protected boolean toShowFile(StringValuePair<File> pair) {
                String name = pair.getKey().toLowerCase();
                return name.endsWith(".jpeg") || name.endsWith(".jpg") || name.endsWith(".gif")
                        || name.endsWith(".png") || name.endsWith(".bmp");

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
        this.iconSizeSlider.addChangeListener((ChangeEvent e) -> {
            if (!iconSizeSlider.getModel().getValueIsAdjusting()) {
                if (iconSizeSlider.getValue() !=
                        fileViewPanel.getPresentationModel().getCommandIconDimension()) {
                    SwingUtilities.invokeLater(() ->
                            fileViewPanel.getPresentationModel().setCommandIconDimension(
                                    iconSizeSlider.getValue()));
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
            SubstanceCortex.GlobalScope.setSkin(new BusinessSkin());

            Viewer test = new Viewer();
            test.setSize(400, 400);
            test.setLocationRelativeTo(null);
            test.setVisible(true);
            test.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        });
    }
}
