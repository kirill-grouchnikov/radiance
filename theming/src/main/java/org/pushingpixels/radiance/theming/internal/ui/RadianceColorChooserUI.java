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
package org.pushingpixels.radiance.theming.internal.ui;

import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.internal.contrib.randelshofer.quaqua.Quaqua14ColorChooserUI;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;

import javax.swing.*;
import javax.swing.colorchooser.AbstractColorChooserPanel;
import javax.swing.plaf.ComponentUI;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;


/**
 * UI for color chooser in <b>Radiance</b> look and feel.
 * 
 * @author Kirill Grouchnikov
 */
public class RadianceColorChooserUI extends Quaqua14ColorChooserUI {
	public static ComponentUI createUI(JComponent comp) {
		RadianceCoreUtilities.testComponentCreationThreadingViolation(comp);
		return new RadianceColorChooserUI();
	}

	protected RadianceColorChooserUI() {
	}

	@Override
	protected AbstractColorChooserPanel[] createDefaultChoosers() {
		String[] defaultChoosers = (String[]) UIManager
				.get("ColorChooser.defaultChoosers");

		List<AbstractColorChooserPanel> panelList = new LinkedList<>();
		// AbstractColorChooserPanel[] panels = new
		// AbstractColorChooserPanel[defaultChoosers.length];
		for (int i = 0; i < defaultChoosers.length; i++) {
			try {
				Method setBundleMethod = Class.forName(defaultChoosers[i])
						.getMethod("setLabelBundle", ResourceBundle.class);
				setBundleMethod.invoke(null,
						RadianceThemingCortex.GlobalScope.getLabelBundle());
			} catch (Throwable t) {
				// ignore - either the method doesn't exist or the invocation
				// failed. Nothing to do in both cases.
			}
			try {
				AbstractColorChooserPanel panel = (AbstractColorChooserPanel) Class
						.forName(defaultChoosers[i]).getDeclaredConstructor().newInstance();
				panelList.add(panel);
			} catch (Throwable t) {
				t.printStackTrace();
				throw new InternalError("Unable to instantiate " + defaultChoosers[i]);
			}
		}
		return panelList.toArray(new AbstractColorChooserPanel[0]);
	}
}
