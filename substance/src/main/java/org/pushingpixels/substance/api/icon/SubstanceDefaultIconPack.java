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
import org.pushingpixels.substance.internal.svg.*;
import org.pushingpixels.substance.internal.utils.SubstanceColorUtilities;

import java.awt.*;

/**
 * Default icon pack interface for <b>Substance</b> look and feel. This class is part of officially
 * supported API.<br>
 *
 * @author Kirill Grouchnikov
 */
public class SubstanceDefaultIconPack implements SubstanceIconPack {
    @Override
    public NeonIcon getOptionPaneInformationIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIcon result = ic_info_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getMidColor());
        return result;
    }

    @Override
    public NeonIcon getOptionPaneWarningIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIcon result = ic_warning_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getMidColor());
        return result;
    }

    @Override
    public NeonIcon getOptionPaneErrorIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIcon result = ic_error_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getMidColor());
        return result;
    }

    @Override
    public NeonIcon getOptionPaneQuestionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIcon result = ic_help_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getMidColor());
        return result;
    }

    @Override
    public NeonIcon getFileChooserNewFolderIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIcon result = ic_create_new_folder_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public NeonIcon getFileChooserUpFolderIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIcon result = ic_arrow_upward_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public NeonIcon getFileChooserHomeFolderIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIcon result = ic_home_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public NeonIcon getFileChooserListViewIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIcon result = ic_view_list_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public NeonIcon getFileChooserDetailsViewIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIcon result = ic_insert_drive_file_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public NeonIcon getFileChooserViewMenuIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIcon result = ic_menu_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public NeonIcon getFileChooserComputerIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIcon result = ic_computer_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public NeonIcon getFileChooserDirectoryIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIcon result = ic_folder_open_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public NeonIcon getFileChooserFileIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIcon result = ic_insert_drive_file_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public NeonIcon getFileChooserFloppyDriveIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIcon result = ic_save_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public NeonIcon getFileChooserHardDriveIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIcon result = ic_storage_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public NeonIcon getLockIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIcon result = SubstanceCortex.GlobalScope.colorizeIconAsUiResource(
                ic_lock_outline_black_24px.factory(), preferredIconColorScheme,
                preferredIconColorScheme.isDark() ? 0.6f : -0.1f);
        result.setDimension(new Dimension(preferredSize, preferredSize));
        return result;
    }

    @Override
    public NeonIcon getCapsLockIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIcon result = keyboard_capslock_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public NeonIcon getInspectIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIcon result = keyboard_capslock_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> SubstanceColorUtilities.getAlphaColor(
                preferredIconColorScheme.getForegroundColor(), 160));
        return result;
    }

    @Override
    public NeonIcon getRefreshIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIcon result = ic_refresh_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public NeonIcon getAllowedIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIcon result = ic_add_circle_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public NeonIcon getNotAllowedIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIcon result = ic_remove_circle_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public NeonIcon getTextCopyActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIcon result = ic_content_copy_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public NeonIcon getTextCutActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIcon result = ic_content_cut_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public NeonIcon getTextPasteActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIcon result = ic_content_paste_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public NeonIcon getTextDeleteActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIcon result = ic_delete_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public NeonIcon getTextSelectAllActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIcon result = ic_select_all_black_24px.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public NeonIcon getColorChooserColorPalettesIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIcon result = ic_palette_black_24px.of(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public NeonIcon getColorChooserColorSlidersIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIcon result = ic_menu_black_24px.of(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public NeonIcon getColorChooserColorSwatchesIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIcon result = ic_grid_on_black_24px.of(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public NeonIcon getColorChooserColorWheelIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIcon result = ic_album_black_24px.of(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public NeonIcon getColorChooserCrayonsIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIcon result = ic_mode_edit_black_24px.of(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public NeonIcon getColorChooserImagePalettesIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIcon result = ic_brightness_high_black_24px.of(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public NeonIcon getScrollVerticalIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIcon result = autoscroll_v.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public NeonIcon getScrollHorizontalIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIcon result = autoscroll_h.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }

    @Override
    public NeonIcon getScrollAllIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIcon result = autoscroll_all.uiResourceOf(preferredSize, preferredSize);
        result.setColorFilter(color -> preferredIconColorScheme.getForegroundColor());
        return result;
    }
}
