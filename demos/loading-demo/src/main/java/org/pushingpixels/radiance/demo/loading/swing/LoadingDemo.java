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
import java.awt.*;

public class LoadingDemo extends JFrame {
    private LoadingDemo() {
        this.setLayout(new FlowLayout());
        this.add(new ArcSpinner());
        this.add(new AtomSpinner());
        this.add(new BlocksSpinner());
        this.add(new BouncingDotsSpinner());
        this.add(new CascadeSpinner());
        this.add(new CircularDotsSpinner());
        this.add(new ClassicSpinner());
        this.add(new ClassicV2Spinner());
        this.add(new ClockSpinner());
        this.add(new CometSpinner());
        this.add(new CompassSpinner());
        this.add(new DualSpinner());
        this.add(new EclipseSpinner());
        this.add(new FlipSpinner());
        this.add(new GatherSpinner());
        this.add(new LeapSpinner());
        this.add(new LinearDotsSpinner());
        this.add(new LoadingSpinner());
        this.add(new MorphSpinner());
        this.add(new OrbitSpinner());
        this.add(new PulseSpinner());
        this.add(new RadarSpinner());
        this.add(new RingSpinner());
        this.add(new RippleSpinner());
        this.add(new SlideSpinner());
        this.add(new SnakeSpinner());
        this.add(new SwirlSpinner());
        this.add(new TraceSpinner());
        this.add(new WaveSpinner());

        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoadingDemo().setVisible(true));
    }
}
