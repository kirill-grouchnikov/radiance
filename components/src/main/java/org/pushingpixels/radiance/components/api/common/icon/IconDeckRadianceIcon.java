/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.components.api.common.icon;

import org.pushingpixels.radiance.common.api.AsynchronousLoadListener;
import org.pushingpixels.radiance.common.api.AsynchronousLoading;
import org.pushingpixels.radiance.common.api.icon.RadianceIcon;

import java.awt.*;
import java.util.Map;

/**
 * Implementation of the {@link RadianceIcon} that allows switching the icon
 * painting at runtime. This class can be used as a delegate in the
 * {@link DecoratedRadianceIcon} where the "base" icon is changed at runtime
 * without the need to recompute all the decorators.
 *
 * @param <T> enumeration key into the deck
 * @author Kenneth Flynn flynnk@darkcornersoftware.com.
 */
public class IconDeckRadianceIcon<T> implements RadianceIcon, AsynchronousLoading {
    /**
     * Currently shown icon.
     */
    private RadianceIcon currentIcon;

    /**
     * The icon deck.
     */
    private final Map<T, ? extends RadianceIcon> iconDeck;

    /**
     * Creates the icon deck.
     *
     * @param iconDeck Icon deck.
     */
    public IconDeckRadianceIcon(Map<T, ? extends RadianceIcon> iconDeck) {
        if (iconDeck.isEmpty())
            throw new IllegalArgumentException(
                    "Icon deck is empty; must have at least one icon");
        this.iconDeck = iconDeck;
        this.currentIcon = iconDeck.values().iterator().next();
    }

    /**
     * Sets the currently shown icon.
     *
     * @param key Icon key.
     */
    public void setIcon(T key) {
        this.currentIcon = iconDeck.get(key);
    }

    @Override
    public void setDimension(Dimension dim) {
        for (RadianceIcon icon : iconDeck.values()) {
            int currH = icon.getIconHeight();
            int currW = icon.getIconWidth();
            if ((currH != dim.height) || (currW != dim.width))
                icon.setDimension(dim);
        }
    }

    @Override
    public boolean supportsColorFilter() {
        for (RadianceIcon icon: iconDeck.values()) {
            if (!icon.supportsColorFilter()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        for (RadianceIcon icon: iconDeck.values()) {
            icon.setColorFilter(colorFilter);
        }
    }

    @Override
    public int getIconHeight() {
        return currentIcon.getIconHeight();
    }

    @Override
    public int getIconWidth() {
        return currentIcon.getIconWidth();
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        currentIcon.paintIcon(c, g, x, y);
    }

    @Override
    public void addAsynchronousLoadListener(AsynchronousLoadListener l) {
        for (RadianceIcon icon : iconDeck.values()) {
            if (icon instanceof AsynchronousLoading)
                ((AsynchronousLoading) icon).addAsynchronousLoadListener(l);
        }
    }

    @Override
    public boolean isLoading() {
        for (RadianceIcon icon : iconDeck.values()) {
            if (icon instanceof AsynchronousLoading) {
                if (((AsynchronousLoading) icon).isLoading())
                    return true;
            }
        }

        return false;
    }

    @Override
    public void removeAsynchronousLoadListener(AsynchronousLoadListener l) {
        for (RadianceIcon icon : iconDeck.values()) {
            if (icon instanceof AsynchronousLoading)
                ((AsynchronousLoading) icon).removeAsynchronousLoadListener(l);
        }
    }
}
