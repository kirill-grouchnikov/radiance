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
package org.pushingpixels.radiance.theming.api.icon;

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.internal.svg.*;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorUtilities;

/**
 * Default icon pack interface for <b>Radiance</b> look and feel. This class is part of officially
 * supported API.<br>
 *
 * @author Kirill Grouchnikov
 */
public class RadianceDefaultIconPack implements RadianceIconPack {
    @Override
    public RadianceIcon getOptionPaneInformationIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        RadianceIcon result = ic_info_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getMidColor());
        return result;
    }

    @Override
    public RadianceIcon getOptionPaneWarningIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        RadianceIcon result = ic_warning_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getMidColor());
        return result;
    }

    @Override
    public RadianceIcon getOptionPaneErrorIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        RadianceIcon result = ic_error_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getMidColor());
        return result;
    }

    @Override
    public RadianceIcon getOptionPaneQuestionIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        RadianceIcon result = ic_help_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getMidColor());
        return result;
    }

    @Override
    public RadianceIcon getFileChooserNewFolderIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        RadianceIcon result = ic_create_new_folder_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public RadianceIcon getFileChooserUpFolderIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        RadianceIcon result = ic_arrow_upward_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public RadianceIcon getFileChooserHomeFolderIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        RadianceIcon result = ic_home_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public RadianceIcon getFileChooserListViewIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        RadianceIcon result = ic_view_list_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public RadianceIcon getFileChooserDetailsViewIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        RadianceIcon result = ic_insert_drive_file_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public RadianceIcon getFileChooserViewMenuIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        RadianceIcon result = ic_menu_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public RadianceIcon getFileChooserComputerIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        RadianceIcon result = ic_computer_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public RadianceIcon getFileChooserDirectoryIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        RadianceIcon result = ic_folder_open_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public RadianceIcon getFileChooserFileIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        RadianceIcon result = ic_insert_drive_file_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public RadianceIcon getFileChooserFloppyDriveIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        RadianceIcon result = ic_save_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public RadianceIcon getFileChooserHardDriveIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        RadianceIcon result = ic_storage_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public RadianceIcon getLockIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        RadianceIcon result = ic_lock_outline_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(preferredIconColorScheme.getColorFilter(
                preferredIconColorScheme.isDark() ? 0.6f : -0.1f, 1.0f));
        return result;
    }

    @Override
    public RadianceIcon getCapsLockIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        RadianceIcon result = keyboard_capslock_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public RadianceIcon getInspectIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        RadianceIcon result = keyboard_capslock_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> RadianceColorUtilities.getAlphaColor(
                preferredIconColorScheme.getForegroundColor(), 160));
        return result;
    }

    @Override
    public RadianceIcon getRefreshIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        RadianceIcon result = ic_refresh_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public RadianceIcon getAllowedIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        RadianceIcon result = ic_add_circle_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public RadianceIcon getNotAllowedIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        RadianceIcon result = ic_remove_circle_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public RadianceIcon getTextCopyActionIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        RadianceIcon result = ic_content_copy_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public RadianceIcon getTextCutActionIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        RadianceIcon result = ic_content_cut_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public RadianceIcon getTextPasteActionIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        RadianceIcon result = ic_content_paste_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public RadianceIcon getTextDeleteActionIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        RadianceIcon result = ic_delete_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public RadianceIcon getTextSelectAllActionIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        RadianceIcon result = ic_select_all_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public RadianceIcon getColorChooserColorPalettesIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        RadianceIcon result = ic_palette_black_24px.of(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public RadianceIcon getColorChooserColorSlidersIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        RadianceIcon result = ic_menu_black_24px.of(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public RadianceIcon getColorChooserColorSwatchesIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        RadianceIcon result = ic_grid_on_black_24px.of(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public RadianceIcon getColorChooserColorWheelIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        RadianceIcon result = ic_album_black_24px.of(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public RadianceIcon getColorChooserCrayonsIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        RadianceIcon result = ic_mode_edit_black_24px.of(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public RadianceIcon getColorChooserImagePalettesIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        RadianceIcon result = ic_brightness_high_black_24px.of(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public RadianceIcon getScrollVerticalIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        RadianceIcon result = autoscroll_v.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public RadianceIcon getScrollHorizontalIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        RadianceIcon result = autoscroll_h.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public RadianceIcon getScrollAllIcon(int preferredSize,
            RadianceColorScheme preferredIconColorScheme) {
        RadianceIcon result = autoscroll_all.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }
}
