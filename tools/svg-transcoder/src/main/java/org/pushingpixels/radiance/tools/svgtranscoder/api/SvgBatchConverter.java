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
package org.pushingpixels.radiance.tools.svgtranscoder.api;

import org.pushingpixels.radiance.tools.svgtranscoder.api.java.JavaLanguageRenderer;
import org.pushingpixels.radiance.tools.svgtranscoder.api.kotlin.KotlinLanguageRenderer;

import java.io.File;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.Objects;
import java.util.stream.Stream;

public class SvgBatchConverter extends SvgBatchBaseConverter {
    public static void main(String[] args) throws IOException {
        if (args.length < 4) {
            System.out.println("=== Usage ===");
            Stream.of(
                    "java " + SvgBatchConverter.class.getCanonicalName(),
                    "  sourceFolder=xyz - points to a folder with SVG images",
                    "  outputPackageName=xyz - the package name for the transcoded classes",
                    "  templateFile=xyz - the template file for creating the transcoded classes",
                    "  outputLanguage=java|kotlin - the language for the transcoded classes",
                    "  outputFolder=xyz - optional location of output files. If not specified, output files will be placed in the 'sourceFolder'",
                    "  outputClassNamePrefix=xyz - optional prefix for the class name of each transcoded class"
            ).forEach(System.out::println);
            System.out.println(CHECK_DOCUMENTATION);
            System.exit(1);
        }

        SvgBatchConverter converter = new SvgBatchConverter();

        String sourceFolderName = converter.getInputArgument(args, "sourceFolder", null);
        Objects.requireNonNull(sourceFolderName, "Missing source folder. " + CHECK_DOCUMENTATION);

        String outputPackageName = converter.getInputArgument(args, "outputPackageName", null);
        Objects.requireNonNull(outputPackageName, "Missing output package name. " + CHECK_DOCUMENTATION);

        String templateFile = converter.getInputArgument(args, "templateFile", null);
        Objects.requireNonNull(templateFile, "Missing template file. " + CHECK_DOCUMENTATION);

        String outputLanguage = converter.getInputArgument(args, "outputLanguage", null);
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

        String outputClassNamePrefix = converter.getInputArgument(args, "outputClassNamePrefix", "");
        String outputFolderName = converter.getInputArgument(args, "outputFolder", sourceFolderName);

        File inputFolder = new File(sourceFolderName);
        if (!inputFolder.exists()) {
            throw new NoSuchFileException(sourceFolderName);
        }
        File outputFolder = new File(outputFolderName);
        if (!outputFolder.exists()) {
            throw new NoSuchFileException(outputFolderName);
        }

        System.out.println(
                "******************************************************************************");
        System.out.println("Processing");
        System.out.println("\tsource folder: " + sourceFolderName);
        System.out.println("\tpackage name: " + outputPackageName);
        System.out.println("\toutput language: " + outputLanguage);
        System.out.println(
                "******************************************************************************");

        converter.transcodeAllFilesInFolder(inputFolder, outputFolder, outputClassNamePrefix, outputFileNameExtension,
                outputPackageName, languageRenderer, templateFile);
    }
}
