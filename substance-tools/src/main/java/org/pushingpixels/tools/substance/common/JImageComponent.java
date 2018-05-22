/*
 * Copyright (c) 2005-2018 Substance Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Substance Kirill Grouchnikov nor the names of 
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
package org.pushingpixels.tools.substance.common;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.ComponentInputMap;
import javax.swing.InputMap;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.TransferHandler;
import javax.swing.UIManager;

import org.pushingpixels.substance.internal.utils.border.SubstanceBorder;
import org.pushingpixels.substance.internal.utils.filters.RenderingUtils;

public class JImageComponent extends JPanel {
	private BufferedImage image;

	private double leftX;

	private double topY;

	private double zoom;

	private boolean isDragging;

	private Point lastDragPoint;

	private Color selectedColor;

	private Color rolloverColor;

	private File originalFile;

	private String[] legend;

	public JImageComponent(boolean hasKeyboardZoom) {
		this.setTransferHandler(new TransferHandler() {
			@Override
			public boolean canImport(TransferSupport support) {
				// can import a list of files
				if (support
						.isDataFlavorSupported(DataFlavor.javaFileListFlavor))
					return true;
				// an image
				if (support.isDataFlavorSupported(DataFlavor.imageFlavor))
					return true;
				for (DataFlavor df : support.getDataFlavors()) {
					// and a flavor represented by URL
					if (df.getRepresentationClass() == URL.class)
						return true;
				}
				return false;
			}

			@Override
			public boolean importData(TransferSupport support) {
				Transferable t = support.getTransferable();

				try {
					if (t.isDataFlavorSupported(DataFlavor.imageFlavor)) {
						// load the image
						Image data = (Image) t
								.getTransferData(DataFlavor.imageFlavor);
						originalFile = null;
						BufferedImage old = image;
						image = new BufferedImage(data.getWidth(null), data
								.getHeight(null), BufferedImage.TYPE_INT_ARGB);
						image.getGraphics().drawImage(data, 0, 0, null);
						reset();
						repaint();

						firePropertyChange("image", old, image);

						return true;
					}

					if (t.isDataFlavorSupported(DataFlavor.javaFileListFlavor)) {
						// load the image from the file
						java.util.List<File> l = (java.util.List<File>) t
								.getTransferData(DataFlavor.javaFileListFlavor);

						if (l.size() == 1) {
							BufferedImage oldImage = image;
							File oldFile = originalFile;
							originalFile = l.get(0);
							image = ImageIO.read(originalFile);
							reset();
							repaint();

							firePropertyChange("image", oldImage, image);
							firePropertyChange("file", oldFile, originalFile);
						}
						return true;
					}

					for (DataFlavor df : support.getDataFlavors()) {
						if (df.getRepresentationClass() == URL.class) {
							// load the image from the URL
							URL url = (URL) t.getTransferData(df);
							originalFile = null;
							Image data = ImageIO.read(url);
							if (data != null) {
								BufferedImage old = image;
								image = new BufferedImage(data.getWidth(null),
										data.getHeight(null),
										BufferedImage.TYPE_INT_ARGB);
								image.getGraphics().drawImage(data, 0, 0, null);
								reset();
								repaint();

								firePropertyChange("image", old, image);
								return true;
							}
						}
					}
					return true;
				} catch (Throwable thr) {
					thr.printStackTrace();
					return false;
				}
			}
		});

		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (image == null)
					return;

				if (!e.isPopupTrigger()) {
					lastDragPoint = e.getPoint();
				} else {
					processPopup(e);
				}
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					processPopup(e);
				} else {
					if (image == null)
						return;

					if (!isDragging) {
						int xRel = e.getX();
						int yRel = e.getY();
						int xAbs = (int) ((xRel / zoom) + leftX);
						int yAbs = (int) ((yRel / zoom) + topY);

						if ((xAbs >= 0) && (xAbs < image.getWidth())
								&& (yAbs >= 0) && (yAbs < image.getHeight())) {
							selectedColor = new Color(image.getRGB(xAbs, yAbs));
							firePropertyChange("selectedColor", null,
									selectedColor);
						}
					}
					isDragging = false;
				}
			}

			private void processPopup(MouseEvent e) {
				JPopupMenu editMenu = new JPopupMenu();
				editMenu.add(new AbstractAction("paste from clipboard") {
					@Override
					public void actionPerformed(ActionEvent e) {
						try {
							Clipboard clipboard = Toolkit.getDefaultToolkit()
									.getSystemClipboard();
							DataFlavor[] flavors = clipboard
									.getAvailableDataFlavors();
							if (flavors != null) {
								for (DataFlavor flavor : flavors) {
									if (Image.class == flavor
											.getRepresentationClass()) {
										Image data = (Image) clipboard
												.getData(flavor);

										BufferedImage old = image;
										originalFile = null;
										image = new BufferedImage(data
												.getWidth(null), data
												.getHeight(null),
												BufferedImage.TYPE_INT_ARGB);
										image.getGraphics().drawImage(data, 0,
												0, null);
										reset();
										repaint();
										firePropertyChange("image", old, image);
										break;
									}
								}
							}
							repaint();
						} catch (Throwable thr) {
						}
					}

					@Override
					public boolean isEnabled() {
						Clipboard clipboard = Toolkit.getDefaultToolkit()
								.getSystemClipboard();
						DataFlavor[] flavors = clipboard
								.getAvailableDataFlavors();
						if (flavors != null) {
							for (DataFlavor flavor : flavors) {
								if (Image.class == flavor
										.getRepresentationClass()) {
									return true;
								}
							}
						}
						return false;
					}
				});
				Point pt = SwingUtilities.convertPoint(e.getComponent(), e
						.getPoint(), JImageComponent.this);
				editMenu.show(JImageComponent.this, pt.x, pt.y);
			}

		});

		this.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				if (image == null)
					return;

				isDragging = true;

				Point currDragPoint = e.getPoint();
				double dx = ((currDragPoint.x - lastDragPoint.x) / zoom);
				double dy = ((currDragPoint.y - lastDragPoint.y) / zoom);
				leftX -= dx;
				topY -= dy;

				lastDragPoint = currDragPoint;
				repaint();
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				if (image == null)
					return;

				int xRel = e.getX();
				int yRel = e.getY();
				int xAbs = (int) ((xRel / zoom) + leftX);
				int yAbs = (int) ((yRel / zoom) + topY);

				// System.out.println(xRel + ":" + yRel + "->" + xAbs + ":"
				// + yAbs);

				if ((xAbs >= 0) && (xAbs < image.getWidth()) && (yAbs >= 0)
						&& (yAbs < image.getHeight())) {
					Color old = rolloverColor;
					rolloverColor = new Color(image.getRGB(xAbs, yAbs));
					firePropertyChange("rolloverColor", old, rolloverColor);
				}
			}
		});

		this.addMouseWheelListener(new MouseWheelListener() {
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				zoom += e.getScrollAmount() * e.getWheelRotation() / 10.0;
				zoom = Math.max(1.0, zoom);
				repaint();
			}
		});

		if (hasKeyboardZoom) {
			Action zoomInAction = new AbstractAction("zoomin") {
				@Override
				public void actionPerformed(ActionEvent e) {
					zoom += 0.1;
					repaint();
				}
			};
			Action zoomOutAction = new AbstractAction("zoomout") {
				@Override
				public void actionPerformed(ActionEvent e) {
					zoom -= 0.1;
					zoom = Math.max(1.0, zoom);
					repaint();
				}
			};

			// create the key input maps to handle the zooming
			// with I and O
			InputMap inputMap = new ComponentInputMap(this);
			inputMap.put(KeyStroke.getKeyStroke("I"), "zoomin");
			inputMap.put(KeyStroke.getKeyStroke("O"), "zoomout");

			ActionMap actionMap = new ActionMap();
			actionMap.put("zoomin", zoomInAction);
			actionMap.put("zoomout", zoomOutAction);

			// and register the maps
			this.setInputMap(WHEN_IN_FOCUSED_WINDOW, inputMap);
			this.setActionMap(actionMap);
		}

		this.setBorder(new SubstanceBorder());

		this.zoom = 1.0;
	}

	public void setLegend(String[] legend) {
		this.legend = legend;
	}

	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setColor(Color.white);
		g2d.fillRect(0, 0, getWidth(), getHeight());

		if (this.image != null) {
			// zoom from the visible top-left pixel
			g2d.scale(zoom, zoom);
			g2d.translate(-this.leftX, -this.topY);
			g2d.drawImage(this.image, 0, 0, null);
		} else {
			RenderingUtils.installDesktopHints(g2d, this);
			g2d.setFont(UIManager.getFont("Label.font"));
			g2d.setColor(Color.black);

			int fh = g2d.getFontMetrics().getHeight();
			if (this.legend != null) {
				for (int i = 0; i < this.legend.length; i++) {
					g2d.drawString(this.legend[i], 10, 20 + i * fh);
				}
			}
		}

		g2d.dispose();
	}

	private void reset() {
		leftX = 0;
		topY = 0;
		zoom = 1.0;
	}

	public BufferedImage getImage() {
		return image;
	}

	public File getOriginalFile() {
		return originalFile;
	}

	public Point toOriginalImageCoords(int x, int y) {
		int xAbs = (int) ((x / zoom) + leftX);
		int yAbs = (int) ((y / zoom) + topY);
		return new Point(xAbs, yAbs);
	}
}