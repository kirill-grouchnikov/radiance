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

import javax.swing.JTextField;
import javax.swing.text.DefaultEditorKit;

import org.pushingpixels.substance.api.inputmap.SubstanceInputMap;

public class AquaInputMapSet extends BaseInputMapSet {
	@Override
	public SubstanceInputMap getComboBoxAncestorInputMap() {
		// All entries in Aqua are "aqua" except ESCAPE mapped to "hidePopup"
		return super.getComboBoxAncestorInputMap();
	}

	protected SubstanceInputMap getSingleLineTextComponentFocusInputMap() {
		SubstanceInputMap result = new SubstanceInputMap();

		result.put("meta C", DefaultEditorKit.copyAction);
		result.put("meta V", DefaultEditorKit.pasteAction);
		result.put("meta X", DefaultEditorKit.cutAction);
		result.put("COPY", DefaultEditorKit.copyAction);
		result.put("PASTE", DefaultEditorKit.pasteAction);
		result.put("CUT", DefaultEditorKit.cutAction);

		result.put("shift LEFT", DefaultEditorKit.selectionBackwardAction);
		result.put("shift KP_LEFT", DefaultEditorKit.selectionBackwardAction);
		result.put("shift RIGHT", DefaultEditorKit.selectionForwardAction);
		result.put("shift KP_RIGHT", DefaultEditorKit.selectionForwardAction);

		result.put("meta LEFT", DefaultEditorKit.beginLineAction);
		result.put("meta KP_LEFT", DefaultEditorKit.beginLineAction);
		result.put("ctrl A", DefaultEditorKit.beginLineAction);
		result.put("UP", DefaultEditorKit.beginLineAction);
		result.put("KP_UP", DefaultEditorKit.beginLineAction);
		result.put("meta RIGHT", DefaultEditorKit.endLineAction);
		result.put("meta KP_RIGHT", DefaultEditorKit.endLineAction);
		result.put("ctrl E", DefaultEditorKit.endLineAction);
		result.put("DOWN", DefaultEditorKit.endLineAction);
		result.put("KP_DOWN", DefaultEditorKit.endLineAction);

		result
				.put("meta shift LEFT",
						DefaultEditorKit.selectionBeginLineAction);
		result.put("meta shift KP_LEFT",
				DefaultEditorKit.selectionBeginLineAction);
		result.put("shift UP", DefaultEditorKit.selectionBeginLineAction);
		result.put("shift KP_UP", DefaultEditorKit.selectionBeginLineAction);
		result.put("meta shift RIGHT", DefaultEditorKit.selectionEndLineAction);
		result.put("meta shift KP_RIGHT",
				DefaultEditorKit.selectionEndLineAction);
		result.put("shift DOWN", DefaultEditorKit.selectionEndLineAction);
		result.put("shift KP_DOWN", DefaultEditorKit.selectionEndLineAction);

		result.put("meta A", DefaultEditorKit.selectAllAction);

		result.put("HOME", DefaultEditorKit.beginAction);
		result.put("ctrl P", DefaultEditorKit.beginAction);
		result.put("meta UP", DefaultEditorKit.beginAction);
		result.put("meta KP_UP", DefaultEditorKit.beginAction);
		result.put("END", DefaultEditorKit.endAction);
		result.put("ctrl N", DefaultEditorKit.endAction);
		result.put("ctrl V", DefaultEditorKit.endAction);
		result.put("meta DOWN", DefaultEditorKit.endAction);
		result.put("meta KP_DOWN", DefaultEditorKit.endAction);

		result.put("shift meta KP_UP", DefaultEditorKit.selectionBeginAction);
		result.put("shift UP", DefaultEditorKit.selectionBeginAction);
		result.put("shift HOME", DefaultEditorKit.selectionBeginAction);
		result.put("shift meta DOWN", DefaultEditorKit.selectionEndAction);
		result.put("shift meta KP_DOWN", DefaultEditorKit.selectionEndAction);
		result.put("shift END", DefaultEditorKit.selectionEndAction);

		result.put("BACK_SPACE", DefaultEditorKit.deletePrevCharAction);
		result.put("ctrl H", DefaultEditorKit.deletePrevCharAction);
		result.put("DELETE", DefaultEditorKit.deleteNextCharAction);
		result.put("ctrl D", DefaultEditorKit.deleteNextCharAction);
		result.put("alt BACK_SPACE", DefaultEditorKit.deletePrevWordAction);
		result.put("ctrl W", DefaultEditorKit.deletePrevWordAction);
		result.put("alt DELETE", DefaultEditorKit.deleteNextWordAction);

		result.put("RIGHT", DefaultEditorKit.forwardAction);
		result.put("KP_RIGHT", DefaultEditorKit.forwardAction);
		result.put("ctrl F", DefaultEditorKit.forwardAction);
		result.put("LEFT", DefaultEditorKit.backwardAction);
		result.put("KP_LEFT", DefaultEditorKit.backwardAction);
		result.put("ctrl B", DefaultEditorKit.backwardAction);

		result.put("alt RIGHT", DefaultEditorKit.nextWordAction);
		result.put("alt KP_RIGHT", DefaultEditorKit.nextWordAction);
		result.put("alt LEFT", DefaultEditorKit.previousWordAction);
		result.put("alt KP_LEFT", DefaultEditorKit.previousWordAction);

		result.put("shift alt RIGHT", DefaultEditorKit.selectionNextWordAction);
		result.put("shift alt KP_RIGHT",
				DefaultEditorKit.selectionNextWordAction);
		result.put("shift alt LEFT",
				DefaultEditorKit.selectionPreviousWordAction);
		result.put("shift alt KP_LEFT",
				DefaultEditorKit.selectionPreviousWordAction);

		result.put("shift meta PAGE_UP",
				TextComponentActions.SELECTION_PAGE_LEFT);
		result.put("shift meta PAGE_DOWN",
				TextComponentActions.SELECTION_PAGE_RIGHT);
		result
				.put("shift meta PAGE_UP",
						TextComponentActions.SELECTION_PAGE_UP);
		result.put("shift meta PAGE_DOWN",
				TextComponentActions.SELECTION_PAGE_DOWN);

		result.put("ENTER", JTextField.notifyAction);
		result.put("meta BACK_SLASH", TextComponentActions.UNSELECT);
		result.put("control shift O",
				TextComponentActions.TOGGLE_COMPONENT_ORIENTATION);

		// XXX: in Aqua these are aqua-page-down and aqua-page-up
		result.put("PAGE_DOWN", DefaultEditorKit.pageDownAction);
		result.put("PAGE_UP", DefaultEditorKit.pageUpAction);

		return result;
	}

