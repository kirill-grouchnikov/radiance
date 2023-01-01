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
package org.pushingpixels.radiance.demo.theming.main.check;

import org.pushingpixels.radiance.theming.api.RadianceLookAndFeel;
import org.pushingpixels.radiance.theming.api.renderer.RadianceDefaultComboBoxRenderer;

import javax.swing.*;
import java.awt.*;

public abstract class FlexiComboBox<T> extends JComboBox<T> {
	@SafeVarargs
	public FlexiComboBox(T... items) {
		super(items);
	}

	@Override
	public void updateUI() {
		if (UIManager.getLookAndFeel() instanceof RadianceLookAndFeel) {
			setRenderer(new RadianceDefaultComboBoxRenderer(this) {
				@SuppressWarnings("unchecked")
				@Override
				public Component getListCellRendererComponent(JList list,
						Object value, int index, boolean isSelected,
						boolean cellHasFocus) {
					Component result = super.getListCellRendererComponent(list,
							getCaption((T) value), index, isSelected,
							cellHasFocus);
					Color color = getItemColor((T) value);
					if (color != null) {
						result.setBackground(color);
					}
					if (result instanceof JLabel) {
						((JLabel) result).setIcon(getItemIcon((T) value));
					}
					return result;
				}
			});
		} else {
			setRenderer(new DefaultListCellRenderer() {
				@SuppressWarnings("unchecked")
				@Override
				public Component getListCellRendererComponent(JList list,
						Object value, int index, boolean isSelected,
						boolean cellHasFocus) {
					Component result = super.getListCellRendererComponent(list,
							getCaption((T) value), index, isSelected,
							cellHasFocus);
					Color color = getItemColor((T) value);
					if (color != null) {
                        result.setBackground(color);
                    }
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
