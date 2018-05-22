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
package org.pushingpixels.substance.internal.ui;

import java.lang.reflect.Method;
import java.security.AccessControlException;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;

import javax.swing.JComponent;
import javax.swing.UIManager;
import javax.swing.colorchooser.AbstractColorChooserPanel;
import javax.swing.plaf.ComponentUI;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.internal.contrib.randelshofer.quaqua.Quaqua14ColorChooserUI;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;


/**
 * UI for color chooser in <b>Substance</b> look and feel. This UI delegate is
 * removed in Lite versions of <b>Substance</b>.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceColorChooserUI extends Quaqua14ColorChooserUI {
	public static ComponentUI createUI(JComponent comp) {
		SubstanceCoreUtilities.testComponentCreationThreadingViolation(comp);
		return new SubstanceColorChooserUI();
	}

	@Override
	protected AbstractColorChooserPanel[] createDefaultChoosers() {
		String[] defaultChoosers = (String[]) UIManager
				.get("ColorChooser.defaultChoosers");

		List<AbstractColorChooserPanel> panelList = new LinkedList<AbstractColorChooserPanel>();
		// AbstractColorChooserPanel[] panels = new
		// AbstractColorChooserPanel[defaultChoosers.length];
		for (int i = 0; i < defaultChoosers.length; i++) {
			try {
				Method setBundleMethod = Class.forName(defaultChoosers[i])
						.getMethod("setLabelBundle",
								new Class[] { ResourceBundle.class });
				setBundleMethod.invoke(null,
						new Object[] { SubstanceCortex.GlobalScope.getLabelBundle() });
			} catch (Throwable t) {
				// ignore - either the method doesn't exist or the invocation
				// failed. Nothing to do in both cases.
			}
			try {
				AbstractColorChooserPanel panel = (AbstractColorChooserPanel) Class
						.forName(defaultChoosers[i]).newInstance();
				panelList.add(panel);
			} catch (AccessControlException e) {
				// ignore - happens on unsigned apps in WebStart environment
			} catch (Exception e) {
				e.printStackTrace();
				throw new InternalError("Unable to instantiate "
						+ defaultChoosers[i]);
			}
		}
		return panelList.toArray(new AbstractColorChooserPanel[0]);
	}
}
