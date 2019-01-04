/*
 * Copyright (c) 2005-2019 Substance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.demo.substance.main.check;

import org.pushingpixels.demo.substance.main.check.svg.tango.*;
import org.pushingpixels.neon.icon.ResizableIcon;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.icon.SubstanceIconPack;

import java.awt.*;

/**
 * Custom Substance icon pack based on Tango icons (license in resources/TangoIcons.license).
 * Original SVG content from https://commons.wikimedia.org/wiki/Tango_icons transcoded offline
 * into Java2D resizable icons with Photon.
 */
public class TangoIconPack implements SubstanceIconPack {

    @Override
    public ResizableIcon getOptionPaneInformationIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return dialog_information.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public ResizableIcon getOptionPaneWarningIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return dialog_warning.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public ResizableIcon getOptionPaneErrorIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return dialog_error.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public ResizableIcon getOptionPaneQuestionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return help_browser.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public ResizableIcon getFileChooserNewFolderIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return folder_new.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public ResizableIcon getFileChooserUpFolderIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return go_up.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public ResizableIcon getFileChooserHomeFolderIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return user_home.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public ResizableIcon getFileChooserListViewIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return format_justify_fill.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public ResizableIcon getFileChooserDetailsViewIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return accessories_text_editor.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public ResizableIcon getFileChooserViewMenuIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return emblem_system.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public ResizableIcon getFileChooserComputerIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return computer.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public ResizableIcon getFileChooserDirectoryIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return folder.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public ResizableIcon getFileChooserFileIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return text_x_generic.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public ResizableIcon getFileChooserFloppyDriveIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return media_floppy.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public ResizableIcon getFileChooserHardDriveIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return drive_harddisk.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public ResizableIcon getLockIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return locked.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public ResizableIcon getInspectIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return system_search.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public ResizableIcon getRefreshIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return view_refresh.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public ResizableIcon getAllowedIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return list_add.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public ResizableIcon getNotAllowedIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return dialog_error.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public ResizableIcon getTextCopyActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        ResizableIcon base = SubstanceCortex.GlobalScope.colorizeIconAsUiResource(
                edit_copy.factory(), preferredIconColorScheme);
        base.setDimension(new Dimension(preferredSize, preferredSize));
        return base;
    }

    @Override
    public ResizableIcon getTextCutActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        ResizableIcon base = SubstanceCortex.GlobalScope.colorizeIconAsUiResource(
                edit_cut.factory(), preferredIconColorScheme);
        base.setDimension(new Dimension(preferredSize, preferredSize));
        return base;
    }

    @Override
    public ResizableIcon getTextPasteActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        ResizableIcon base = SubstanceCortex.GlobalScope.colorizeIconAsUiResource(
                edit_paste.factory(), preferredIconColorScheme);
        base.setDimension(new Dimension(preferredSize, preferredSize));
        return base;
    }

    @Override
    public ResizableIcon getTextDeleteActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        ResizableIcon base = SubstanceCortex.GlobalScope.colorizeIconAsUiResource(
                edit_delete.factory(), preferredIconColorScheme);
        base.setDimension(new Dimension(preferredSize, preferredSize));
        return base;
    }

    @Override
    public ResizableIcon getTextSelectAllActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        ResizableIcon base = SubstanceCortex.GlobalScope.colorizeIconAsUiResource(
                edit_select_all.factory(), preferredIconColorScheme);
        base.setDimension(new Dimension(preferredSize, preferredSize));
        return base;
    }

    @Override
    public ResizableIcon getColorChooserColorPalettesIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return face_angel.of(preferredSize, preferredSize);
    }

    @Override
    public ResizableIcon getColorChooserColorSlidersIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return face_glasses.of(preferredSize, preferredSize);
    }

    @Override
    public ResizableIcon getColorChooserColorSwatchesIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return face_grin.of(preferredSize, preferredSize);
    }

    @Override
    public ResizableIcon getColorChooserColorWheelIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return face_plain.of(preferredSize, preferredSize);
    }

    @Override
    public ResizableIcon getColorChooserCrayonsIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return face_sad.of(preferredSize, preferredSize);
    }

    @Override
    public ResizableIcon getColorChooserImagePalettesIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return face_smile.of(preferredSize, preferredSize);
    }

    @Override
    public ResizableIcon getScrollHorizontalIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return go_next.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public ResizableIcon getScrollVerticalIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return go_down.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public ResizableIcon getScrollAllIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return view_fullscreen.uiResourceOf(preferredSize, preferredSize);
    }
}
