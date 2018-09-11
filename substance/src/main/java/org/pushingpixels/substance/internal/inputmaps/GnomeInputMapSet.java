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

public class GnomeInputMapSet extends BaseInputMapSet {
	@Override
	public SubstanceInputMap getButtonFocusInputMap() {
		SubstanceInputMap result = new SubstanceInputMap();

		result.put("SPACE", PRESSED);
		result.put("released SPACE", RELEASED);
		result.put("ENTER", PRESSED);
		result.put("released ENTER", RELEASED);

		return result;
	}

	@Override
	public SubstanceInputMap getFileChooserAncestorInputMap() {
		SubstanceInputMap result = new SubstanceInputMap();

		result.put("ctrl ENTER", FileChooserActions.APPROVE_SELECTION);
		result.put("ESCAPE", FileChooserActions.CANCEL_SELECTION);

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
	public SubstanceInputMap getTreeFocusInputMap() {
		SubstanceInputMap result = super.getTreeFocusInputMap();

		result.remove("ADD");
		result.put("BACK_SPACE", TreeActions.MOVE_SELECTION_TO_PARENT);
		result.remove("SUBTRACT");

		result.put("typed +", TreeActions.EXPAND);
		result.put("typed -", TreeActions.COLLAPSE);

		return result;
	}
}
