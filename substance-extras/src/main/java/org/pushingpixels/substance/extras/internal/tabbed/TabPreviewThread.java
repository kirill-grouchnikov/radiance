/*
 * Copyright (c) 2005-2019 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.substance.extras.internal.tabbed;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;

import org.pushingpixels.substance.extras.api.tabbed.TabPreviewPainter;
import org.pushingpixels.substance.extras.internal.tabbed.DeltaQueue.DeltaMatcher;
import org.pushingpixels.substance.extras.internal.tabbed.DeltaQueue.Deltable;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.TrackableThread;
import org.pushingpixels.substance.internal.utils.WidgetUtilities;

/**
 * Thread for running the tab preview requests.
 * 
 * @author Kirill Grouchnikov
 */
public class TabPreviewThread extends TrackableThread {
	/**
	 * Indication whether a stop request has been issued on <code>this</code>
	 * thread.
	 */
	private boolean stopRequested;

	/**
	 * Queue of preview requests. Contains {@link TabPreviewInfo}s.
	 */
	protected DeltaQueue previewQueue;

	/**
	 * Information for previewing a tabbed pane.
	 * 
	 * @author Kirill Grouchnikov
	 */
	public static class TabPreviewInfo extends DeltaQueue.Deltable {
		/**
		 * Tabbed pane.
		 */
		public JTabbedPane tabPane;

		/**
		 * Callback for passing the preview thumbnail once it is computed.
		 */
		public TabPreviewThread.TabPreviewCallback previewCallback;

		/**
		 * Width of the preview thumbnail.
		 */
		private int previewWidth;

		/**
		 * Height of the preview thumbnail.
		 */
		private int previewHeight;

		/**
		 * Indicates whether all tabs in the {@link #tabPane} should be
		 * previewed.
		 */
		public boolean toPreviewAllTabs;

		/**
		 * If {@link #toPreviewAllTabs} is <code>false</code>, contains the
		 * index of the tab to be previewed.
		 */
		public int tabIndexToPreview;

		/**
		 * Points to the preview initiator.
		 */
		public Object initiator;

		public void setPreviewWidth(int previewWidth) {
			this.previewWidth = previewWidth;
		}

		public int getPreviewWidth() {
			return this.previewWidth;
		}

		public void setPreviewHeight(int previewHeight) {
			this.previewHeight = previewHeight;
		}

		public int getPreviewHeight() {
			return this.previewHeight;
		}
	}

	/**
	 * Interface for offering the tab preview image once it has been computed.
	 * 
	 * @author Kirill Grouchnikov
	 */
	public static interface TabPreviewCallback {
		/**
		 * Starts the current cycle of
		 * {@link #offer(JTabbedPane, int, BufferedImage)} calls. This can be
		 * used by the implementing class to revalidate itself in case the tab
		 * count in the specified tabbed pane has changed since the previous
		 * cycle of {@link #offer(JTabbedPane, int, BufferedImage)} call.
		 * 
		 * @param tabPane
		 *            Tabbed pane.
		 * @param tabCount
		 *            Tab count in the tabbed pane.
		 * @param tabPreviewInfo
		 *            Tab preview info. Can be changed in the implementation
		 *            code.
		 */
		public void start(JTabbedPane tabPane, int tabCount,
				TabPreviewInfo tabPreviewInfo);

		/**
		 * Offers the preview image (thumbnail) of a tab in the specified tabbed
		 * pane.
		 * 
		 * @param tabPane
		 *            Tabbed pane.
		 * @param tabIndex
		 *            Tab index.
		 * @param componentSnap
		 *            Tab preview image.
		 */
		public void offer(JTabbedPane tabPane, int tabIndex,
				BufferedImage componentSnap);
	}

	/**
	 * Simple constructor. Defined private for singleton.
	 * 
	 * @see #getInstance()
	 */
	private TabPreviewThread() {
		super();
		this.setName("Laf-Widget tab preview");
		this.stopRequested = false;
		this.previewQueue = new DeltaQueue();
	}

