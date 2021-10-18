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
package org.pushingpixels.radiance.laf.api.icon;

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.laf.api.RadianceLafCortex;
import org.pushingpixels.radiance.laf.api.colorscheme.RadianceColorScheme;

/**
 * Icon pack interface for <b>Radiance</b> look and feel. This class is part of officially
 * supported API.
 * 
 * <p>
 * Applications using Radiance can use a custom icon pack with
 * {@link RadianceLafCortex.GlobalScope#setIconPack(RadianceIconPack)} to match the overall
 * iconography language that maintains visual consistency across the entire app.
 * 
 * @author Kirill Grouchnikov
 * @see RadianceLafCortex.GlobalScope#setIconPack(RadianceIconPack)
 */
public interface RadianceIconPack {
    RadianceIcon getOptionPaneInformationIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme);

    RadianceIcon getOptionPaneWarningIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme);

    RadianceIcon getOptionPaneErrorIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme);

    RadianceIcon getOptionPaneQuestionIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme);

    RadianceIcon getFileChooserNewFolderIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme);

    RadianceIcon getFileChooserUpFolderIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme);

    RadianceIcon getFileChooserHomeFolderIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme);

    RadianceIcon getFileChooserListViewIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme);

    RadianceIcon getFileChooserDetailsViewIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme);

    RadianceIcon getFileChooserViewMenuIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme);

    RadianceIcon getFileChooserComputerIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme);

    RadianceIcon getFileChooserDirectoryIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme);

    RadianceIcon getFileChooserFileIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme);

    RadianceIcon getFileChooserFloppyDriveIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme);

    RadianceIcon getFileChooserHardDriveIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme);

    RadianceIcon getLockIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme);

    RadianceIcon getCapsLockIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme);

    RadianceIcon getInspectIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme);

    RadianceIcon getRefreshIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme);

    RadianceIcon getAllowedIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme);

    RadianceIcon getNotAllowedIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme);

    RadianceIcon getTextCopyActionIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme);

    RadianceIcon getTextCutActionIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme);

    RadianceIcon getTextPasteActionIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme);

    RadianceIcon getTextDeleteActionIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme);

    RadianceIcon getTextSelectAllActionIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme);

    RadianceIcon getColorChooserColorPalettesIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme);

    RadianceIcon getColorChooserColorSlidersIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme);

    RadianceIcon getColorChooserColorSwatchesIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme);

    RadianceIcon getColorChooserColorWheelIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme);

    RadianceIcon getColorChooserCrayonsIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme);

    RadianceIcon getColorChooserImagePalettesIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme);

    RadianceIcon getScrollVerticalIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme);

    RadianceIcon getScrollHorizontalIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme);

    RadianceIcon getScrollAllIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme);
}
