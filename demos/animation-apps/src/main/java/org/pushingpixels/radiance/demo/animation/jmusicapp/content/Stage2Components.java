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
package org.pushingpixels.radiance.demo.animation.jmusicapp.content;

import org.pushingpixels.radiance.demo.animation.jmusicapp.AlbumOverviewComponent;
import org.pushingpixels.radiance.demo.animation.jmusicapp.details.DetailsWindowManager;
import org.pushingpixels.radiance.demo.animation.jmusicapp.data.SearchResultRelease;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

/**
 * Adds the following functionality to the album scroller container:
 *
 * <ul>
 * <li>Adding album overview components</li>
 * <li>Scrolling overview components with mouse wheel and left / right arrow
 * keys</li>
 * </ul>
 *
 * @author Kirill Grouchnikov
 */
public class Stage2Components extends Stage1LoadingProgress {
    /**
     * The list of album overview components. Each component added with
     * {@link #addAlbumItem(SearchResultRelease)} is added to this list.
     */
    List<AlbumOverviewComponent> comps;

    /**
     * Indicates which album overview component is displayed at the left edge of
     * this container. Note that while this specific class (in its
     * {@link #scrollToNext()} and {@link #scrollToPrevious()}) operate on the
     * integer values, the animated scrolling will result in fractional values
     * of the leading position.
     *
     * <p>
     * At the beginning the value is 0.0 - displaying the first entry in
     * {@link #comps} at the left edge. When scrolling to the next album, the
     * value will become 1.0 (effectively pushing the first album over the left
     * edge). If the scrolling is animated, this value will be gradually
     * interpolated from 0.0 to 1.0.
     * </p>
     *
     * <p>
     * This value is respected in the {@link #doLayout()} to provide the
     * seamless scroll animation.
     * </p>
     */
    float leadingPosition;

    /**
     * Creates the new container that can host album overview components.
     */
    public Stage2Components() {
        super();
        this.comps = new ArrayList<>();

        // register the mouse wheel listener for scrolling content
        this.addMouseWheelListener(mouseWheelEvent -> {
            if (mouseWheelEvent.getWheelRotation() > 0) {
                // next
                scrollToNext();
            } else {
                // previous
                scrollToPrevious();
            }
        });

        // create the key input maps to handle the scrolling
        // with left / right arrows
        InputMap inputMap = new ComponentInputMap(this);
        inputMap.put(KeyStroke.getKeyStroke("RIGHT"), "right");
        inputMap.put(KeyStroke.getKeyStroke("KP_RIGHT"), "right");
        inputMap.put(KeyStroke.getKeyStroke("LEFT"), "left");
        inputMap.put(KeyStroke.getKeyStroke("KP_LEFT"), "left");

        // create the relevant action map
        Action rightAction = new AbstractAction("right") {
            @Override
            public void actionPerformed(ActionEvent e) {
                // next
                scrollToNext();
            }
        };
        Action leftAction = new AbstractAction("left") {
            @Override
            public void actionPerformed(ActionEvent e) {
                // previous
                scrollToPrevious();
            }
        };
        ActionMap actionMap = new ActionMap();
        actionMap.put("right", rightAction);
        actionMap.put("left", leftAction);

        // and register the maps
        this.setInputMap(WHEN_IN_FOCUSED_WINDOW, inputMap);
        this.setActionMap(actionMap);

        // add a mouse listener to dispose the album details window
        // when the user clicks outside any album overview component.
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                DetailsWindowManager.disposeCurrentlyShowing();
            }
        });
    }

    /**
     * Adds the specified album item to this album container.
     *
     * @param album Description of the album item from the Amazon backend.
     * @return Thew matching album overview component.
     */
    public synchronized AlbumOverviewComponent addAlbumItem(SearchResultRelease album) {
        AlbumOverviewComponent comp = new AlbumOverviewComponent(album);
        this.comps.add(comp);
        this.add(comp);
        return comp;
    }

    @Override
    public synchronized void doLayout() {
        if (comps.size() == 0)
            return;

        for (int i = 0; i < this.comps.size(); i++) {
            float delta = i - this.leadingPosition;
            // compute the left X based on the current leading position
            int x = 10 + (int) (delta * (AlbumOverviewComponent.DEFAULT_WIDTH + 10));
            this.comps.get(i).setBounds(
                    x,
                    TITLE_HEIGHT
                            + (getHeight() - TITLE_HEIGHT - AlbumOverviewComponent.DEFAULT_HEIGHT)
                            / 2, AlbumOverviewComponent.DEFAULT_WIDTH,
                    AlbumOverviewComponent.DEFAULT_HEIGHT);
        }
    }

    @Override
    protected void paintChildren(Graphics g) {
        // clip the graphics context
        g.clipRect(10, 10, getWidth() - 20, getHeight() - 20);
        super.paintChildren(g);
    }

    /**
     * Scrolls the albums to show the next album.
     */
    protected void scrollToNext() {
        if (this.leadingPosition < (this.comps.size() - 1)) {
            this.leadingPosition++;
            revalidate();
        }
    }

    /**
     * Scrolls the albums to show the previous album.
     */
    protected void scrollToPrevious() {
        if (this.leadingPosition > 0) {
            this.leadingPosition--;
            revalidate();
        }
    }
}
