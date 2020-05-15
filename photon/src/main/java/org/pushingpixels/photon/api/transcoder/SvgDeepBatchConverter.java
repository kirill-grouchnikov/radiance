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

import java.io.File;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.Objects;
import java.util.stream.Stream;

public class SvgDeepBatchConverter extends SvgBatchBaseConverter {
    public static void main(String[] args) throws IOException {
        if (args.length < 4) {
            System.out.println("=== Usage ===");
            Stream.of(
                    "java " + SvgDeepBatchConverter.class.getCanonicalName(),
                    "  sourceRootFolder=xyz - points to the root folder to traverse for SVG images",
                    "  outputRootPackageName=xyz - the root package name for the transcoded classes",
                    "  templateFile=xyz - the template file for creating the transcoded classes",
                    "  outputLanguage=java|kotlin - the language for the transcoded classes",
                    "  outputRootFolder=xyz - optional root location of output files. If not specified, output files will be placed under the 'sourceRootFolder'",
                    "  outputClassNamePrefix=xyz - optional prefix for the class name of each transcoded class"
            ).forEach(System.out::println);
            System.out.println(CHECK_DOCUMENTATION);
            System.exit(1);
        }

        SvgDeepBatchConverter converter = new SvgDeepBatchConverter();

        String sourceRootFolderName = converter.getInputArgument(args, "sourceRootFolder", null);
        Objects.requireNonNull(sourceRootFolderName, "Missing source folder. " + CHECK_DOCUMENTATION);

        String outputRootPackageName = converter.getInputArgument(args, "outputRootPackageName", null);
        Objects.requireNonNull(outputRootPackageName, "Missing output package name. " + CHECK_DOCUMENTATION);

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
        String outputRootFolderName = converter.getInputArgument(args, "outputRootFolder", sourceRootFolderName);

        File inputRootFolder = new File(sourceRootFolderName);
        if (!inputRootFolder.exists()) {
            throw new NoSuchFileException(sourceRootFolderName);
        }
        File outputRootFolder = new File(outputRootFolderName);
        if (!outputRootFolder.exists()) {
            throw new NoSuchFileException(outputRootFolderName);
        }

        System.out.println(
                "******************************************************************************");
        System.out.println("Processing");
        System.out.println("\tsource root folder: " + sourceRootFolderName);
        System.out.println("\troot package name: " + outputRootPackageName);
        System.out.println("\toutput language: " + outputLanguage);
        System.out.println(
                "******************************************************************************");
        System.out.println();

        converter.processFolder(inputRootFolder, outputRootFolder, outputClassNamePrefix, outputFileNameExtension,
                outputRootPackageName, languageRenderer, templateFile);
    }

    protected void processFolder(File inputFolder, File outputFolder,
            String outputClassNamePrefix, String outputFileNameExtension,
            String outputPackageName, LanguageRenderer languageRenderer,
            String templateFile) {

        System.out.println(
                "******************************************************************************");
        System.out.println("Processing");
        System.out.println("\tsource folder: " + inputFolder.getAbsolutePath());
        System.out.println("\tpackage name: " + outputPackageName);
        System.out.println(
                "******************************************************************************");

        // Transcode all SVG files in this folder
        transcodeAllFilesInFolder(inputFolder, outputFolder, outputClassNamePrefix, outputFileNameExtension,
                outputPackageName, languageRenderer, templateFile);

        // Now scan the folder for sub-folders
        for (File inputSubfolder : inputFolder.listFiles((File dir, String name) -> new File(dir, name).isDirectory())) {
            String subfolderName = inputSubfolder.getName();
            System.out.println("Going into sub-folder " + subfolderName);

            // Mirror the input subfolder structure to the output
            File outputSubfolder = new File(outputFolder, subfolderName);
            if (!outputSubfolder.exists()) {
                outputSubfolder.mkdir();
            }

            // And recursively process SVG content (and possible folders)
            processFolder(inputSubfolder, outputSubfolder, outputClassNamePrefix, outputFileNameExtension,
                    outputPackageName + "." + subfolderName, languageRenderer,
                    templateFile);
        }
        System.out.println();
    }
}