	@Override
	protected SubstanceInputMap getMultilineTextComponentFocusInputMap() {
		// This is used in EditorPane, TextArea and TextPane. Almost
		// all key strokes can be mapped to the same basic actions used in Aqua.
		// There are 7 key strokes that use Aqua-specific actions. These
		// are mapped to the closest basic actions.
		SubstanceInputMap result = new SubstanceInputMap();

		result.put("meta C", DefaultEditorKit.copyAction);
		result.put("meta V", DefaultEditorKit.pasteAction);
		result.put("meta X", DefaultEditorKit.cutAction);
		result.put("COPY", DefaultEditorKit.copyAction);
		result.put("PASTE", DefaultEditorKit.pasteAction);
		result.put("CUT", DefaultEditorKit.cutAction);

		result.put("shift LEFT", DefaultEditorKit.selectionBackwardAction);
		result.put("shift KP_LEFT", DefaultEditorKit.selectionBackwardAction);
		result.put("shift RIGHT", DefaultEditorKit.selectionForwardAction);
		result.put("shift KP_RIGHT", DefaultEditorKit.selectionForwardAction);
		result.put("alt LEFT", DefaultEditorKit.previousWordAction);
		result.put("alt KP_LEFT", DefaultEditorKit.previousWordAction);
		result.put("alt RIGHT", DefaultEditorKit.nextWordAction);
		result.put("alt KP_RIGHT", DefaultEditorKit.nextWordAction);
		result.put("alt shift LEFT",
				DefaultEditorKit.selectionPreviousWordAction);
		result.put("alt shift KP_LEFT",
				DefaultEditorKit.selectionPreviousWordAction);
		result.put("alt shift RIGHT", DefaultEditorKit.selectionNextWordAction);
		result.put("alt shift KP_RIGHT",
				DefaultEditorKit.selectionNextWordAction);

		result.put("meta A", DefaultEditorKit.selectAllAction);
		result.put("ctrl A", DefaultEditorKit.beginLineAction);
		result.put("meta KP_LEFT", DefaultEditorKit.beginLineAction);
		result.put("meta LEFT", DefaultEditorKit.beginLineAction);
		result.put("ctrl E", DefaultEditorKit.endLineAction);
		result.put("meta KP_RIGHT", DefaultEditorKit.endLineAction);
		result.put("meta RIGHT", DefaultEditorKit.endLineAction);

		result.put("shift meta KP_LEFT",
				DefaultEditorKit.selectionBeginLineAction);
		result
				.put("shift meta LEFT",
						DefaultEditorKit.selectionBeginLineAction);
		result.put("shift meta KP_RIGHT",
				DefaultEditorKit.selectionEndLineAction);
		result.put("shift meta RIGHT", DefaultEditorKit.selectionEndLineAction);

		result.put("ctrl P", DefaultEditorKit.upAction);
		result.put("ctrl N", DefaultEditorKit.downAction);
		// XXX: these are actually mapped to aqua-move-up and aqua-move-down
		result.put("UP", DefaultEditorKit.upAction);
		result.put("KP_UP", DefaultEditorKit.upAction);
		result.put("DOWN", DefaultEditorKit.downAction);
		result.put("KP_DOWN", DefaultEditorKit.downAction);
		// XXX: these are actually mapped to aqua-page-up and aqua-page-down
		result.put("PAGE_UP", DefaultEditorKit.pageUpAction);
		result.put("PAGE_DOWN", DefaultEditorKit.pageDownAction);
		result.put("ctrl V", DefaultEditorKit.pageDownAction);

		result.put("shift PAGE_UP", TextComponentActions.SELECTION_PAGE_UP);
		result.put("shift PAGE_DOWN", TextComponentActions.SELECTION_PAGE_DOWN);
		result.put("meta shift PAGE_UP",
				TextComponentActions.SELECTION_PAGE_LEFT);
		result.put("meta shift PAGE_DOWN",
				TextComponentActions.SELECTION_PAGE_RIGHT);
		result.put("shift UP", DefaultEditorKit.selectionUpAction);
		result.put("shift KP_UP", DefaultEditorKit.selectionUpAction);
		result.put("shift DOWN", DefaultEditorKit.selectionDownAction);
		result.put("shift KP_DOWN", DefaultEditorKit.selectionDownAction);

		result.put("meta shift KP_UP", DefaultEditorKit.selectionBeginAction);
		result.put("meta shift UP", DefaultEditorKit.selectionBeginAction);
		result.put("shift HOME", DefaultEditorKit.selectionBeginAction);
		result.put("meta shift KP_DOWN", DefaultEditorKit.selectionEndAction);
		result.put("meta shift DOWN", DefaultEditorKit.selectionEndAction);
		result.put("shift END", DefaultEditorKit.selectionEndAction);

		result.put("shift alt KP_UP",
				DefaultEditorKit.selectionBeginParagraphAction);
		result.put("shift alt UP",
				DefaultEditorKit.selectionBeginParagraphAction);
		result.put("shift alt KP_DOWN",
				DefaultEditorKit.selectionEndParagraphAction);
		result.put("shift alt DOWN",
				DefaultEditorKit.selectionEndParagraphAction);

		result.put("ENTER", DefaultEditorKit.insertBreakAction);
		result.put("BACK_SPACE", DefaultEditorKit.deletePrevCharAction);
		result.put("ctrl H", DefaultEditorKit.deletePrevCharAction);
		result.put("DELETE", DefaultEditorKit.deleteNextCharAction);
		result.put("ctrl D", DefaultEditorKit.deleteNextCharAction);
		result.put("alt DELETE", DefaultEditorKit.deleteNextWordAction);
		result.put("alt BACK_SPACE", DefaultEditorKit.deletePrevWordAction);
		result.put("ctrl W", DefaultEditorKit.deletePrevWordAction);

		result.put("RIGHT", DefaultEditorKit.forwardAction);
		result.put("KP_RIGHT", DefaultEditorKit.forwardAction);
		result.put("ctrl F", DefaultEditorKit.forwardAction);
		result.put("LEFT", DefaultEditorKit.backwardAction);
		result.put("KP_LEFT", DefaultEditorKit.backwardAction);
		result.put("ctrl B", DefaultEditorKit.backwardAction);
		result.put("TAB", DefaultEditorKit.insertTabAction);
		result.put("meta BACK_SLASH", TextComponentActions.UNSELECT);

		result.put("meta KP_UP", DefaultEditorKit.beginAction);
		result.put("meta UP", DefaultEditorKit.beginAction);
		result.put("HOME", DefaultEditorKit.beginAction);
		result.put("meta KP_DOWN", DefaultEditorKit.endAction);
		result.put("meta DOWN", DefaultEditorKit.endAction);
		result.put("END", DefaultEditorKit.endAction);

		result.put("meta T", TextComponentActions.NEXT_LINK);
		result.put("meta shift T", TextComponentActions.PREVIOUS_LINK);
		result.put("meta SPACE", TextComponentActions.ACTIVATE_LINK);
		result.put("control shift O",
				TextComponentActions.TOGGLE_COMPONENT_ORIENTATION);

		return result;
	}

