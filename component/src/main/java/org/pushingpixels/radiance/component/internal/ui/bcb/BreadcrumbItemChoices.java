/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov
 * and <a href="http://www.topologi.com">Topologi</a>. 
 * Contributed by <b>Rick Jelliffe</b> of <b>Topologi</b> 
 * in January 2006. 
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
package org.pushingpixels.radiance.component.internal.ui.bcb;

import org.pushingpixels.radiance.component.api.bcb.BreadcrumbItem;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the model for the popup that is shown by clicking on the path
 * selector.
 */
final class BreadcrumbItemChoices<T> {
	/**
	 * Contains all possible choices.
	 */
	private List<BreadcrumbItem<T>> choices;

	/**
	 * The ancestor item. This can be <code>null</code> only for the root
	 * choices element.
	 */
	private BreadcrumbItem<T> ancestor;

	/**
	 * The index of <code>this</code> element.
	 */
	private int selectedIndex = 0;

	public BreadcrumbItemChoices(BreadcrumbItem<T> ancestor,
			List<BreadcrumbItem<T>> entries) {
		this.ancestor = ancestor;
		this.choices = new ArrayList<>(entries.size());
		int index = 0;
		for (BreadcrumbItem<T> item : entries) {
			this.choices.add(index, item);
			index++;
		}
		this.selectedIndex = -1;
	}

	public void setSelectedIndex(int index) {
		this.selectedIndex = index;
	}

	public int getSelectedIndex() {
		return this.selectedIndex;
	}

	/**
	 * Returns the item array of <code>true</code>his element.
	 * 
	 * @return The item array of <code>true</code>his element.
	 */
	public List<BreadcrumbItem<T>> getChoices() {
		return choices;
	}

	public BreadcrumbItem<T> getAncestor() {
		return ancestor;
	}
}
