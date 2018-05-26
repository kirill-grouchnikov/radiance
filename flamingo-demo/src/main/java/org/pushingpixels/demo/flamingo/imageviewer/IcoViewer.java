package org.pushingpixels.demo.flamingo.imageviewer;

import org.pushingpixels.flamingo.api.bcb.BreadcrumbItem;
import org.pushingpixels.flamingo.api.bcb.BreadcrumbPathEvent;
import org.pushingpixels.flamingo.api.bcb.core.BreadcrumbFileSelector;
import org.pushingpixels.flamingo.api.common.AbstractFileViewPanel;
import org.pushingpixels.flamingo.api.common.CommandButtonDisplayState;
import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.StringValuePair;
import org.pushingpixels.flamingo.api.common.icon.IcoWrapperResizableIcon;
import org.pushingpixels.neon.icon.ResizableIcon;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

public class IcoViewer extends JFrame {
    private BreadcrumbFileSelector bar;

    private AbstractFileViewPanel fileViewPanel;

    private JSlider iconSizeSlider;

    private int currIconSize;

    public IcoViewer() {
        super("ICO Viewer");

        this.bar = new BreadcrumbFileSelector();

        this.bar.getModel()
                .addPathListener((BreadcrumbPathEvent event) -> SwingUtilities.invokeLater(() -> {
                    final List<BreadcrumbItem<File>> newPath = bar.getModel().getItems();
                    System.out.println("New path is ");
                    for (BreadcrumbItem<File> item : newPath) {
                        // String[] values = item.getValue();
                        System.out.println("\t" + item.getData().getAbsolutePath());
                    }

                    if (newPath.size() > 0) {
                        SwingWorker<List<StringValuePair<File>>, Void> worker = new SwingWorker<List<StringValuePair<File>>, Void>() {
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

        int initialSize = 32;
        this.fileViewPanel = new AbstractFileViewPanel<File>(32, null) {
            @Override
            protected void configureCommandButton(
                    org.pushingpixels.flamingo.api.common.AbstractFileViewPanel.Leaf leaf,
                    JCommandButton button, ResizableIcon icon) {
            }

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
            protected ResizableIcon getResizableIcon(
                    org.pushingpixels.flamingo.api.common.AbstractFileViewPanel.Leaf leaf,
                    InputStream stream, CommandButtonDisplayState state, Dimension dimension) {
                int prefSize = state.getPreferredIconSize();
                if (prefSize > 0) {
                    dimension = new Dimension(prefSize, prefSize);
                }
                return IcoWrapperResizableIcon.getIcon(stream, dimension);
            }

            @Override
            protected boolean toShowFile(StringValuePair<File> pair) {
                String name = pair.getKey().toLowerCase();
                return name.endsWith(".ico");

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
        this.iconSizeSlider.addChangeListener((ChangeEvent e) -> {
            if (!iconSizeSlider.getModel().getValueIsAdjusting()) {
                int newValue = iconSizeSlider.getValue();
                if (newValue != currIconSize) {
                    currIconSize = newValue;
                    SwingUtilities.invokeLater(() -> {
                        fileViewPanel.setIconDimension(currIconSize);
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
     * @param args
     *            Ignored.
     */
    public static void main(String... args) {
        IcoViewer test = new IcoViewer();
        test.setSize(800, 650);
        test.setLocationRelativeTo(null);
        test.setVisible(true);
        test.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
