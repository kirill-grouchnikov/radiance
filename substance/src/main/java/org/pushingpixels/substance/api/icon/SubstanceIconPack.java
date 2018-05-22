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
package org.pushingpixels.substance.api.icon;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;

/**
 * Icon pack interface for <b>Substance</b> look and feel. This class is part of officially
 * supported API.
 * 
 * <p>
 * Starting from version 8.0, applications using Substance can use a custom icon pack with
 * {@link SubstanceCortex.GlobalScope#setIconPack(SubstanceIconPack)} to match the overall
 * iconography language that maintains visual consistency across the entire app.
 * 
 * @author Kirill Grouchnikov
 * @since version 8.0
 * @see {@link SubstanceCortex.GlobalScope#setIconPack(SubstanceIconPack)}
 */
public interface SubstanceIconPack {
    public SubstanceIconUIResource getOptionPaneInformationIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public SubstanceIconUIResource getOptionPaneWarningIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public SubstanceIconUIResource getOptionPaneErrorIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public SubstanceIconUIResource getOptionPaneQuestionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public SubstanceIconUIResource getFileChooserNewFolderIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public SubstanceIconUIResource getFileChooserUpFolderIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public SubstanceIconUIResource getFileChooserHomeFolderIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public SubstanceIconUIResource getFileChooserListViewIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public SubstanceIconUIResource getFileChooserDetailsViewIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public SubstanceIconUIResource getFileChooserViewMenuIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public SubstanceIconUIResource getFileChooserComputerIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public SubstanceIconUIResource getFileChooserDirectoryIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public SubstanceIconUIResource getFileChooserFileIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public SubstanceIconUIResource getFileChooserFloppyDriveIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public SubstanceIconUIResource getFileChooserHardDriveIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public SubstanceIconUIResource getLockIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public SubstanceIconUIResource getInspectIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public SubstanceIconUIResource getRefreshIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public SubstanceIconUIResource getAllowedIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public SubstanceIconUIResource getNotAllowedIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public SubstanceIconUIResource getTextCopyActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public SubstanceIconUIResource getTextCutActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public SubstanceIconUIResource getTextPasteActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public SubstanceIconUIResource getTextDeleteActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public SubstanceIconUIResource getTextSelectAllActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public SubstanceIconUIResource getColorChooserColorPalettesIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public SubstanceIconUIResource getColorChooserColorSlidersIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public SubstanceIconUIResource getColorChooserColorSwatchesIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public SubstanceIconUIResource getColorChooserColorWheelIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public SubstanceIconUIResource getColorChooserCrayonsIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public SubstanceIconUIResource getColorChooserImagePalettesIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public SubstanceIconUIResource getScrollVerticalIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public SubstanceIconUIResource getScrollHorizontalIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public SubstanceIconUIResource getScrollAllIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);
}
