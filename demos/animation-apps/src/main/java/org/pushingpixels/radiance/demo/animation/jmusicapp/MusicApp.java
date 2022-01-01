/*
 * Copyright (c) 2005-2022 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.demo.animation.jmusicapp;

import org.pushingpixels.radiance.demo.animation.jmusicapp.details.DetailsWindowManager;
import org.pushingpixels.radiance.demo.animation.jmusicapp.data.SearchResultRelease;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class MusicApp {
    MainWindow mainWindow;

    public MusicApp() {
        this.mainWindow = new MainWindow();
        this.mainWindow.setVisible(true);
    }

    public static void main(final String[] args) {
        SwingUtilities.invokeLater(() ->
                new MusicApp().doLoad("Sarah McLachlan", "ce58d854-7430-4231-aa44-97f0144b3372")
        );
    }

    private void doLoad(String searchStringDisplayable, final String searchString) {
        mainWindow.setLoading(true);
        mainWindow.setSearchString(searchStringDisplayable);
        SwingWorker<List<SearchResultRelease>, Void> worker =
                new SwingWorker<List<SearchResultRelease>, Void>() {
                    @Override
                    protected List<SearchResultRelease> doInBackground() throws Exception {
                        System.err.println("Searching");
                        try {
                            List<SearchResultRelease> result = BackendConnector
                                    .doAlbumSearch(searchString, searchStringDisplayable);
                            // simulate longer load if required
                            if (System.getProperty("musicapp.load") != null) {
                                Thread.sleep(2000);
                            }
                            System.err.println("Done searching");

                            return result;
                        } catch (Throwable exc) {
                            exc.printStackTrace();
                            return null;
                        }
                    }

                    @Override
                    protected void done() {
                        try {
                            List<SearchResultRelease> albums = get();
                            for (final SearchResultRelease album : albums) {
                                AlbumOverviewComponent albumOverviewComp = mainWindow
                                        .addAlbumItem(album);
                                albumOverviewComp.addMouseListener(new MouseAdapter() {
                                    @Override
                                    public void mouseClicked(MouseEvent e) {
                                        DetailsWindowManager.show(mainWindow, album);
                                    }
                                });
                            }
                        } catch (Throwable t) {
                            t.printStackTrace();
                        }

                        mainWindow.invalidate();
                        mainWindow.validate();
                        mainWindow.repaint();

                        mainWindow.setLoading(false);
                    }
                };
        worker.execute();
    }
}
