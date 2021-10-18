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

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
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
    RadianceIcon getOptionPaneInformationIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    RadianceIcon getOptionPaneWarningIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    RadianceIcon getOptionPaneErrorIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    RadianceIcon getOptionPaneQuestionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    RadianceIcon getFileChooserNewFolderIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    RadianceIcon getFileChooserUpFolderIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    RadianceIcon getFileChooserHomeFolderIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    RadianceIcon getFileChooserListViewIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    RadianceIcon getFileChooserDetailsViewIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    RadianceIcon getFileChooserViewMenuIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    RadianceIcon getFileChooserComputerIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    RadianceIcon getFileChooserDirectoryIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    RadianceIcon getFileChooserFileIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    RadianceIcon getFileChooserFloppyDriveIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    RadianceIcon getFileChooserHardDriveIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    RadianceIcon getLockIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    RadianceIcon getCapsLockIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    RadianceIcon getInspectIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    RadianceIcon getRefreshIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    RadianceIcon getAllowedIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    RadianceIcon getNotAllowedIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    RadianceIcon getTextCopyActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    RadianceIcon getTextCutActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    RadianceIcon getTextPasteActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    RadianceIcon getTextDeleteActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    RadianceIcon getTextSelectAllActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    RadianceIcon getColorChooserColorPalettesIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    RadianceIcon getColorChooserColorSlidersIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    RadianceIcon getColorChooserColorSwatchesIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    RadianceIcon getColorChooserColorWheelIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    RadianceIcon getColorChooserCrayonsIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    RadianceIcon getColorChooserImagePalettesIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    RadianceIcon getScrollVerticalIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    RadianceIcon getScrollHorizontalIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);

    RadianceIcon getScrollAllIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme);
}
