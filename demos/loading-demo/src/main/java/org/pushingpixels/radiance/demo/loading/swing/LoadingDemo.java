/*
 * Copyright (c) 2005-2026 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.demo.loading.swing;

import org.pushingpixels.radiance.loading.api.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class LoadingDemo extends JFrame {
    private static class DemoTile extends JComponent {
        public DemoTile(BaseSpinner spinner, String name) {
            this.setLayout(new BorderLayout());
            this.setBorder(new EmptyBorder(16, 16, 16, 16));

            JPanel spinnerPanel = new JPanel(new FlowLayout());
            spinnerPanel.add(spinner);
            this.add(spinnerPanel, BorderLayout.CENTER);

            JPanel labelPanel = new JPanel(new FlowLayout());
            labelPanel.setBorder(new EmptyBorder(12, 0, 0, 0));
            labelPanel.add(new JLabel(name));

            this.add(labelPanel, BorderLayout.SOUTH);
        }

        @Override
        public Dimension getPreferredSize() {
            Dimension dim = super.getPreferredSize();
            return new Dimension(Math.max((int) dim.getWidth(), 120), (int) dim.getHeight());
        }
    }

    private LoadingDemo() {
        this.setLayout(new FlowLayout());
        this.add(new DemoTile(new ArcSpinner(), "Arc"));
        this.add(new DemoTile(new AtomSpinner(), "Atom"));
        this.add(new DemoTile(new BlocksSpinner(), "Blocks"));
        this.add(new DemoTile(new BouncingDotsSpinner(), "Bouncing Dots"));
        this.add(new DemoTile(new CascadeSpinner(), "Cascade"));
        this.add(new DemoTile(new CircularDotsSpinner(), "Circular Dots"));
        this.add(new DemoTile(new ClassicSpinner(), "Classic"));
        this.add(new DemoTile(new ClassicV2Spinner(), "Classic V2"));
        this.add(new DemoTile(new ClockSpinner(), "Clock"));
        this.add(new DemoTile(new CometSpinner(), "Comet"));
        this.add(new DemoTile(new CompassSpinner(), "Compass"));
        this.add(new DemoTile(new DualSpinner(), "Dual"));
        this.add(new DemoTile(new EclipseSpinner(), "Eclipse"));
        this.add(new DemoTile(new FlipSpinner(), "Flip"));
        this.add(new DemoTile(new GatherSpinner(), "Gather"));
        this.add(new DemoTile(new LeapSpinner(), "Leap"));
        this.add(new DemoTile(new LinearDotsSpinner(), "Linear Dots"));
        this.add(new DemoTile(new LoadingSpinner(), "Loading"));
        this.add(new DemoTile(new MorphSpinner(), "Morph"));
        this.add(new DemoTile(new OrbitSpinner(), "Orbit"));
        this.add(new DemoTile(new PulseSpinner(), "Pulse"));
        this.add(new DemoTile(new RadarSpinner(), "Radar"));
        this.add(new DemoTile(new RingSpinner(), "Ring"));
        this.add(new DemoTile(new RippleSpinner(), "Ripple"));
        this.add(new DemoTile(new SlideSpinner(), "Slide"));
        this.add(new DemoTile(new SnakeSpinner(), "Snake"));
        this.add(new DemoTile(new SwirlSpinner(), "Swirl"));
        this.add(new DemoTile(new TraceSpinner(), "Trace"));
        this.add(new DemoTile(new WaveSpinner(), "Wave"));

        this.setSize(700, 680);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoadingDemo().setVisible(true));
    }
}
