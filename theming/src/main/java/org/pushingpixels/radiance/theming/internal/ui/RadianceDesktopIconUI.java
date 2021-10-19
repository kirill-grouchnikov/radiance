/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.RadianceThemingWidget;
import org.pushingpixels.radiance.theming.internal.RadianceThemingWidgetRepository;
import org.pushingpixels.radiance.theming.internal.RadianceSynapse;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceInternalFrameTitlePane;

import javax.swing.*;
import javax.swing.JInternalFrame.JDesktopIcon;
import javax.swing.event.MouseInputListener;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.UIResource;
import javax.swing.plaf.basic.BasicDesktopIconUI;
import java.awt.*;
import java.util.Set;

/**
 * UI for desktop icons in <b>Radiance</b> look and feel.
 * 
 * @author Kirill Grouchnikov
 */
public class RadianceDesktopIconUI extends BasicDesktopIconUI {
	/**
	 * Listener on the title label (for the dragging purposes).
	 */
	private MouseInputListener radianceLabelMouseInputListener;

	/**
	 * Width of minimized component (desktop icon).
	 */
	private int width;

	private Set<RadianceThemingWidget<JComponent>> themingWidgets;

	public static ComponentUI createUI(JComponent comp) {
		RadianceCoreUtilities.testComponentCreationThreadingViolation(comp);
		return new RadianceDesktopIconUI();
	}

	private RadianceDesktopIconUI() {
	}

	@Override
	protected void installDefaults() {
		super.installDefaults();
		Font f = this.desktopIcon.getFont();
		if ((f == null) || (f instanceof UIResource)) {
			this.desktopIcon.setFont(UIManager.getFont("DesktopIcon.font"));
		}
		this.width = UIManager.getInt("DesktopIcon.width");
		this.desktopIcon.setBackground(
				RadianceCoreUtilities.getBackgroundFill(
						RadianceCoreUtilities.getSkin(this.desktopIcon.getInternalFrame()),
						RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE));

		for (RadianceThemingWidget themingWidget : this.themingWidgets) {
			themingWidget.installDefaults();
		}
	}
	
	@Override
	protected void uninstallDefaults() {
		for (RadianceThemingWidget themingWidget : this.themingWidgets) {
			themingWidget.uninstallDefaults();
		}

		super.uninstallDefaults();
	}

	@Override
	protected void installComponents() {
		this.frame = this.desktopIcon.getInternalFrame();

		this.iconPane = new RadianceInternalFrameTitlePane(this.frame);
		this.iconPane.setOpaque(false);
		this.desktopIcon.setLayout(new BorderLayout());
		this.desktopIcon.add(this.iconPane, BorderLayout.CENTER);

		for (RadianceThemingWidget themingWidget : this.themingWidgets) {
			themingWidget.installComponents();
		}
	}

	@Override
	protected void uninstallComponents() {
		((RadianceInternalFrameTitlePane) this.iconPane).uninstall();

		this.desktopIcon.setLayout(null);
		this.desktopIcon.remove(this.iconPane);

		for (RadianceThemingWidget themingWidget : this.themingWidgets) {
			themingWidget.uninstallComponents();
		}

		this.frame = null;
	}

	@Override
	protected void installListeners() {
		super.installListeners();
		this.radianceLabelMouseInputListener = this.createMouseInputListener();
		this.iconPane
				.addMouseMotionListener(this.radianceLabelMouseInputListener);
		this.iconPane.addMouseListener(this.radianceLabelMouseInputListener);

		for (RadianceThemingWidget themingWidget : this.themingWidgets) {
			themingWidget.installListeners();
		}
	}

	@Override
	protected void uninstallListeners() {
		((RadianceInternalFrameTitlePane) this.iconPane).uninstallListeners();

		this.iconPane
				.removeMouseMotionListener(this.radianceLabelMouseInputListener);
		this.iconPane
				.removeMouseListener(this.radianceLabelMouseInputListener);
		this.radianceLabelMouseInputListener = null;

		for (RadianceThemingWidget themingWidget : this.themingWidgets) {
			themingWidget.uninstallListeners();
		}

		super.uninstallListeners();
	}

	@Override
	public Dimension getPreferredSize(JComponent c) {
		// Desktop icons can not be resized. Their dimensions should
		// always be the minimum size. See getMinimumSize(JComponent c).
		return this.getMinimumSize(c);
	}

	@Override
	public Dimension getMinimumSize(JComponent c) {
		// For the desktop icon we will use the layout maanger to
		// determine the correct height of the component, but we want to keep
		// the width consistent according to the jlf spec.
		return new Dimension(this.width, this.desktopIcon.getLayout()
				.minimumLayoutSize(this.desktopIcon).height);
	}

	@Override
	public Dimension getMaximumSize(JComponent c) {
		// Desktop icons can not be resized. Their dimensions should
		// always be the minimum size. See getMinimumSize(JComponent c).
		return this.getMinimumSize(c);
	}

	@Override
	public void installUI(JComponent c) {
		this.themingWidgets = RadianceThemingWidgetRepository.getRepository().getMatchingWidgets(c);

		super.installUI(c);
		c.setOpaque(false);
		
		for (RadianceThemingWidget themingWidget : this.themingWidgets) {
			themingWidget.installUI();
		}
	}

	@Override
	public void uninstallUI(JComponent c) {
		for (RadianceThemingWidget themingWidget : this.themingWidgets) {
			themingWidget.uninstallUI();
		}

		RadianceInternalFrameTitlePane thePane = (RadianceInternalFrameTitlePane) this.iconPane;
		super.uninstallUI(c);
		thePane.uninstallListeners();
	}

	/**
	 * Returns the component for desktop icon hover (internal frame preview)
	 * functionality.
	 * 
	 * @return The component for desktop icon hover (internal frame preview)
	 *         functionality.
	 */
	public JComponent getComponentForHover() {
		return this.iconPane;
	}

	/**
	 * Installs the UI delegate on the desktop icon if necessary.
	 * 
	 * @param jdi
	 *            Desktop icon.
	 */
	void installIfNecessary(JDesktopIcon jdi) {
		// fix for issue 344 - reopening an internal frame
		// that has been closed.
		if (this.desktopIcon == null) {
			this.installUI(jdi);
		}
	}

	/**
	 * Uninstalls the UI delegate from the desktop icon if necessary.
	 * 
	 * @param jdi
	 *            Desktop icon.
	 */
	void uninstallIfNecessary(JDesktopIcon jdi) {
		// fix for issue 345 - an internal frame used in inner option pane
		// gets closed twice
		if (this.desktopIcon == jdi) {
			this.uninstallUI(jdi);
		}
	}

	void setWindowModified(boolean isWindowModified) {
		((RadianceInternalFrameTitlePane) this.iconPane).getCloseButton()
				.putClientProperty(RadianceSynapse.CONTENTS_MODIFIED,
						Boolean.valueOf(isWindowModified));
	}
}
