/*
 * Copyright (c) 2005-2022 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.tools.svgtranscoder.api;

import java.io.File;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public abstract class SvgBatchBaseConverter {
    protected static final String CHECK_DOCUMENTATION = "Check the documentation for the parameters to pass";

    protected String getInputArgument(String[] args, String argumentName, String defaultValue) {
        for (String arg : args) {
            String[] split = arg.split("=");
            if (split.length != 2) {
                System.out.println("Argument '" + arg + "' unsupported");
                System.out.println(CHECK_DOCUMENTATION);
                System.exit(1);
            }
            if (split[0].compareTo(argumentName) == 0) {
                return split[1];
            }
        }
        return defaultValue;
    }

    protected void transcodeAllFilesInFolder(File inputFolder, File outputFolder,
            String outputClassNamePrefix, String outputFileNameExtension,
            String outputPackageName, LanguageRenderer languageRenderer,
            String templateFile) {

        File[] svgFiles = inputFolder.listFiles((directory, name) -> name.endsWith(".svg"));
        if (svgFiles == null) {
            return;
        }
        for (File file : svgFiles) {
            final String filename = file.getName();
            final String svgClassName = (outputClassNamePrefix + filename.substring(0, filename.length() - 4))
                    .replace('-', '_')
                    .replace(' ', '_');

            final String classFilename = outputFolder.getAbsolutePath() + File.separator +
                    svgClassName + outputFileNameExtension;
            System.out.println("Processing " + file.getAbsolutePath() + "\n\tto " + classFilename);

            try (Writer writer = new PrintWriter(classFilename);
                 InputStream templateStream = SvgBatchBaseConverter.class.getResourceAsStream(templateFile)) {
                Objects.requireNonNull(templateStream, "Couldn't load " + templateFile);
                final CountDownLatch latch = new CountDownLatch(1);

                final String uri = file.toURI().toURL().toString();
                final SvgTranscoder transcoder = new SvgTranscoder(uri, svgClassName, languageRenderer);
                transcoder.setPackageName(outputPackageName);
                transcoder.setListener(new TranscoderListener() {
                    public Writer getWriter() {
                        return writer;
                    }

                    public void finished() {
                        latch.countDown();
                    }
                });
                transcoder.transcode(templateStream);
                // Limit the processing to 10 seconds to prevent infinite hang
                latch.await(10, TimeUnit.SECONDS);
            } catch (Throwable t) {
                t.printStackTrace(System.err);
            }
        }

        System.out.println();
    }
}
