/*
 * Copyright (c) 2005-2020 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.photon.api.transcoder;

import org.pushingpixels.photon.api.transcoder.java.JavaLanguageRenderer;
import org.pushingpixels.photon.api.transcoder.kotlin.KotlinLanguageRenderer;

import java.io.*;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;

public class SvgBatchConverter {

    private static final String CHECK_DOCUMENTATION = "Check the documentation for the parameters to pass";

    private static String getInputArgument(String[] args, String argumentName, String defaultValue) {
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

    /**
     * @param args <ul>
     *             <li>sourceFolder=xyz - points to a folder with SVG images</li>
     *             <li>outputPackageName=xyz - the package name for the transcoded classes</li>
     *             <li>templateFile=xyz - the template file for creating the transcoded classes</li>
     *             <li>outputLanguage=java|kotlin - the language for the transcoded classes</li>
     *             <li>outputFolder=xyz - optional location of output files. If not specified,
     *             output files will be placed in the 'sourceFolder'</li>
     *             <li>outputClassNamePrefix=xyz - optional prefix for the class name of each
     *             transcoded class</li>
     *             </ul>
     */
    public static void main(String[] args) throws IOException {
        if (args.length < 4) {
            System.out.println(CHECK_DOCUMENTATION);
            System.exit(1);
        }

        String sourceFolderName = getInputArgument(args, "sourceFolder", null);
        Objects.requireNonNull(sourceFolderName, "Missing source folder. " + CHECK_DOCUMENTATION);

        String outputPackageName = getInputArgument(args, "outputPackageName", null);
        Objects.requireNonNull(outputPackageName, "Missing output package name. " + CHECK_DOCUMENTATION);

        String templateFile = getInputArgument(args, "templateFile", null);
        Objects.requireNonNull(templateFile, "Missing template file. " + CHECK_DOCUMENTATION);

        String outputLanguage = getInputArgument(args, "outputLanguage", null);
        Objects.requireNonNull(outputLanguage, "Missing output language. " + CHECK_DOCUMENTATION);

        final LanguageRenderer languageRenderer;
        final String outputFileNameExtension;
        if ("java".equals(outputLanguage)) {
            languageRenderer = new JavaLanguageRenderer();
            outputFileNameExtension = ".java";
        } else if ("kotlin".equals(outputLanguage)) {
            languageRenderer = new KotlinLanguageRenderer();
            outputFileNameExtension = ".kt";
        } else {
            throw new IllegalArgumentException("Output language must be either Java or Kotlin. " + CHECK_DOCUMENTATION);
        }

        String outputClassNamePrefix = getInputArgument(args, "outputClassNamePrefix", "");
        String outputFolderName = getInputArgument(args, "outputFolder", sourceFolderName);

        File inputFolder = new File(sourceFolderName);
        if (!inputFolder.exists()) {
            throw new FileNotFoundException(inputFolder.toString());
        }
        File outputFolder = new File(outputFolderName);
        if (!outputFolder.exists()) {
            throw new FileNotFoundException(outputFolder.toString());
        }

        System.out.println(
                "******************************************************************************");
        System.out.println("Processing");
        System.out.println("\t  source folder: " + sourceFolderName);
        System.out.println("\t   package name: " + outputPackageName);
        System.out.println("\toutput language: " + outputLanguage);
        System.out.println(
                "******************************************************************************");

        for (File file : inputFolder.listFiles((File dir, String name) -> name.endsWith(".svg"))) {
            String svgClassName = outputClassNamePrefix
                    + file.getName().substring(0, file.getName().length() - 4);
            svgClassName = svgClassName.replace('-', '_');
            svgClassName = svgClassName.replace(' ', '_');
            String classFilename = outputFolderName + File.separator +
                    svgClassName + outputFileNameExtension;

            System.err.println("Processing " + file.getName());

            try (PrintWriter pw = new PrintWriter(classFilename);
                 InputStream templateStream = SvgBatchConverter.class.getResourceAsStream(templateFile)) {
                Objects.requireNonNull(templateStream, "Couldn't load " + templateFile);
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
                e.printStackTrace();
            }
        }

        System.out.println();
    }
}
