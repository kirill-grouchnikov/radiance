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
package org.pushingpixels.demo.flamingo;

import org.pushingpixels.flamingo.api.bcb.JBreadcrumbBar;
import org.pushingpixels.flamingo.api.common.AbstractFileViewPanel;
import org.pushingpixels.flamingo.api.common.CommandButtonPresentationState;
import org.pushingpixels.flamingo.api.common.StringValuePair;
import org.pushingpixels.flamingo.api.common.icon.IcoWrapperNeonIcon;
import org.pushingpixels.flamingo.api.common.icon.ImageWrapperNeonIcon;
import org.pushingpixels.flamingo.api.common.model.Command;
import org.pushingpixels.neon.api.NeonCortex;
import org.pushingpixels.neon.api.icon.NeonIcon;
import org.pushingpixels.demo.flamingo.svg.SvgBatikNeonIcon;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Panel that hosts image-based buttons.
 *
 * @param <T> Type tag.
 * @author Kirill Grouchnikov
 */
public class ExplorerFileViewPanel<T> extends AbstractFileViewPanel<T> {
    private JBreadcrumbBar<T> bar;

    private static Map<String, NeonIcon> iconMapping = new HashMap<>();

    private boolean useNativeIcons;

    /**
     * Creates a new panel.
     *
     * @param bar           The breadcrumb bar that is used to browse local or remote
     *                      repository of image files.
     * @param startingState Initial state for image icons.
     */
    public ExplorerFileViewPanel(JBreadcrumbBar<T> bar, CommandButtonPresentationState startingState) {
        super(startingState);
        this.bar = bar;
        this.useNativeIcons = false;
    }

    public void setUseNativeIcons(boolean useNativeIcons) {
        this.useNativeIcons = useNativeIcons;
    }

    @Override
    protected boolean toShowFile(StringValuePair<T> pair) {
        return true;
    }

    @Override
    protected NeonIcon getNeonIcon(AbstractFileViewPanel.Leaf leaf,
            InputStream stream, CommandButtonPresentationState state, Dimension dimension) {
        int prefSize = state.getPreferredIconSize();
        if (prefSize > 0) {
            dimension = new Dimension(prefSize, prefSize);
        }

        if (this.useNativeIcons) {
            Object sourceProp = leaf.getLeafProp("source");
            if (sourceProp instanceof File) {
                Icon delegate = FileSystemView.getFileSystemView().getSystemIcon((File) sourceProp);
                if (delegate != null) {
                    return new IconWrapperNeonIcon(delegate);
                }
            }
            return null;
        }

        String name = leaf.getLeafName();
        int lastPointIndex = name.lastIndexOf('.');
        String ext = "*";
        if (lastPointIndex >= 0) {
            ext = name.substring(lastPointIndex + 1);
        }
        ext = ext.toLowerCase();
        if ((ext.compareTo("jpg") == 0) || (ext.compareTo("jpeg") == 0)
                || (ext.compareTo("gif") == 0) || (ext.compareTo("png") == 0)
                || (ext.compareTo("bmp") == 0)) {
            return ImageWrapperNeonIcon.getIcon(stream, dimension);
        }

        double scale = NeonCortex.getScaleFactor(this);
        if (ext.compareTo("svg") == 0) {
            return SvgBatikNeonIcon.getSvgIcon(stream, scale, dimension);
        }

        if (ext.compareTo("svgz") == 0) {
            return SvgBatikNeonIcon.getSvgzIcon(stream, scale, dimension);
        }

        if (ext.compareTo("ico") == 0) {
            return IcoWrapperNeonIcon.getIcon(stream, scale, dimension);
        }

        NeonIcon icon = iconMapping.get(ext);
        if (icon == null) {
            try {
                String className = "org.pushingpixels.demo.flamingo.svg.filetypes.transcoded.ext_"
                        + ext;
                Class<?> transcodedClass = Class.forName(className);
                if (transcodedClass != null) {
                    Method of = transcodedClass.getDeclaredMethod("of", int.class, int.class);
                    icon = (NeonIcon) of.invoke(null, prefSize, prefSize);
                    iconMapping.put(ext, icon);
                }
            } catch (Throwable t) {
            }
        }
        return icon;
    }

    @Override
    protected void configureCommand(Leaf leaf, Command command, NeonIcon icon) {
        String filename = leaf.getLeafName();
        String ext = "Generic";
        int lastDot = filename.lastIndexOf('.');
        if (lastDot >= 0) {
            ext = filename.substring(lastDot + 1).toUpperCase();
        }
        command.setExtraText(ext + " file");
    }

    @Override
    protected InputStream getLeafContent(T leaf) {
        return bar.getCallback().getLeafContent(leaf);
    }
}
