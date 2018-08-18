/*
 * Copyright (c) 2009-2018 Onyx Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Onyx Kirill Grouchnikov nor the names of 
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
package org.pushingpixels.onyx;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;

import org.pushingpixels.onyx.data.Album;
import org.pushingpixels.onyx.details.DetailsWindowManager;

public class DemoApp {
	MainWindow mainWindow;

	public DemoApp() {
		this.mainWindow = new MainWindow();
		this.mainWindow.setVisible(true);
	}

	public void doLoad(String searchStringDisplayable, final String searchString)
			throws Exception {
		mainWindow.setLoading(true);
		mainWindow.setSearchString(searchStringDisplayable);
		SwingWorker<List<Album>, Void> worker = new SwingWorker<List<Album>, Void>() {
			@Override
			protected List<Album> doInBackground() throws Exception {
				System.err.println("Searching");
				try {
					List<Album> result = BackendConnector
							.doAlbumSearch(searchString, searchStringDisplayable);
					// simulate longer load if required
					if (System.getProperty("onyx.load") != null) {
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
					List<Album> albums = get();
					for (final Album album : albums) {
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

	public static void main(final String[] args) throws Exception {
		try {
			System.setProperty("java.net.useSystemProxies", "true");
		} catch (SecurityException e) {
		}

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				DemoApp demo = new DemoApp();
				try {
					demo.doLoad("Lana Del Rey", "b7539c32-53e7-4908-bda3-81449c367da6");
				} catch (Exception e) {
				}
			}
		});
	}

}
