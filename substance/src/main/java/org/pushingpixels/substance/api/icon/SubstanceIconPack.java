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

import org.pushingpixels.neon.icon.NeonIconUIResource;
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
 * @see {@link SubstanceCortex.GlobalScope#setIconPack(SubstanceIconPack)}
 */
public interface SubstanceIconPack {
    public NeonIconUIResource getOptionPaneInformationIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public NeonIconUIResource getOptionPaneWarningIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public NeonIconUIResource getOptionPaneErrorIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public NeonIconUIResource getOptionPaneQuestionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public NeonIconUIResource getFileChooserNewFolderIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public NeonIconUIResource getFileChooserUpFolderIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public NeonIconUIResource getFileChooserHomeFolderIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public NeonIconUIResource getFileChooserListViewIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public NeonIconUIResource getFileChooserDetailsViewIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public NeonIconUIResource getFileChooserViewMenuIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public NeonIconUIResource getFileChooserComputerIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public NeonIconUIResource getFileChooserDirectoryIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public NeonIconUIResource getFileChooserFileIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public NeonIconUIResource getFileChooserFloppyDriveIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public NeonIconUIResource getFileChooserHardDriveIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public NeonIconUIResource getLockIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public NeonIconUIResource getInspectIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public NeonIconUIResource getRefreshIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public NeonIconUIResource getAllowedIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public NeonIconUIResource getNotAllowedIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public NeonIconUIResource getTextCopyActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public NeonIconUIResource getTextCutActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public NeonIconUIResource getTextPasteActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public NeonIconUIResource getTextDeleteActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public NeonIconUIResource getTextSelectAllActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public NeonIconUIResource getColorChooserColorPalettesIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public NeonIconUIResource getColorChooserColorSlidersIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public NeonIconUIResource getColorChooserColorSwatchesIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public NeonIconUIResource getColorChooserColorWheelIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public NeonIconUIResource getColorChooserCrayonsIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public NeonIconUIResource getColorChooserImagePalettesIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public NeonIconUIResource getScrollVerticalIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public NeonIconUIResource getScrollHorizontalIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    public NeonIconUIResource getScrollAllIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);
}