	@Override
	public SubstanceInputMap getFileChooserAncestorInputMap() {
		SubstanceInputMap result = new SubstanceInputMap();

		result.put("ESCAPE", FileChooserActions.CANCEL_SELECTION);
		result.put("F5", FileChooserActions.REFRESH);

		return result;
	}

	@Override
	public SubstanceInputMap getListFocusInputMap() {
		SubstanceInputMap result = new SubstanceInputMap();

		result.put("meta C", COPY);
		result.put("meta V", PASTE);
		result.put("meta X", CUT);
		result.put("COPY", COPY);
		result.put("PASTE", PASTE);
		result.put("CUT", CUT);

		result.put("UP", ListActions.SELECT_PREVIOUS_ROW);
		result.put("KP_UP", ListActions.SELECT_PREVIOUS_ROW);
		result.put("shift UP", ListActions.SELECT_PREVIOUS_ROW_EXTEND);
		result.put("shift KP_UP", ListActions.SELECT_PREVIOUS_ROW_EXTEND);

		result.put("DOWN", ListActions.SELECT_NEXT_ROW);
		result.put("KP_DOWN", ListActions.SELECT_NEXT_ROW);
		result.put("shift DOWN", ListActions.SELECT_NEXT_ROW_EXTEND);
		result.put("shift KP_DOWN", ListActions.SELECT_NEXT_ROW_EXTEND);

		result.put("LEFT", ListActions.SELECT_PREVIOUS_COLUMN);
		result.put("KP_LEFT", ListActions.SELECT_PREVIOUS_COLUMN);
		result.put("shift LEFT", ListActions.SELECT_PREVIOUS_COLUMN_EXTEND);
		result.put("shift KP_LEFT", ListActions.SELECT_PREVIOUS_COLUMN_EXTEND);

		result.put("RIGHT", ListActions.SELECT_NEXT_COLUMN);
		result.put("KP_RIGHT", ListActions.SELECT_NEXT_COLUMN);
		result.put("shift RIGHT", ListActions.SELECT_NEXT_COLUMN_EXTEND);
		result.put("shift KP_RIGHT", ListActions.SELECT_NEXT_COLUMN_EXTEND);

		result.put("shift HOME", ListActions.SELECT_FIRST_ROW_EXTEND);
		result.put("shift END", ListActions.SELECT_LAST_ROW_EXTEND);

		result.put("shift PAGE_UP", ListActions.SCROLL_UP_EXTEND);
		result.put("shift PAGE_DOWN", ListActions.SCROLL_DOWN_EXTEND);

		result.put("meta A", ListActions.SELECT_ALL);

		// XXX: missing:
		// END -> aquaEnd
		// HOME -> aquaHome

		return result;
	}

