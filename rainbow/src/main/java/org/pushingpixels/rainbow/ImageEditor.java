/*
 * Copyright (c) 2005-2018 Rainbow Kirill Grouchnikov 
 * and Alexander Potochkin. All Rights Reserved.
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
 *  o Neither the name of Rainbow, Kirill Grouchnikov 
 *    and Alexander Potochkin nor the names of
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
package org.pushingpixels.rainbow;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileFilter;

import org.jdesktop.jxlayer.JXLayer;
import org.jdesktop.jxlayer.plaf.BufferedLayerUI;
import org.jdesktop.jxlayer.plaf.effect.BufferedImageOpEffect;
import org.pushingpixels.ibis.icon.SvgBatikResizableIcon;

import com.jhlabs.image.InvertFilter;
import com.jhlabs.image.KaleidoscopeFilter;
import com.jhlabs.image.MarbleFilter;
import com.jhlabs.image.TwirlFilter;

/**
 * Image editor panel for svg icon
 * 
 * @author Alexander Potochkin
 */
public class ImageEditor extends JPanel {

    // private URL svgIconURL;
    private byte[] svgBytes;
    private BufferedLayerUI<JComponent> layerUI;
    private SettingsPanel settingsPanel;

    private BufferedImageOpEffect rescaleEffect;
    private BufferedImageOpEffect twirlEffect;
    private BufferedImageOpEffect edgeEffect;
    private BufferedImageOpEffect marbleEffect;
    private BufferedImageOpEffect kaleidoscopeEffect;

    public ImageEditor(byte[] svgBytes, final File folderToSave, final String svgName,
            final Window parent) {
        this.svgBytes = svgBytes;
        setLayout(new BorderLayout());
        ImagePanel imagePanel = new ImagePanel();

        layerUI = new BufferedLayerUI<JComponent>();

        rescaleEffect = new BufferedImageOpEffect();
        twirlEffect = new BufferedImageOpEffect();
        edgeEffect = new BufferedImageOpEffect(new MarbleFilter());
        edgeEffect.setEnabled(false);
        marbleEffect = new BufferedImageOpEffect(new InvertFilter());
        marbleEffect.setEnabled(false);
        kaleidoscopeEffect = new BufferedImageOpEffect(new KaleidoscopeFilter());
        kaleidoscopeEffect.setEnabled(false);

        layerUI.setLayerEffects(rescaleEffect, twirlEffect, edgeEffect, marbleEffect,
                kaleidoscopeEffect);

        JXLayer<JComponent> layer = new JXLayer<JComponent>(imagePanel);
        layer.setUI(layerUI);

        // Turn the incremental update off because
        // KaleidoscopeFilter doesn't work well with incremental updates
        // especially if the layer is inside a JScrollPane
        layerUI.setIncrementalUpdate(false);

        add(layer);
        // Comment the previous line and uncomment the next lines
        // to test BufferedPainter and KaleidoscopeFilter with JScrollPane
        // layer.setPreferredSize(new Dimension(500, 500));
        // JScrollPane scroll = new JScrollPane(layer);
        // add(scroll);

        settingsPanel = new SettingsPanel();
        add(settingsPanel, BorderLayout.EAST);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        JButton resetButton = new JButton("Reset");
        buttonPanel.add(resetButton);
        resetButton.addActionListener((ActionEvent e) -> 
                settingsPanel.resetSettings());

        JButton saveButton = new JButton("Save as...");
        buttonPanel.add(saveButton);
        add(buttonPanel, BorderLayout.SOUTH);

        saveButton.addActionListener((ActionEvent e) -> SwingUtilities
                .invokeLater(() -> showFileChooser(folderToSave, svgName, parent)));
    }

    class SettingsPanel extends JPanel implements ChangeListener {
        private JSlider redSlider;
        private JSlider greenSlider;
        private JSlider blueSlider;
        private JSlider twirlEffectSlider;
        private JCheckBox marbleCheckBox;
        private JCheckBox invertCheckBox;
        private JCheckBox kaleidoscopeCheckBox;

