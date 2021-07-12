/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.substance.api.icon;

import org.pushingpixels.neon.api.icon.NeonIcon;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;

/**
 * Icon pack interface for <b>Substance</b> look and feel. This class is part of officially
 * supported API.
 * 
 * <p>
 * Applications using Substance can use a custom icon pack with
 * {@link SubstanceCortex.GlobalScope#setIconPack(SubstanceIconPack)} to match the overall
 * iconography language that maintains visual consistency across the entire app.
 * 
 * @author Kirill Grouchnikov
 * @see SubstanceCortex.GlobalScope#setIconPack(SubstanceIconPack)
 */
public interface SubstanceIconPack {
    NeonIcon getOptionPaneInformationIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    NeonIcon getOptionPaneWarningIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    NeonIcon getOptionPaneErrorIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    NeonIcon getOptionPaneQuestionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    NeonIcon getFileChooserNewFolderIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    NeonIcon getFileChooserUpFolderIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    NeonIcon getFileChooserHomeFolderIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    NeonIcon getFileChooserListViewIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    NeonIcon getFileChooserDetailsViewIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    NeonIcon getFileChooserViewMenuIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    NeonIcon getFileChooserComputerIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    NeonIcon getFileChooserDirectoryIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    NeonIcon getFileChooserFileIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    NeonIcon getFileChooserFloppyDriveIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    NeonIcon getFileChooserHardDriveIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    NeonIcon getLockIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    NeonIcon getCapsLockIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    NeonIcon getInspectIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    NeonIcon getRefreshIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    NeonIcon getAllowedIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    NeonIcon getNotAllowedIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    NeonIcon getTextCopyActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    NeonIcon getTextCutActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    NeonIcon getTextPasteActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    NeonIcon getTextDeleteActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    NeonIcon getTextSelectAllActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    NeonIcon getColorChooserColorPalettesIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    NeonIcon getColorChooserColorSlidersIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    NeonIcon getColorChooserColorSwatchesIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    NeonIcon getColorChooserColorWheelIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    NeonIcon getColorChooserCrayonsIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    NeonIcon getColorChooserImagePalettesIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    NeonIcon getScrollVerticalIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    NeonIcon getScrollHorizontalIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    NeonIcon getScrollAllIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);
}
