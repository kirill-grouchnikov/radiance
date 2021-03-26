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
package org.pushingpixels.demo.flamingo.svg;

import org.pushingpixels.flamingo.api.bcb.BreadcrumbBarCallBack;
import org.pushingpixels.flamingo.api.common.*;
import org.pushingpixels.flamingo.api.common.icon.EmptyResizableIcon;
import org.pushingpixels.flamingo.api.common.model.Command;
import org.pushingpixels.flamingo.api.common.model.CommandGroup;
import org.pushingpixels.flamingo.api.common.model.CommandPanelContentModel;
import org.pushingpixels.flamingo.api.common.model.CommandPanelPresentationModel;
import org.pushingpixels.flamingo.api.common.projection.CommandPanelProjection;
import org.pushingpixels.neon.api.NeonCortex;
import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.photon.api.icon.SvgBatikResizableIcon;
import org.pushingpixels.photon.api.transcoder.SvgStreamTranscoder;
import org.pushingpixels.photon.api.transcoder.java.JavaLanguageRenderer;

import javax.swing.*;
import java.awt.*;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Panel that hosts SVG-based gallery buttons.
 *
 * @author Kirill Grouchnikov
 */
public class SvgFileViewPanel extends JCommandButtonPanel {
    /**
     * Callback into the underlying breadcrumb bar.
     */
    private BreadcrumbBarCallBack<File> callback;

    /**
     * The main worker that loads the SVG images off EDT.
     */
    private SwingWorker<Void, StringValuePair<InputStream>> mainWorker;

    /**
     * Creates a new panel.
     *
     * @param callback          Callback into the underlying breadcrumb bar.
     * @param startingDimension Initial dimension for SVG icons.
     */
    public SvgFileViewPanel(BreadcrumbBarCallBack<File> callback, int startingDimension) {
        super(new CommandPanelProjection(new CommandPanelContentModel(new ArrayList<>()),
                CommandPanelPresentationModel.builder()
                        .setToShowGroupLabels(false)
                        .setLayoutKind(CommandPanelPresentationModel.LayoutKind.ROW_FILL)
                        .setCommandPresentationState(CommandButtonPresentationState.FIT_TO_ICON)
                        .setCommandIconDimension(startingDimension)
                        .build()));

        this.callback = callback;
    }

    /**
     * Sets the current files to show. The current contents of the panel are discarded. The file
     * list is scanned for files ending with <code>.svg</code> or <code>.svgz</code>. For each such
     * file a new {@link Command} with an SVG-based implementation of
     * {@link ResizableIcon} is added to the panel content model.
     *
     * @param leafs Information on the files to show in the panel.
     */
    public void setFolder(final java.util.List<StringValuePair<File>> leafs) {
        this.getProjection().getContentModel().removeAllCommandGroups();

        List<Command> commands = new ArrayList<>();

        final Map<String, Command> newCommands = new HashMap<>();
        for (StringValuePair<File> leaf : leafs) {
            String name = leaf.getKey();
            if (!name.endsWith(".svg") && !name.endsWith(".svgz")) {
                continue;
            }

            Command svgCommand = Command.builder()
                    .setText(name.replace('-', ' '))
                    .setIconFactory(EmptyResizableIcon.factory())
                    .setAction(commandActionEvent -> {
                        try {
                            ResizableIcon icon = commandActionEvent.getCommand().getIconFactory().createNewIcon();
                            if (!(icon instanceof SvgBatikResizableIcon)) {
                                return;
                            }

                            SvgBatikResizableIcon svgIcon = (SvgBatikResizableIcon) icon;

                            System.out.println(name);
                            String svgClassName = name.substring(0, name.lastIndexOf('.'));
                            svgClassName = svgClassName.replace('-', '_');
                            svgClassName = svgClassName.replace(' ', '_');

                            String javaClassFilename = System.getProperty("java.io.tmpdir")
                                    + File.separator + svgClassName + ".java";

                            PrintWriter pw = new PrintWriter(javaClassFilename);

                            SvgStreamTranscoder transcoder = new SvgStreamTranscoder(
                                    new ByteArrayInputStream(svgIcon.getSvgBytes()), svgClassName,
                                    new JavaLanguageRenderer());

                            transcoder.setPrintWriter(pw);
                            transcoder.transcode(this.getClass().getResourceAsStream(
                                    "/org/pushingpixels/photon/api/transcoder/java" +
                                            "/SvgTranscoderTemplateResizable.templ"));
                            JOptionPane.showMessageDialog(
                                    SwingUtilities.getWindowAncestor(SvgFileViewPanel.this),
                                    "Finished with '" + javaClassFilename + "'");
                        } catch (Throwable exc) {
                            exc.printStackTrace();
                        }
                    })
                    .setActionRichTooltip(RichTooltip.builder().setTitle("Transcode")
                            .addDescriptionSection("Click to generate Java2D class").build())
                    .build();

            commands.add(svgCommand);

            newCommands.put(name, svgCommand);
        }

        this.getProjection().getContentModel().addCommandGroup(new CommandGroup(commands));

        mainWorker = new SwingWorker<Void, StringValuePair<InputStream>>() {
            @Override
            protected Void doInBackground() throws Exception {
                for (final StringValuePair<File> leafPair : leafs) {
                    if (isCancelled()) {
                        break;
                    }
                    final String name = leafPair.getKey();
                    if (!name.endsWith(".svg") && !name.endsWith(".svgz")) {
                        continue;
                    }
                    InputStream stream = callback.getLeafContent(leafPair.getValue());
                    StringValuePair<InputStream> pair = new StringValuePair<>(name, stream);
                    publish(pair);
                }
                return null;
            }

            @Override
            protected void process(List<StringValuePair<InputStream>> pairs) {
                for (final StringValuePair<InputStream> pair : pairs) {
                    final String name = pair.getKey();
                    InputStream svgStream = pair.getValue();
                    int iconDimension = getProjection().getPresentationModel()
                            .getCommandIconDimension();
                    Dimension svgDim = new Dimension(iconDimension, iconDimension);

                    double scale = NeonCortex.getScaleFactor(SvgFileViewPanel.this);
                    final SvgBatikResizableIcon svgIcon = name.endsWith(".svg")
                            ? SvgBatikResizableIcon.getSvgIcon(svgStream, scale, svgDim)
                            : SvgBatikResizableIcon.getSvgzIcon(svgStream, scale, svgDim);

                    newCommands.get(name).setIconFactory(() -> svgIcon);
                }
            }
        };
        mainWorker.execute();
    }

    /**
     * Changes the current dimension of all displayed icons.
     *
     * @param dimension New dimension for the icons.
     */
    public void setIconDimension(int dimension) {
        this.getProjection().getPresentationModel().setCommandIconDimension(dimension);
    }

    /**
     * Cancels the main worker.
     */
    public void cancelMainWorker() {
        if (this.mainWorker == null) {
            return;
        }
        if (this.mainWorker.isDone() || this.mainWorker.isCancelled()) {
            return;
        }
        this.mainWorker.cancel(false);
    }
}
