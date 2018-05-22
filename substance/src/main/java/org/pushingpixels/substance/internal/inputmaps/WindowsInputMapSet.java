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
package org.pushingpixels.substance.internal.inputmaps;

import org.pushingpixels.substance.api.inputmap.SubstanceInputMap;

public class WindowsInputMapSet extends BaseInputMapSet {
	@Override
	public SubstanceInputMap getComboBoxAncestorInputMap() {
		SubstanceInputMap result = new SubstanceInputMap();

		result.put("ESCAPE", ComboActions.HIDE);
		result.put("PAGE_UP", ComboActions.PAGE_UP);
		result.put("PAGE_DOWN", ComboActions.PAGE_DOWN);
		result.put("HOME", ComboActions.HOME);
		result.put("END", ComboActions.END);
		result.put("DOWN", ComboActions.DOWN_2);
		result.put("KP_DOWN", ComboActions.DOWN_2);
		result.put("alt DOWN", ComboActions.TOGGLE);
		result.put("alt KP_DOWN", ComboActions.TOGGLE);
		result.put("alt UP", ComboActions.TOGGLE);
		result.put("alt KP_UP", ComboActions.TOGGLE);
		result.put("ENTER", ComboActions.ENTER);
		result.put("UP", ComboActions.UP_2);
		result.put("KP_UP", ComboActions.UP_2);

		return result;
	}

	@Override
	public SubstanceInputMap getDesktopAncestorInputMap() {
		SubstanceInputMap result = new SubstanceInputMap();

		result.put("ctrl F5", DesktopPaneActions.RESTORE);
		result.put("ctrl F4", DesktopPaneActions.CLOSE);
		result.put("ctrl F7", DesktopPaneActions.MOVE);
		result.put("ctrl F8", DesktopPaneActions.RESIZE);

		result.put("RIGHT", DesktopPaneActions.RIGHT);
		result.put("KP_RIGHT", DesktopPaneActions.RIGHT);
		result.put("LEFT", DesktopPaneActions.LEFT);
		result.put("KP_LEFT", DesktopPaneActions.LEFT);

		result.put("UP", DesktopPaneActions.UP);
		result.put("KP_UP", DesktopPaneActions.UP);
		result.put("DOWN", DesktopPaneActions.DOWN);
		result.put("KP_DOWN", DesktopPaneActions.DOWN);

		result.put("ESCAPE", DesktopPaneActions.ESCAPE);
		result.put("ctrl F9", DesktopPaneActions.MINIMIZE);
		result.put("ctrl F10", DesktopPaneActions.MAXIMIZE);

		result.put("ctrl F6", DesktopPaneActions.NEXT_FRAME);
		result.put("ctrl TAB", DesktopPaneActions.NEXT_FRAME);
		result.put("ctrl alt F6", DesktopPaneActions.NEXT_FRAME);
		result.put("shift ctrl alt F6", DesktopPaneActions.PREVIOUS_FRAME);
		result.put("ctrl F12", DesktopPaneActions.NAVIGATE_NEXT);
		result.put("shift ctrl F12", DesktopPaneActions.NAVIGATE_PREVIOUS);

		return result;
	}

	@Override
	protected SubstanceInputMap getMultilineTextComponentFocusInputMap() {
		SubstanceInputMap result = super
				.getMultilineTextComponentFocusInputMap();

		result.remove("ctrl KP_LEFT");
		result.remove("ctrl KP_RIGHT");
		result.remove("KP_DOWN");
		result.remove("KP_UP");
		result.remove("ctrl shift KP_LEFT");
		result.remove("ctrl shift KP_RIGHT");
		result.remove("shift KP_LEFT");
		result.remove("shift KP_RIGHT");
		result.remove("shift KP_DOWN");
		result.remove("shift KP_UP");

		return result;
	}

	@Override
	public SubstanceInputMap getPasswordFieldFocusInputMap() {
		SubstanceInputMap result = super.getPasswordFieldFocusInputMap();

		result.remove("ctrl KP_LEFT");
		result.remove("ctrl KP_RIGHT");
		result.remove("ctrl shift KP_LEFT");
		result.remove("ctrl shift KP_RIGHT");
		result.remove("shift KP_LEFT");
		result.remove("shift KP_RIGHT");

		return result;
	}

	@Override
	public SubstanceInputMap getScrollBarAncestorInputMap() {
		SubstanceInputMap result = super.getScrollBarAncestorInputMap();

		result.put("ctrl PAGE_DOWN", ScrollBarActions.POSITIVE_BLOCK_INCREMENT);
		result.put("ctrl PAGE_UP", ScrollBarActions.NEGATIVE_BLOCK_INCREMENT);

		return result;
	}

	@Override
	public SubstanceInputMap getSliderFocusInputMap() {
		SubstanceInputMap result = super.getSliderFocusInputMap();

		result.remove("ctrl PAGE_DOWN");
		result.remove("ctrl PAGE_UP");

		return result;
	}

	@Override
	public SubstanceInputMap getTabbedPaneAncestorInputMap() {
		SubstanceInputMap result = super.getTabbedPaneAncestorInputMap();

		result.put("ctrl TAB", TabbedPaneActions.NEXT);
		result.put("shift ctrl TAB", TabbedPaneActions.PREVIOUS);

		return result;
	}

	@Override
	public SubstanceInputMap getTextFieldFocusInputMap() {
		SubstanceInputMap result = super.getTextFieldFocusInputMap();

		result.remove("ctrl KP_LEFT");
		result.remove("ctrl KP_RIGHT");
		result.remove("ctrl shift KP_LEFT");
		result.remove("ctrl shift KP_RIGHT");
		result.remove("shift KP_LEFT");
		result.remove("shift KP_RIGHT");

		return result;
	}

}
