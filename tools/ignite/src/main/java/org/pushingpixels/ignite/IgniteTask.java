/*
 * Copyright (c) 2018 Radiance Ignite Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Radiance Ignite Kirill Grouchnikov nor the names of
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
package org.pushingpixels.ignite;

import org.gradle.api.DefaultTask;
import org.gradle.api.logging.Logger;
import org.gradle.api.tasks.*;
import org.pushingpixels.photon.transcoder.*;
import org.pushingpixels.photon.transcoder.java.JavaLanguageRenderer;
import org.pushingpixels.photon.transcoder.kotlin.KotlinLanguageRenderer;

import java.io.*;
import java.util.concurrent.CountDownLatch;

public class IgniteTask extends DefaultTask {
    @Input
    public String outputPackageName;

    @Input
    public String outputLanguage;

    @Input
    public String outputClassNamePrefix = "";

    @Input
    public boolean useResizableTemplate;

    @InputDirectory
    public File inputDirectory;

    @InputDirectory
    public File outputDirectory;

    @TaskAction
    public void transcode() {
        Logger logger = getLogger();

        logger.trace("Working on files in " + inputDirectory.getAbsolutePath());

        if (!this.inputDirectory.exists()) {
            return;
        }

        this.outputDirectory.mkdirs();

        boolean renderAsKotlinCode = ("kotlin".compareTo(outputLanguage) == 0);

        LanguageRenderer languageRenderer = renderAsKotlinCode
                ? new KotlinLanguageRenderer()
                : new JavaLanguageRenderer();
        String outputFileNameExtension = ("java".compareTo(outputLanguage) == 0) ? ".java" : ".kt";

        logger.trace(
                "Processing " + inputDirectory.getAbsolutePath() + " to " + outputPackageName +
                        " in " + outputLanguage);

        String templateFileName = "/org/pushingpixels/photon/transcoder/" + outputLanguage + "/"
                + "SvgTranscoderTemplate";
        templateFileName += (useResizableTemplate ? "Resizable" : "Plain");
        templateFileName += ".templ";

        for (File file : inputDirectory.listFiles(
                (File dir, String name) -> name.endsWith(".svg"))) {
            String svgClassName = outputClassNamePrefix
                    + file.getName().substring(0, file.getName().length() - 4);
            svgClassName = svgClassName.replace('-', '_');
            svgClassName = svgClassName.replace(' ', '_');
            String classFilename =
                    outputDirectory + File.separator + svgClassName + outputFileNameExtension;

            logger.trace("Processing " + file.getName());

            try (PrintWriter pw = new PrintWriter(classFilename);
                 InputStream templateStream = SvgBatchConverter.class
                         .getResourceAsStream(templateFileName)) {
                if (templateStream == null) {
                    logger.error("Couldn't load " + templateFileName);
                    return;
                }

                final CountDownLatch latch = new CountDownLatch(1);

                SvgTranscoder transcoder = new SvgTranscoder(file.toURI().toURL().toString(),
                        svgClassName, languageRenderer);
                transcoder.setPackageName(outputPackageName);
                transcoder.setListener(new TranscoderListener() {
                    public Writer getWriter() {
                        return pw;
                    }

                    public void finished() {
                        latch.countDown();
                    }
                });
                transcoder.transcode(templateStream);
                latch.await();
            } catch (Exception e) {
                logger.error("Transcoding failed", e);
            }
        }
    }
}