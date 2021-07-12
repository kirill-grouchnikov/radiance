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
package org.pushingpixels.flamingo.api.common.icon;

import org.pushingpixels.neon.api.AsynchronousLoadListener;
import org.pushingpixels.neon.api.AsynchronousLoading;
import org.pushingpixels.neon.api.icon.NeonIcon;

import java.awt.*;
import java.util.Map;

/**
 * Implementation of the {@link NeonIcon} that allows switching the icon
 * painting at runtime. This class can be used as a delegate in the
 * {@link DecoratedNeonIcon} where the "base" icon is changed at runtime
 * without the need to recompute all the decorators.
 *
 * @param <T> enumeration key into the deck
 * @author Kenneth Flynn flynnk@darkcornersoftware.com.
 */
public class IconDeckNeonIcon<T> implements NeonIcon, AsynchronousLoading {
    /**
     * Currently shown icon.
     */
    private NeonIcon currentIcon;

    /**
     * The icon deck.
     */
    private final Map<T, ? extends NeonIcon> iconDeck;

    /**
     * Creates the icon deck.
     *
     * @param iconDeck Icon deck.
     */
    public IconDeckNeonIcon(Map<T, ? extends NeonIcon> iconDeck) {
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
        for (NeonIcon icon : iconDeck.values()) {
            int currH = icon.getIconHeight();
            int currW = icon.getIconWidth();
            if ((currH != dim.height) || (currW != dim.width))
                icon.setDimension(dim);
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
        for (NeonIcon icon : iconDeck.values()) {
            if (icon instanceof AsynchronousLoading)
                ((AsynchronousLoading) icon).addAsynchronousLoadListener(l);
        }
    }

    @Override
    public boolean isLoading() {
        for (NeonIcon icon : iconDeck.values()) {
            if (icon instanceof AsynchronousLoading) {
                if (((AsynchronousLoading) icon).isLoading())
                    return true;
            }
        }

        return false;
    }

    @Override
    public void removeAsynchronousLoadListener(AsynchronousLoadListener l) {
        for (NeonIcon icon : iconDeck.values()) {
            if (icon instanceof AsynchronousLoading)
                ((AsynchronousLoading) icon).removeAsynchronousLoadListener(l);
        }
    }
}
