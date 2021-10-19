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
package org.pushingpixels.radiance.theming.extras.api.tabbed;

import org.pushingpixels.radiance.theming.extras.api.RadianceExtrasSlices.TabOverviewKind;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Base class for tab preview painters.
 * 
 * @author Kirill Grouchnikov
 */
public abstract class TabPreviewPainter {
	/**
	 * Draws a tab preview on the specified graphics.
	 * 
	 * @param tabPane
	 *            Tabbed pane.
	 * @param tabIndex
	 *            tabIndex Tab index for the preview paint.
	 * @param bufferedImage
	 *            Buffered image to draw the preview into.
	 * @param x
	 *            X coordinate of the preview area.
	 * @param y
	 *            Y coordinate of the preview area.
	 * @param w
	 *            Width of the preview area.
	 * @param h
	 *            Height of the preview area.
	 */
	public void previewTab(JTabbedPane tabPane, int tabIndex, BufferedImage bufferedImage,
			int x, int y, int w, int h) {
	}

	/**
	 * Checks whether the specified tab component is previewable.
	 * 
	 * @param tabPane
	 *            Tabbed pane.
	 * @param tabIndex
	 *            Tab index for the preview paint.
	 * @return <code>true</code> if the specified tab component is
	 *         previewable, <code>false</code> otherwise.
	 */
	public boolean hasPreview(JTabbedPane tabPane, int tabIndex) {
		return false;
	}

	/**
	 * Checks whether the specified tab component is sensitive to events.
	 * Overriding implementation may decide that disabled tabs do not respond to
	 * mouse and keyboard events, thus not allowing selecting the corresponding
	 * tab.
	 * 
	 * @param tabPane
	 *            Tabbed pane.
	 * @param tabIndex
	 *            Tab index.
	 * @return <code>true</code> if the specified tab component is sensitive
	 *         to events, <code>false</code> otherwise.
	 */
	public boolean isSensitiveToEvents(JTabbedPane tabPane, int tabIndex) {
		return false;
	}

	/**
	 * Returns the screen bounds of the tab preview dialog window.
	 * 
	 * @param tabPane
	 *            Tabbed pane.
	 * @return Screen bounds of the preview dialog window of the specified
	 *         tabbed pane.
	 */
	public Rectangle getPreviewDialogScreenBounds(JTabbedPane tabPane) {
		Rectangle tabPaneBounds = tabPane.getBounds();
		Point tabPaneScreenLoc = tabPane.getLocationOnScreen();
		return new Rectangle(tabPaneScreenLoc.x, tabPaneScreenLoc.y,
				tabPaneBounds.width, tabPaneBounds.height);
	}

	/**
	 * Returns the owner of the overview dialog of the specified tabbed pane. If
	 * this function retuns a non-<code>null</code> value, the overview
	 * dialog will be modal for the corresponding frame.
	 * 
	 * @param tabPane
	 *            Tabbed pane.
	 * @return If not <code>null</code>, the overview dialog for the
	 *         specified tabbed pane will be modal for the corresponding frame.
	 */
	public JFrame getModalOwner(JTabbedPane tabPane) {
		return null;
	}

	/**
	 * Checks whether the specified tabbed pane has an overview dialog.
	 * 
	 * @param tabPane
	 *            Tabbed pane.
	 * @return <code>true</code> if the specified tabbed pane has an overview
	 *         dialog, <code>false</code> otherwise.
	 */
	public boolean hasOverviewDialog(JTabbedPane tabPane) {
		return false;
	}

	/**
	 * Checks whether the specified tabbed pane has a preview window for the
	 * specified tab.
	 * 
	 * @param tabPane
	 *            Tabbed pane.
	 * @param tabIndex
	 *            Tab index.
	 * @return <code>true</code> if the specified tabbed pane has a preview
	 *         window for the specified tab, <code>false</code> otherwise.
	 */
	public boolean hasPreviewWindow(JTabbedPane tabPane, int tabIndex) {
		return false;
	}

	/**
	 * Returns the dimension for the tab preview window.
	 * 
	 * @param tabPane
	 *            Tabbed pane.
	 * @param tabIndex
	 *            Tab index.
	 * @return Dimension of the tab preview window for the specified tab in the
	 *         specified tabbed pane.
	 */
	public Dimension getPreviewWindowDimension(JTabbedPane tabPane, int tabIndex) {
		return new Dimension(300, 200);
	}

	/**
	 * Returns extra delay (in milliseconds) for showing the tab preview window.
	 * The base delay is 2000 milliseconds (2 seconds). This function must
	 * return a non-negative value.
	 * 
	 * @param tabPane
	 *            Tabbed pane.
	 * @param tabIndex
	 *            Tab index.
	 * @return Non-negative extra delay (in milliseconds) for showing the tab
	 *         preview window.
	 */
	public int getPreviewWindowExtraDelay(JTabbedPane tabPane, int tabIndex) {
		return 0;
	}

	/**
	 * Returns indication whether the thumbnail preview should be updated
	 * periodically. If the return value is <code>true</code>, then the
	 * implementation of {@link #getUpdateCycle(JTabbedPane)} returns the
	 * refresh cycle length in milliseconds.
	 * 
	 * @param tabPane
	 *            Tabbed pane.
	 * @return <code>true</code> if the thumbnail preview of the specified
	 *         tabbed pane should be updated periodically, <code>false</code>
	 *         otherwise.
	 */
	public boolean toUpdatePeriodically(JTabbedPane tabPane) {
		return false;
	}

	/**
	 * If the result of {@link #toUpdatePeriodically(JTabbedPane)} is
	 * <code>true</code>, returns the update cycle length in milliseconds.
	 * 
	 * @param tabPane
	 *            Tabbed pane.
	 * @return Update cycle length in milliseconds for the thumbnail preview of
	 *         the specified tabbed pane.
	 */
	public int getUpdateCycle(JTabbedPane tabPane) {
		return 10000;
	}

	/**
	 * Returns the tab overview kind for the specified tabbed pane. Relevant if
	 * {@link #hasOverviewDialog(JTabbedPane)} returns <code>true</code> for
	 * the same tabbed pane. If {@link #hasOverviewDialog(JTabbedPane)} returns
	 * <code>true</code>, the result should be not <code>null</code>.
	 * 
	 * 
	 * @param tabPane
	 *            Tabbed pane.
	 * @return Tab overview kind for the specified tabbed pane.
	 */
	public TabOverviewKind getOverviewKind(JTabbedPane tabPane) {
		return TabOverviewKind.GRID;
	}

	/**
	 * Returns indication whether the tab overview dialog should be
	 * automatically disposed when it loses focus.
	 * 
	 * @return if <code>true</code>, the tab overview dialog will be disposed
	 *         when it loses focus.
	 */
	public boolean toDisposeOverviewOnFocusLoss() {
		return true;
	}
}
