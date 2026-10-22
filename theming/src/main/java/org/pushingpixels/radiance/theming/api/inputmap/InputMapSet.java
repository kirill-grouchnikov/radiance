/*
 * Copyright (c) 2005-2026 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.theming.api.inputmap;

/**
 * Interface for a set of input maps for various components.
 * This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public interface InputMapSet {
	/**
	 * Returns the button focus input map.
	 * @return The button focus input map.
	 */
	RadianceInputMap getButtonFocusInputMap();

	/**
	 * Returns the check box focus input map.
	 * @return The check box focus input map.
	 */
	RadianceInputMap getCheckBoxFocusInputMap();

	/**
	 * Returns the combo box ancestor input map.
	 * @return The combo box ancestor input map.
	 */
	RadianceInputMap getComboBoxAncestorInputMap();

	/**
	 * Returns the desktop ancestor input map.
	 * @return The desktop ancestor input map.
	 */
	RadianceInputMap getDesktopAncestorInputMap();

	/**
	 * Returns the editor pane focus input map.
	 * @return The editor pane focus input map.
	 */
	RadianceInputMap getEditorPaneFocusInputMap();

	/**
	 * Returns the file chooser ancestor input map.
	 * @return The file chooser ancestor input map.
	 */
	RadianceInputMap getFileChooserAncestorInputMap();

	/**
	 * Returns the formatted text field focus input map.
	 * @return The formatted text field focus input map.
	 */
	RadianceInputMap getFormattedTextFieldFocusInputMap();

	/**
	 * Returns the list focus input map.
	 * @return The list focus input map.
	 */
	RadianceInputMap getListFocusInputMap();

	/**
	 * Returns the password field focus input map.
	 * @return The password field focus input map.
	 */
	RadianceInputMap getPasswordFieldFocusInputMap();

	/**
	 * Returns the radio button focus input map.
	 * @return The radio button focus input map.
	 */
	RadianceInputMap getRadioButtonFocusInputMap();

	/**
	 * Returns the root pane ancestor input map.
	 * @return The root pane ancestor input map.
	 */
	RadianceInputMap getRootPaneAncestorInputMap();

	/**
	 * Returns the scroll bar ancestor input map.
	 * @return The scroll bar ancestor input map.
	 */
	RadianceInputMap getScrollBarAncestorInputMap();

	/**
	 * Returns the scroll pane ancestor input map.
	 * @return The scroll pane ancestor input map.
	 */
	RadianceInputMap getScrollPaneAncestorInputMap();

	/**
	 * Returns the slider focus input map.
	 * @return The slider focus input map.
	 */
	RadianceInputMap getSliderFocusInputMap();

	/**
	 * Returns the spinner ancestor input map.
	 * @return The spinner ancestor input map.
	 */
	RadianceInputMap getSpinnerAncestorInputMap();

	/**
	 * Returns the split pane ancestor input map.
	 * @return The split pane ancestor input map.
	 */
	RadianceInputMap getSplitPaneAncestorInputMap();

	/**
	 * Returns the tabbed pane ancestor input map.
	 * @return The tabbed pane ancestor input map.
	 */
	RadianceInputMap getTabbedPaneAncestorInputMap();

	/**
	 * Returns the tabbed pane focus input map.
	 * @return The tabbed pane focus input map.
	 */
	RadianceInputMap getTabbedPaneFocusInputMap();

	/**
	 * Returns the table ancestor input map.
	 * @return The table ancestor input map.
	 */
	RadianceInputMap getTableAncestorInputMap();

	/**
	 * Returns the table header ancestor input map.
	 * @return The table header ancestor input map.
	 */
	RadianceInputMap getTableHeaderAncestorInputMap();

	/**
	 * Returns the text area focus input map.
	 * @return The text area focus input map.
	 */
	RadianceInputMap getTextAreaFocusInputMap();

	/**
	 * Returns the text field focus input map.
	 * @return The text field focus input map.
	 */
	RadianceInputMap getTextFieldFocusInputMap();

	/**
	 * Returns the text pane focus input map.
	 * @return The text pane focus input map.
	 */
	RadianceInputMap getTextPaneFocusInputMap();

	/**
	 * Returns the toggle button focus input map.
	 * @return The toggle button focus input map.
	 */
	RadianceInputMap getToggleButtonFocusInputMap();

	/**
	 * Returns the tool bar ancestor input map.
	 * @return The tool bar ancestor input map.
	 */
	RadianceInputMap getToolBarAncestorInputMap();

	/**
	 * Returns the tree ancestor input map.
	 * @return The tree ancestor input map.
	 */
	RadianceInputMap getTreeAncestorInputMap();

	/**
	 * Returns the tree focus input map.
	 * @return The tree focus input map.
	 */
	RadianceInputMap getTreeFocusInputMap();
}
