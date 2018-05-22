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

import javax.swing.Action;
import javax.swing.JTextField;
import javax.swing.TransferHandler;
import javax.swing.text.DefaultEditorKit;

import org.pushingpixels.substance.api.inputmap.InputMapSet;
import org.pushingpixels.substance.api.inputmap.SubstanceInputMap;

public class BaseInputMapSet implements InputMapSet {
	public static final String PRESSED = "pressed";

	public static final String RELEASED = "released";

	public static final String COPY = (String) TransferHandler.getCopyAction()
			.getValue(Action.NAME);

	public static final String PASTE = (String) TransferHandler
			.getPasteAction().getValue(Action.NAME);

	public static final String CUT = (String) TransferHandler.getCutAction()
			.getValue(Action.NAME);

	protected SubstanceInputMap getActionControlFocusInputMap() {
		SubstanceInputMap result = new SubstanceInputMap();
		result.put("SPACE", PRESSED);
		result.put("released SPACE", RELEASED);
		return result;
	}

	public SubstanceInputMap getButtonFocusInputMap() {
		return this.getActionControlFocusInputMap();
	}

	public SubstanceInputMap getCheckBoxFocusInputMap() {
		return this.getActionControlFocusInputMap();
	}

	/**
	 * Taken from BasicComboBoxUI.Actions
	 */
	protected static class ComboActions {
		public static final String HIDE = "hidePopup";
		public static final String DOWN = "selectNext";
		public static final String DOWN_2 = "selectNext2";
		public static final String TOGGLE = "togglePopup";
		public static final String TOGGLE_2 = "spacePopup";
		public static final String UP = "selectPrevious";
		public static final String UP_2 = "selectPrevious2";
		public static final String ENTER = "enterPressed";
		public static final String PAGE_DOWN = "pageDownPassThrough";
		public static final String PAGE_UP = "pageUpPassThrough";
		public static final String HOME = "homePassThrough";
		public static final String END = "endPassThrough";
	}

	public SubstanceInputMap getComboBoxAncestorInputMap() {
		SubstanceInputMap result = new SubstanceInputMap();

		result.put("ESCAPE", ComboActions.HIDE);
		result.put("PAGE_UP", ComboActions.PAGE_UP);
		result.put("PAGE_DOWN", ComboActions.PAGE_DOWN);
		result.put("HOME", ComboActions.HOME);
		result.put("END", ComboActions.END);
		result.put("DOWN", ComboActions.DOWN);
		result.put("KP_DOWN", ComboActions.DOWN);
		result.put("alt DOWN", ComboActions.TOGGLE);
		result.put("alt KP_DOWN", ComboActions.TOGGLE);
		result.put("alt UP", ComboActions.TOGGLE);
		result.put("alt KP_UP", ComboActions.TOGGLE);
		result.put("SPACE", ComboActions.TOGGLE_2);
		result.put("ENTER", ComboActions.ENTER);
		result.put("UP", ComboActions.UP);
		result.put("KP_UP", ComboActions.UP);

		return result;
	};

	/**
	 * Taken from BasicDesktopPaneUI.Actions
	 */
	protected static class DesktopPaneActions {
		public static String CLOSE = "close";
		public static String ESCAPE = "escape";
		public static String MAXIMIZE = "maximize";
		public static String MINIMIZE = "minimize";
		public static String MOVE = "move";
		public static String RESIZE = "resize";
		public static String RESTORE = "restore";
		public static String LEFT = "left";
		public static String RIGHT = "right";
		public static String UP = "up";
		public static String DOWN = "down";
		public static String SHRINK_LEFT = "shrinkLeft";
		public static String SHRINK_RIGHT = "shrinkRight";
		public static String SHRINK_UP = "shrinkUp";
		public static String SHRINK_DOWN = "shrinkDown";
		public static String NEXT_FRAME = "selectNextFrame";
		public static String PREVIOUS_FRAME = "selectPreviousFrame";
		public static String NAVIGATE_NEXT = "navigateNext";
		public static String NAVIGATE_PREVIOUS = "navigatePrevious";
	}

