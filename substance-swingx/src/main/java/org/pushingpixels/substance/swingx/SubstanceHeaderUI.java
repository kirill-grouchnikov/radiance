/*
 * Copyright 2005-2018 Kirill Grouchnikov, based on work by
 * Sun Microsystems, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */
package org.pushingpixels.substance.swingx;

import org.jdesktop.swingx.JXHeader;
import org.jdesktop.swingx.painter.Painter;
import org.jdesktop.swingx.plaf.PainterUIResource;
import org.jdesktop.swingx.plaf.basic.BasicHeaderUI;
import org.pushingpixels.substance.api.SubstanceCortex.ComponentOrParentChainScope;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.substance.internal.painter.DecorationPainterUtils;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import java.awt.*;

/**
 * Substance-consistent UI delegate for {@link JXHeader}.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceHeaderUI extends BasicHeaderUI {
	public static ComponentUI createUI(JComponent comp) {
		SubstanceCoreUtilities.testComponentCreationThreadingViolation(comp);
		return new SubstanceHeaderUI();
	}

	// protected class SubstanceDescriptionPane extends DescriptionPane {
	// @Override
	// protected void paintComponent(Graphics g) {
	// Graphics2D g2d = (Graphics2D)g.create();
	// RenderingUtils.installDesktopHints(g2d, this);
	// super.paintComponent(g2d);
	// g2d.dispose();
	// }
	// }

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.jdesktop.swingx.plaf.basic.BasicHeaderUI#installUI(javax.swing.JComponent
	 * )
	 */
	@Override
	public void installUI(JComponent c) {
		super.installUI(c);

		Font font = UIManager.getFont("Label.font");
		this.descriptionPane.setFont(font);
		this.titleLabel.setFont(font.deriveFont(font.getSize() + 2.0f));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.jdesktop.swingx.plaf.basic.BasicHeaderUI#installDefaults(org.jdesktop
	 * .swingx.JXHeader)
	 */
	@Override
	protected void installDefaults(JXHeader h) {
		// this.descriptionPane = new SubstanceDescriptionPane();
		// this.descriptionPane.setLineWrap(true);
		// this.descriptionPane.setOpaque(false);

		super.installDefaults(h);
		ComponentOrParentChainScope.setDecorationType(h, DecorationAreaType.HEADER);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.jdesktop.swingx.plaf.basic.BasicHeaderUI#uninstallDefaults(org.jdesktop
	 * .swingx.JXHeader)
	 */
	@Override
	protected void uninstallDefaults(JXHeader h) {
		DecorationPainterUtils.clearDecorationType(h);
		super.uninstallDefaults(h);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.jdesktop.swingx.plaf.basic.BasicHeaderUI#createBackgroundPainter()
	 */
	@Override
	protected Painter<?> createBackgroundPainter() {
		return new PainterUIResource<JXHeader>(new Painter<JXHeader>() {
			public void paint(Graphics2D g, JXHeader jxHeader, int width,
					int height) {
				// SubstanceDecorationUtilities.paintDecorationBackground(g,
				// jxHeader, false);

				BackgroundPaintingUtils.update(g, jxHeader, false);
				// g.translate(0, height - 2);
				// SubstanceTheme decorationTheme = SubstanceThemeUtilities
				// .getDecorationTheme(jxHeader);
				// SubstanceCoreUtilities.paintSeparator(jxHeader, g,
				// decorationTheme.getColorScheme(),
				// SubstanceCoreUtilities.isThemeDark(decorationTheme),
				// width, 1, JSeparator.HORIZONTAL);
				// g.translate(0, 2 - height);
			}
		});
	}
}
