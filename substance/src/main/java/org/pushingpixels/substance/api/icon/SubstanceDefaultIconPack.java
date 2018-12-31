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
import org.pushingpixels.substance.internal.svg.*;

import java.awt.*;

/**
 * Default icon pack interface for <b>Substance</b> look and feel. This class is part of officially
 * supported API.<br>
 *
 * @author Kirill Grouchnikov
 */
public class SubstanceDefaultIconPack implements SubstanceIconPack {
    @Override
    public NeonIconUIResource getOptionPaneInformationIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIconUIResource result = SubstanceCortex.GlobalScope.colorizeAsUiResource(
                ic_info_black_24px.factory(),
                preferredIconColorScheme.getMidColor());
        result.setDimension(new Dimension(preferredSize, preferredSize));
        return result;
    }

    @Override
    public NeonIconUIResource getOptionPaneWarningIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIconUIResource result = SubstanceCortex.GlobalScope.colorizeAsUiResource(
                ic_warning_black_24px.factory(),
                preferredIconColorScheme.getMidColor());
        result.setDimension(new Dimension(preferredSize, preferredSize));
        return result;
    }

    @Override
    public NeonIconUIResource getOptionPaneErrorIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIconUIResource result = SubstanceCortex.GlobalScope.colorizeAsUiResource(
                ic_error_black_24px.factory(),
                preferredIconColorScheme.getMidColor());
        result.setDimension(new Dimension(preferredSize, preferredSize));
        return result;
    }

    @Override
    public NeonIconUIResource getOptionPaneQuestionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIconUIResource result = SubstanceCortex.GlobalScope.colorizeAsUiResource(
                ic_help_black_24px.factory(),
                preferredIconColorScheme.getMidColor());
        result.setDimension(new Dimension(preferredSize, preferredSize));
        return result;
    }

    @Override
    public NeonIconUIResource getFileChooserNewFolderIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIconUIResource result = SubstanceCortex.GlobalScope.colorizeAsUiResource(
                ic_create_new_folder_black_24px.factory(),
                preferredIconColorScheme.getForegroundColor());
        result.setDimension(new Dimension(preferredSize, preferredSize));
        return result;
    }

    @Override
    public NeonIconUIResource getFileChooserUpFolderIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIconUIResource result = SubstanceCortex.GlobalScope.colorizeAsUiResource(
                ic_arrow_upward_black_24px.factory(),
                preferredIconColorScheme.getForegroundColor());
        result.setDimension(new Dimension(preferredSize, preferredSize));
        return result;
    }

    @Override
    public NeonIconUIResource getFileChooserHomeFolderIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIconUIResource result = SubstanceCortex.GlobalScope.colorizeAsUiResource(
                ic_home_black_24px.factory(),
                preferredIconColorScheme.getForegroundColor());
        result.setDimension(new Dimension(preferredSize, preferredSize));
        return result;
    }

    @Override
    public NeonIconUIResource getFileChooserListViewIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIconUIResource result = SubstanceCortex.GlobalScope.colorizeAsUiResource(
                ic_view_list_black_24px.factory(),
                preferredIconColorScheme.getForegroundColor());
        result.setDimension(new Dimension(preferredSize, preferredSize));
        return result;
    }

    @Override
    public NeonIconUIResource getFileChooserDetailsViewIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIconUIResource result = SubstanceCortex.GlobalScope.colorizeAsUiResource(
                ic_insert_drive_file_black_24px.factory(),
                preferredIconColorScheme.getForegroundColor());
        result.setDimension(new Dimension(preferredSize, preferredSize));
        return result;
    }

    @Override
    public NeonIconUIResource getFileChooserViewMenuIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIconUIResource result = SubstanceCortex.GlobalScope.colorizeAsUiResource(
                ic_menu_black_24px.factory(),
                preferredIconColorScheme.getForegroundColor());
        result.setDimension(new Dimension(preferredSize, preferredSize));
        return result;
    }

    @Override
    public NeonIconUIResource getFileChooserComputerIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIconUIResource result = SubstanceCortex.GlobalScope.colorizeAsUiResource(
                ic_computer_black_24px.factory(),
                preferredIconColorScheme.getForegroundColor());
        result.setDimension(new Dimension(preferredSize, preferredSize));
        return result;
    }

    @Override
    public NeonIconUIResource getFileChooserDirectoryIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIconUIResource result = SubstanceCortex.GlobalScope.colorizeAsUiResource(
                ic_folder_open_black_24px.factory(),
                preferredIconColorScheme.getForegroundColor());
        result.setDimension(new Dimension(preferredSize, preferredSize));
        return result;
    }

    @Override
    public NeonIconUIResource getFileChooserFileIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIconUIResource result = SubstanceCortex.GlobalScope.colorizeAsUiResource(
                ic_insert_drive_file_black_24px.factory(),
                preferredIconColorScheme.getForegroundColor());
        result.setDimension(new Dimension(preferredSize, preferredSize));
        return result;
    }

    @Override
    public NeonIconUIResource getFileChooserFloppyDriveIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIconUIResource result = SubstanceCortex.GlobalScope.colorizeAsUiResource(
                ic_save_black_24px.factory(),
                preferredIconColorScheme.getForegroundColor());
        result.setDimension(new Dimension(preferredSize, preferredSize));
        return result;
    }

    @Override
    public NeonIconUIResource getFileChooserHardDriveIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIconUIResource result = SubstanceCortex.GlobalScope.colorizeAsUiResource(
                ic_storage_black_24px.factory(),
                preferredIconColorScheme.getForegroundColor());
        result.setDimension(new Dimension(preferredSize, preferredSize));
        return result;
    }

    @Override
    public NeonIconUIResource getLockIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIconUIResource result = SubstanceCortex.GlobalScope.colorizeAsUiResource(
                ic_lock_outline_black_24px.factory(), preferredIconColorScheme,
                preferredIconColorScheme.isDark() ? 0.6f : -0.1f);
        result.setDimension(new Dimension(preferredSize, preferredSize));
        return result;
    }

    @Override
    public NeonIconUIResource getInspectIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIconUIResource result = SubstanceCortex.GlobalScope.colorizeAsUiResource(
                ic_adjust_black_24px.factory(),
                preferredIconColorScheme.getForegroundColor(), 0.625f);
        result.setDimension(new Dimension(preferredSize, preferredSize));
        return result;
    }

    @Override
    public NeonIconUIResource getRefreshIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIconUIResource result = SubstanceCortex.GlobalScope.colorizeAsUiResource(
                ic_refresh_black_24px.factory(),
                preferredIconColorScheme.getForegroundColor());
        result.setDimension(new Dimension(preferredSize, preferredSize));
        return result;
    }

    @Override
    public NeonIconUIResource getAllowedIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIconUIResource result = SubstanceCortex.GlobalScope.colorizeAsUiResource(
                ic_add_circle_black_24px.factory(),
                preferredIconColorScheme.getForegroundColor());
        result.setDimension(new Dimension(preferredSize, preferredSize));
        return result;
    }

    @Override
    public NeonIconUIResource getNotAllowedIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIconUIResource result = SubstanceCortex.GlobalScope.colorizeAsUiResource(
                ic_remove_circle_black_24px.factory(),
                preferredIconColorScheme.getForegroundColor());
        result.setDimension(new Dimension(preferredSize, preferredSize));
        return result;
    }

    @Override
    public NeonIconUIResource getTextCopyActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIconUIResource result = SubstanceCortex.GlobalScope.colorizeAsUiResource(
                ic_content_copy_black_24px.factory(),
                preferredIconColorScheme.getForegroundColor());
        result.setDimension(new Dimension(preferredSize, preferredSize));
        return result;
    }

    @Override
    public NeonIconUIResource getTextCutActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIconUIResource result = SubstanceCortex.GlobalScope.colorizeAsUiResource(
                ic_content_cut_black_24px.factory(),
                preferredIconColorScheme.getForegroundColor());
        result.setDimension(new Dimension(preferredSize, preferredSize));
        return result;
    }

    @Override
    public NeonIconUIResource getTextPasteActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIconUIResource result = SubstanceCortex.GlobalScope.colorizeAsUiResource(
                ic_content_paste_black_24px.factory(),
                preferredIconColorScheme.getForegroundColor());
        result.setDimension(new Dimension(preferredSize, preferredSize));
        return result;
    }

    @Override
    public NeonIconUIResource getTextDeleteActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIconUIResource result = SubstanceCortex.GlobalScope.colorizeAsUiResource(
                ic_delete_black_24px.factory(),
                preferredIconColorScheme.getForegroundColor());
        result.setDimension(new Dimension(preferredSize, preferredSize));
        return result;
    }

    @Override
    public NeonIconUIResource getTextSelectAllActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIconUIResource result = SubstanceCortex.GlobalScope.colorizeAsUiResource(
                ic_select_all_black_24px.factory(),
                preferredIconColorScheme.getForegroundColor());
        result.setDimension(new Dimension(preferredSize, preferredSize));
        return result;
    }

    @Override
    public NeonIconUIResource getColorChooserColorPalettesIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIconUIResource result = SubstanceCortex.GlobalScope.colorizeAsUiResource(
                ic_palette_black_24px.factory(),
                preferredIconColorScheme.getForegroundColor());
        result.setDimension(new Dimension(preferredSize, preferredSize));
        return result;
    }

    @Override
    public NeonIconUIResource getColorChooserColorSlidersIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIconUIResource result = SubstanceCortex.GlobalScope.colorizeAsUiResource(
                ic_menu_black_24px.factory(),
                preferredIconColorScheme.getForegroundColor());
        result.setDimension(new Dimension(preferredSize, preferredSize));
        return result;
    }

    @Override
    public NeonIconUIResource getColorChooserColorSwatchesIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIconUIResource result = SubstanceCortex.GlobalScope.colorizeAsUiResource(
                ic_grid_on_black_24px.factory(),
                preferredIconColorScheme.getForegroundColor());
        result.setDimension(new Dimension(preferredSize, preferredSize));
        return result;
    }

    @Override
    public NeonIconUIResource getColorChooserColorWheelIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIconUIResource result = SubstanceCortex.GlobalScope.colorizeAsUiResource(
                ic_album_black_24px.factory(),
                preferredIconColorScheme.getForegroundColor());
        result.setDimension(new Dimension(preferredSize, preferredSize));
        return result;
    }

    @Override
    public NeonIconUIResource getColorChooserCrayonsIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIconUIResource result = SubstanceCortex.GlobalScope.colorizeAsUiResource(
                ic_mode_edit_black_24px.factory(),
                preferredIconColorScheme.getForegroundColor());
        result.setDimension(new Dimension(preferredSize, preferredSize));
        return result;
    }

    @Override
    public NeonIconUIResource getColorChooserImagePalettesIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIconUIResource result = SubstanceCortex.GlobalScope.colorizeAsUiResource(
                ic_brightness_high_black_24px.factory(),
                preferredIconColorScheme.getForegroundColor());
        result.setDimension(new Dimension(preferredSize, preferredSize));
        return result;
    }

    @Override
    public NeonIconUIResource getScrollVerticalIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIconUIResource result = SubstanceCortex.GlobalScope.colorizeAsUiResource(
                autoscroll_v.factory(),
                preferredIconColorScheme.getForegroundColor());
        result.setDimension(new Dimension(preferredSize, preferredSize));
        return result;
    }

    @Override
    public NeonIconUIResource getScrollHorizontalIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIconUIResource result = SubstanceCortex.GlobalScope.colorizeAsUiResource(
                autoscroll_h.factory(),
                preferredIconColorScheme.getForegroundColor());
        result.setDimension(new Dimension(preferredSize, preferredSize));
        return result;
    }

    @Override
    public NeonIconUIResource getScrollAllIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        NeonIconUIResource result = SubstanceCortex.GlobalScope.colorizeAsUiResource(
                autoscroll_all.factory(),
                preferredIconColorScheme.getForegroundColor());
        result.setDimension(new Dimension(preferredSize, preferredSize));
        return result;
    }
}