	public SubstanceInputMap getDesktopAncestorInputMap() {
		SubstanceInputMap result = new SubstanceInputMap();

		result.put("ctrl F5", DesktopPaneActions.RESTORE);
		result.put("ctrl F4", DesktopPaneActions.CLOSE);
		result.put("ctrl F7", DesktopPaneActions.MOVE);
		result.put("ctrl F8", DesktopPaneActions.RESIZE);

		result.put("RIGHT", DesktopPaneActions.RIGHT);
		result.put("KP_RIGHT", DesktopPaneActions.RIGHT);
		result.put("shift RIGHT", DesktopPaneActions.SHRINK_RIGHT);
		result.put("shift KP_RIGHT", DesktopPaneActions.SHRINK_RIGHT);
		result.put("LEFT", DesktopPaneActions.LEFT);
		result.put("KP_LEFT", DesktopPaneActions.LEFT);
		result.put("shift LEFT", DesktopPaneActions.SHRINK_LEFT);
		result.put("shift KP_LEFT", DesktopPaneActions.SHRINK_LEFT);

		result.put("UP", DesktopPaneActions.UP);
		result.put("KP_UP", DesktopPaneActions.UP);
		result.put("shift UP", DesktopPaneActions.SHRINK_UP);
		result.put("shift KP_UP", DesktopPaneActions.SHRINK_UP);
		result.put("DOWN", DesktopPaneActions.DOWN);
		result.put("KP_DOWN", DesktopPaneActions.DOWN);
		result.put("shift DOWN", DesktopPaneActions.SHRINK_DOWN);
		result.put("shift KP_DOWN", DesktopPaneActions.SHRINK_DOWN);

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

	protected static class TextComponentActions {
		// from DefaultEditorKit
		public static final String SELECTION_PAGE_UP = "selection-page-up";
		public static final String SELECTION_PAGE_DOWN = "selection-page-down";
		public static final String SELECTION_PAGE_LEFT = "selection-page-left";
		public static final String SELECTION_PAGE_RIGHT = "selection-page-right";
		public static final String UNSELECT = "unselect";
		public static final String TOGGLE_COMPONENT_ORIENTATION = "toggle-componentOrientation";

		// from HTMLEditorKit
		public static final String NEXT_LINK = "next-link-action";
		public static final String PREVIOUS_LINK = "previous-link-action";
		public static final String ACTIVATE_LINK = "activate-link-action";

		// from JFormattedTextField.CancelAction
		public static final String RESET_FIELD_EDIT = "reset-field-edit";

		// from BasicSpinnerUI.loadActionMap
		public static final String INCREMENT = "increment";
		public static final String DECREMENT = "decrement";
	}

	protected SubstanceInputMap getMultilineTextComponentFocusInputMap() {
		SubstanceInputMap result = new SubstanceInputMap();

		result.put("ctrl C", DefaultEditorKit.copyAction);
		result.put("ctrl V", DefaultEditorKit.pasteAction);
		result.put("ctrl X", DefaultEditorKit.cutAction);
		result.put("COPY", DefaultEditorKit.copyAction);
		result.put("PASTE", DefaultEditorKit.pasteAction);
		result.put("CUT", DefaultEditorKit.cutAction);
		result.put("control INSERT", DefaultEditorKit.copyAction);
		result.put("shift INSERT", DefaultEditorKit.pasteAction);
		result.put("shift DELETE", DefaultEditorKit.cutAction);

		result.put("shift LEFT", DefaultEditorKit.selectionBackwardAction);
		result.put("shift KP_LEFT", DefaultEditorKit.selectionBackwardAction);
		result.put("shift RIGHT", DefaultEditorKit.selectionForwardAction);
		result.put("shift KP_RIGHT", DefaultEditorKit.selectionForwardAction);
		result.put("ctrl LEFT", DefaultEditorKit.previousWordAction);
		result.put("ctrl KP_LEFT", DefaultEditorKit.previousWordAction);
		result.put("ctrl RIGHT", DefaultEditorKit.nextWordAction);
		result.put("ctrl KP_RIGHT", DefaultEditorKit.nextWordAction);
		result.put("ctrl shift LEFT",
				DefaultEditorKit.selectionPreviousWordAction);
		result.put("ctrl shift KP_LEFT",
				DefaultEditorKit.selectionPreviousWordAction);
		result
				.put("ctrl shift RIGHT",
						DefaultEditorKit.selectionNextWordAction);
		result.put("ctrl shift KP_RIGHT",
				DefaultEditorKit.selectionNextWordAction);

		result.put("ctrl A", DefaultEditorKit.selectAllAction);
		result.put("HOME", DefaultEditorKit.beginLineAction);
		result.put("END", DefaultEditorKit.endLineAction);
		result.put("shift HOME", DefaultEditorKit.selectionBeginLineAction);
		result.put("shift END", DefaultEditorKit.selectionEndLineAction);

		result.put("UP", DefaultEditorKit.upAction);
		result.put("KP_UP", DefaultEditorKit.upAction);
		result.put("DOWN", DefaultEditorKit.downAction);
		result.put("KP_DOWN", DefaultEditorKit.downAction);
		result.put("PAGE_UP", DefaultEditorKit.pageUpAction);
		result.put("PAGE_DOWN", DefaultEditorKit.pageDownAction);

		result.put("shift PAGE_UP", TextComponentActions.SELECTION_PAGE_UP);
		result.put("shift PAGE_DOWN", TextComponentActions.SELECTION_PAGE_DOWN);
		result.put("ctrl shift PAGE_UP",
				TextComponentActions.SELECTION_PAGE_LEFT);
		result.put("ctrl shift PAGE_DOWN",
				TextComponentActions.SELECTION_PAGE_RIGHT);
		result.put("shift UP", DefaultEditorKit.selectionUpAction);
		result.put("shift KP_UP", DefaultEditorKit.selectionUpAction);
		result.put("shift DOWN", DefaultEditorKit.selectionDownAction);
		result.put("shift KP_DOWN", DefaultEditorKit.selectionDownAction);

		result.put("ctrl shift HOME", DefaultEditorKit.selectionBeginAction);
		result.put("ctrl shift END", DefaultEditorKit.selectionEndAction);

		result.put("ENTER", DefaultEditorKit.insertBreakAction);
		result.put("BACK_SPACE", DefaultEditorKit.deletePrevCharAction);
		result.put("shift BACK_SPACE", DefaultEditorKit.deletePrevCharAction);
		result.put("ctrl H", DefaultEditorKit.deletePrevCharAction);
		result.put("DELETE", DefaultEditorKit.deleteNextCharAction);
		result.put("ctrl DELETE", DefaultEditorKit.deleteNextWordAction);
		result.put("ctrl BACK_SPACE", DefaultEditorKit.deletePrevWordAction);

		result.put("RIGHT", DefaultEditorKit.forwardAction);
		result.put("KP_RIGHT", DefaultEditorKit.forwardAction);
		result.put("LEFT", DefaultEditorKit.backwardAction);
		result.put("KP_LEFT", DefaultEditorKit.backwardAction);
		result.put("TAB", DefaultEditorKit.insertTabAction);
		result.put("ctrl BACK_SLASH", TextComponentActions.UNSELECT);
		result.put("ctrl HOME", DefaultEditorKit.beginAction);
		result.put("ctrl END", DefaultEditorKit.endAction);

		result.put("ctrl T", TextComponentActions.NEXT_LINK);
		result.put("ctrl shift T", TextComponentActions.PREVIOUS_LINK);
		result.put("ctrl SPACE", TextComponentActions.ACTIVATE_LINK);
		result.put("control shift O",
				TextComponentActions.TOGGLE_COMPONENT_ORIENTATION);

		return result;
	};

	public SubstanceInputMap getEditorPaneFocusInputMap() {
		return this.getMultilineTextComponentFocusInputMap();
	}

	/**
	 * From sun.swing.FilePane via BasicFileChooserUI
	 */
	protected static class FileChooserActions {
		public static final String APPROVE_SELECTION = "approveSelection";
		public static final String CANCEL_SELECTION = "cancelSelection";
		public static final String EDIT_FILE_NAME = "editFileName";
		public static final String REFRESH = "refresh";
		public static final String GO_UP = "Go Up";
	}

	public SubstanceInputMap getFileChooserAncestorInputMap() {
		SubstanceInputMap result = new SubstanceInputMap();

		result.put("ESCAPE", FileChooserActions.CANCEL_SELECTION);
		result.put("F2", FileChooserActions.EDIT_FILE_NAME);
		result.put("F5", FileChooserActions.REFRESH);
		result.put("BACK_SPACE", FileChooserActions.GO_UP);
		result.put("ENTER", FileChooserActions.APPROVE_SELECTION);
		result.put("ctrl ENTER", FileChooserActions.APPROVE_SELECTION);

		return result;
	}

	@Override
	public SubstanceInputMap getFormattedTextFieldFocusInputMap() {
		SubstanceInputMap result = new SubstanceInputMap();

		result.put("ctrl C", DefaultEditorKit.copyAction);
		result.put("ctrl V", DefaultEditorKit.pasteAction);
		result.put("ctrl X", DefaultEditorKit.cutAction);
		result.put("COPY", DefaultEditorKit.copyAction);
		result.put("PASTE", DefaultEditorKit.pasteAction);
		result.put("CUT", DefaultEditorKit.cutAction);
		result.put("control INSERT", DefaultEditorKit.copyAction);
		result.put("shift INSERT", DefaultEditorKit.pasteAction);
		result.put("shift DELETE", DefaultEditorKit.cutAction);

		result.put("shift LEFT", DefaultEditorKit.selectionBackwardAction);
		result.put("shift KP_LEFT", DefaultEditorKit.selectionBackwardAction);
		result.put("shift RIGHT", DefaultEditorKit.selectionForwardAction);
		result.put("shift KP_RIGHT", DefaultEditorKit.selectionForwardAction);

		result.put("ctrl LEFT", DefaultEditorKit.previousWordAction);
		result.put("ctrl KP_LEFT", DefaultEditorKit.previousWordAction);
		result.put("ctrl RIGHT", DefaultEditorKit.nextWordAction);
		result.put("ctrl KP_RIGHT", DefaultEditorKit.nextWordAction);
		result.put("ctrl shift LEFT",
				DefaultEditorKit.selectionPreviousWordAction);
		result.put("ctrl shift KP_LEFT",
				DefaultEditorKit.selectionPreviousWordAction);
		result
				.put("ctrl shift RIGHT",
						DefaultEditorKit.selectionNextWordAction);
		result.put("ctrl shift KP_RIGHT",
				DefaultEditorKit.selectionNextWordAction);

		result.put("ctrl A", DefaultEditorKit.selectAllAction);
		result.put("HOME", DefaultEditorKit.beginLineAction);
		result.put("END", DefaultEditorKit.endLineAction);
		result.put("shift HOME", DefaultEditorKit.selectionBeginLineAction);
		result.put("shift END", DefaultEditorKit.selectionEndLineAction);

		result.put("BACK_SPACE", DefaultEditorKit.deletePrevCharAction);
		result.put("shift BACK_SPACE", DefaultEditorKit.deletePrevCharAction);
		result.put("ctrl H", DefaultEditorKit.deletePrevCharAction);
		result.put("DELETE", DefaultEditorKit.deleteNextCharAction);
		result.put("ctrl DELETE", DefaultEditorKit.deleteNextWordAction);
		result.put("ctrl BACK_SPACE", DefaultEditorKit.deletePrevWordAction);
		result.put("RIGHT", DefaultEditorKit.forwardAction);
		result.put("LEFT", DefaultEditorKit.backwardAction);
		result.put("KP_RIGHT", DefaultEditorKit.forwardAction);
		result.put("KP_LEFT", DefaultEditorKit.backwardAction);

		result.put("ENTER", JTextField.notifyAction);
		result.put("ctrl BACK_SLASH", TextComponentActions.UNSELECT);
		result.put("control shift O",
				TextComponentActions.TOGGLE_COMPONENT_ORIENTATION);
		result.put("ESCAPE", TextComponentActions.RESET_FIELD_EDIT);
		result.put("UP", TextComponentActions.INCREMENT);
		result.put("KP_UP", TextComponentActions.INCREMENT);
		result.put("DOWN", TextComponentActions.DECREMENT);
		result.put("KP_DOWN", TextComponentActions.DECREMENT);

		return result;
	}

	/**
	 * From BasicListUI.Actions
	 */
	protected static class ListActions {
		public static final String SELECT_PREVIOUS_COLUMN = "selectPreviousColumn";
		public static final String SELECT_PREVIOUS_COLUMN_EXTEND = "selectPreviousColumnExtendSelection";
		public static final String SELECT_PREVIOUS_COLUMN_CHANGE_LEAD = "selectPreviousColumnChangeLead";
		public static final String SELECT_NEXT_COLUMN = "selectNextColumn";
		public static final String SELECT_NEXT_COLUMN_EXTEND = "selectNextColumnExtendSelection";
		public static final String SELECT_NEXT_COLUMN_CHANGE_LEAD = "selectNextColumnChangeLead";
		public static final String SELECT_PREVIOUS_ROW = "selectPreviousRow";
		public static final String SELECT_PREVIOUS_ROW_EXTEND = "selectPreviousRowExtendSelection";
		public static final String SELECT_PREVIOUS_ROW_CHANGE_LEAD = "selectPreviousRowChangeLead";
		public static final String SELECT_NEXT_ROW = "selectNextRow";
		public static final String SELECT_NEXT_ROW_EXTEND = "selectNextRowExtendSelection";
		public static final String SELECT_NEXT_ROW_CHANGE_LEAD = "selectNextRowChangeLead";
		public static final String SELECT_FIRST_ROW = "selectFirstRow";
		public static final String SELECT_FIRST_ROW_EXTEND = "selectFirstRowExtendSelection";
		public static final String SELECT_FIRST_ROW_CHANGE_LEAD = "selectFirstRowChangeLead";
		public static final String SELECT_LAST_ROW = "selectLastRow";
		public static final String SELECT_LAST_ROW_EXTEND = "selectLastRowExtendSelection";
		public static final String SELECT_LAST_ROW_CHANGE_LEAD = "selectLastRowChangeLead";
		public static final String SCROLL_UP = "scrollUp";
		public static final String SCROLL_UP_EXTEND = "scrollUpExtendSelection";
		public static final String SCROLL_UP_CHANGE_LEAD = "scrollUpChangeLead";
		public static final String SCROLL_DOWN = "scrollDown";
		public static final String SCROLL_DOWN_EXTEND = "scrollDownExtendSelection";
		public static final String SCROLL_DOWN_CHANGE_LEAD = "scrollDownChangeLead";
		public static final String SELECT_ALL = "selectAll";
		public static final String CLEAR_SELECTION = "clearSelection";

		public static final String ADD_TO_SELECTION = "addToSelection";
		public static final String TOGGLE_AND_ANCHOR = "toggleAndAnchor";

		public static final String EXTEND_TO = "extendTo";

		public static final String MOVE_SELECTION_TO = "moveSelectionTo";

	}

	public SubstanceInputMap getListFocusInputMap() {
		SubstanceInputMap result = new SubstanceInputMap();

		result.put("ctrl C", COPY);
		result.put("ctrl V", PASTE);
		result.put("ctrl X", CUT);
		result.put("COPY", COPY);
		result.put("PASTE", PASTE);
		result.put("CUT", CUT);
		result.put("control INSERT", COPY);
		result.put("shift INSERT", PASTE);
		result.put("shift DELETE", CUT);

		result.put("UP", ListActions.SELECT_PREVIOUS_ROW);
		result.put("KP_UP", ListActions.SELECT_PREVIOUS_ROW);
		result.put("shift UP", ListActions.SELECT_PREVIOUS_ROW_EXTEND);
		result.put("shift KP_UP", ListActions.SELECT_PREVIOUS_ROW_EXTEND);
		result.put("ctrl shift UP", ListActions.SELECT_PREVIOUS_ROW_EXTEND);
		result.put("ctrl shift KP_UP", ListActions.SELECT_PREVIOUS_ROW_EXTEND);
		result.put("ctrl UP", ListActions.SELECT_PREVIOUS_ROW_CHANGE_LEAD);
		result.put("ctrl KP_UP", ListActions.SELECT_PREVIOUS_ROW_CHANGE_LEAD);

		result.put("DOWN", ListActions.SELECT_NEXT_ROW);
		result.put("KP_DOWN", ListActions.SELECT_NEXT_ROW);
		result.put("shift DOWN", ListActions.SELECT_NEXT_ROW_EXTEND);
		result.put("shift KP_DOWN", ListActions.SELECT_NEXT_ROW_EXTEND);
		result.put("ctrl shift DOWN", ListActions.SELECT_NEXT_ROW_EXTEND);
		result.put("ctrl shift KP_DOWN", ListActions.SELECT_NEXT_ROW_EXTEND);
		result.put("ctrl DOWN", ListActions.SELECT_NEXT_ROW_CHANGE_LEAD);
		result.put("ctrl KP_DOWN", ListActions.SELECT_NEXT_ROW_CHANGE_LEAD);

		result.put("LEFT", ListActions.SELECT_PREVIOUS_COLUMN);
		result.put("KP_LEFT", ListActions.SELECT_PREVIOUS_COLUMN);
		result.put("shift LEFT", ListActions.SELECT_PREVIOUS_COLUMN_EXTEND);
		result.put("shift KP_LEFT", ListActions.SELECT_PREVIOUS_COLUMN_EXTEND);
		result
				.put("ctrl shift LEFT",
						ListActions.SELECT_PREVIOUS_COLUMN_EXTEND);
		result.put("ctrl shift KP_LEFT",
				ListActions.SELECT_PREVIOUS_COLUMN_EXTEND);
		result.put("ctrl LEFT", ListActions.SELECT_PREVIOUS_COLUMN_CHANGE_LEAD);
		result.put("ctrl KP_LEFT",
				ListActions.SELECT_PREVIOUS_COLUMN_CHANGE_LEAD);

		result.put("RIGHT", ListActions.SELECT_NEXT_COLUMN);
		result.put("KP_RIGHT", ListActions.SELECT_NEXT_COLUMN);
		result.put("shift RIGHT", ListActions.SELECT_NEXT_COLUMN_EXTEND);
		result.put("shift KP_RIGHT", ListActions.SELECT_NEXT_COLUMN_EXTEND);
		result.put("ctrl shift RIGHT", ListActions.SELECT_NEXT_COLUMN_EXTEND);
		result
				.put("ctrl shift KP_RIGHT",
						ListActions.SELECT_NEXT_COLUMN_EXTEND);
		result.put("ctrl RIGHT", ListActions.SELECT_NEXT_COLUMN_CHANGE_LEAD);
		result.put("ctrl KP_RIGHT", ListActions.SELECT_NEXT_COLUMN_CHANGE_LEAD);

		result.put("HOME", ListActions.SELECT_FIRST_ROW);
		result.put("shift HOME", ListActions.SELECT_FIRST_ROW_EXTEND);
		result.put("ctrl shift HOME", ListActions.SELECT_FIRST_ROW_EXTEND);
		result.put("ctrl HOME", ListActions.SELECT_FIRST_ROW_CHANGE_LEAD);
		result.put("END", ListActions.SELECT_LAST_ROW);
		result.put("shift END", ListActions.SELECT_LAST_ROW_EXTEND);
		result.put("ctrl shift END", ListActions.SELECT_LAST_ROW_EXTEND);
		result.put("ctrl END", ListActions.SELECT_LAST_ROW_CHANGE_LEAD);

		result.put("PAGE_UP", ListActions.SCROLL_UP);
		result.put("shift PAGE_UP", ListActions.SCROLL_UP_EXTEND);
		result.put("ctrl shift PAGE_UP", ListActions.SCROLL_UP_EXTEND);
		result.put("ctrl PAGE_UP", ListActions.SCROLL_UP_CHANGE_LEAD);
		result.put("PAGE_DOWN", ListActions.SCROLL_DOWN);
		result.put("shift PAGE_DOWN", ListActions.SCROLL_DOWN_EXTEND);
		result.put("ctrl shift PAGE_DOWN", ListActions.SCROLL_DOWN_EXTEND);
		result.put("ctrl PAGE_DOWN", ListActions.SCROLL_DOWN_CHANGE_LEAD);

		result.put("ctrl A", ListActions.SELECT_ALL);
		result.put("ctrl SLASH", ListActions.SELECT_ALL);
		result.put("ctrl BACK_SLASH", ListActions.CLEAR_SELECTION);
		result.put("SPACE", ListActions.ADD_TO_SELECTION);
		result.put("ctrl SPACE", ListActions.TOGGLE_AND_ANCHOR);
		result.put("shift SPACE", ListActions.EXTEND_TO);
		result.put("ctrl shift SPACE", ListActions.MOVE_SELECTION_TO);

		return result;
	}

	public SubstanceInputMap getPasswordFieldFocusInputMap() {
		SubstanceInputMap result = new SubstanceInputMap();

		result.put("ctrl C", DefaultEditorKit.copyAction);
		result.put("ctrl V", DefaultEditorKit.pasteAction);
		result.put("ctrl X", DefaultEditorKit.cutAction);
		result.put("COPY", DefaultEditorKit.copyAction);
		result.put("PASTE", DefaultEditorKit.pasteAction);
		result.put("CUT", DefaultEditorKit.cutAction);
		result.put("control INSERT", DefaultEditorKit.copyAction);
		result.put("shift INSERT", DefaultEditorKit.pasteAction);
		result.put("shift DELETE", DefaultEditorKit.cutAction);

		result.put("shift LEFT", DefaultEditorKit.selectionBackwardAction);
		result.put("shift KP_LEFT", DefaultEditorKit.selectionBackwardAction);
		result.put("shift RIGHT", DefaultEditorKit.selectionForwardAction);
		result.put("shift KP_RIGHT", DefaultEditorKit.selectionForwardAction);

		result.put("ctrl LEFT", DefaultEditorKit.beginLineAction);
		result.put("ctrl KP_LEFT", DefaultEditorKit.beginLineAction);
		result.put("ctrl RIGHT", DefaultEditorKit.endLineAction);
		result.put("ctrl KP_RIGHT", DefaultEditorKit.endLineAction);
		result
				.put("ctrl shift LEFT",
						DefaultEditorKit.selectionBeginLineAction);
		result.put("ctrl shift KP_LEFT",
				DefaultEditorKit.selectionBeginLineAction);
		result.put("ctrl shift RIGHT", DefaultEditorKit.selectionEndLineAction);
		result.put("ctrl shift KP_RIGHT",
				DefaultEditorKit.selectionEndLineAction);

		result.put("ctrl A", DefaultEditorKit.selectAllAction);
		result.put("HOME", DefaultEditorKit.beginLineAction);
		result.put("END", DefaultEditorKit.endLineAction);
		result.put("shift HOME", DefaultEditorKit.selectionBeginLineAction);
		result.put("shift END", DefaultEditorKit.selectionEndLineAction);
		result.put("BACK_SPACE", DefaultEditorKit.deletePrevCharAction);
		result.put("shift BACK_SPACE", DefaultEditorKit.deletePrevCharAction);
		result.put("ctrl H", DefaultEditorKit.deletePrevCharAction);
		result.put("DELETE", DefaultEditorKit.deleteNextCharAction);
		result.put("RIGHT", DefaultEditorKit.forwardAction);
		result.put("LEFT", DefaultEditorKit.backwardAction);
		result.put("KP_RIGHT", DefaultEditorKit.forwardAction);
		result.put("KP_LEFT", DefaultEditorKit.backwardAction);
		result.put("ENTER", JTextField.notifyAction);
		result.put("ctrl BACK_SLASH", TextComponentActions.UNSELECT);
		result.put("control shift O",
				TextComponentActions.TOGGLE_COMPONENT_ORIENTATION);

		return result;
	}

	public SubstanceInputMap getRadioButtonFocusInputMap() {
		return this.getActionControlFocusInputMap();
	}

	/**
	 * From BasicRootPaneUI.Actions
	 */
	protected static class RootPaneActions {
		public static final String POST_POPUP = "postPopup";
	}

	public SubstanceInputMap getRootPaneAncestorInputMap() {
		SubstanceInputMap result = new SubstanceInputMap();

		result.put("shift F10", RootPaneActions.POST_POPUP);
		result.put("CONTEXT_MENU", RootPaneActions.POST_POPUP);

		return result;
	}

	/**
	 * From BasicScrollBarUI.Actions
	 */
	protected static class ScrollBarActions {
		public static final String POSITIVE_UNIT_INCREMENT = "positiveUnitIncrement";
		public static final String POSITIVE_BLOCK_INCREMENT = "positiveBlockIncrement";
		public static final String NEGATIVE_UNIT_INCREMENT = "negativeUnitIncrement";
		public static final String NEGATIVE_BLOCK_INCREMENT = "negativeBlockIncrement";
		public static final String MIN_SCROLL = "minScroll";
		public static final String MAX_SCROLL = "maxScroll";
	}

	@Override
	public SubstanceInputMap getScrollBarAncestorInputMap() {
		SubstanceInputMap result = new SubstanceInputMap();

		result.put("RIGHT", ScrollBarActions.POSITIVE_UNIT_INCREMENT);
		result.put("KP_RIGHT", ScrollBarActions.POSITIVE_UNIT_INCREMENT);
		result.put("DOWN", ScrollBarActions.POSITIVE_UNIT_INCREMENT);
		result.put("KP_DOWN", ScrollBarActions.POSITIVE_UNIT_INCREMENT);
		result.put("PAGE_DOWN", ScrollBarActions.POSITIVE_BLOCK_INCREMENT);

		result.put("LEFT", ScrollBarActions.NEGATIVE_UNIT_INCREMENT);
		result.put("KP_LEFT", ScrollBarActions.NEGATIVE_UNIT_INCREMENT);
		result.put("UP", ScrollBarActions.NEGATIVE_UNIT_INCREMENT);
		result.put("KP_UP", ScrollBarActions.NEGATIVE_UNIT_INCREMENT);
		result.put("PAGE_UP", ScrollBarActions.NEGATIVE_BLOCK_INCREMENT);

		result.put("HOME", ScrollBarActions.MIN_SCROLL);
		result.put("END", ScrollBarActions.MAX_SCROLL);

		return result;
	}

	/**
	 * From BasicScrollPaneUI.Actions
	 */
	protected static class ScrollPaneActions {
		public static final String SCROLL_UP = "scrollUp";
		public static final String SCROLL_DOWN = "scrollDown";
		public static final String SCROLL_HOME = "scrollHome";
		public static final String SCROLL_END = "scrollEnd";
		public static final String UNIT_SCROLL_UP = "unitScrollUp";
		public static final String UNIT_SCROLL_DOWN = "unitScrollDown";
		public static final String SCROLL_LEFT = "scrollLeft";
		public static final String SCROLL_RIGHT = "scrollRight";
		public static final String UNIT_SCROLL_LEFT = "unitScrollLeft";
		public static final String UNIT_SCROLL_RIGHT = "unitScrollRight";
	}

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
		result.put("ctrl PAGE_UP", ScrollPaneActions.SCROLL_LEFT);
		result.put("ctrl PAGE_DOWN", ScrollPaneActions.SCROLL_RIGHT);
		result.put("ctrl HOME", ScrollPaneActions.SCROLL_HOME);
		result.put("ctrl END", ScrollPaneActions.SCROLL_END);

		return result;
	}

