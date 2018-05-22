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

import java.util.EnumSet;
import java.util.Set;
import java.util.WeakHashMap;

import javax.swing.JRootPane;

import org.pushingpixels.substance.api.SubstanceSlices.SubstanceWidgetType;

public class SubstanceWidgetManager {
	private static SubstanceWidgetManager instance;

	private Set<SubstanceWidgetType> globalAllowed;

	private Set<SubstanceWidgetType> globalDisallowed;

	private WeakHashMap<JRootPane, Set<SubstanceWidgetType>> specificAllowed;

	private WeakHashMap<JRootPane, Set<SubstanceWidgetType>> specificDisallowed;

	public static synchronized SubstanceWidgetManager getInstance() {
		if (instance == null)
			instance = new SubstanceWidgetManager();
		return instance;
	}

	private SubstanceWidgetManager() {
		this.globalAllowed = EnumSet.noneOf(SubstanceWidgetType.class);
		this.globalDisallowed = EnumSet.noneOf(SubstanceWidgetType.class);
		this.specificAllowed = new WeakHashMap<JRootPane, Set<SubstanceWidgetType>>();
		this.specificDisallowed = new WeakHashMap<JRootPane, Set<SubstanceWidgetType>>();
	}

	public void register(JRootPane rootPane, boolean isAllowed,
			SubstanceWidgetType... substanceWidgets) {
		if (rootPane == null) {
			for (SubstanceWidgetType widget : substanceWidgets) {
				if (isAllowed) {
					this.globalAllowed.add(widget);
					this.globalDisallowed.remove(widget);
				} else {
					this.globalDisallowed.add(widget);
					this.globalAllowed.remove(widget);
				}
			}
		} else {
			Set<SubstanceWidgetType> toAddTo = null;
			Set<SubstanceWidgetType> toRemoveFrom = null;
			if (isAllowed) {
				toAddTo = this.specificAllowed.get(rootPane);
				if (toAddTo == null) {
					toAddTo = EnumSet.noneOf(SubstanceWidgetType.class);
					this.specificAllowed.put(rootPane, toAddTo);
				}
				toRemoveFrom = this.specificDisallowed.get(rootPane);
			} else {
				toAddTo = this.specificDisallowed.get(rootPane);
				if (toAddTo == null) {
					toAddTo = EnumSet.noneOf(SubstanceWidgetType.class);
					this.specificDisallowed.put(rootPane, toAddTo);
				}
				toRemoveFrom = this.specificAllowed.get(rootPane);
			}

			for (SubstanceWidgetType widget : substanceWidgets) {
				toAddTo.add(widget);
				if (toRemoveFrom != null)
					toRemoveFrom.remove(widget);
			}
		}
	}

	public boolean isAllowed(JRootPane rootPane, SubstanceWidgetType widget) {
		if (this.specificDisallowed.containsKey(rootPane)) {
			if (this.specificDisallowed.get(rootPane).contains(widget))
				return false;
		}
		if (this.specificAllowed.containsKey(rootPane)) {
			if (this.specificAllowed.get(rootPane).contains(widget))
				return true;
		}
		if (this.globalDisallowed.contains(widget))
			return false;
		if (this.globalAllowed.contains(widget))
			return true;
		return false;
	}

	public boolean isAllowedAnywhere(SubstanceWidgetType widget) {
		if (specificAllowed.size() > 0)
			return true;
		if (this.globalDisallowed.contains(widget))
			return false;
		if (this.globalAllowed.contains(widget))
			return true;
		return false;
	}
}
