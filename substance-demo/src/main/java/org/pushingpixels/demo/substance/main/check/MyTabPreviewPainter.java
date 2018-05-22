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
package org.pushingpixels.demo.substance.main.check;

import javax.swing.JTabbedPane;

import org.pushingpixels.substance.extras.api.SubstanceExtrasSlices.TabOverviewKind;
import org.pushingpixels.substance.extras.api.tabbed.DefaultTabPreviewPainter;

/**
 * A custom tab preview painter for the test application.
 * 
 * @author Kirill Grouchnikov
 */
public class MyTabPreviewPainter extends DefaultTabPreviewPainter {
	/**
	 * The current tab overview kind.
	 */
	protected TabOverviewKind tabOverviewKind;

	/**
	 * Sets the tab overview kind.
	 * 
	 * @param tabOverviewKind
	 *            New tab overview kind.
	 */
	public void setTabOverviewKind(TabOverviewKind tabOverviewKind) {
		this.tabOverviewKind = tabOverviewKind;
	}

	@Override
	public TabOverviewKind getOverviewKind(JTabbedPane tabPane) {
		if (this.tabOverviewKind == null)
			return super.getOverviewKind(tabPane);
		return this.tabOverviewKind;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.lafwidget.tabbed.TabPreviewPainter#toUpdatePeriodically(javax.swing.JTabbedPane)
	 */
	@Override
	public boolean toUpdatePeriodically(JTabbedPane tabPane) {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.lafwidget.tabbed.TabPreviewPainter#getUpdateCycle(javax.swing.JTabbedPane)
	 */
	@Override
	public int getUpdateCycle(JTabbedPane tabPane) {
		return 3000;
	}
}