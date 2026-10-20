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
package org.pushingpixels.radiance.loading.api;

import javax.swing.*;
import java.awt.*;
import java.awt.event.HierarchyListener;
import java.beans.PropertyChangeListener;

/**
 * The base abstract class for all Radiance loading spinners.
 *
 * <p>This is a modified version of the original source code by Jakub Krehel
 * available under the MIT license.</p>
 *
 * @author Kirill Grouchnikov
 */
public abstract class BaseSpinner extends JComponent {
    protected Color color;
    protected int duration;
    protected int size = 24;

    private PropertyChangeListener propertyChangeListener;
    private HierarchyListener hierarchyListener;

    /**
     * Creates a new {@code BaseSpinner} with the specified color and animation
     * duration.
     *
     * @param color the color of the spinner
     * @param duration the duration of one full animation cycle in milliseconds
     */
    protected BaseSpinner(Color color, int duration) {
        this.color = color;
        this.duration = duration;

        setOpaque(false);
        installListeners();
    }

    /**
     * Returns the color of the spinner.
     *
     * @return the spinner color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Sets the color of the spinner.
     *
     * @param color the new spinner color
     */
    public void setColor(Color color) {
        Color old = this.color;
        this.color = color;
        firePropertyChange("color", old, color);
        repaint();
    }

    /**
     * Returns the animation duration in milliseconds.
     *
     * @return the duration in milliseconds
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Sets the animation duration in milliseconds. Calling this will restart
     * the animation if it is currently running.
     *
     * @param duration the new duration in milliseconds
     */
    public void setDuration(int duration) {
        int old = this.duration;
        this.duration = duration;
        firePropertyChange("duration", old, duration);
        if (isVisible() && isDisplayable()) {
            stopAnimations();
            startAnimations();
        }
    }

    public void setSize(int size) {
        int old = this.size;
        this.size = size;
        firePropertyChange("duration", old, size);
        if (isVisible() && isDisplayable()) {
            stopAnimations();
            startAnimations();
        }
        invalidate();
        revalidate();
    }

    // ─── Lifecycle ────────────────────────────────────────────────────────

    private void installListeners() {
        this.propertyChangeListener = e -> {
            if ("visible".equals(e.getPropertyName())) {
                if ((Boolean) e.getNewValue()) {
                    startAnimations();
                } else {
                    stopAnimations();
                }
            }
        };
        addPropertyChangeListener(this.propertyChangeListener);

        this.hierarchyListener = e -> {
            if (isVisible() && isDisplayable()) {
                startAnimations();
            } else {
                stopAnimations();
            }
        };
        addHierarchyListener(this.hierarchyListener);
    }

    private void uninstallListeners() {
        if (this.propertyChangeListener != null) {
            removePropertyChangeListener(this.propertyChangeListener);
            this.propertyChangeListener = null;
        }
        if (this.hierarchyListener != null) {
            removeHierarchyListener(this.hierarchyListener);
            this.hierarchyListener = null;
        }
    }

    protected abstract void startAnimations();

    protected abstract void stopAnimations();

    @Override
    public void addNotify() {
        super.addNotify();
        if (isVisible()) {
            startAnimations();
        }
    }

    @Override
    public void removeNotify() {
        stopAnimations();
        super.removeNotify();
    }

    // ─── Painting ─────────────────────────────────────────────────────────

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(this.size, this.size);
    }

    @Override
    public void update(Graphics g) {
        paint(g);
    }
}
