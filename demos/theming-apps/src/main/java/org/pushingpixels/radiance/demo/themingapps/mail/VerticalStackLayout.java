/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class VerticalStackLayout implements LayoutManager2 {
    private List<Component> components = new ArrayList<>();

    @Override
    public void addLayoutComponent(Component comp, Object constraints) {
        components.add(comp);
    }

    @Override
    public void addLayoutComponent(String name, Component comp) {
        components.add(comp);
    }

    @Override
    public void removeLayoutComponent(Component comp) {
        components.remove(comp);
    }

    @Override
    public Dimension preferredLayoutSize(Container parent) {
        int prefWidth = 0;
        int prefHeight = 0;
        for (Component comp : components) {
            Dimension compPref = comp.getPreferredSize();
            prefWidth = Math.max(prefWidth, compPref.width);
            prefHeight += compPref.height;
        }
        Insets insets = parent.getInsets();
        return new Dimension(prefWidth + insets.left + insets.right,
                prefHeight + insets.top + insets.bottom);
    }

    @Override
    public Dimension minimumLayoutSize(Container parent) {
        int minWidth = 0;
        int minHeight = 0;
        for (Component comp : components) {
            Dimension compPref = comp.getMinimumSize();
            minWidth = Math.max(minWidth, compPref.width);
            minHeight += compPref.height;
        }
        Insets insets = parent.getInsets();
        return new Dimension(minWidth + insets.left + insets.right,
                minHeight + insets.top + insets.bottom);
    }

    @Override
    public Dimension maximumLayoutSize(Container parent) {
        int maxWidth = 0;
        int maxHeight = 0;
        for (Component comp : components) {
            Dimension compPref = comp.getMaximumSize();
            maxWidth = Math.max(maxWidth, compPref.width);
            maxHeight += compPref.height;
        }
        Insets insets = parent.getInsets();
        return new Dimension(maxWidth + insets.left + insets.right,
                maxHeight + insets.top + insets.bottom);
    }

    @Override
    public float getLayoutAlignmentX(Container target) {
        return 0;
    }

    @Override
    public float getLayoutAlignmentY(Container target) {
        return 0;
    }

    @Override
    public void invalidateLayout(Container target) {
    }

    @Override
    public void layoutContainer(Container parent) {
        Insets insets = parent.getInsets();
        int y = insets.top;
        int width = parent.getWidth() - insets.left - insets.right;
        int height = parent.getHeight() - insets.top - insets.bottom;
        for (Component comp : components) {
            Dimension compPref = comp.getPreferredSize();
            int heightLeft = height - y;
            int compHeight = Math.min(heightLeft, compPref.height);
            comp.setBounds(insets.left, y, width, compHeight);
            y += compPref.height;
        }
    }
}