	/**
	 * From BasicSliderUI.Actions
	 */
	protected static class SliderActions {
		public static final String POSITIVE_UNIT_INCREMENT = "positiveUnitIncrement";
		public static final String POSITIVE_BLOCK_INCREMENT = "positiveBlockIncrement";
		public static final String NEGATIVE_UNIT_INCREMENT = "negativeUnitIncrement";
		public static final String NEGATIVE_BLOCK_INCREMENT = "negativeBlockIncrement";
		public static final String MIN_SCROLL_INCREMENT = "minScroll";
		public static final String MAX_SCROLL_INCREMENT = "maxScroll";
	}

	public SubstanceInputMap getSliderFocusInputMap() {
		SubstanceInputMap result = new SubstanceInputMap();

		result.put("RIGHT", SliderActions.POSITIVE_UNIT_INCREMENT);
		result.put("KP_RIGHT", SliderActions.POSITIVE_UNIT_INCREMENT);
		result.put("DOWN", SliderActions.NEGATIVE_UNIT_INCREMENT);
		result.put("KP_DOWN", SliderActions.NEGATIVE_UNIT_INCREMENT);
		result.put("LEFT", SliderActions.NEGATIVE_UNIT_INCREMENT);
		result.put("KP_LEFT", SliderActions.NEGATIVE_UNIT_INCREMENT);
		result.put("UP", SliderActions.POSITIVE_UNIT_INCREMENT);
		result.put("KP_UP", SliderActions.POSITIVE_UNIT_INCREMENT);

		result.put("PAGE_DOWN", SliderActions.NEGATIVE_BLOCK_INCREMENT);
		result.put("ctrl PAGE_DOWN", SliderActions.NEGATIVE_BLOCK_INCREMENT);
		result.put("PAGE_UP", SliderActions.POSITIVE_BLOCK_INCREMENT);
		result.put("ctrl PAGE_UP", SliderActions.POSITIVE_BLOCK_INCREMENT);

		result.put("HOME", SliderActions.MIN_SCROLL_INCREMENT);
		result.put("END", SliderActions.MAX_SCROLL_INCREMENT);

		return result;
	}

