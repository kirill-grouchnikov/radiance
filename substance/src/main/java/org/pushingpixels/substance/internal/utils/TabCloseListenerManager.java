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

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.swing.JTabbedPane;

import org.pushingpixels.substance.api.tabbed.BaseTabCloseListener;

/**
 * Manages the listeners registered on tab-close events. This class is <b>for
 * internal use only</b>.
 * 
 * @author Kirill Grouchnikov
 */
public class TabCloseListenerManager {
	/**
	 * Listeners registered on all tabbed panes.
	 */
	private Set<BaseTabCloseListener> generalListeners;

	/**
	 * Listeners registered on specific tabbed panes.
	 */
	private Map<JTabbedPane, Set<BaseTabCloseListener>> specificListeners;

	/**
	 * A single instance of <code>this</code> manager.
	 */
	private static TabCloseListenerManager instance = new TabCloseListenerManager();

	/**
	 * Returns the single instance of <code>this</code> class.
	 * 
	 * @return The single instance of <code>this</code> class.
	 */
	public static TabCloseListenerManager getInstance() {
		return instance;
	}

	/**
	 * Simple constructor.
	 */
	public TabCloseListenerManager() {
		this.generalListeners = new HashSet<BaseTabCloseListener>();
		this.specificListeners = new HashMap<JTabbedPane, Set<BaseTabCloseListener>>();
	}

	/**
	 * Unregisters the specified tabbed pane.
	 * 
	 * @param tabbedPane
	 *            Tabbed pane to unregister.
	 */
	public synchronized void unregisterTabbedPane(JTabbedPane tabbedPane) {
		this.specificListeners.remove(tabbedPane);
	}

	/**
	 * Registers the specified listener on tab-close events on <b>all</b> tabbed
	 * panes.
	 * 
	 * @param listener
	 *            Listener to register.
	 */
	public synchronized void registerListener(BaseTabCloseListener listener) {
		this.generalListeners.add(listener);
	}

	/**
	 * Unregisters the specified listener on tab-close events on <b>all</b>
	 * tabbed panes.
	 * 
	 * @param listener
	 *            Listener to unregister.
	 */
	public synchronized void unregisterListener(BaseTabCloseListener listener) {
		this.generalListeners.remove(listener);
	}

	/**
	 * Returns the set of all listeners registered on tab-close events on
	 * <b>all</b> tabbed panes.
	 * 
	 * @return Set of all listeners registered on tab-close events on <b>all</b>
	 *         tabbed panes.
	 */
	public synchronized Set<BaseTabCloseListener> getListeners() {
		return Collections.unmodifiableSet(this.generalListeners);
	}

	/**
	 * Registers the specified listener on tab-close events on <b>the
	 * specified</b> tabbed pane.
	 * 
	 * @param tabbedPane
	 *            Tabbed pane. If <code>null</code>, the tab close listener is
	 *            registered globally (for all tabbed panes).
	 * @param listener
	 *            Listener to register.
	 */
	public synchronized void registerListener(JTabbedPane tabbedPane,
			BaseTabCloseListener listener) {
		if (tabbedPane == null) {
			this.registerListener(listener);
		} else {
			Set<BaseTabCloseListener> listeners = this.specificListeners
					.get(tabbedPane);
			if (listeners == null) {
				listeners = new HashSet<BaseTabCloseListener>();
				this.specificListeners.put(tabbedPane, listeners);
			}
			listeners.add(listener);
		}
	}

	/**
	 * Unregisters the specified listener on tab-close events on <b>the
	 * specified</b> tabbed pane.
	 * 
	 * @param tabbedPane
	 *            Tabbed pane. If <code>null</code>, the tab close listener is
	 *            unregistered globally (for all tabbed panes).
	 * @param listener
	 *            Listener to unregister.
	 */
	public synchronized void unregisterListener(JTabbedPane tabbedPane,
			BaseTabCloseListener listener) {
		if (tabbedPane == null) {
			this.unregisterListener(listener);
		} else {
			Set<BaseTabCloseListener> listeners = this.specificListeners
					.get(tabbedPane);
			if (listeners != null)
				listeners.remove(listener);
		}
	}

	/**
	 * Returns the set of all listeners registered on tab-close events on <b>the
	 * specified</b> tabbed pane.
	 * 
	 * @param tabbedPane
	 *            Tabbed pane. If <code>null</code>, all globally registered tab
	 *            close listeners are returned.
	 * @return The set of all listeners registered on tab-close events on <b>the
	 *         specified</b> tabbed pane.
	 */
	public synchronized Set<BaseTabCloseListener> getListeners(
			JTabbedPane tabbedPane) {
		if (tabbedPane == null)
			return this.getListeners();

		Set<BaseTabCloseListener> result = new HashSet<BaseTabCloseListener>();
		for (BaseTabCloseListener listener : this.generalListeners)
			result.add(listener);
		Set<BaseTabCloseListener> listeners = this.specificListeners
				.get(tabbedPane);
		if (listeners != null) {
			for (BaseTabCloseListener listener : listeners)
				result.add(listener);
		}

		return Collections.unmodifiableSet(result);
	}
}
