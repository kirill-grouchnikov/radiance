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
package org.pushingpixels.radiance.theming.api.icon;

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.theming.api.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;

/**
 * Icon pack interface for <b>Radiance</b> look and feel. This class is part of officially
 * supported API.
 * 
 * <p>
 * Applications using Radiance can use a custom icon pack with
 * {@link RadianceThemingCortex.GlobalScope#setIconPack(RadianceIconPack)} to match the overall
 * iconography language that maintains visual consistency across the entire app.
 * 
 * @author Kirill Grouchnikov
 * @see RadianceThemingCortex.GlobalScope#setIconPack(RadianceIconPack)
 */
public interface RadianceIconPack {

    /**
     * Returns the option pane information icon.
     * @param preferredSize The preferred size.
     * @param preferredIconColorTokens The preferred icon color tokens.
     * @return The option pane information icon.
     */
    RadianceIcon getOptionPaneInformationIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    /**
     * Returns the option pane warning icon.
     * @param preferredSize The preferred size.
     * @param preferredIconColorTokens The preferred icon color tokens.
     * @return The option pane warning icon.
     */
    RadianceIcon getOptionPaneWarningIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    /**
     * Returns the option pane error icon.
     * @param preferredSize The preferred size.
     * @param preferredIconColorTokens The preferred icon color tokens.
     * @return The option pane error icon.
     */
    RadianceIcon getOptionPaneErrorIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    /**
     * Returns the option pane question icon.
     * @param preferredSize The preferred size.
     * @param preferredIconColorTokens The preferred icon color tokens.
     * @return The option pane question icon.
     */
    RadianceIcon getOptionPaneQuestionIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    /**
     * Returns the file chooser new folder icon.
     * @param preferredSize The preferred size.
     * @param preferredIconColorTokens The preferred icon color tokens.
     * @return The file chooser new folder icon.
     */
    RadianceIcon getFileChooserNewFolderIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    /**
     * Returns the file chooser up folder icon.
     * @param preferredSize The preferred size.
     * @param preferredIconColorTokens The preferred icon color tokens.
     * @return The file chooser up folder icon.
     */
    RadianceIcon getFileChooserUpFolderIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    /**
     * Returns the file chooser home folder icon.
     * @param preferredSize The preferred size.
     * @param preferredIconColorTokens The preferred icon color tokens.
     * @return The file chooser home folder icon.
     */
    RadianceIcon getFileChooserHomeFolderIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    /**
     * Returns the file chooser list view icon.
     * @param preferredSize The preferred size.
     * @param preferredIconColorTokens The preferred icon color tokens.
     * @return The file chooser list view icon.
     */
    RadianceIcon getFileChooserListViewIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    /**
     * Returns the file chooser details view icon.
     * @param preferredSize The preferred size.
     * @param preferredIconColorTokens The preferred icon color tokens.
     * @return The file chooser details view icon.
     */
    RadianceIcon getFileChooserDetailsViewIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    /**
     * Returns the file chooser view menu icon.
     * @param preferredSize The preferred size.
     * @param preferredIconColorTokens The preferred icon color tokens.
     * @return The file chooser view menu icon.
     */
    RadianceIcon getFileChooserViewMenuIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    /**
     * Returns the file chooser computer icon.
     * @param preferredSize The preferred size.
     * @param preferredIconColorTokens The preferred icon color tokens.
     * @return The file chooser computer icon.
     */
    RadianceIcon getFileChooserComputerIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    /**
     * Returns the file chooser directory icon.
     * @param preferredSize The preferred size.
     * @param preferredIconColorTokens The preferred icon color tokens.
     * @return The file chooser directory icon.
     */
    RadianceIcon getFileChooserDirectoryIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    /**
     * Returns the file chooser file icon.
     * @param preferredSize The preferred size.
     * @param preferredIconColorTokens The preferred icon color tokens.
     * @return The file chooser file icon.
     */
    RadianceIcon getFileChooserFileIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    /**
     * Returns the file chooser floppy drive icon.
     * @param preferredSize The preferred size.
     * @param preferredIconColorTokens The preferred icon color tokens.
     * @return The file chooser floppy drive icon.
     */
    RadianceIcon getFileChooserFloppyDriveIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    /**
     * Returns the file chooser hard drive icon.
     * @param preferredSize The preferred size.
     * @param preferredIconColorTokens The preferred icon color tokens.
     * @return The file chooser hard drive icon.
     */
    RadianceIcon getFileChooserHardDriveIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    /**
     * Returns the lock icon.
     * @param preferredSize The preferred size.
     * @param preferredIconColorTokens The preferred icon color tokens.
     * @return The lock icon.
     */
    RadianceIcon getLockIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    /**
     * Returns the caps lock icon.
     * @param preferredSize The preferred size.
     * @param preferredIconColorTokens The preferred icon color tokens.
     * @return The caps lock icon.
     */
    RadianceIcon getCapsLockIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    /**
     * Returns the inspect icon.
     * @param preferredSize The preferred size.
     * @param preferredIconColorTokens The preferred icon color tokens.
     * @return The inspect icon.
     */
    RadianceIcon getInspectIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    /**
     * Returns the refresh icon.
     * @param preferredSize The preferred size.
     * @param preferredIconColorTokens The preferred icon color tokens.
     * @return The refresh icon.
     */
    RadianceIcon getRefreshIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    /**
     * Returns the allowed icon.
     * @param preferredSize The preferred size.
     * @param preferredIconColorTokens The preferred icon color tokens.
     * @return The allowed icon.
     */
    RadianceIcon getAllowedIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    /**
     * Returns the not allowed icon.
     * @param preferredSize The preferred size.
     * @param preferredIconColorTokens The preferred icon color tokens.
     * @return The not allowed icon.
     */
    RadianceIcon getNotAllowedIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    /**
     * Returns the text copy action icon.
     * @param preferredSize The preferred size.
     * @param preferredIconColorTokens The preferred icon color tokens.
     * @return The text copy action icon.
     */
    RadianceIcon getTextCopyActionIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    /**
     * Returns the text cut action icon.
     * @param preferredSize The preferred size.
     * @param preferredIconColorTokens The preferred icon color tokens.
     * @return The text cut action icon.
     */
    RadianceIcon getTextCutActionIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    /**
     * Returns the text paste action icon.
     * @param preferredSize The preferred size.
     * @param preferredIconColorTokens The preferred icon color tokens.
     * @return The text paste action icon.
     */
    RadianceIcon getTextPasteActionIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    /**
     * Returns the text delete action icon.
     * @param preferredSize The preferred size.
     * @param preferredIconColorTokens The preferred icon color tokens.
     * @return The text delete action icon.
     */
    RadianceIcon getTextDeleteActionIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    /**
     * Returns the text select all action icon.
     * @param preferredSize The preferred size.
     * @param preferredIconColorTokens The preferred icon color tokens.
     * @return The text select all action icon.
     */
    RadianceIcon getTextSelectAllActionIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    /**
     * Returns the color chooser color palettes icon.
     * @param preferredSize The preferred size.
     * @param preferredIconColorTokens The preferred icon color tokens.
     * @return The color chooser color palettes icon.
     */
    RadianceIcon getColorChooserColorPalettesIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    /**
     * Returns the color chooser color sliders icon.
     * @param preferredSize The preferred size.
     * @param preferredIconColorTokens The preferred icon color tokens.
     * @return The color chooser color sliders icon.
     */
    RadianceIcon getColorChooserColorSlidersIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    /**
     * Returns the color chooser color swatches icon.
     * @param preferredSize The preferred size.
     * @param preferredIconColorTokens The preferred icon color tokens.
     * @return The color chooser color swatches icon.
     */
    RadianceIcon getColorChooserColorSwatchesIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    /**
     * Returns the color chooser color wheel icon.
     * @param preferredSize The preferred size.
     * @param preferredIconColorTokens The preferred icon color tokens.
     * @return The color chooser color wheel icon.
     */
    RadianceIcon getColorChooserColorWheelIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    /**
     * Returns the color chooser crayons icon.
     * @param preferredSize The preferred size.
     * @param preferredIconColorTokens The preferred icon color tokens.
     * @return The color chooser crayons icon.
     */
    RadianceIcon getColorChooserCrayonsIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    /**
     * Returns the color chooser image palettes icon.
     * @param preferredSize The preferred size.
     * @param preferredIconColorTokens The preferred icon color tokens.
     * @return The color chooser image palettes icon.
     */
    RadianceIcon getColorChooserImagePalettesIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    /**
     * Returns the scroll vertical icon.
     * @param preferredSize The preferred size.
     * @param preferredIconColorTokens The preferred icon color tokens.
     * @return The scroll vertical icon.
     */
    RadianceIcon getScrollVerticalIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    /**
     * Returns the scroll horizontal icon.
     * @param preferredSize The preferred size.
     * @param preferredIconColorTokens The preferred icon color tokens.
     * @return The scroll horizontal icon.
     */
    RadianceIcon getScrollHorizontalIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    /**
     * Returns the scroll all icon.
     * @param preferredSize The preferred size.
     * @param preferredIconColorTokens The preferred icon color tokens.
     * @return The scroll all icon.
     */
    RadianceIcon getScrollAllIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);
}
