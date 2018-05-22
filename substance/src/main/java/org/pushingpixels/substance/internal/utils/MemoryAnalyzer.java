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
package org.pushingpixels.substance.internal.utils;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.swing.SwingUtilities;
import javax.swing.UIDefaults;
import javax.swing.UIManager;

/**
 * Tracer for memory usage patterns of <b>Substance</b> look-and-feel. The
 * tracer is started when VM has <code>-Dsubstancelaf.traceFile</code> flag. The
 * value of this flag specifies the location of trace log file. When activated,
 * the tracer runs a thread that collects information on memory usage and
 * appends it to the trace log file every <code>X</code> seconds. The
 * <code>X</code> (delay) is specified in the constructor. This class is <b>for
 * internal use only</b>.
 * 
 * @author Kirill Grouchnikov
 */
public class MemoryAnalyzer extends TrackableThread {
	/**
	 * Sleep delay between trace log iterations.
	 */
	private long delay;

	/**
	 * Trace logfile name.
	 */
	private String filename;

	/**
	 * Singleton instance.
	 */
	private static MemoryAnalyzer instance;

	/**
	 * If <code>true</code>, <code>this</code> tracer has received a request to
	 * stop.
	 */
	private static boolean isStopRequest = false;

	/**
	 * Usage strings collected during the sleep time.
	 */
	private static ArrayList<String> usages;

	/**
	 * Formatting object.
	 */
	private static SimpleDateFormat sdf;

	/**
	 * Simple constructor.
	 * 
	 * @param delay
	 *            Sleep delay between trace log iterations.
	 * @param filename
	 *            Trace logfile name.
	 */
	private MemoryAnalyzer(long delay, String filename) {
		super();
		this.delay = delay;
		this.filename = filename;
		this.setName("Substance memory analyzer");
	}

	/**
	 * Starts the memory tracing.
	 * 
	 * @param delay
	 *            Sleep delay between trace log iterations.
	 * @param filename
	 *            Trace logfile name.
	 */
	public static synchronized void commence(long delay, String filename) {
		if (instance == null) {
			instance = new MemoryAnalyzer(delay, filename);
			usages = new ArrayList<String>();
			// yeah, yeah, it's not multi-thread safe.
			sdf = new SimpleDateFormat("HH:mm:ss.SSS");
			instance.start();
		}
	}

	/**
	 * Issues request to stop tracing.
	 */
	@Override
	public synchronized void requestStop() {
		isStopRequest = true;
	}

	/**
	 * Checks whether a request to stop tracing has been issued.
	 * 
	 * @return <code>true</code> if a request to stop tracing has been issued,
	 *         <code>false</code> otherwise.
	 */
	private static synchronized boolean hasStopRequest() {
		return isStopRequest;
	}

	/**
	 * Checks whether tracer is running.
	 * 
	 * @return <code>true</code> if tracer is running, <code>false</code>
	 *         otherwise.
	 */
	public static boolean isRunning() {
		return (instance != null);
	}

	/**
	 * Adds usage string.
	 * 
	 * @param usage
	 *            Usage string. Will be output to the trace file at next
	 *            iteration of the tracer.
	 */
	public static synchronized void enqueueUsage(String usage) {
		if (instance != null) {
			usages.add(sdf.format(new Date()) + ": " + usage);
		}
	}

	/**
	 * Returns all queued usages.
	 * 
	 * @return All queued usages.
	 */
	public static synchronized ArrayList<String> getUsages() {
		ArrayList<String> copy = new ArrayList<String>();
		for (String usage : usages)
			copy.add(usage);
		usages.clear();
		return copy;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// output all settings from UIManager
		// Need to run on EDT - issue 392
		try {
			SwingUtilities.invokeAndWait(() -> {
				try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File(filename), true))) {
					bw.write(sdf.format(new Date()) + "\n");

					UIDefaults uidefs = UIManager.getLookAndFeel().getDefaults();
					// Retrieve the keys. Can't use an iterator since the
					// map may be modified during the iteration. So retrieve
					// all at once.
					Set<Object> keySet = uidefs.keySet();
					List<String> keyList = new LinkedList<String>();
					for (Object key : keySet) {
						keyList.add((String) key);
					}
					Collections.sort(keyList);

					for (String key : keyList) {
						Object v = uidefs.get(key);

						if (v instanceof Integer) {
							int intVal = uidefs.getInt(key);
							bw.write(key + " (int) : " + intVal);
						} else if (v instanceof Boolean) {
							boolean boolVal = uidefs.getBoolean(key);
							bw.write(key + " (bool) : " + boolVal);
						} else if (v instanceof String) {
							String strVal = uidefs.getString(key);
							bw.write(key + " (string) : " + strVal);
						} else if (v instanceof Dimension) {
							Dimension dimVal = uidefs.getDimension(key);
							bw.write(key + " (Dimension) : " + dimVal.width + "*" + dimVal.height);
						} else if (v instanceof Insets) {
							Insets insetsVal = uidefs.getInsets(key);
							bw.write(key + " (Insets) : " + insetsVal.top + "*" + insetsVal.left + "*"
									+ insetsVal.bottom + "*" + insetsVal.right);
						} else if (v instanceof Color) {
							Color colorVal = uidefs.getColor(key);
							bw.write(key + " (int) : " + colorVal.getRed() + "," + colorVal.getGreen() + ","
									+ colorVal.getBlue());
						} else if (v instanceof Font) {
							Font fontVal = uidefs.getFont(key);
							bw.write(key + " (Font) : " + fontVal.getFontName() + "*" + fontVal.getSize());
						} else {
							bw.write(key + " (Object) : " + uidefs.get(key));
						}
						bw.write("\n");
					}
				} catch (IOException ioe) {
					requestStop();
				}
			});
		} catch (Exception exc) {
			requestStop();
		}
		while (!hasStopRequest()) {
			// gather statistics and print them to file
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File(this.filename), true))) {
				bw.write(sdf.format(new Date()) + "\n");
				java.util.List<String> stats = LazyResettableHashMap.getStats();
				if (stats != null) {
					for (String stat : stats) {
						bw.write(stat + "\n");
					}
				}
				ArrayList<String> usages = getUsages();
				for (String usage : usages) {
					bw.write(usage + "\n");
				}
				bw.write("UIManager has " + UIManager.getDefaults().size() + " entries\n");
				long heapSize = Runtime.getRuntime().totalMemory();
				long heapFreeSize = Runtime.getRuntime().freeMemory();

				int heapSizeKB = (int) (heapSize / 1024);
				int takenHeapSizeKB = (int) ((heapSize - heapFreeSize) / 1024);
				bw.write("Heap : " + takenHeapSizeKB + " / " + heapSizeKB);
				bw.write("\n");
			} catch (IOException ioe) {
				this.requestStop();
			}

			// sleep
			try {
				sleep(this.delay);
			} catch (InterruptedException ie) {
			}
		}
	}
}
