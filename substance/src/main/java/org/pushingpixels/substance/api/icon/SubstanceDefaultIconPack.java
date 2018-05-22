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

import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.internal.svg.autoscroll_all;
import org.pushingpixels.substance.internal.svg.autoscroll_h;
import org.pushingpixels.substance.internal.svg.autoscroll_v;
import org.pushingpixels.substance.internal.svg.ic_add_circle_black_24px;
import org.pushingpixels.substance.internal.svg.ic_adjust_black_24px;
import org.pushingpixels.substance.internal.svg.ic_album_black_24px;
import org.pushingpixels.substance.internal.svg.ic_arrow_upward_black_24px;
import org.pushingpixels.substance.internal.svg.ic_brightness_high_black_24px;
import org.pushingpixels.substance.internal.svg.ic_computer_black_24px;
import org.pushingpixels.substance.internal.svg.ic_content_copy_black_24px;
import org.pushingpixels.substance.internal.svg.ic_content_cut_black_24px;
import org.pushingpixels.substance.internal.svg.ic_content_paste_black_24px;
import org.pushingpixels.substance.internal.svg.ic_create_new_folder_black_24px;
import org.pushingpixels.substance.internal.svg.ic_delete_black_24px;
import org.pushingpixels.substance.internal.svg.ic_error_black_24px;
import org.pushingpixels.substance.internal.svg.ic_folder_open_black_24px;
import org.pushingpixels.substance.internal.svg.ic_grid_on_black_24px;
import org.pushingpixels.substance.internal.svg.ic_help_black_24px;
import org.pushingpixels.substance.internal.svg.ic_home_black_24px;
import org.pushingpixels.substance.internal.svg.ic_info_black_24px;
import org.pushingpixels.substance.internal.svg.ic_insert_drive_file_black_24px;
import org.pushingpixels.substance.internal.svg.ic_lock_outline_black_24px;
import org.pushingpixels.substance.internal.svg.ic_menu_black_24px;
import org.pushingpixels.substance.internal.svg.ic_mode_edit_black_24px;
import org.pushingpixels.substance.internal.svg.ic_palette_black_24px;
import org.pushingpixels.substance.internal.svg.ic_refresh_black_24px;
import org.pushingpixels.substance.internal.svg.ic_remove_circle_black_24px;
import org.pushingpixels.substance.internal.svg.ic_save_black_24px;
import org.pushingpixels.substance.internal.svg.ic_select_all_black_24px;
import org.pushingpixels.substance.internal.svg.ic_storage_black_24px;
import org.pushingpixels.substance.internal.svg.ic_view_list_black_24px;
import org.pushingpixels.substance.internal.svg.ic_warning_black_24px;

/**
 * Default icon pack interface for <b>Substance</b> look and feel. This class is part of officially
 * supported API.<br>
 * 
 * @author Kirill Grouchnikov
 * @since version 8.0
 */
public class SubstanceDefaultIconPack implements SubstanceIconPack {
    private SubstanceIconUIResource getOptionPaneIcon(SubstanceIconUIResource base,
            SubstanceColorScheme colorScheme) {
        return base.colorize(colorScheme.getMidColor());
    }

