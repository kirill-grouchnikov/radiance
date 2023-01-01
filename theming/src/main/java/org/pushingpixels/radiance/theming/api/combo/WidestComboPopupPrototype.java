/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.theming.api.combo;

import org.pushingpixels.radiance.theming.internal.ui.RadianceComboBoxUI;

import javax.swing.*;
import java.awt.*;

/**
 * Sample core implementation of {@link ComboPopupPrototypeCallback} interface
 * that returns the widest combo entry. This class is part of officially
 * supported API.
 * 
 * @author Kirill Grouchnikov
 */
public class WidestComboPopupPrototype<T> implements ComboPopupPrototypeCallback<T> {
	@SuppressWarnings("unchecked")
    @Override
	public T getPopupPrototypeDisplayValue(JComboBox<T> jc) {
		int maxWidth = -1;
		T prototype = null;
		JList<T> list = (JList<T>) ((RadianceComboBoxUI) jc.getUI()).getPopup().getList();
		for (int i = 0; i < jc.getModel().getSize(); i++) {
			T elem = jc.getModel().getElementAt(i);
			Component renderer = jc.getRenderer().getListCellRendererComponent(
					list, elem, i, false, false);
			if (renderer != null) {
				int rWidth = renderer.getPreferredSize().width;
				if (rWidth > maxWidth) {
					maxWidth = rWidth;
					prototype = elem;
				}
			}
		}

		return prototype;
	}
}