	public SubstanceInputMap getSpinnerAncestorInputMap() {
		SubstanceInputMap result = new SubstanceInputMap();

		result.put("UP", TextComponentActions.INCREMENT);
		result.put("KP_UP", TextComponentActions.INCREMENT);
		result.put("DOWN", TextComponentActions.DECREMENT);
		result.put("KP_DOWN", TextComponentActions.DECREMENT);

		return result;

	};

	protected static class SplitPaneActions {
		public static final String NEGATIVE_INCREMENT = "negativeIncrement";
		public static final String POSITIVE_INCREMENT = "positiveIncrement";
		public static final String SELECT_MIN = "selectMin";
		public static final String SELECT_MAX = "selectMax";
		public static final String START_RESIZE = "startResize";
		public static final String TOGGLE_FOCUS = "toggleFocus";
		public static final String FOCUS_OUT_FORWARD = "focusOutForward";
		public static final String FOCUS_OUT_BACKWARD = "focusOutBackward";
	}

	public SubstanceInputMap getSplitPaneAncestorInputMap() {
		SubstanceInputMap result = new SubstanceInputMap();

		result.put("UP", SplitPaneActions.NEGATIVE_INCREMENT);
		result.put("DOWN", SplitPaneActions.POSITIVE_INCREMENT);
		result.put("LEFT", SplitPaneActions.NEGATIVE_INCREMENT);
		result.put("RIGHT", SplitPaneActions.POSITIVE_INCREMENT);
		result.put("KP_UP", SplitPaneActions.NEGATIVE_INCREMENT);
		result.put("KP_DOWN", SplitPaneActions.POSITIVE_INCREMENT);
		result.put("KP_LEFT", SplitPaneActions.NEGATIVE_INCREMENT);
		result.put("KP_RIGHT", SplitPaneActions.POSITIVE_INCREMENT);

		result.put("HOME", SplitPaneActions.SELECT_MIN);
		result.put("END", SplitPaneActions.SELECT_MAX);
		result.put("F8", SplitPaneActions.START_RESIZE);
		result.put("F6", SplitPaneActions.TOGGLE_FOCUS);
		result.put("ctrl TAB", SplitPaneActions.FOCUS_OUT_FORWARD);
		result.put("ctrl shift TAB", SplitPaneActions.FOCUS_OUT_BACKWARD);

		return result;
	}

