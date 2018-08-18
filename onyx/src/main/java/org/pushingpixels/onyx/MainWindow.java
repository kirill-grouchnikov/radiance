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

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.pushingpixels.onyx.content.AlbumOverviewPanel;
import org.pushingpixels.onyx.data.Album;
import org.pushingpixels.onyx.details.DetailsWindowManager;

public class MainWindow extends JFrame {
	AlbumOverviewPanel contentPanel;

	CloseButton closeButton;

	public MainWindow() {
		super("Onyx");
		this.setUndecorated(true);
		this.setBackground(new Color(0, 0, 0, 0));

		this.contentPanel = new AlbumOverviewPanel();
		this.closeButton = new CloseButton();

		Container contentPane = this.getContentPane();
		contentPane.add(this.contentPanel);
		contentPane.add(this.closeButton);

		contentPane.setComponentZOrder(this.contentPanel, 1);
		contentPane.setComponentZOrder(this.closeButton, 0);

		contentPane.setLayout(new LayoutManager() {
			@Override
			public void addLayoutComponent(String name, Component comp) {
			}

			@Override
			public void removeLayoutComponent(Component comp) {
			}

			@Override
			public Dimension minimumLayoutSize(Container parent) {
				return null;
			}

			@Override
			public Dimension preferredLayoutSize(Container parent) {
				return null;
			}

			@Override
			public void layoutContainer(Container parent) {
				int closeButtonDim = 35;
				closeButton.setBounds(getWidth() - closeButtonDim, 0,
						closeButtonDim, closeButtonDim);
				contentPanel
						.setBounds(0, 10, getWidth() - 10, getHeight() - 10);
			}
		});

		this.addWindowFocusListener(new WindowAdapter() {
			@Override
			public void windowLostFocus(WindowEvent e) {
				DetailsWindowManager.disposeCurrentlyShowing();
			}
		});

		this.setSize(560, 230);
		this.setLocationRelativeTo(null);
	}

	public AlbumOverviewComponent addAlbumItem(Album album) {
		return contentPanel.addAlbumItem(album);
	}

	public void setLoading(boolean isLoading) {
		contentPanel.setLoading(isLoading);
	}

	public void setSearchString(String searchString) {
		contentPanel.setSearchString(searchString);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new MainWindow().setVisible(true);
			}
		});
	}
}
