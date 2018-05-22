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
 *  o Neither the name of Flamingo Kirill Grouchnikov nor the names of 
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

import javax.swing.DefaultListCellRenderer;
import javax.swing.Icon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.UIManager;

import org.pushingpixels.substance.api.SubstanceLookAndFeel;
import org.pushingpixels.substance.api.renderer.SubstanceDefaultComboBoxRenderer;

public abstract class FlexiComboBox<T> extends JComboBox {

	public FlexiComboBox(T... items) {
		super(items);
	}

	@Override
	public void updateUI() {
		if (UIManager.getLookAndFeel() instanceof SubstanceLookAndFeel) {
			setRenderer(new SubstanceDefaultComboBoxRenderer(this) {
				@Override
				public Component getListCellRendererComponent(JList list,
						Object value, int index, boolean isSelected,
						boolean cellHasFocus) {
					Component result = super.getListCellRendererComponent(list,
							getCaption((T) value), index, isSelected,
							cellHasFocus);
					Color color = getItemColor((T) value);
					if (color != null)
						result.setBackground(color);
					if (result instanceof JLabel) {
						((JLabel) result).setIcon(getItemIcon((T) value));
					}
					return result;
				}
			});
		} else {
			setRenderer(new DefaultListCellRenderer() {
				@Override
				public Component getListCellRendererComponent(JList list,
						Object value, int index, boolean isSelected,
						boolean cellHasFocus) {
					Component result = super.getListCellRendererComponent(list,
							getCaption((T) value), index, isSelected,
							cellHasFocus);
					Color color = getItemColor((T) value);
					if (color != null)
						result.setBackground(color);
					if (result instanceof JLabel) {
						((JLabel) result).setIcon(getItemIcon((T) value));
					}
					return result;
				}
			});
		}
		super.updateUI();
	}

	public abstract String getCaption(T item);

	public Color getItemColor(T item) {
		return null;
	}

	public Icon getItemIcon(T item) {
		return null;
	}

}
