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

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JList;

import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.renderer.SubstanceDefaultListCellRenderer;

public class MySubstanceListCellRenderer extends
		SubstanceDefaultListCellRenderer {

	/**
	 * Creates the cell renderer.
	 */
	public MySubstanceListCellRenderer() {
		super();
		setOpaque(true);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.swing.ListCellRenderer#getListCellRendererComponent(javax.swing
	 * .JList, java.lang.Object, int, boolean, boolean)
	 */
	@Override
	public Component getListCellRendererComponent(JList list, Object value,
			int index, boolean isSelected, boolean cellHasFocus) {
		Component result = super.getListCellRendererComponent(list, value,
				index, isSelected, cellHasFocus);
		result.setForeground(list.getForeground());

		int comp = 156 + 10 * (index % 9);
		int blue = 255 - (255 - comp) / 2;
		result.setBackground(new Color(comp, comp, blue));
		if (isSelected)
			result.setBackground(list.getSelectionBackground());

		// mark every fifth row as disabled
		if ((index % 5) == 0) {
			result.setEnabled(false);
			ComponentState state = isSelected ? ComponentState.DISABLED_SELECTED
					: ComponentState.DISABLED_UNSELECTED;
			result.setForeground(SubstanceCortex.ComponentScope.getCurrentSkin(list)
					.getColorScheme(list, state).getForegroundColor());
			result.setBackground(new Color(255, 196, 196));
			((JLabel) result).setText(value + " [disabled by renderer]");
		}

		return this;
	}
}