        public SettingsPanel() {
            JPanel inner = new JPanel();
            inner.setLayout(new GridLayout(0, 1));
            redSlider = new JSlider(0, 100, 50);

            redSlider.setBorder(BorderFactory.createTitledBorder("Red"));
            inner.add(redSlider);
            greenSlider = new JSlider(0, 100, 50);
            greenSlider.setBorder(BorderFactory.createTitledBorder("Green"));
            inner.add(greenSlider);
            blueSlider = new JSlider(0, 100, 50);
            blueSlider.setBorder(BorderFactory.createTitledBorder("Blue"));
            inner.add(blueSlider);
            redSlider.addChangeListener(this);
            greenSlider.addChangeListener(this);
            blueSlider.addChangeListener(this);

            invertCheckBox = new JCheckBox("Invert colors");
            invertCheckBox.addChangeListener(this);
            inner.add(invertCheckBox);

            marbleCheckBox = new JCheckBox("Marble");
            marbleCheckBox.addChangeListener(this);
            inner.add(marbleCheckBox);

            kaleidoscopeCheckBox = new JCheckBox("Kaleidoscope");
            kaleidoscopeCheckBox.addChangeListener(this);
            inner.add(kaleidoscopeCheckBox);

            twirlEffectSlider = new JSlider(0, 10, 0);
            twirlEffectSlider.setBorder(BorderFactory.createTitledBorder("Twirl"));
            twirlEffectSlider.addChangeListener(this);
            inner.add(twirlEffectSlider);

            add(inner);
        }

        public void stateChanged(ChangeEvent e) {
            if (e.getSource() == twirlEffectSlider) {
                TwirlFilter twirlFilter = new TwirlFilter();
                twirlFilter.setRadius(getWidth());
                twirlFilter.setAngle(twirlEffectSlider.getValue());
                twirlEffect.setBufferedImageOps(twirlFilter);
            } else if (e.getSource() == marbleCheckBox) {
                edgeEffect.setEnabled(marbleCheckBox.isSelected());
            } else if (e.getSource() == invertCheckBox) {
                marbleEffect.setEnabled(invertCheckBox.isSelected());
            } else if (e.getSource() == kaleidoscopeCheckBox) {
                kaleidoscopeEffect.setEnabled(kaleidoscopeCheckBox.isSelected());
            }
            // Change RGB
            else {
                float f = 50f;
                float[] scaleFactors = { redSlider.getValue() / f, greenSlider.getValue() / f,
                                blueSlider.getValue() / f, 1 };
                float[] offsets = { 0, 0, 0, 1 };
                rescaleEffect.setBufferedImageOps(new RescaleOp(scaleFactors, offsets, null));
            }
        }

        public void resetSettings() {
            redSlider.setValue(redSlider.getMaximum() / 2);
            greenSlider.setValue(greenSlider.getMaximum() / 2);
            blueSlider.setValue(blueSlider.getMaximum() / 2);
            twirlEffectSlider.setValue(0);
            marbleCheckBox.setSelected(false);
            invertCheckBox.setSelected(false);
            kaleidoscopeCheckBox.setSelected(false);
        }
    }

    class ImagePanel extends JPanel {
        private SvgBatikResizableIcon icon;

        public ImagePanel() {
            addComponentListener(new ComponentAdapter() {
                @Override
                public void componentResized(ComponentEvent e) {
                    Insets insets = getInsets();
                    Dimension iconSize = new Dimension(getSize());
                    iconSize.width -= insets.left + insets.right;
                    iconSize.height -= insets.top + insets.bottom;

                    // here the stream always has non-compressed SVG contents.
                    icon = SvgBatikResizableIcon.getSvgIcon(new ByteArrayInputStream(svgBytes),
                            iconSize);
                    icon.addAsynchronousLoadListener((boolean b) -> repaint());
                }
            });

            TitledBorder border = BorderFactory.createTitledBorder("JXLayer");
            border.setTitleFont(border.getTitleFont().deriveFont(20f));
            border.setTitlePosition(TitledBorder.BOTTOM);
            setBorder(border);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (icon != null) {
                Insets insets = getInsets();
                icon.paintIcon(this, g, insets.left, insets.top);
            }
        }
    }

    private void showFileChooser(File folderToSave, String svgName, Window parent) {
        JFileChooser fileChooser = new JFileChooser(folderToSave);
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.setSelectedFile(
                new File(folderToSave, RainbowUtils.getSvgClassName(svgName) + ".png"));
        fileChooser.addChoosableFileFilter(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory())
                    return true;
                return pathname.getAbsolutePath().endsWith(".png");
            }

            @Override
            public String getDescription() {
                return "PNG files";
            }
        });
        if (fileChooser.showDialog(parent, "Save") == JFileChooser.APPROVE_OPTION) {
            JXLayer<?> layer = layerUI.getLayer();
            BufferedImage buf = new BufferedImage(layer.getWidth(), layer.getHeight(),
                    BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = buf.createGraphics();
            layer.paint(g2);
            g2.dispose();
            try {
                ImageIO.write(buf, "png", fileChooser.getSelectedFile());
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
}