	@Override
	public void run() {
		while (!this.stopRequested) {
			try {
				// System.out.println(System.currentTimeMillis() + " Polling");
				int delay = 500;
				List<Deltable> expired = this.dequeueTabPreviewRequest(delay);
				for (Deltable dExpired : expired) {
					final TabPreviewInfo nextPreviewInfo = (TabPreviewInfo) dExpired;
					final JTabbedPane jtp = nextPreviewInfo.tabPane;
					if (jtp == null)
						continue;
					final TabPreviewPainter previewPainter = TabPreviewUtilities
							.getTabPreviewPainter(jtp);
					final int tabCount = jtp.getTabCount();

					if (nextPreviewInfo.toPreviewAllTabs) {
						// The call to start() is only relevant for the
						// preview of all tabs.
						SwingUtilities.invokeLater(() ->
								nextPreviewInfo.previewCallback.start(jtp, 
										jtp.getTabCount(), nextPreviewInfo));

						for (int i = 0; i < tabCount; i++) {
							final int index = i;
							SwingUtilities.invokeLater(() -> 
									getSingleTabPreviewImage(jtp, previewPainter, 
											nextPreviewInfo, index));
						}
					} else {
						SwingUtilities.invokeLater(() -> 
							getSingleTabPreviewImage(jtp, previewPainter,
									nextPreviewInfo, nextPreviewInfo.tabIndexToPreview));
					}

					if (previewPainter.toUpdatePeriodically(jtp)) {
						TabPreviewInfo cyclePreviewInfo = new TabPreviewInfo();
						// copy all the fields from the currently processed
						// request
						cyclePreviewInfo.tabPane = nextPreviewInfo.tabPane;
						cyclePreviewInfo.tabIndexToPreview = nextPreviewInfo.tabIndexToPreview;
						cyclePreviewInfo.toPreviewAllTabs = nextPreviewInfo.toPreviewAllTabs;
						cyclePreviewInfo.previewCallback = nextPreviewInfo.previewCallback;
						cyclePreviewInfo.setPreviewWidth(nextPreviewInfo.getPreviewWidth());
						cyclePreviewInfo.setPreviewHeight(nextPreviewInfo.getPreviewHeight());
						cyclePreviewInfo.initiator = nextPreviewInfo.initiator;

						// schedule it to app-specific delay
						cyclePreviewInfo.setDelta(previewPainter.getUpdateCycle(cyclePreviewInfo.tabPane));

						// queue the new request
						this.queueTabPreviewRequest(cyclePreviewInfo);
					}
				}
				Thread.sleep(delay);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}

	/**
	 * Computes and offers the preview thumbnail for a single tab.
	 * 
	 * @param tabPane
	 *            Tabbed pane.
	 * @param previewPainter
	 *            Tab preview painter.
	 * @param previewInfo
	 *            Preview info.
	 * @param tabIndex
	 *            Index of the tab to preview.
	 */
	protected void getSingleTabPreviewImage(final JTabbedPane tabPane,
			final TabPreviewPainter previewPainter,
			final TabPreviewInfo previewInfo, final int tabIndex) {
		int pWidth = previewInfo.getPreviewWidth();
		int pHeight = previewInfo.getPreviewHeight();
		final BufferedImage previewImage = SubstanceCoreUtilities.getBlankImage(pWidth, pHeight);
		Component comp = tabPane.getComponentAt(tabIndex);

		if (previewPainter.hasPreview(tabPane, tabIndex)) {
			Map<Component, Boolean> dbSnapshot = new HashMap<Component, Boolean>();
			WidgetUtilities.makePreviewable(comp, dbSnapshot);
			previewPainter.previewTab(tabPane, tabIndex, previewImage, 0, 0, pWidth, pHeight);
			WidgetUtilities.restorePreviewable(comp, dbSnapshot);
		} else {
			Graphics2D gr = previewImage.createGraphics();
			gr.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			gr.setColor(Color.red);
			gr.setStroke(new BasicStroke(Math.max(5.0f, Math.min(pWidth, pHeight) / 10.0f)));
			gr.drawLine(0, 0, pWidth, pHeight);
			gr.drawLine(0, pHeight, pWidth, 0);
			gr.dispose();
		}

		if (previewInfo.previewCallback != null) {
			SwingUtilities.invokeLater(() ->
					previewInfo.previewCallback.offer(tabPane, tabIndex, previewImage));
		}
	}

	/**
	 * Queues the request to preview one or all tabs in the specified tabbed
	 * pane. Once the request is queued, the thread will pick it up from the
	 * queue (in at most 500 milliseconds in the current implementation) and
	 * start processing it. For each tab (if all tabs were requested to be
	 * previewed), the preview thumbnail will be offered to the relevant
	 * callback. This allows to maintain the interactivity of the application
	 * while generating the preview thumbnails for the tab overview dialog (see
	 * {@link TabOverviewDialog}).
	 * 
	 * @param previewInfo
	 *            Tab preview info.
	 */
	public void queueTabPreviewRequest(TabPreviewInfo previewInfo) {
		this.previewQueue.queue(previewInfo);
	}

	/**
	 * Cancels all tab preview requests that were initiated by the specified
	 * initiator.
	 * 
	 * @param initiator
	 *            Initiator.
	 */
	public void cancelTabPreviewRequests(final Object initiator) {
		DeltaMatcher matcher = new DeltaMatcher() {
			public boolean matches(Deltable deltable) {
				TabPreviewInfo currInfo = (TabPreviewInfo) deltable;
				return (currInfo.initiator == initiator);
			}
		};
		this.previewQueue.removeMatching(matcher);
	}

	/**
	 * Removes the tab preview requests that have at most specified delay left.
	 * 
	 * @param delay
	 *            Delay.
	 * @return The list of all tab preview requests that have at most specified
	 *         delay left.
	 */
	private List<Deltable> dequeueTabPreviewRequest(int delay) {
		return this.previewQueue.dequeue(delay);
	}

	@Override
	protected void requestStop() {
		this.stopRequested = true;
		TabPreviewThread.tabPreviewThread = null;
	}

	/**
	 * The preview thread.
	 */
	private static TabPreviewThread tabPreviewThread;

	/**
	 * Returns the singleton instance of the tab preview thread.
	 * 
	 * @return The singleton instance of the tab preview thread.
	 */
	public static synchronized TabPreviewThread getInstance() {
		if (TabPreviewThread.tabPreviewThread == null) {
			// System.err.println("Allocating ");
			// Thread.dumpStack();
			TabPreviewThread.tabPreviewThread = new TabPreviewThread();
			TabPreviewThread.tabPreviewThread.start();
		}
		return TabPreviewThread.tabPreviewThread;
	}

	/**
	 * Returns indication whether tab preview thread is running.
	 * 
	 * @return <code>true</code> if the tab preview thread is running,
	 *         <code>false</code> otherwise.
	 */
	public static synchronized boolean instanceRunning() {
		return (TabPreviewThread.tabPreviewThread != null);
	}
}