	/**
	 * From BasicTabbedPaneUI.Actions
	 */
	protected static class TabbedPaneActions {
		public static final String NEXT = "navigateNext";
		public static final String PREVIOUS = "navigatePrevious";
		public static final String RIGHT = "navigateRight";
		public static final String LEFT = "navigateLeft";
		public static final String UP = "navigateUp";
		public static final String DOWN = "navigateDown";
		public static final String PAGE_UP = "navigatePageUp";
		public static final String PAGE_DOWN = "navigatePageDown";
		public static final String REQUEST_FOCUS = "requestFocus";
		public static final String REQUEST_FOCUS_FOR_VISIBLE = "requestFocusForVisibleComponent";
		public static final String SET_SELECTED = "setSelectedIndex";
		public static final String SELECT_FOCUSED = "selectTabWithFocus";
		public static final String SCROLL_FORWARD = "scrollTabsForwardAction";
		public static final String SCROLL_BACKWARD = "scrollTabsBackwardAction";
	}

	@Override
	public SubstanceInputMap getTabbedPaneAncestorInputMap() {
		SubstanceInputMap result = new SubstanceInputMap();

		result.put("ctrl PAGE_DOWN", TabbedPaneActions.PAGE_DOWN);
		result.put("ctrl PAGE_UP", TabbedPaneActions.PAGE_UP);
		result.put("ctrl UP", TabbedPaneActions.REQUEST_FOCUS);
		result.put("ctrl KP_UP", TabbedPaneActions.REQUEST_FOCUS);

		return result;
	}

	@Override
	public SubstanceInputMap getTabbedPaneFocusInputMap() {
		SubstanceInputMap result = new SubstanceInputMap();

		result.put("RIGHT", TabbedPaneActions.RIGHT);
		result.put("KP_RIGHT", TabbedPaneActions.RIGHT);
		result.put("LEFT", TabbedPaneActions.LEFT);
		result.put("KP_LEFT", TabbedPaneActions.LEFT);

		result.put("UP", TabbedPaneActions.UP);
		result.put("KP_UP", TabbedPaneActions.UP);
		result.put("DOWN", TabbedPaneActions.DOWN);
		result.put("KP_DOWN", TabbedPaneActions.DOWN);

		result.put("ctrl DOWN", TabbedPaneActions.REQUEST_FOCUS_FOR_VISIBLE);
		result.put("ctrl KP_DOWN", TabbedPaneActions.REQUEST_FOCUS_FOR_VISIBLE);

		return result;
	}

	/**
	 * From BasicTableUI.Actions
	 */
	protected static class TableActions {
		public static final String CANCEL_EDITING = "cancel";
		public static final String SELECT_ALL = "selectAll";
		public static final String CLEAR_SELECTION = "clearSelection";
		public static final String START_EDITING = "startEditing";

		public static final String NEXT_ROW = "selectNextRow";
		public static final String NEXT_ROW_CELL = "selectNextRowCell";
		public static final String NEXT_ROW_EXTEND_SELECTION = "selectNextRowExtendSelection";
		public static final String NEXT_ROW_CHANGE_LEAD = "selectNextRowChangeLead";
		public static final String PREVIOUS_ROW = "selectPreviousRow";
		public static final String PREVIOUS_ROW_CELL = "selectPreviousRowCell";
		public static final String PREVIOUS_ROW_EXTEND_SELECTION = "selectPreviousRowExtendSelection";
		public static final String PREVIOUS_ROW_CHANGE_LEAD = "selectPreviousRowChangeLead";

		public static final String NEXT_COLUMN = "selectNextColumn";
		public static final String NEXT_COLUMN_CELL = "selectNextColumnCell";
		public static final String NEXT_COLUMN_EXTEND_SELECTION = "selectNextColumnExtendSelection";
		public static final String NEXT_COLUMN_CHANGE_LEAD = "selectNextColumnChangeLead";
		public static final String PREVIOUS_COLUMN = "selectPreviousColumn";
		public static final String PREVIOUS_COLUMN_CELL = "selectPreviousColumnCell";
		public static final String PREVIOUS_COLUMN_EXTEND_SELECTION = "selectPreviousColumnExtendSelection";
		public static final String PREVIOUS_COLUMN_CHANGE_LEAD = "selectPreviousColumnChangeLead";

