/*
 * Copyright (c) 2005-2025 Radiance Kirill Grouchnikov. All Rights Reserved.
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

    RadianceIcon getOptionPaneInformationIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    RadianceIcon getOptionPaneWarningIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    RadianceIcon getOptionPaneErrorIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    RadianceIcon getOptionPaneQuestionIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    RadianceIcon getFileChooserNewFolderIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    RadianceIcon getFileChooserUpFolderIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    RadianceIcon getFileChooserHomeFolderIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    RadianceIcon getFileChooserListViewIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    RadianceIcon getFileChooserDetailsViewIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    RadianceIcon getFileChooserViewMenuIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    RadianceIcon getFileChooserComputerIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    RadianceIcon getFileChooserDirectoryIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    RadianceIcon getFileChooserFileIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    RadianceIcon getFileChooserFloppyDriveIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    RadianceIcon getFileChooserHardDriveIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    RadianceIcon getLockIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    RadianceIcon getCapsLockIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    RadianceIcon getInspectIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    RadianceIcon getRefreshIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    RadianceIcon getAllowedIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    RadianceIcon getNotAllowedIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    RadianceIcon getTextCopyActionIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    RadianceIcon getTextCutActionIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    RadianceIcon getTextPasteActionIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    RadianceIcon getTextDeleteActionIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    RadianceIcon getTextSelectAllActionIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    RadianceIcon getColorChooserColorPalettesIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    RadianceIcon getColorChooserColorSlidersIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    RadianceIcon getColorChooserColorSwatchesIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    RadianceIcon getColorChooserColorWheelIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    RadianceIcon getColorChooserCrayonsIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    RadianceIcon getColorChooserImagePalettesIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    RadianceIcon getScrollVerticalIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    RadianceIcon getScrollHorizontalIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);

    RadianceIcon getScrollAllIcon(int preferredSize,
        ContainerColorTokens preferredIconColorTokens);
}
