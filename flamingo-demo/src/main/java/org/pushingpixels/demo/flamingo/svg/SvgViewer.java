/*
 * Copyright (c) 2005-2018 Flamingo Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.demo.flamingo.svg;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.filechooser.FileSystemView;

import org.pushingpixels.flamingo.api.bcb.BreadcrumbItem;
import org.pushingpixels.flamingo.api.bcb.BreadcrumbPathEvent;
import org.pushingpixels.flamingo.api.bcb.core.BreadcrumbFileSelector;
import org.pushingpixels.flamingo.api.common.StringValuePair;

/**
 * SVG viewer application.
 * 
 * @author Kirill Grouchnikov
 */
public class SvgViewer extends JFrame {
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
     * File system view.
     */
    protected static FileSystemView fsv = FileSystemView.getFileSystemView();

    /**
     * Creates a new SVG viewer application.
     */
    public SvgViewer() {
        super("SVG File Viewer");

        this.bar = new BreadcrumbFileSelector();

        this.bar.getModel()
                .addPathListener((BreadcrumbPathEvent event) -> SwingUtilities.invokeLater(() -> {
                    final List<BreadcrumbItem<File>> newPath = bar.getModel().getItems();
                    svgFileViewPanel.cancelMainWorker();
                    System.out.println("New path is ");
                    for (BreadcrumbItem<File> item : newPath) {
                        System.out.println("\t" + FileSystemView.getFileSystemView()
                                .getSystemDisplayName(item.getData()));
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
                                    svgFileViewPanel.setFolder(get());
                                    svgFileViewPanel.setIconDimension(currIconSize);
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
        this.svgFileViewPanel = new SvgFileViewPanel(bar.getCallback(), initialSize);
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
        this.iconSizeSlider.addChangeListener((ChangeEvent e) -> {
            if (!iconSizeSlider.getModel().getValueIsAdjusting()) {
                int newValue = iconSizeSlider.getValue();
                if (newValue != currIconSize) {
                    currIconSize = newValue;
                    SwingUtilities
                            .invokeLater(() -> svgFileViewPanel.setIconDimension(currIconSize));
                }
            }
        });
        this.add(this.iconSizeSlider, BorderLayout.SOUTH);

        JMenuBar jmb = new JMenuBar();
        JMenu menu = new JMenu("Look-and-feel");
        menu.add(LafChanger.getMenuItem(this, "Metal", "javax.swing.plaf.metal.MetalLookAndFeel"));
        menu.add(LafChanger.getMenuItem(this, "Windows",
                "com.sun.java.swing.plaf.windows.WindowsLookAndFeel"));
        menu.add(LafChanger.getMenuItem(this, "Windows Classic",
                "com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel"));
        menu.add(LafChanger.getMenuItem(this, "Motif",
                "com.sun.java.swing.plaf.motif.MotifLookAndFeel"));
        menu.add(LafChanger.getMenuItem(this, "Substance",
                "org.jvnet.substance.skin.SubstanceBusinessLookAndFeel"));
        jmb.add(menu);
        this.setJMenuBar(jmb);
    }

    /**
     * The main method to run the SVG viewer.
     * 
     * @param args
     *            Ignored.
     */
    public static void main(String... args) {
        SvgViewer test = new SvgViewer();
        test.setSize(550, 385);
        test.setLocationRelativeTo(null);
        test.setVisible(true);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private static class LafChanger implements ActionListener {
        private JFrame frame;

        private String lafClassName;

        public static JMenuItem getMenuItem(JFrame frame, String lafName, String lafClassName) {
            JMenuItem result = new JMenuItem(lafName);
            result.addActionListener(new LafChanger(frame, lafClassName));
            return result;
        }

        public LafChanger(JFrame frame, String lafClassName) {
            super();
            this.frame = frame;
            this.lafClassName = lafClassName;
        }

        public void actionPerformed(ActionEvent e) {
            SwingUtilities.invokeLater(() -> {
                try {
                    UIManager.setLookAndFeel(lafClassName);
                    SwingUtilities.updateComponentTreeUI(frame);
                } catch (Exception exc) {
                    exc.printStackTrace();
                }
            });
        }
    }
}
