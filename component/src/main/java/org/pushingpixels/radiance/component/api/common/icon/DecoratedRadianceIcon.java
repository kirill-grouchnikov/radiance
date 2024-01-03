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
package org.pushingpixels.radiance.component.api.common.icon;

import org.pushingpixels.radiance.common.api.AsynchronousLoadListener;
import org.pushingpixels.radiance.common.api.AsynchronousLoading;
import org.pushingpixels.radiance.common.api.icon.RadianceIcon;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Implementation of {@link RadianceIcon} that adds decorations to a main icon.
 *
 * @author Kirill Grouchnikov
 */
public class DecoratedRadianceIcon implements RadianceIcon, AsynchronousLoading {
    /**
     * The main delegate icon.
     */
    private RadianceIcon delegate;

    /**
     * List of icon decorators.
     */
    private java.util.List<IconDecorator> decorators;

    /**
     * Icon decorator interface.
     *
     * @author Kirill Grouchnikov
     */
    @FunctionalInterface
    public interface IconDecorator {
        /**
         * Paints the icon decoration.
         *
         * @param c              Component.
         * @param g              Graphics context.
         * @param mainIconX      X position of main icon painting.
         * @param mainIconY      Y position of main icon painting.
         * @param mainIconWidth  Width of main icon.
         * @param mainIconHeight Height of main icon.
         */
        void paintIconDecoration(Component c, Graphics g, int mainIconX,
                int mainIconY, int mainIconWidth, int mainIconHeight);
    }

    /**
     * Creates a new decorated icon.
     *
     * @param delegate   The main icon.
     * @param decorators Icon decorators.
     */
    public DecoratedRadianceIcon(RadianceIcon delegate, IconDecorator... decorators) {
        this.delegate = delegate;
        this.decorators = new ArrayList<>();
        if (decorators != null) {
            this.decorators.addAll(Arrays.asList(decorators));
        }
    }

    /**
     * Creates a new decorated icon with no decorators. Decorators can be added
     * later with {@link #addIconDecorator(IconDecorator)}.
     *
     * @param delegate Main icon.
     */
    public DecoratedRadianceIcon(RadianceIcon delegate) {
        this(delegate, (IconDecorator) null);
    }

    @Override
    public int getIconHeight() {
        return this.delegate.getIconHeight();
    }

    @Override
    public int getIconWidth() {
        return this.delegate.getIconWidth();
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        this.delegate.paintIcon(c, g, x, y);
        for (IconDecorator decorator : this.decorators) {
            decorator.paintIconDecoration(c, g, x, y, this.delegate
                    .getIconWidth(), this.delegate.getIconHeight());
        }
    }

    @Override
    public void setDimension(Dimension newDimension) {
        this.delegate.setDimension(newDimension);
    }

    @Override
    public boolean supportsColorFilter() {
        return this.delegate.supportsColorFilter();
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.delegate.setColorFilter(colorFilter);
    }

    /**
     * Adds the specified decorator to the end of the decorator sequence. If the
     * specified decorator already exists, it is not moved to the end of the
     * sequence.
     *
     * @param decorator Decorator to add.
     */
    public void addIconDecorator(IconDecorator decorator) {
        if (this.decorators.contains(decorator)) {
            return;
        }
        this.decorators.add(decorator);
    }

    /**
     * Removes the specified decorator.
     *
     * @param decorator Decorator to remove.
     */
    public void removeIconDecorator(IconDecorator decorator) {
        this.decorators.remove(decorator);
    }

    @Override
    public void addAsynchronousLoadListener(AsynchronousLoadListener l) {
        if (this.delegate instanceof AsynchronousLoading) {
            ((AsynchronousLoading) this.delegate).addAsynchronousLoadListener(l);
        }
    }

    @Override
    public void removeAsynchronousLoadListener(AsynchronousLoadListener l) {
        if (this.delegate instanceof AsynchronousLoading) {
            ((AsynchronousLoading) this.delegate).removeAsynchronousLoadListener(l);
        }
    }

    @Override
    public synchronized boolean isLoading() {
        if (this.delegate instanceof AsynchronousLoading) {
            if (((AsynchronousLoading) this.delegate).isLoading()) {
                return true;
            }
        }
        for (IconDecorator decorator : this.decorators) {
            if (decorator instanceof AsynchronousLoading) {
                if (((AsynchronousLoading) decorator).isLoading()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Factory factory(Factory original, IconDecorator... decorators) {
        return () -> new DecoratedRadianceIcon(original.createNewIcon(), decorators);
    }
}