		public static final String SCROLL_LEFT_CHANGE_SELECTION = "scrollLeftChangeSelection";
		public static final String SCROLL_LEFT_EXTEND_SELECTION = "scrollLeftExtendSelection";
		public static final String SCROLL_RIGHT_CHANGE_SELECTION = "scrollRightChangeSelection";
		public static final String SCROLL_RIGHT_EXTEND_SELECTION = "scrollRightExtendSelection";

		public static final String SCROLL_UP_CHANGE_SELECTION = "scrollUpChangeSelection";
		public static final String SCROLL_UP_EXTEND_SELECTION = "scrollUpExtendSelection";
		public static final String SCROLL_DOWN_CHANGE_SELECTION = "scrollDownChangeSelection";
		public static final String SCROLL_DOWN_EXTEND_SELECTION = "scrollDownExtendSelection";

		public static final String FIRST_COLUMN = "selectFirstColumn";
		public static final String FIRST_COLUMN_EXTEND_SELECTION = "selectFirstColumnExtendSelection";
		public static final String LAST_COLUMN = "selectLastColumn";
		public static final String LAST_COLUMN_EXTEND_SELECTION = "selectLastColumnExtendSelection";

		public static final String FIRST_ROW = "selectFirstRow";
		public static final String FIRST_ROW_EXTEND_SELECTION = "selectFirstRowExtendSelection";
		public static final String LAST_ROW = "selectLastRow";
		public static final String LAST_ROW_EXTEND_SELECTION = "selectLastRowExtendSelection";

		public static final String ADD_TO_SELECTION = "addToSelection";

		public static final String TOGGLE_AND_ANCHOR = "toggleAndAnchor";

		public static final String EXTEND_TO = "extendTo";

		public static final String MOVE_SELECTION_TO = "moveSelectionTo";

		public static final String FOCUS_HEADER = "focusHeader";
	}

	public SubstanceInputMap getTableAncestorInputMap() {
		SubstanceInputMap result = new SubstanceInputMap();

		result.put("ctrl C", COPY);
		result.put("ctrl V", PASTE);
		result.put("ctrl X", CUT);
		result.put("COPY", COPY);
		result.put("PASTE", PASTE);
		result.put("CUT", CUT);
		result.put("control INSERT", COPY);
		result.put("shift INSERT", PASTE);
		result.put("shift DELETE", CUT);

		result.put("RIGHT", TableActions.NEXT_COLUMN);
		result.put("KP_RIGHT", TableActions.NEXT_COLUMN);
		result.put("shift RIGHT", TableActions.NEXT_COLUMN_EXTEND_SELECTION);
		result.put("shift KP_RIGHT", TableActions.NEXT_COLUMN_EXTEND_SELECTION);
		result.put("ctrl shift RIGHT",
				TableActions.NEXT_COLUMN_EXTEND_SELECTION);
		result.put("ctrl shift KP_RIGHT",
				TableActions.NEXT_COLUMN_EXTEND_SELECTION);
		result.put("ctrl RIGHT", TableActions.NEXT_COLUMN_CHANGE_LEAD);
		result.put("ctrl KP_RIGHT", TableActions.NEXT_COLUMN_CHANGE_LEAD);

		result.put("LEFT", TableActions.PREVIOUS_COLUMN);
		result.put("KP_LEFT", TableActions.PREVIOUS_COLUMN);
		result.put("shift LEFT", TableActions.PREVIOUS_COLUMN_EXTEND_SELECTION);
		result.put("shift KP_LEFT",
				TableActions.PREVIOUS_COLUMN_EXTEND_SELECTION);
		result.put("ctrl shift LEFT",
				TableActions.PREVIOUS_COLUMN_EXTEND_SELECTION);
		result.put("ctrl shift KP_LEFT",
				TableActions.PREVIOUS_COLUMN_EXTEND_SELECTION);
		result.put("ctrl LEFT", TableActions.PREVIOUS_COLUMN_CHANGE_LEAD);
		result.put("ctrl KP_LEFT", TableActions.PREVIOUS_COLUMN_CHANGE_LEAD);

		result.put("DOWN", TableActions.NEXT_ROW);
		result.put("KP_DOWN", TableActions.NEXT_ROW);
		result.put("shift DOWN", TableActions.NEXT_ROW_EXTEND_SELECTION);
		result.put("shift KP_DOWN", TableActions.NEXT_ROW_EXTEND_SELECTION);
		result.put("ctrl shift DOWN", TableActions.NEXT_ROW_EXTEND_SELECTION);
		result
				.put("ctrl shift KP_DOWN",
						TableActions.NEXT_ROW_EXTEND_SELECTION);
		result.put("ctrl DOWN", TableActions.NEXT_ROW_CHANGE_LEAD);
		result.put("ctrl KP_DOWN", TableActions.NEXT_ROW_CHANGE_LEAD);

		result.put("UP", TableActions.PREVIOUS_ROW);
		result.put("KP_UP", TableActions.PREVIOUS_ROW);
		result.put("shift UP", TableActions.PREVIOUS_ROW_EXTEND_SELECTION);
		result.put("shift KP_UP", TableActions.PREVIOUS_ROW_EXTEND_SELECTION);
		result.put("ctrl shift UP", TableActions.PREVIOUS_ROW_EXTEND_SELECTION);
		result.put("ctrl shift KP_UP",
				TableActions.PREVIOUS_ROW_EXTEND_SELECTION);
		result.put("ctrl UP", TableActions.PREVIOUS_ROW_CHANGE_LEAD);
		result.put("ctrl KP_UP", TableActions.PREVIOUS_ROW_CHANGE_LEAD);

		result.put("HOME", TableActions.FIRST_COLUMN);
		result.put("shift HOME", TableActions.FIRST_COLUMN_EXTEND_SELECTION);
		result.put("ctrl shift HOME", TableActions.FIRST_ROW_EXTEND_SELECTION);
		result.put("ctrl HOME", TableActions.FIRST_ROW);
		result.put("END", TableActions.LAST_COLUMN);
		result.put("shift END", TableActions.LAST_COLUMN_EXTEND_SELECTION);
		result.put("ctrl shift END", TableActions.LAST_ROW_EXTEND_SELECTION);
		result.put("ctrl END", TableActions.LAST_ROW);

		result.put("PAGE_UP", TableActions.SCROLL_UP_CHANGE_SELECTION);
		result.put("shift PAGE_UP", TableActions.SCROLL_UP_EXTEND_SELECTION);
		result.put("ctrl shift PAGE_UP",
				TableActions.SCROLL_LEFT_EXTEND_SELECTION);
		result.put("ctrl PAGE_UP", TableActions.SCROLL_LEFT_CHANGE_SELECTION);
		result.put("PAGE_DOWN", TableActions.SCROLL_DOWN_CHANGE_SELECTION);
		result
				.put("shift PAGE_DOWN",
						TableActions.SCROLL_DOWN_EXTEND_SELECTION);
		result.put("ctrl shift PAGE_DOWN",
				TableActions.SCROLL_RIGHT_EXTEND_SELECTION);
		result
				.put("ctrl PAGE_DOWN",
						TableActions.SCROLL_RIGHT_CHANGE_SELECTION);

		result.put("TAB", TableActions.NEXT_COLUMN_CELL);
		result.put("shift TAB", TableActions.PREVIOUS_COLUMN_CELL);
		result.put("ENTER", TableActions.NEXT_ROW_CELL);
		result.put("shift ENTER", TableActions.PREVIOUS_ROW_CELL);
		result.put("ctrl A", TableActions.SELECT_ALL);
		result.put("ctrl SLASH", TableActions.SELECT_ALL);
		result.put("ctrl BACK_SLASH", TableActions.CLEAR_SELECTION);

		result.put("ESCAPE", TableActions.CANCEL_EDITING);
		result.put("F2", TableActions.START_EDITING);
		result.put("SPACE", TableActions.ADD_TO_SELECTION);
		result.put("ctrl SPACE", TableActions.TOGGLE_AND_ANCHOR);
		result.put("shift SPACE", TableActions.EXTEND_TO);
		result.put("ctrl shift SPACE", TableActions.MOVE_SELECTION_TO);
		result.put("F8", TableActions.FOCUS_HEADER);

		return result;
	}

