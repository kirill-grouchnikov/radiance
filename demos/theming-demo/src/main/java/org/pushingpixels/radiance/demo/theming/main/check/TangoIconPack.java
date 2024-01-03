/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.demo.theming.main.check;

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.demo.theming.main.check.svg.tango.*;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.icon.RadianceIconPack;

/**
 * Custom Radiance icon pack based on Tango icons (license in resources/TangoIcons.license).
 * Original SVG content from https://commons.wikimedia.org/wiki/Tango_icons transcoded offline
 * into Java2D resizable icons with SVG Transcoder.
 */
public class TangoIconPack implements RadianceIconPack {

    @Override
    public RadianceIcon getOptionPaneInformationIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        return dialog_information.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public RadianceIcon getOptionPaneWarningIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        return dialog_warning.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public RadianceIcon getOptionPaneErrorIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        return dialog_error.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public RadianceIcon getOptionPaneQuestionIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        return help_browser.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public RadianceIcon getFileChooserNewFolderIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        return folder_new.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public RadianceIcon getFileChooserUpFolderIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        return go_up.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public RadianceIcon getFileChooserHomeFolderIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        return user_home.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public RadianceIcon getFileChooserListViewIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        return format_justify_fill.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public RadianceIcon getFileChooserDetailsViewIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        return accessories_text_editor.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public RadianceIcon getFileChooserViewMenuIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        return emblem_system.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public RadianceIcon getFileChooserComputerIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        return computer.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public RadianceIcon getFileChooserDirectoryIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        return folder.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public RadianceIcon getFileChooserFileIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        return text_x_generic.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public RadianceIcon getFileChooserFloppyDriveIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        return media_floppy.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public RadianceIcon getFileChooserHardDriveIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        return drive_harddisk.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public RadianceIcon getLockIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        return locked.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public RadianceIcon getCapsLockIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        return go_top.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public RadianceIcon getInspectIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        return system_search.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public RadianceIcon getRefreshIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        return view_refresh.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public RadianceIcon getAllowedIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        return list_add.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public RadianceIcon getNotAllowedIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        return dialog_error.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public RadianceIcon getTextCopyActionIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        RadianceIcon result = edit_copy.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(preferredIconColorScheme.getColorFilter(
                preferredIconColorScheme.isDark() ? 0.6f : 0.8f, 1.0f));
        return result;
    }

    @Override
    public RadianceIcon getTextCutActionIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        RadianceIcon result = edit_cut.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(preferredIconColorScheme.getColorFilter(
                preferredIconColorScheme.isDark() ? 0.6f : 0.8f, 1.0f));
        return result;
    }

    @Override
    public RadianceIcon getTextPasteActionIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        RadianceIcon result = edit_paste.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(preferredIconColorScheme.getColorFilter(
                preferredIconColorScheme.isDark() ? 0.6f : 0.8f, 1.0f));
        return result;
    }

    @Override
    public RadianceIcon getTextDeleteActionIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        RadianceIcon result = edit_delete.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(preferredIconColorScheme.getColorFilter(
                preferredIconColorScheme.isDark() ? 0.6f : 0.8f, 1.0f));
        return result;
    }

    @Override
    public RadianceIcon getTextSelectAllActionIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        RadianceIcon result = edit_select_all.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(preferredIconColorScheme.getColorFilter(
                preferredIconColorScheme.isDark() ? 0.6f : 0.8f, 1.0f));
        return result;
    }

    @Override
    public RadianceIcon getColorChooserColorPalettesIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        return face_angel.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public RadianceIcon getColorChooserColorSlidersIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        return face_glasses.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public RadianceIcon getColorChooserColorSwatchesIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        return face_grin.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public RadianceIcon getColorChooserColorWheelIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        return face_plain.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public RadianceIcon getColorChooserCrayonsIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        return face_sad.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public RadianceIcon getColorChooserImagePalettesIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        return face_smile.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public RadianceIcon getScrollHorizontalIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        return go_next.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public RadianceIcon getScrollVerticalIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        return go_down.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public RadianceIcon getScrollAllIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        return view_fullscreen.uiResourceOf(preferredSize, preferredSize);
    }
}
