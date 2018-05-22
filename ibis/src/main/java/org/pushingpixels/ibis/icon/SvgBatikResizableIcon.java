/*
 * Copyright (c) 2005-2018 Ibis Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Ibis Kirill Grouchnikov nor the names of 
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
package org.pushingpixels.ibis.icon;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.zip.GZIPInputStream;

import javax.swing.event.EventListenerList;

import org.apache.batik.swing.gvt.GVTTreeRendererAdapter;
import org.apache.batik.swing.gvt.GVTTreeRendererEvent;
import org.apache.batik.util.EventDispatcher.Dispatcher;
import org.pushingpixels.flamingo.api.common.AsynchronousLoadListener;
import org.pushingpixels.flamingo.api.common.AsynchronousLoading;
import org.pushingpixels.flamingo.api.common.icon.ResizableIcon;

/**
 * SVG-based implementation of {@link ResizableIcon} based on Apache Batik
 * library.
 * 
 * @author Kirill Grouchnikov.
 */
public class SvgBatikResizableIcon extends SvgBatikIcon implements
		ResizableIcon, AsynchronousLoading {
	/**
	 * The listeners.
	 */
	protected EventListenerList listenerList;

	/**
	 * Constructs an input stream with uncompressed contents from the specified
	 * input stream with compressed contents.
	 * 
	 * @param zippedStream
	 *            Input stream with compressed contents.
	 * @return Input stream with uncompressed contents.
	 * @throws IOException
	 *             in case any I/O operation failed.
	 */
	protected static InputStream constructFromZipStream(InputStream zippedStream)
			throws IOException {
		GZIPInputStream gis = new GZIPInputStream(zippedStream);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		byte[] buf = new byte[2048];
		int len;
		while ((len = gis.read(buf)) != -1) {
			baos.write(buf, 0, len);
		}

		return new ByteArrayInputStream(baos.toByteArray());
	}

	/**
	 * Returns the icon for the specified URL. The URL is assumed to point to
	 * uncompressed SVG contents.
	 * 
	 * @param location
	 *            Icon URL.
	 * @param initialDim
	 *            Initial dimension of the icon.
	 * @return Icon instance.
	 */
	public static SvgBatikResizableIcon getSvgIcon(URL location,
			final Dimension initialDim) {
		try {
			return new SvgBatikResizableIcon(location.openStream(), initialDim);
		} catch (IOException ioe) {
			return null;
		}
	}

	/**
	 * Returns the icon for the specified input stream. The stream is assumed to
	 * contain uncompressed SVG contents.
	 * 
	 * @param inputStream
	 *            Icon stream.
	 * @param initialDim
	 *            Initial dimension of the icon.
	 * @return Icon instance.
	 */
	public static SvgBatikResizableIcon getSvgIcon(InputStream inputStream,
			final Dimension initialDim) {
		if (inputStream == null)
			return null;
		try {
			return new SvgBatikResizableIcon(inputStream, initialDim);
		} catch (IOException ioe) {
			return null;
		}
	}

	/**
	 * Returns the icon for the specified URL. The URL is assumed to point to
	 * compressed SVG contents.
	 * 
	 * @param location
	 *            Icon URL.
	 * @param initialDim
	 *            Initial dimension of the icon.
	 * @return Icon instance.
	 */
	public static SvgBatikResizableIcon getSvgzIcon(URL location,
			final Dimension initialDim) {
		try {
			return new SvgBatikResizableIcon(constructFromZipStream(location
					.openStream()), initialDim);
		} catch (IOException ioe) {
			return null;
		}
	}

	/**
	 * Returns the icon for the specified input stream. The stream is assumed to
	 * contain compressed SVG contents.
	 * 
	 * @param inputStream
	 *            Icon stream.
	 * @param initialDim
	 *            Initial dimension of the icon.
	 * @return Icon instance.
	 */
	public static SvgBatikResizableIcon getSvgzIcon(InputStream inputStream,
			final Dimension initialDim) {
		try {
			return new SvgBatikResizableIcon(
					constructFromZipStream(inputStream), initialDim);
		} catch (IOException ioe) {
			return null;
		}
	}

	/**
	 * Creates a new resizable icon based on SVG content.
	 * 
	 * @param inputStream
	 *            Input stream with uncompressed SVG content.
	 * @param initialDim
	 *            Initial dimension.
	 * @throws IOException
	 *             in case any I/O operation failed.
	 */
	private SvgBatikResizableIcon(InputStream inputStream,
			final Dimension initialDim) throws IOException {
		super(inputStream, initialDim.width, initialDim.height);
		this.listenerList = new EventListenerList();

		this.addGVTTreeRendererListener(new GVTTreeRendererAdapter() {
			@Override
			public void gvtRenderingCompleted(GVTTreeRendererEvent e) {
				fireAsyncCompleted(Boolean.valueOf(true));
			}

			@Override
			public void gvtRenderingFailed(GVTTreeRendererEvent arg0) {
				fireAsyncCompleted(Boolean.valueOf(false));
			}
		});
	}

	@Override
	public void setDimension(Dimension dim) {
		this.setPreferredSize(dim);
	}

    @Override
	public void addAsynchronousLoadListener(AsynchronousLoadListener l) {
		listenerList.add(AsynchronousLoadListener.class, l);
	}

    @Override
	public void removeAsynchronousLoadListener(AsynchronousLoadListener l) {
		listenerList.remove(AsynchronousLoadListener.class, l);
	}

	@Override
	protected boolean renderGVTTree(int renderWidth, int renderHeight) {
		boolean cached = super.renderGVTTree(renderWidth, renderHeight);
		if (cached) {
			this.fireAsyncCompleted(Boolean.valueOf(true));
		}
		return cached;
	}

	/**
	 * Fires the asynchronous load event.
	 * 
	 * @param event
	 *            Event object.
	 */
	protected void fireAsyncCompleted(Boolean event) {
		// Guaranteed to return a non-null array
		Object[] listeners = listenerList.getListenerList();
		// Process the listeners last to first, notifying
		// those that are interested in this event
		for (int i = listeners.length - 2; i >= 0; i -= 2) {
			if (listeners[i] == AsynchronousLoadListener.class) {
				((AsynchronousLoadListener) listeners[i + 1]).completed(event);
			}
		}
	}

	/**
	 * Dispatcher for GVT tree rendering completion.
	 */
	static Dispatcher asyncCompletedDispatcher = new Dispatcher() {
		public void dispatch(Object listener, Object event) {
			((AsynchronousLoadListener) listener).completed((Boolean) event);
		}
	};

	@Override
	public synchronized boolean isLoading() {
		String cacheKey = this.getIconWidth() + ":" + this.getIconHeight();
		BufferedImage image = this.cachedImages.get(cacheKey);
		return (image == null);
	}
}
