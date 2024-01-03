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
package org.pushingpixels.radiance.tools.svgtranscoder.gradle;

import org.gradle.api.DefaultTask;
import org.gradle.api.logging.Logger;
import org.pushingpixels.radiance.tools.svgtranscoder.api.*;

import java.io.File;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public abstract class TranscodeBaseTask extends DefaultTask {
    protected void transcodeAllFilesInFolder(File inputFolder, File outputFolder,
            String outputClassNamePrefix, String outputFileNameExtension,
            String outputPackageName, LanguageRenderer languageRenderer,
            String templateFileName) {
        Logger logger = getLogger();

        File[] svgFiles = inputFolder.listFiles((directory, name) -> name.endsWith(".svg"));
        if (svgFiles == null) {
            return;
        }
        for (File file : svgFiles) {
            String svgClassName = outputClassNamePrefix
                    + file.getName().substring(0, file.getName().length() - 4);
            svgClassName = svgClassName.replace('-', '_');
            svgClassName = svgClassName.replace(' ', '_');
            String classFilename =
                    outputFolder + File.separator + svgClassName + outputFileNameExtension;

            logger.trace("Processing " + file.getName());

            try (Writer pw = new PrintWriter(classFilename);
                 InputStream templateStream = SvgBatchBaseConverter.class
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
                // Limit the processing to 10 seconds to prevent infinite hang
                latch.await(10, TimeUnit.SECONDS);
            } catch (Exception e) {
                logger.error("Transcoding failed", e);
            }
        }
    }
}
