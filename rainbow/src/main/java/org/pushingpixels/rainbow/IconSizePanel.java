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

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;

import org.pushingpixels.rainbow.svg.ic_zoom_in_black_24px;
import org.pushingpixels.rainbow.svg.ic_zoom_out_black_24px;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.layout.FormLayout;

public class IconSizePanel {
    public static JPanel getPanel(final RainbowViewer rainbowViewer, int initialSize) {
        FormLayout lm = new FormLayout(
                "left:pref, 8dlu, fill:pref, 0dlu, fill:min:grow, 0dlu, fill:pref, 4dlu", "");
        DefaultFormBuilder builder = new DefaultFormBuilder(lm);

        final JLabel sizeLabel = new JLabel();
        sizeLabel.setText(initialSize + "x" + initialSize);
        builder.append(sizeLabel);

        JLabel zoomOutLabel = new JLabel(ic_zoom_out_black_24px.of(12, 12));
        builder.append(zoomOutLabel);

        final JSlider iconSizeSlider = new JSlider();
        iconSizeSlider.setOpaque(false);
        iconSizeSlider.setMinimum(32);
        iconSizeSlider.setMaximum(128);
        iconSizeSlider.setSnapToTicks(true);
        iconSizeSlider.setMajorTickSpacing(32);
        iconSizeSlider.setMinorTickSpacing(8);
        iconSizeSlider.setValue(initialSize);
        iconSizeSlider.setFocusable(false);

        iconSizeSlider.addChangeListener((ChangeEvent e) -> {
            if (!iconSizeSlider.getModel().getValueIsAdjusting()) {
                final int newValue = iconSizeSlider.getValue();
                if (newValue != rainbowViewer.getIconSize()) {
                    SwingUtilities.invokeLater(() -> rainbowViewer.setIconSize(newValue));
                    sizeLabel.setText(newValue + "x" + newValue);
                }
            }
        });
        builder.append(iconSizeSlider);

        JLabel zoomInLabel = new JLabel(ic_zoom_in_black_24px.of(12, 12));
        builder.append(zoomInLabel);

        JPanel result = builder.getPanel();
        result.setOpaque(false);
        return result;
    }

    public static JPanel getPanel(final RainbowSvnViewer rainbowViewer, int initialSize) {
        FormLayout lm = new FormLayout(
                "left:pref, 4dlu, fill:pref, 0dlu, fill:min:grow, 0dlu, fill:pref", "");
        DefaultFormBuilder builder = new DefaultFormBuilder(lm);

        final JLabel sizeLabel = new JLabel();
        sizeLabel.setText(initialSize + "*" + initialSize);
        builder.append(sizeLabel);

        Icon zoomOutIcon = new ImageIcon(Thread.currentThread().getContextClassLoader()
                .getResource("org/pushingpixels/rainbow/zoom_out.png"));
        JLabel zoomOutLabel = new JLabel(zoomOutIcon);
        builder.append(zoomOutLabel);

        final JSlider iconSizeSlider = new JSlider();
        iconSizeSlider.setOpaque(false);
        iconSizeSlider.setMinimum(32);
        iconSizeSlider.setMaximum(128);
        iconSizeSlider.setSnapToTicks(true);
        // this.iconSizeSlider.setPaintLabels(true);
        // this.iconSizeSlider.setPaintTicks(true);
        iconSizeSlider.setMajorTickSpacing(32);
        iconSizeSlider.setMinorTickSpacing(8);
        iconSizeSlider.setValue(initialSize);
        iconSizeSlider.setFocusable(false);

        iconSizeSlider.addChangeListener((ChangeEvent e) -> {
            if (!iconSizeSlider.getModel().getValueIsAdjusting()) {
                final int newValue = iconSizeSlider.getValue();
                if (newValue != rainbowViewer.getIconSize()) {
                    SwingUtilities.invokeLater(() -> rainbowViewer.setIconSize(newValue));
                }
                sizeLabel.setText(newValue + "*" + newValue);
            }
        });
        builder.append(iconSizeSlider);

        Icon zoomInIcon = new ImageIcon(Thread.currentThread().getContextClassLoader()
                .getResource("org/pushingpixels/rainbow/zoom_in.png"));
        JLabel zoomInLabel = new JLabel(zoomInIcon);
        builder.append(zoomInLabel);

        JPanel result = builder.getPanel();
        result.setOpaque(false);
        return result;
    }
}
