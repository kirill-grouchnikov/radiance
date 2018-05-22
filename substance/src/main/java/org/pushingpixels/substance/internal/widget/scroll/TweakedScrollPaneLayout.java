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
package org.pushingpixels.substance.internal.widget.scroll;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Rectangle;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneLayout;
import javax.swing.Scrollable;
import javax.swing.UIManager;
import javax.swing.border.Border;

/**
 * A hideous hack to allow the display of the selector's button even when only
 * one scrollBar is visible.
 * <p>
 * Contributed by the original author under BSD license. Also appears in the <a
 * href="https://jdnc-incubator.dev.java.net">JDNC Incubator</a>.
 * 
 * @author weebib (Pierre LE LANNIC)
 */
public class TweakedScrollPaneLayout extends ScrollPaneLayout {
	private void superlayoutContainer(Container parent) {
		JScrollPane scrollPane = (JScrollPane) parent;
		vsbPolicy = scrollPane.getVerticalScrollBarPolicy();
		hsbPolicy = scrollPane.getHorizontalScrollBarPolicy();

		Rectangle availR = scrollPane.getBounds();
		Insets insets = parent.getInsets();
		availR.x = insets.left;
		availR.y = insets.top;
		availR.width -= insets.left + insets.right;
		availR.height -= insets.top + insets.bottom;

		boolean leftToRight = scrollPane.getComponentOrientation()
				.isLeftToRight();

		Rectangle colHeadR = new Rectangle(0, availR.y, 0, 0);

		if ((colHead != null) && (colHead.isVisible())) {
			int colHeadHeight = Math.min(availR.height, colHead
					.getPreferredSize().height);
			colHeadR.height = colHeadHeight;
			availR.y += colHeadHeight;
			availR.height -= colHeadHeight;
		}

		Rectangle rowHeadR = new Rectangle(0, 0, 0, 0);

		if ((rowHead != null) && (rowHead.isVisible())) {
			int rowHeadWidth = Math.min(availR.width, rowHead
					.getPreferredSize().width);
			rowHeadR.width = rowHeadWidth;
			availR.width -= rowHeadWidth;
			if (leftToRight) {
				rowHeadR.x = availR.x;
				availR.x += rowHeadWidth;
			} else {
				rowHeadR.x = availR.x + availR.width;
			}
		}

		Border viewportBorder = scrollPane.getViewportBorder();
		Insets vpbInsets;
		if (viewportBorder != null) {
			vpbInsets = viewportBorder.getBorderInsets(parent);
			availR.x += vpbInsets.left;
			availR.y += vpbInsets.top;
			availR.width -= vpbInsets.left + vpbInsets.right;
			availR.height -= vpbInsets.top + vpbInsets.bottom;
		} else {
			vpbInsets = new Insets(0, 0, 0, 0);
		}

		Component view = (viewport != null) ? viewport.getView() : null;
		Dimension viewPrefSize = (view != null) ? view.getPreferredSize()
				: new Dimension(0, 0);

		Dimension extentSize = (viewport != null) ? viewport
				.toViewCoordinates(availR.getSize()) : new Dimension(0, 0);

		boolean viewTracksViewportWidth = false;
		boolean viewTracksViewportHeight = false;
		boolean isEmpty = (availR.width < 0 || availR.height < 0);
		Scrollable sv;
		if (!isEmpty && view instanceof Scrollable) {
			sv = (Scrollable) view;
			viewTracksViewportWidth = sv.getScrollableTracksViewportWidth();
			viewTracksViewportHeight = sv.getScrollableTracksViewportHeight();
		} else {
			sv = null;
		}

		Rectangle vsbR = new Rectangle(0, availR.y - vpbInsets.top, 0, 0);

		boolean vsbNeeded;
		if (isEmpty) {
			vsbNeeded = false;
		} else if (vsbPolicy == VERTICAL_SCROLLBAR_ALWAYS) {
			vsbNeeded = true;
		} else if (vsbPolicy == VERTICAL_SCROLLBAR_NEVER) {
			vsbNeeded = false;
		} else { // vsbPolicy == VERTICAL_SCROLLBAR_AS_NEEDED
			vsbNeeded = !viewTracksViewportHeight
					&& (viewPrefSize.height > extentSize.height);
		}

		if ((vsb != null) && vsbNeeded) {
			adjustForVSB(true, availR, vsbR, vpbInsets, leftToRight);
			extentSize = viewport.toViewCoordinates(availR.getSize());
		}

		Rectangle hsbR = new Rectangle(availR.x - vpbInsets.left, 0, 0, 0);
		boolean hsbNeeded;
		if (isEmpty) {
			hsbNeeded = false;
		} else if (hsbPolicy == HORIZONTAL_SCROLLBAR_ALWAYS) {
			hsbNeeded = true;
		} else if (hsbPolicy == HORIZONTAL_SCROLLBAR_NEVER) {
			hsbNeeded = false;
		} else { // hsbPolicy == HORIZONTAL_SCROLLBAR_AS_NEEDED
			hsbNeeded = !viewTracksViewportWidth
					&& (viewPrefSize.width > extentSize.width);
		}
		if ((hsb != null) && hsbNeeded) {
			adjustForHSB(true, availR, hsbR, vpbInsets);
			if ((vsb != null) && !vsbNeeded
					&& (vsbPolicy != VERTICAL_SCROLLBAR_NEVER)) {
				extentSize = viewport.toViewCoordinates(availR.getSize());
				vsbNeeded = viewPrefSize.height > extentSize.height;
				if (vsbNeeded) {
					adjustForVSB(true, availR, vsbR, vpbInsets, leftToRight);

					// Hack to correct Bug 6411225
					// I don't actually measure the consequences of this bug
					// "fix"

					if (!leftToRight) {
						hsbR.x += vsbR.width;
					}

					// end of hack
				}
			}
		}

		if (viewport != null) {
			viewport.setBounds(availR);

			if (sv != null) {
				extentSize = viewport.toViewCoordinates(availR.getSize());

				boolean oldHSBNeeded = hsbNeeded;
				boolean oldVSBNeeded = vsbNeeded;
				viewTracksViewportWidth = sv.getScrollableTracksViewportWidth();
				viewTracksViewportHeight = sv
						.getScrollableTracksViewportHeight();
				if (vsb != null && vsbPolicy == VERTICAL_SCROLLBAR_AS_NEEDED) {
					boolean newVSBNeeded = !viewTracksViewportHeight
							&& (viewPrefSize.height > extentSize.height);
					if (newVSBNeeded != vsbNeeded) {
						vsbNeeded = newVSBNeeded;
						adjustForVSB(vsbNeeded, availR, vsbR, vpbInsets,
								leftToRight);
						extentSize = viewport.toViewCoordinates(availR
								.getSize());
					}
				}
				if (hsb != null && hsbPolicy == HORIZONTAL_SCROLLBAR_AS_NEEDED) {
					boolean newHSBbNeeded = !viewTracksViewportWidth
							&& (viewPrefSize.width > extentSize.width);
					if (newHSBbNeeded != hsbNeeded) {
						hsbNeeded = newHSBbNeeded;
						adjustForHSB(hsbNeeded, availR, hsbR, vpbInsets);
						if ((vsb != null) && !vsbNeeded
								&& (vsbPolicy != VERTICAL_SCROLLBAR_NEVER)) {
							extentSize = viewport.toViewCoordinates(availR
									.getSize());
							vsbNeeded = viewPrefSize.height > extentSize.height;
							if (vsbNeeded) {
								adjustForVSB(true, availR, vsbR, vpbInsets,
										leftToRight);
							}
						}
					}
				}
				if (oldHSBNeeded != hsbNeeded || oldVSBNeeded != vsbNeeded) {
					viewport.setBounds(availR);
				}
			}
		}
		vsbR.height = availR.height + vpbInsets.top + vpbInsets.bottom;
		hsbR.width = availR.width + vpbInsets.left + vpbInsets.right;
		rowHeadR.height = availR.height + vpbInsets.top + vpbInsets.bottom;
		rowHeadR.y = availR.y - vpbInsets.top;
		colHeadR.width = availR.width + vpbInsets.left + vpbInsets.right;
		colHeadR.x = availR.x - vpbInsets.left;

		if (rowHead != null) {
			rowHead.setBounds(rowHeadR);
		}

		if (colHead != null) {
			colHead.setBounds(colHeadR);
		}

		if (vsb != null) {
			if (vsbNeeded) {
				vsb.setVisible(true);
				vsb.setBounds(vsbR);
			} else {
				vsb.setVisible(false);
			}
		}

		if (hsb != null) {
			if (hsbNeeded) {
				hsb.setVisible(true);
				hsb.setBounds(hsbR);
			} else {
				hsb.setVisible(false);
			}
		}

		// bug 6411225 ????????

		if (lowerLeft != null) {
			lowerLeft.setBounds(leftToRight ? rowHeadR.x : vsbR.x, hsbR.y,
					leftToRight ? rowHeadR.width : vsbR.width, hsbR.height);
		}

		if (lowerRight != null) {
			lowerRight.setBounds(leftToRight ? vsbR.x : rowHeadR.x, hsbR.y,
					leftToRight ? vsbR.width : rowHeadR.width, hsbR.height);
		}

		if (upperLeft != null) {
			upperLeft.setBounds(leftToRight ? rowHeadR.x : vsbR.x, colHeadR.y,
					leftToRight ? rowHeadR.width : vsbR.width, colHeadR.height);
		}

		if (upperRight != null) {
			upperRight.setBounds(leftToRight ? vsbR.x : rowHeadR.x, colHeadR.y,
					leftToRight ? vsbR.width : rowHeadR.width, colHeadR.height);
		}
	}