	@Override
	public SubstanceInputMap getPasswordFieldFocusInputMap() {
		return this.getSingleLineTextComponentFocusInputMap();
	}

	@Override
	public SubstanceInputMap getScrollPaneAncestorInputMap() {
		SubstanceInputMap result = new SubstanceInputMap();

		result.put("RIGHT", ScrollPaneActions.UNIT_SCROLL_RIGHT);
		result.put("KP_RIGHT", ScrollPaneActions.UNIT_SCROLL_RIGHT);
		result.put("DOWN", ScrollPaneActions.UNIT_SCROLL_DOWN);
		result.put("KP_DOWN", ScrollPaneActions.UNIT_SCROLL_DOWN);
		result.put("LEFT", ScrollPaneActions.UNIT_SCROLL_LEFT);
		result.put("KP_LEFT", ScrollPaneActions.UNIT_SCROLL_LEFT);
		result.put("UP", ScrollPaneActions.UNIT_SCROLL_UP);
		result.put("KP_UP", ScrollPaneActions.UNIT_SCROLL_UP);

		result.put("PAGE_UP", ScrollPaneActions.SCROLL_UP);
		result.put("PAGE_DOWN", ScrollPaneActions.SCROLL_DOWN);
		result.put("HOME", ScrollPaneActions.SCROLL_HOME);
		result.put("END", ScrollPaneActions.SCROLL_END);

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
	public SubstanceInputMap getTableAncestorInputMap() {
		SubstanceInputMap result = new SubstanceInputMap();

		result.put("meta C", COPY);
		result.put("meta V", PASTE);
		result.put("meta X", CUT);
		result.put("COPY", COPY);
		result.put("PASTE", PASTE);
		result.put("CUT", CUT);

		result.put("RIGHT", TableActions.NEXT_COLUMN);
		result.put("KP_RIGHT", TableActions.NEXT_COLUMN);
		result.put("shift RIGHT", TableActions.NEXT_COLUMN_EXTEND_SELECTION);
		result.put("shift KP_RIGHT", TableActions.NEXT_COLUMN_EXTEND_SELECTION);

		result.put("LEFT", TableActions.PREVIOUS_COLUMN);
		result.put("KP_LEFT", TableActions.PREVIOUS_COLUMN);
		result.put("shift LEFT", TableActions.PREVIOUS_COLUMN_EXTEND_SELECTION);
		result.put("shift KP_LEFT",
				TableActions.PREVIOUS_COLUMN_EXTEND_SELECTION);

		result.put("DOWN", TableActions.NEXT_ROW);
		result.put("KP_DOWN", TableActions.NEXT_ROW);
		result.put("shift DOWN", TableActions.NEXT_ROW_EXTEND_SELECTION);
		result.put("shift KP_DOWN", TableActions.NEXT_ROW_EXTEND_SELECTION);

		result.put("UP", TableActions.PREVIOUS_ROW);
		result.put("KP_UP", TableActions.PREVIOUS_ROW);
		result.put("shift UP", TableActions.PREVIOUS_ROW_EXTEND_SELECTION);
		result.put("shift KP_UP", TableActions.PREVIOUS_ROW_EXTEND_SELECTION);

		result.put("HOME", TableActions.FIRST_COLUMN);
		result.put("shift HOME", TableActions.FIRST_COLUMN_EXTEND_SELECTION);
		result.put("END", TableActions.LAST_COLUMN);
		result.put("shift END", TableActions.LAST_COLUMN_EXTEND_SELECTION);

		result.put("PAGE_UP", TableActions.SCROLL_UP_CHANGE_SELECTION);
		result.put("shift PAGE_UP", TableActions.SCROLL_UP_EXTEND_SELECTION);
		result.put("PAGE_DOWN", TableActions.SCROLL_DOWN_CHANGE_SELECTION);
		result
				.put("shift PAGE_DOWN",
						TableActions.SCROLL_DOWN_EXTEND_SELECTION);

		result.put("TAB", TableActions.NEXT_COLUMN_CELL);
		result.put("shift TAB", TableActions.PREVIOUS_COLUMN_CELL);
		result.put("ENTER", TableActions.NEXT_ROW_CELL);
		result.put("shift ENTER", TableActions.PREVIOUS_ROW_CELL);
		result.put("meta A", TableActions.SELECT_ALL);

		result.put("alt TAB", TableActions.FOCUS_HEADER);
		result.put("shift alt TAB", TableActions.FOCUS_HEADER);

		return result;
	}

	@Override
	public SubstanceInputMap getTextFieldFocusInputMap() {
		return this.getSingleLineTextComponentFocusInputMap();
	}

	@Override
	public SubstanceInputMap getTreeFocusInputMap() {
		SubstanceInputMap result = new SubstanceInputMap();

		result.put("meta C", COPY);
		result.put("meta V", PASTE);
		result.put("meta X", CUT);
		result.put("COPY", COPY);
		result.put("PASTE", PASTE);
		result.put("CUT", CUT);

		result.put("UP", TreeActions.SELECT_PREVIOUS);
		result.put("KP_UP", TreeActions.SELECT_PREVIOUS);
		result.put("shift UP", TreeActions.SELECT_PREVIOUS_EXTEND_SELECTION);
		result.put("shift KP_UP", TreeActions.SELECT_PREVIOUS_EXTEND_SELECTION);

		result.put("DOWN", TreeActions.SELECT_NEXT);
		result.put("KP_DOWN", TreeActions.SELECT_NEXT);
		result.put("shift DOWN", TreeActions.SELECT_NEXT_EXTEND_SELECTION);
		result.put("shift KP_DOWN", TreeActions.SELECT_NEXT_EXTEND_SELECTION);

		result.put("ctrl A", TreeActions.SELECT_ALL);

		// XXX: in Aqua this is mapped to aquaExpandNode
		result.put("RIGHT", TreeActions.EXPAND);
		result.put("KP_RIGHT", TreeActions.EXPAND);
		result.put("ctrl RIGHT", TreeActions.EXPAND);
		result.put("ctrl KP_RIGHT", TreeActions.EXPAND);
		result.put("shift RIGHT", TreeActions.EXPAND);
		result.put("shift KP_RIGHT", TreeActions.EXPAND);

		// XXX: in Aqua this is mapped to aquaCollapseNode
		result.put("LEFT", TreeActions.COLLAPSE);
		result.put("KP_LEFT", TreeActions.COLLAPSE);
		result.put("ctrl LEFT", TreeActions.COLLAPSE);
		result.put("ctrl KP_LEFT", TreeActions.COLLAPSE);
		result.put("shift LEFT", TreeActions.COLLAPSE);
		result.put("shift KP_LEFT", TreeActions.COLLAPSE);

		// XXX: in Aqua there are mappings to aquaFullyCollapseNode and
		// aquaFullyExpandNode

		return result;
	}
}
