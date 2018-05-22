/*
 * Copyright (c) 2005-2018 Rainbow Kirill Grouchnikov 
 * and Alexander Potochkin. All Rights Reserved.
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
 *  o Neither the name of Rainbow, Kirill Grouchnikov 
 *    and Alexander Potochkin nor the names of
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
package org.pushingpixels.rainbow;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.io.InputStream;

import javax.swing.SwingUtilities;

import org.pushingpixels.flamingo.api.bcb.JBreadcrumbBar;
import org.pushingpixels.flamingo.api.common.AbstractFileViewPanel;
import org.pushingpixels.flamingo.api.common.CommandButtonDisplayState;
import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.ProgressListener;
import org.pushingpixels.flamingo.api.common.RichTooltip;
import org.pushingpixels.flamingo.api.common.StringValuePair;
import org.pushingpixels.flamingo.api.common.icon.ResizableIcon;
import org.pushingpixels.ibis.icon.SvgBatikResizableIcon;
import org.pushingpixels.rainbow.layout.TransitionLayoutManager;

/**
 * Panel that hosts SVG-based gallery buttons.
 * 
 * @author Kirill Grouchnikov
 * @param <T>
 *            Type tag.
 */
public class RainbowFileViewPanel<T> extends AbstractFileViewPanel<T> {
    /**
     * The breadcrumb bar that is used to browse local or remote repository of SVG files.
     */
    protected JBreadcrumbBar<T> bar;

    /**
     * Creates a new panel.
     * 
     * @param bar
     *            The breadcrumb bar that is used to browse local or remote repository of SVG files.
     * @param startingDimension
     *            Initial dimension for SVG icons.
     * @param progressListener
     *            Progress listener to report back on loaded SVG images.
     */
    public RainbowFileViewPanel(JBreadcrumbBar<T> bar, int startingDimension,
            ProgressListener progressListener) {
        super(startingDimension, progressListener);
        this.bar = bar;
        TransitionLayoutManager.getInstance().track(this, true);
    }

    @Override
    protected void configureCommandButton(final AbstractFileViewPanel.Leaf leaf,
            JCommandButton button, final ResizableIcon icon) {
        button.setActionRichTooltip(new RichTooltip.RichTooltipBuilder().setTitle("Transcode")
                .addDescriptionSection("Click to generate Java2D class").build());
        button.addActionListener((ActionEvent e) -> {
            SwingUtilities.invokeLater(() -> {
                // can't pass the stream contents since the
                // input can be .svgz
                SvgBatikResizableIcon svgIcon = (SvgBatikResizableIcon) icon;
                RainbowUtils.processSvgButtonClick(svgIcon.getSvgBytes(), leaf.getLeafName());
            });
        });
    }

    @Override
    protected boolean toShowFile(StringValuePair<T> pair) {
        String name = pair.getKey();
        return name.endsWith(".svg") || name.endsWith(".svgz");
    }

    @Override
    protected java.io.InputStream getLeafContent(T leaf) {
        return bar.getCallback().getLeafContent(leaf);
    }

    @Override
    protected ResizableIcon getResizableIcon(AbstractFileViewPanel.Leaf leaf, InputStream stream,
            CommandButtonDisplayState state, Dimension dimension) {
        String name = leaf.getLeafName();
        if (name.endsWith(".svg"))
            return SvgBatikResizableIcon.getSvgIcon(leaf.getLeafStream(), dimension);
        else
            return SvgBatikResizableIcon.getSvgzIcon(leaf.getLeafStream(), dimension);
    }
}
