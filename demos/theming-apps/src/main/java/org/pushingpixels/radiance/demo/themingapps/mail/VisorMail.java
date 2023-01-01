/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.demo.themingapps.mail;

import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.FocusKind;

import javax.swing.*;
import java.awt.*;

public class VisorMail extends JFrame {
    public static final RadianceThemingSlices.DecorationAreaType DESTINATIONS =
            new RadianceThemingSlices.DecorationAreaType("Visor Destinations");
    public static final RadianceThemingSlices.DecorationAreaType THREADS =
            new RadianceThemingSlices.DecorationAreaType("Visor Threads");

    public VisorMail() {
        BorderLayout mainLayout = new BorderLayout();
        Container contentPane = this.getContentPane();
        contentPane.setLayout(mainLayout);

        // In the real app the space allocation between the panels will probably be
        // more intelligent, allowing the user to reallocate the available space.
        // http://www.docking-frames.org/ is one option.
        contentPane.add(new DestinationsPanel(this), BorderLayout.LINE_START);
        contentPane.add(new ThreadListPanel(), BorderLayout.CENTER);
        contentPane.add(new ThreadPanel(), BorderLayout.LINE_END);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Configure the main skin
            RadianceThemingCortex.GlobalScope.setSkin(new VisorSkin());
            RadianceThemingCortex.GlobalScope.setFocusKind(FocusKind.NONE);
            JFrame.setDefaultLookAndFeelDecorated(true);

            // Create the main frame
            VisorMail visorMail = new VisorMail();

            // Extend our content into the title pane and configure the title control buttons to be
            // vertically centered and in the leading horizontal position (in our main selector
            // pane).
            RadianceThemingCortex.WindowScope.extendContentIntoTitlePane(visorMail,
                    RadianceThemingSlices.HorizontalGravity.LEADING,
                    RadianceThemingSlices.VerticalGravity.CENTERED);

            // And increase the height of the title pane to play nicer with additional
            // content that we are displaying in that area.
            RadianceThemingCortex.WindowScope.setPreferredTitlePaneHeight(visorMail, 40);

            // Set initial size, center in screen, configure to exit the app on clicking the
            // close button
            visorMail.setSize(900, 600);
            visorMail.setLocationRelativeTo(null);
            visorMail.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // And finally make the main frame visible
            visorMail.setVisible(true);
        });
    }

}
