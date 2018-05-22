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
package org.pushingpixels.demo.substance.main.check;

import org.pushingpixels.demo.substance.main.check.svg.tango.accessories_text_editor;
import org.pushingpixels.demo.substance.main.check.svg.tango.computer;
import org.pushingpixels.demo.substance.main.check.svg.tango.dialog_error;
import org.pushingpixels.demo.substance.main.check.svg.tango.dialog_information;
import org.pushingpixels.demo.substance.main.check.svg.tango.dialog_warning;
import org.pushingpixels.demo.substance.main.check.svg.tango.drive_harddisk;
import org.pushingpixels.demo.substance.main.check.svg.tango.edit_copy;
import org.pushingpixels.demo.substance.main.check.svg.tango.edit_cut;
import org.pushingpixels.demo.substance.main.check.svg.tango.edit_delete;
import org.pushingpixels.demo.substance.main.check.svg.tango.edit_paste;
import org.pushingpixels.demo.substance.main.check.svg.tango.edit_select_all;
import org.pushingpixels.demo.substance.main.check.svg.tango.emblem_system;
import org.pushingpixels.demo.substance.main.check.svg.tango.face_angel;
import org.pushingpixels.demo.substance.main.check.svg.tango.face_glasses;
import org.pushingpixels.demo.substance.main.check.svg.tango.face_grin;
import org.pushingpixels.demo.substance.main.check.svg.tango.face_plain;
import org.pushingpixels.demo.substance.main.check.svg.tango.face_sad;
import org.pushingpixels.demo.substance.main.check.svg.tango.face_smile;
import org.pushingpixels.demo.substance.main.check.svg.tango.folder;
import org.pushingpixels.demo.substance.main.check.svg.tango.folder_new;
import org.pushingpixels.demo.substance.main.check.svg.tango.format_justify_fill;
import org.pushingpixels.demo.substance.main.check.svg.tango.go_down;
import org.pushingpixels.demo.substance.main.check.svg.tango.go_next;
import org.pushingpixels.demo.substance.main.check.svg.tango.go_up;
import org.pushingpixels.demo.substance.main.check.svg.tango.help_browser;
import org.pushingpixels.demo.substance.main.check.svg.tango.list_add;
import org.pushingpixels.demo.substance.main.check.svg.tango.locked;
import org.pushingpixels.demo.substance.main.check.svg.tango.media_floppy;
import org.pushingpixels.demo.substance.main.check.svg.tango.system_search;
import org.pushingpixels.demo.substance.main.check.svg.tango.text_x_generic;
import org.pushingpixels.demo.substance.main.check.svg.tango.user_home;
import org.pushingpixels.demo.substance.main.check.svg.tango.view_fullscreen;
import org.pushingpixels.demo.substance.main.check.svg.tango.view_refresh;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.icon.SubstanceIconPack;
import org.pushingpixels.substance.api.icon.SubstanceIconUIResource;

public class TangoIconPack implements SubstanceIconPack {

    @Override
    public SubstanceIconUIResource getOptionPaneInformationIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return dialog_information.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIconUIResource getOptionPaneWarningIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return dialog_warning.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIconUIResource getOptionPaneErrorIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return dialog_error.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIconUIResource getOptionPaneQuestionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return help_browser.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIconUIResource getFileChooserNewFolderIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return folder_new.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIconUIResource getFileChooserUpFolderIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return go_up.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIconUIResource getFileChooserHomeFolderIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return user_home.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIconUIResource getFileChooserListViewIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return format_justify_fill.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIconUIResource getFileChooserDetailsViewIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return accessories_text_editor.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIconUIResource getFileChooserViewMenuIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return emblem_system.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIconUIResource getFileChooserComputerIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return computer.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIconUIResource getFileChooserDirectoryIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return folder.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIconUIResource getFileChooserFileIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return text_x_generic.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIconUIResource getFileChooserFloppyDriveIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return media_floppy.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIconUIResource getFileChooserHardDriveIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return drive_harddisk.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIconUIResource getLockIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return locked.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIconUIResource getInspectIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return system_search.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIconUIResource getRefreshIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return view_refresh.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIconUIResource getAllowedIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return list_add.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIconUIResource getNotAllowedIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return dialog_error.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIconUIResource getTextCopyActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return edit_copy.uiResourceOf(preferredSize, preferredSize)
                .colorize(preferredIconColorScheme);
    }

    @Override
    public SubstanceIconUIResource getTextCutActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return edit_cut.uiResourceOf(preferredSize, preferredSize)
                .colorize(preferredIconColorScheme);
    }

    @Override
    public SubstanceIconUIResource getTextPasteActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return edit_paste.uiResourceOf(preferredSize, preferredSize)
                .colorize(preferredIconColorScheme);
    }

    @Override
    public SubstanceIconUIResource getTextDeleteActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return edit_delete.uiResourceOf(preferredSize, preferredSize)
                .colorize(preferredIconColorScheme);
    }

    @Override
    public SubstanceIconUIResource getTextSelectAllActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return edit_select_all.uiResourceOf(preferredSize, preferredSize)
                .colorize(preferredIconColorScheme);
    }

    @Override
    public SubstanceIconUIResource getColorChooserColorPalettesIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return face_angel.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIconUIResource getColorChooserColorSlidersIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return face_glasses.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIconUIResource getColorChooserColorSwatchesIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return face_grin.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIconUIResource getColorChooserColorWheelIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return face_plain.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIconUIResource getColorChooserCrayonsIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return face_sad.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIconUIResource getColorChooserImagePalettesIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return face_smile.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIconUIResource getScrollHorizontalIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return go_next.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIconUIResource getScrollVerticalIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return go_down.uiResourceOf(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIconUIResource getScrollAllIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return view_fullscreen.uiResourceOf(preferredSize, preferredSize);
    }
}
