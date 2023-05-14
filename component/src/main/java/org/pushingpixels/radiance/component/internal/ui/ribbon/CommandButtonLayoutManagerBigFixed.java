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
package org.pushingpixels.radiance.component.internal.ui.ribbon;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.component.api.common.CommandButtonLayoutManager;
import org.pushingpixels.radiance.component.api.common.JCommandButton;
import org.pushingpixels.radiance.component.internal.utils.ComponentUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceMetricsUtilities;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CommandButtonLayoutManagerBigFixed implements CommandButtonLayoutManager {

	@Override
	public Dimension getPreferredIconSize(JCommandButton commandButton) {
        int size = ComponentUtilities.getScaledSize(32, commandButton.getFont().getSize(), 2.0f, 4);
		return new Dimension(size, size);
	}

	@Override
	public Dimension getPreferredSize(JCommandButton commandButton) {
		Insets borderInsets = commandButton.getInsets();
		int bx = borderInsets.left + borderInsets.right;
		int by = borderInsets.top + borderInsets.bottom;
		FontMetrics fm = RadianceMetricsUtilities.getFontMetrics(
				RadianceCommonCortex.getScaleFactor(commandButton), commandButton.getFont());
		JSeparator jsep = new JSeparator(JSeparator.VERTICAL);
		int layoutVGap = ComponentUtilities.getVLayoutGap(commandButton);

		// icon, label
		int fillTitleWidth = fm.stringWidth(commandButton.getText());

		int widthFull = Math.max(this.getPreferredIconSize(commandButton).width, fillTitleWidth);

		int heightFull = by + this.getPreferredIconSize(commandButton).height + layoutVGap
				+ jsep.getPreferredSize().width;
		if (commandButton.getText() != null) {
			heightFull += fm.getHeight();
		}

		widthFull = Math.max(widthFull, heightFull);
		return new Dimension(bx + widthFull, heightFull);
	}

	@Override
	public Point getActionKeyTipAnchorCenterPoint(JCommandButton commandButton) {
		CommandButtonLayoutInfo layoutInfo = this.getLayoutInfo(commandButton);
		// horizontally centered at the bottom edge of the action click area
		return new Point(layoutInfo.actionClickArea.x + layoutInfo.actionClickArea.width / 2,
				layoutInfo.actionClickArea.y + layoutInfo.actionClickArea.height);
	}

	@Override
	public Point getPopupKeyTipAnchorCenterPoint(JCommandButton commandButton) {
		CommandButtonLayoutInfo layoutInfo = this.getLayoutInfo(commandButton);
		// horizontally centered at the bottom edge of the popup click area
		return new Point(layoutInfo.popupClickArea.x + layoutInfo.popupClickArea.width / 2,
				layoutInfo.popupClickArea.y + layoutInfo.popupClickArea.height);
	}

	@Override
	public CommandButtonLayoutInfo getLayoutInfo(JCommandButton commandButton) {
		CommandButtonLayoutInfo result = new CommandButtonLayoutInfo();

		result.actionClickArea = new Rectangle(0, 0, 0, 0);
		result.popupClickArea = new Rectangle(0, 0, 0, 0);

		Insets ins = commandButton.getInsets();

		result.iconRect = new Rectangle();
		result.popupActionRect = new Rectangle();

		int width = commandButton.getWidth();
		int height = commandButton.getHeight();

		int y = ins.top;

		FontMetrics fm = RadianceMetricsUtilities.getFontMetrics(
				RadianceCommonCortex.getScaleFactor(commandButton), commandButton.getFont());
		int labelHeight = fm.getAscent() + fm.getDescent();

		JCommandButton.CommandButtonKind buttonKind = commandButton.getCommandButtonKind();

		result.isTextInActionArea = false;
		if (buttonKind == JCommandButton.CommandButtonKind.ACTION_ONLY) {
			result.actionClickArea.x = 0;
			result.actionClickArea.y = 0;
			result.actionClickArea.width = width;
			result.actionClickArea.height = height;
			result.isTextInActionArea = true;
		}
		if (buttonKind == JCommandButton.CommandButtonKind.POPUP_ONLY) {
			result.popupClickArea.x = 0;
			result.popupClickArea.y = 0;
			result.popupClickArea.width = width;
			result.popupClickArea.height = height;
		}

		JSeparator jsep = new JSeparator(JSeparator.VERTICAL);

		RadianceIcon buttonIcon = commandButton.getIcon();

		if (commandButton.getText() == null) {
			y = ins.top
					+ (height - ins.top - ins.bottom - buttonIcon
							.getIconHeight()) / 2;
		}
		result.iconRect.x = (width - buttonIcon.getIconWidth()) / 2;
		result.iconRect.y = y;
		result.iconRect.width = buttonIcon.getIconWidth();
		result.iconRect.height = buttonIcon.getIconHeight();
		y += buttonIcon.getIconHeight();

		y += jsep.getPreferredSize().width;

		TextLayoutInfo lineLayoutInfo = new TextLayoutInfo();
		lineLayoutInfo.text = commandButton.getText();
		lineLayoutInfo.textRect = new Rectangle();

		int labelWidth = fm.stringWidth(commandButton.getText());

		lineLayoutInfo.textRect.x = ins.left
				+ (width - labelWidth - ins.left - ins.right) / 2;
		lineLayoutInfo.textRect.y = y;
		lineLayoutInfo.textRect.width = labelWidth;
		lineLayoutInfo.textRect.height = labelHeight;

		result.textLayoutInfoList = new ArrayList<TextLayoutInfo>();
		result.textLayoutInfoList.add(lineLayoutInfo);

		return result;
	}

}