    @Override
    public SubstanceIconUIResource getOptionPaneInformationIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        SubstanceIconUIResource base = ic_info_black_24px.uiResourceOf(preferredSize,
                preferredSize);
        return getOptionPaneIcon(base, preferredIconColorScheme);
    }

    @Override
    public SubstanceIconUIResource getOptionPaneWarningIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        SubstanceIconUIResource base = ic_warning_black_24px.uiResourceOf(preferredSize,
                preferredSize);
        return getOptionPaneIcon(base, preferredIconColorScheme);
    }

    @Override
    public SubstanceIconUIResource getOptionPaneErrorIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        SubstanceIconUIResource base = ic_error_black_24px.uiResourceOf(preferredSize,
                preferredSize);
        return getOptionPaneIcon(base, preferredIconColorScheme);
    }

    @Override
    public SubstanceIconUIResource getOptionPaneQuestionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        SubstanceIconUIResource base = ic_help_black_24px.uiResourceOf(preferredSize,
                preferredSize);
        return getOptionPaneIcon(base, preferredIconColorScheme);
    }

    @Override
    public SubstanceIconUIResource getFileChooserNewFolderIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        SubstanceIconUIResource base = ic_create_new_folder_black_24px.uiResourceOf(preferredSize,
                preferredSize);
        return base.colorize(preferredIconColorScheme);
    }

    @Override
    public SubstanceIconUIResource getFileChooserUpFolderIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        SubstanceIconUIResource base = ic_arrow_upward_black_24px.uiResourceOf(preferredSize,
                preferredSize);
        return base.colorize(preferredIconColorScheme);
    }

    @Override
    public SubstanceIconUIResource getFileChooserHomeFolderIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        SubstanceIconUIResource base = ic_home_black_24px.uiResourceOf(preferredSize,
                preferredSize);
        return base.colorize(preferredIconColorScheme);
    }

    @Override
    public SubstanceIconUIResource getFileChooserListViewIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        SubstanceIconUIResource base = ic_view_list_black_24px.uiResourceOf(preferredSize,
                preferredSize);
        return base.colorize(preferredIconColorScheme);
    }

    @Override
    public SubstanceIconUIResource getFileChooserDetailsViewIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        SubstanceIconUIResource base = ic_insert_drive_file_black_24px.uiResourceOf(preferredSize,
                preferredSize);
        return base.colorize(preferredIconColorScheme);
    }

    @Override
    public SubstanceIconUIResource getFileChooserViewMenuIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        SubstanceIconUIResource base = ic_menu_black_24px.uiResourceOf(preferredSize,
                preferredSize);
        return base.colorize(preferredIconColorScheme);
    }

    @Override
    public SubstanceIconUIResource getFileChooserComputerIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        SubstanceIconUIResource base = ic_computer_black_24px.uiResourceOf(preferredSize,
                preferredSize);
        return base.colorize(preferredIconColorScheme);
    }

    @Override
    public SubstanceIconUIResource getFileChooserDirectoryIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        SubstanceIconUIResource base = ic_folder_open_black_24px.uiResourceOf(preferredSize,
                preferredSize);
        return base.colorize(preferredIconColorScheme);
    }

    @Override
    public SubstanceIconUIResource getFileChooserFileIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        SubstanceIconUIResource base = ic_insert_drive_file_black_24px.uiResourceOf(preferredSize,
                preferredSize);
        return base.colorize(preferredIconColorScheme);
    }

    @Override
    public SubstanceIconUIResource getFileChooserFloppyDriveIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        SubstanceIconUIResource base = ic_save_black_24px.uiResourceOf(preferredSize,
                preferredSize);
        return base.colorize(preferredIconColorScheme);
    }

    @Override
    public SubstanceIconUIResource getFileChooserHardDriveIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        SubstanceIconUIResource base = ic_storage_black_24px.uiResourceOf(preferredSize,
                preferredSize);
        return base.colorize(preferredIconColorScheme);
    }

    @Override
    public SubstanceIconUIResource getLockIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        SubstanceIconUIResource base = ic_lock_outline_black_24px.uiResourceOf(preferredSize,
                preferredSize);
        return base.colorize(preferredIconColorScheme,
                preferredIconColorScheme.isDark() ? 0.6f : -0.1f);
    }

    @Override
    public SubstanceIconUIResource getInspectIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        SubstanceIconUIResource base = ic_adjust_black_24px.uiResourceOf(preferredSize,
                preferredSize);
        return base.colorize(preferredIconColorScheme.getForegroundColor(), 0.625f);
    }

    @Override
    public SubstanceIconUIResource getRefreshIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        SubstanceIconUIResource base = ic_refresh_black_24px.uiResourceOf(preferredSize,
                preferredSize);
        return base.colorize(preferredIconColorScheme.getForegroundColor());
    }

    @Override
    public SubstanceIconUIResource getAllowedIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        SubstanceIconUIResource base = ic_add_circle_black_24px.uiResourceOf(preferredSize,
                preferredSize);
        return base.colorize(preferredIconColorScheme.getForegroundColor());
    }

    @Override
    public SubstanceIconUIResource getNotAllowedIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        SubstanceIconUIResource base = ic_remove_circle_black_24px.uiResourceOf(preferredSize,
                preferredSize);
        return base.colorize(preferredIconColorScheme.getDarkColor());
    }

    @Override
    public SubstanceIconUIResource getTextCopyActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        SubstanceIconUIResource base = ic_content_copy_black_24px.uiResourceOf(preferredSize,
                preferredSize);
        return base.colorize(preferredIconColorScheme.getForegroundColor());
    }

    @Override
    public SubstanceIconUIResource getTextCutActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        SubstanceIconUIResource base = ic_content_cut_black_24px.uiResourceOf(preferredSize,
                preferredSize);
        return base.colorize(preferredIconColorScheme.getForegroundColor());
    }

    @Override
    public SubstanceIconUIResource getTextPasteActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        SubstanceIconUIResource base = ic_content_paste_black_24px.uiResourceOf(preferredSize,
                preferredSize);
        return base.colorize(preferredIconColorScheme.getForegroundColor());
    }

    @Override
    public SubstanceIconUIResource getTextDeleteActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        SubstanceIconUIResource base = ic_delete_black_24px.uiResourceOf(preferredSize,
                preferredSize);
        return base.colorize(preferredIconColorScheme.getForegroundColor());
    }

    @Override
    public SubstanceIconUIResource getTextSelectAllActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        SubstanceIconUIResource base = ic_select_all_black_24px.uiResourceOf(preferredSize,
                preferredSize);
        return base.colorize(preferredIconColorScheme.getForegroundColor());
    }

    @Override
    public SubstanceIconUIResource getColorChooserColorPalettesIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        SubstanceIconUIResource base = ic_palette_black_24px.uiResourceOf(preferredSize,
                preferredSize);
        return base.colorize(preferredIconColorScheme.getForegroundColor());
    }

    @Override
    public SubstanceIconUIResource getColorChooserColorSlidersIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        SubstanceIconUIResource base = ic_menu_black_24px.uiResourceOf(preferredSize,
                preferredSize);
        return base.colorize(preferredIconColorScheme.getForegroundColor());
    }

    @Override
    public SubstanceIconUIResource getColorChooserColorSwatchesIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        SubstanceIconUIResource base = ic_grid_on_black_24px.uiResourceOf(preferredSize,
                preferredSize);
        return base.colorize(preferredIconColorScheme.getForegroundColor());
    }

    @Override
    public SubstanceIconUIResource getColorChooserColorWheelIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        SubstanceIconUIResource base = ic_album_black_24px.uiResourceOf(preferredSize,
                preferredSize);
        return base.colorize(preferredIconColorScheme.getForegroundColor());
    }

    @Override
    public SubstanceIconUIResource getColorChooserCrayonsIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        SubstanceIconUIResource base = ic_mode_edit_black_24px.uiResourceOf(preferredSize,
                preferredSize);
        return base.colorize(preferredIconColorScheme.getForegroundColor());
    }

    @Override
    public SubstanceIconUIResource getColorChooserImagePalettesIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        SubstanceIconUIResource base = ic_brightness_high_black_24px.uiResourceOf(preferredSize,
                preferredSize);
        return base.colorize(preferredIconColorScheme.getForegroundColor());
    }

    @Override
    public SubstanceIconUIResource getScrollVerticalIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        SubstanceIconUIResource base = autoscroll_v.uiResourceOf(preferredSize, preferredSize);
        return base.colorize(preferredIconColorScheme.getForegroundColor());
    }

    @Override
    public SubstanceIconUIResource getScrollHorizontalIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        SubstanceIconUIResource base = autoscroll_h.uiResourceOf(preferredSize, preferredSize);
        return base.colorize(preferredIconColorScheme.getForegroundColor());
    }

    @Override
    public SubstanceIconUIResource getScrollAllIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        SubstanceIconUIResource base = autoscroll_all.uiResourceOf(preferredSize, preferredSize);
        return base.colorize(preferredIconColorScheme.getForegroundColor());
    }
}