	private void adjustForVSB(boolean wantsVSB, Rectangle available,
			Rectangle vsbR, Insets vpbInsets, boolean leftToRight) {
		int oldWidth = vsbR.width;
		if (wantsVSB) {
			int vsbWidth = Math.max(0, Math.min(vsb.getPreferredSize().width,
					available.width));

			available.width -= vsbWidth;
			vsbR.width = vsbWidth;

			if (leftToRight) {
				vsbR.x = available.x + available.width + vpbInsets.right;
			} else {
				vsbR.x = available.x - vpbInsets.left;
				available.x += vsbWidth;
			}
		} else {
			available.width += oldWidth;
		}
	}

	private void adjustForHSB(boolean wantsHSB, Rectangle available,
			Rectangle hsbR, Insets vpbInsets) {
		int oldHeight = hsbR.height;
		if (wantsHSB) {
			int hsbHeight = Math.max(0, Math.min(available.height, hsb
					.getPreferredSize().height));

			available.height -= hsbHeight;
			hsbR.y = available.y + available.height + vpbInsets.bottom;
			hsbR.height = hsbHeight;
		} else {
			available.height += oldHeight;
		}
	}

	public void layoutContainer(Container parent) {
		superlayoutContainer(parent);
		boolean isLeftToRight = parent.getComponentOrientation()
				.isLeftToRight();
		if (isLeftToRight && lowerRight == null)
			return;
		if (!isLeftToRight && lowerLeft == null)
			return;

		boolean onlyVsb = (vsb != null) && vsb.isVisible()
				&& ((hsb == null) || ((hsb != null) && (!hsb.isVisible())));
		if (onlyVsb) {
			Rectangle vsbBounds = vsb.getBounds();
			int delta = (hsb == null) ? ((Integer) (UIManager
					.get("ScrollBar.width"))).intValue() : hsb
					.getPreferredSize().height;
			vsbBounds.height -= delta;
			vsb.setBounds(vsbBounds);
			if (isLeftToRight) {
				lowerRight.setBounds(vsbBounds.x, vsbBounds.y
						+ vsbBounds.height, vsbBounds.width, delta);
				lowerRight.setVisible(true);
			} else {
				lowerLeft.setBounds(vsbBounds.x,
						vsbBounds.y + vsbBounds.height, vsbBounds.width, delta);
				lowerLeft.setVisible(true);
			}
		}
		boolean onlyHsb = (hsb != null) && hsb.isVisible()
				&& ((vsb == null) || ((vsb != null) && (!vsb.isVisible())));
		if (onlyHsb) {
			Rectangle hsbBounds = hsb.getBounds();
			int delta = (vsb == null) ? ((Integer) (UIManager
					.get("ScrollBar.width"))).intValue() : vsb
					.getPreferredSize().width;
			hsbBounds.width -= delta;
			if (!isLeftToRight) {
				hsbBounds.x += delta;
			}
			hsb.setBounds(hsbBounds);
			if (isLeftToRight) {
				lowerRight.setBounds(hsbBounds.x + hsbBounds.width,
						hsbBounds.y, delta, hsbBounds.height);
				lowerRight.setVisible(true);
			} else {
				lowerLeft.setBounds(hsbBounds.x - delta, hsbBounds.y, delta,
						hsbBounds.height);
				lowerLeft.setVisible(true);
			}
		}
	}
}