	protected static class TableHeaderActions {
		public static final String TOGGLE_SORT_ORDER = "toggleSortOrder";
		public static final String SELECT_COLUMN_TO_LEFT = "selectColumnToLeft";
		public static final String SELECT_COLUMN_TO_RIGHT = "selectColumnToRight";
		public static final String MOVE_COLUMN_LEFT = "moveColumnLeft";
		public static final String MOVE_COLUMN_RIGHT = "moveColumnRight";
		public static final String RESIZE_LEFT = "resizeLeft";
		public static final String RESIZE_RIGHT = "resizeRight";
		public static final String FOCUS_TABLE = "focusTable";
	}

	public SubstanceInputMap getTableHeaderAncestorInputMap() {
		SubstanceInputMap result = new SubstanceInputMap();

		result.put("SPACE", TableHeaderActions.TOGGLE_SORT_ORDER);

		result.put("LEFT", TableHeaderActions.SELECT_COLUMN_TO_LEFT);
		result.put("KP_LEFT", TableHeaderActions.SELECT_COLUMN_TO_LEFT);
		result.put("RIGHT", TableHeaderActions.SELECT_COLUMN_TO_RIGHT);
		result.put("KP_RIGHT", TableHeaderActions.SELECT_COLUMN_TO_RIGHT);

		result.put("alt LEFT", TableHeaderActions.MOVE_COLUMN_LEFT);
		result.put("alt KP_LEFT", TableHeaderActions.MOVE_COLUMN_LEFT);
		result.put("alt RIGHT", TableHeaderActions.MOVE_COLUMN_RIGHT);
		result.put("alt KP_RIGHT", TableHeaderActions.MOVE_COLUMN_RIGHT);

		result.put("alt shift LEFT", TableHeaderActions.RESIZE_LEFT);
		result.put("alt shift KP_LEFT", TableHeaderActions.RESIZE_LEFT);
		result.put("alt shift RIGHT", TableHeaderActions.RESIZE_RIGHT);
		result.put("alt shift KP_RIGHT", TableHeaderActions.RESIZE_RIGHT);

		result.put("ESCAPE", TableHeaderActions.FOCUS_TABLE);

		return result;

	}

	public SubstanceInputMap getTextAreaFocusInputMap() {
		return this.getMultilineTextComponentFocusInputMap();
	}

	public SubstanceInputMap getTextFieldFocusInputMap() {
		SubstanceInputMap result = new SubstanceInputMap();

		result.put("ctrl C", DefaultEditorKit.copyAction);
		result.put("ctrl V", DefaultEditorKit.pasteAction);
		result.put("ctrl X", DefaultEditorKit.cutAction);
		result.put("COPY", DefaultEditorKit.copyAction);
		result.put("PASTE", DefaultEditorKit.pasteAction);
		result.put("CUT", DefaultEditorKit.cutAction);
		result.put("control INSERT", DefaultEditorKit.copyAction);
		result.put("shift INSERT", DefaultEditorKit.pasteAction);
		result.put("shift DELETE", DefaultEditorKit.cutAction);

		result.put("shift LEFT", DefaultEditorKit.selectionBackwardAction);
		result.put("shift KP_LEFT", DefaultEditorKit.selectionBackwardAction);
		result.put("shift RIGHT", DefaultEditorKit.selectionForwardAction);
		result.put("shift KP_RIGHT", DefaultEditorKit.selectionForwardAction);
		result.put("ctrl LEFT", DefaultEditorKit.previousWordAction);
		result.put("ctrl KP_LEFT", DefaultEditorKit.previousWordAction);
		result.put("ctrl RIGHT", DefaultEditorKit.nextWordAction);
		result.put("ctrl KP_RIGHT", DefaultEditorKit.nextWordAction);
		result.put("ctrl shift LEFT",
				DefaultEditorKit.selectionPreviousWordAction);
		result.put("ctrl shift KP_LEFT",
				DefaultEditorKit.selectionPreviousWordAction);
		result
				.put("ctrl shift RIGHT",
						DefaultEditorKit.selectionNextWordAction);
		result.put("ctrl shift KP_RIGHT",
				DefaultEditorKit.selectionNextWordAction);

		result.put("ctrl A", DefaultEditorKit.selectAllAction);
		result.put("HOME", DefaultEditorKit.beginLineAction);
		result.put("END", DefaultEditorKit.endLineAction);
		result.put("shift HOME", DefaultEditorKit.selectionBeginLineAction);
		result.put("shift END", DefaultEditorKit.selectionEndLineAction);

		result.put("BACK_SPACE", DefaultEditorKit.deletePrevCharAction);
		result.put("shift BACK_SPACE", DefaultEditorKit.deletePrevCharAction);
		result.put("ctrl H", DefaultEditorKit.deletePrevCharAction);
		result.put("DELETE", DefaultEditorKit.deleteNextCharAction);
		result.put("ctrl DELETE", DefaultEditorKit.deleteNextWordAction);
		result.put("ctrl BACK_SPACE", DefaultEditorKit.deletePrevWordAction);

		result.put("RIGHT", DefaultEditorKit.forwardAction);
		result.put("LEFT", DefaultEditorKit.backwardAction);
		result.put("KP_RIGHT", DefaultEditorKit.forwardAction);
		result.put("KP_LEFT", DefaultEditorKit.backwardAction);
		result.put("ENTER", JTextField.notifyAction);
		result.put("ctrl BACK_SLASH", TextComponentActions.UNSELECT);
		result.put("control shift O",
				TextComponentActions.TOGGLE_COMPONENT_ORIENTATION);

		return result;

	}

	public SubstanceInputMap getTextPaneFocusInputMap() {
		return this.getMultilineTextComponentFocusInputMap();
	}

	public SubstanceInputMap getToggleButtonFocusInputMap() {
		return this.getActionControlFocusInputMap();
	}

	/**
	 * From BasicToolBarUI.Actions
	 */
	protected static class ToolBarActions {
		public static final String NAVIGATE_RIGHT = "navigateRight";
		public static final String NAVIGATE_LEFT = "navigateLeft";
		public static final String NAVIGATE_UP = "navigateUp";
		public static final String NAVIGATE_DOWN = "navigateDown";
	}

	public SubstanceInputMap getToolBarAncestorInputMap() {
		SubstanceInputMap result = new SubstanceInputMap();

		result.put("UP", ToolBarActions.NAVIGATE_UP);
		result.put("KP_UP", ToolBarActions.NAVIGATE_UP);
		result.put("DOWN", ToolBarActions.NAVIGATE_DOWN);
		result.put("KP_DOWN", ToolBarActions.NAVIGATE_DOWN);
		result.put("LEFT", ToolBarActions.NAVIGATE_LEFT);
		result.put("KP_LEFT", ToolBarActions.NAVIGATE_LEFT);
		result.put("RIGHT", ToolBarActions.NAVIGATE_RIGHT);
		result.put("KP_RIGHT", ToolBarActions.NAVIGATE_RIGHT);

		return result;
	}

	protected static class TreeActions {
		public static final String SELECT_PREVIOUS = "selectPrevious";
		public static final String SELECT_PREVIOUS_CHANGE_LEAD = "selectPreviousChangeLead";
		public static final String SELECT_PREVIOUS_EXTEND_SELECTION = "selectPreviousExtendSelection";
		public static final String SELECT_NEXT = "selectNext";
		public static final String SELECT_NEXT_CHANGE_LEAD = "selectNextChangeLead";
		public static final String SELECT_NEXT_EXTEND_SELECTION = "selectNextExtendSelection";
		public static final String SELECT_CHILD = "selectChild";
		public static final String SELECT_CHILD_CHANGE_LEAD = "selectChildChangeLead";
		public static final String SELECT_PARENT = "selectParent";
		public static final String SELECT_PARENT_CHANGE_LEAD = "selectParentChangeLead";
		public static final String SCROLL_UP_CHANGE_SELECTION = "scrollUpChangeSelection";
		public static final String SCROLL_UP_CHANGE_LEAD = "scrollUpChangeLead";
		public static final String SCROLL_UP_EXTEND_SELECTION = "scrollUpExtendSelection";
		public static final String SCROLL_DOWN_CHANGE_SELECTION = "scrollDownChangeSelection";
		public static final String SCROLL_DOWN_EXTEND_SELECTION = "scrollDownExtendSelection";
		public static final String SCROLL_DOWN_CHANGE_LEAD = "scrollDownChangeLead";
		public static final String SELECT_FIRST = "selectFirst";
		public static final String SELECT_FIRST_CHANGE_LEAD = "selectFirstChangeLead";
		public static final String SELECT_FIRST_EXTEND_SELECTION = "selectFirstExtendSelection";
		public static final String SELECT_LAST = "selectLast";
		public static final String SELECT_LAST_CHANGE_LEAD = "selectLastChangeLead";
		public static final String SELECT_LAST_EXTEND_SELECTION = "selectLastExtendSelection";
		public static final String TOGGLE = "toggle";
		public static final String CANCEL_EDITING = "cancel";
		public static final String START_EDITING = "startEditing";
		public static final String SELECT_ALL = "selectAll";
		public static final String CLEAR_SELECTION = "clearSelection";
		public static final String SCROLL_LEFT = "scrollLeft";
		public static final String SCROLL_RIGHT = "scrollRight";
		public static final String SCROLL_LEFT_EXTEND_SELECTION = "scrollLeftExtendSelection";
		public static final String SCROLL_RIGHT_EXTEND_SELECTION = "scrollRightExtendSelection";
		public static final String SCROLL_RIGHT_CHANGE_LEAD = "scrollRightChangeLead";
		public static final String SCROLL_LEFT_CHANGE_LEAD = "scrollLeftChangeLead";
		public static final String EXPAND = "expand";
		public static final String COLLAPSE = "collapse";
		public static final String MOVE_SELECTION_TO_PARENT = "moveSelectionToParent";

		public static final String ADD_TO_SELECTION = "addToSelection";

		public static final String TOGGLE_AND_ANCHOR = "toggleAndAnchor";

		public static final String EXTEND_TO = "extendTo";

		public static final String MOVE_SELECTION_TO = "moveSelectionTo";
	}

	public SubstanceInputMap getTreeAncestorInputMap() {
		SubstanceInputMap result = new SubstanceInputMap();

		result.put("ESCAPE", TreeActions.CANCEL_EDITING);

		return result;

	}

	public SubstanceInputMap getTreeFocusInputMap() {
		SubstanceInputMap result = new SubstanceInputMap();

		result.put("ADD", TreeActions.EXPAND);
		result.put("SUBTRACT", TreeActions.COLLAPSE);

		result.put("ctrl C", COPY);
		result.put("ctrl V", PASTE);
		result.put("ctrl X", CUT);
		result.put("COPY", COPY);
		result.put("PASTE", PASTE);
		result.put("CUT", CUT);
		result.put("control INSERT", COPY);
		result.put("shift INSERT", PASTE);
		result.put("shift DELETE", CUT);

		result.put("UP", TreeActions.SELECT_PREVIOUS);
		result.put("KP_UP", TreeActions.SELECT_PREVIOUS);
		result.put("shift UP", TreeActions.SELECT_PREVIOUS_EXTEND_SELECTION);
		result.put("shift KP_UP", TreeActions.SELECT_PREVIOUS_EXTEND_SELECTION);
		result.put("ctrl shift UP",
				TreeActions.SELECT_PREVIOUS_EXTEND_SELECTION);
		result.put("ctrl shift KP_UP",
				TreeActions.SELECT_PREVIOUS_EXTEND_SELECTION);
		result.put("ctrl UP", TreeActions.SELECT_PREVIOUS_CHANGE_LEAD);
		result.put("ctrl KP_UP", TreeActions.SELECT_PREVIOUS_CHANGE_LEAD);

		result.put("DOWN", TreeActions.SELECT_NEXT);
		result.put("KP_DOWN", TreeActions.SELECT_NEXT);
		result.put("shift DOWN", TreeActions.SELECT_NEXT_EXTEND_SELECTION);
		result.put("shift KP_DOWN", TreeActions.SELECT_NEXT_EXTEND_SELECTION);
		result.put("ctrl shift DOWN", TreeActions.SELECT_NEXT_EXTEND_SELECTION);
		result.put("ctrl shift KP_DOWN",
				TreeActions.SELECT_NEXT_EXTEND_SELECTION);
		result.put("ctrl DOWN", TreeActions.SELECT_NEXT_CHANGE_LEAD);
		result.put("ctrl KP_DOWN", TreeActions.SELECT_NEXT_CHANGE_LEAD);

		result.put("RIGHT", TreeActions.SELECT_CHILD);
		result.put("KP_RIGHT", TreeActions.SELECT_CHILD);
		result.put("LEFT", TreeActions.SELECT_PARENT);
		result.put("KP_LEFT", TreeActions.SELECT_PARENT);

		result.put("PAGE_UP", TreeActions.SCROLL_UP_CHANGE_SELECTION);
		result.put("shift PAGE_UP", TreeActions.SCROLL_UP_EXTEND_SELECTION);
		result
				.put("ctrl shift PAGE_UP",
						TreeActions.SCROLL_UP_EXTEND_SELECTION);
		result.put("ctrl PAGE_UP", TreeActions.SCROLL_UP_CHANGE_LEAD);
		result.put("PAGE_DOWN", TreeActions.SCROLL_DOWN_CHANGE_SELECTION);
		result.put("shift PAGE_DOWN", TreeActions.SCROLL_DOWN_EXTEND_SELECTION);
		result.put("ctrl shift PAGE_DOWN",
				TreeActions.SCROLL_DOWN_EXTEND_SELECTION);
		result.put("ctrl PAGE_DOWN", TreeActions.SCROLL_DOWN_CHANGE_LEAD);

		result.put("HOME", TreeActions.SELECT_FIRST);
		result.put("shift HOME", TreeActions.SELECT_FIRST_EXTEND_SELECTION);
		result
				.put("ctrl shift HOME",
						TreeActions.SELECT_FIRST_EXTEND_SELECTION);
		result.put("ctrl HOME", TreeActions.SELECT_FIRST_CHANGE_LEAD);
		result.put("END", TreeActions.SELECT_LAST);
		result.put("shift END", TreeActions.SELECT_LAST_EXTEND_SELECTION);
		result.put("ctrl shift END", TreeActions.SELECT_LAST_EXTEND_SELECTION);
		result.put("ctrl END", TreeActions.SELECT_LAST_CHANGE_LEAD);

		result.put("F2", TreeActions.START_EDITING);
		result.put("ctrl A", TreeActions.SELECT_ALL);
		result.put("ctrl SLASH", TreeActions.SELECT_ALL);
		result.put("ctrl BACK_SLASH", TreeActions.CLEAR_SELECTION);

		result.put("ctrl LEFT", TreeActions.SCROLL_LEFT);
		result.put("ctrl KP_LEFT", TreeActions.SCROLL_LEFT);
		result.put("ctrl RIGHT", TreeActions.SCROLL_RIGHT);
		result.put("ctrl KP_RIGHT", TreeActions.SCROLL_RIGHT);

		result.put("SPACE", TreeActions.ADD_TO_SELECTION);
		result.put("ctrl SPACE", TreeActions.TOGGLE_AND_ANCHOR);
		result.put("shift SPACE", TreeActions.EXTEND_TO);
		result.put("ctrl shift SPACE", TreeActions.MOVE_SELECTION_TO);

		return result;
	};
}