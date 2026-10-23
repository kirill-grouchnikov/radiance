/*
 * Copyright (c) 2005-2026 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import org.gradle.api.logging.Logger;
import org.gradle.api.tasks.*;
import org.gradle.api.tasks.options.Option;
import org.pushingpixels.radiance.tools.svgtranscoder.api.LanguageRenderer;
import org.pushingpixels.radiance.tools.svgtranscoder.api.java.JavaLanguageRenderer;
import org.pushingpixels.radiance.tools.svgtranscoder.api.kotlin.KotlinLanguageRenderer;

import java.io.File;

/**
 * Gradle task that recursively transcodes all SVG files in a folder tree into Java or Kotlin source files.
 * <p>
 * Mirrors the input folder hierarchy as package structure in the output, so that sub-folders
 * become sub-packages.
 *
 * @author Kirill Grouchnikov.
 */
@CacheableTask
public class TranscodeDeepTask extends TranscodeBaseTask {
    private String outputRootPackageName;

    private String outputLanguage;

    private String outputClassNamePrefix = "";

    private File inputRootDirectory;

    private File outputRootDirectory;

    /**
     * Returns the root package name for the generated classes.
     *
     * @return The root package name.
     */
    @Input
    public String getOutputRootPackageName() {
        return outputRootPackageName;
    }

    /**
     * Sets the root package name for the generated classes.
     *
     * @param outputRootPackageName The root package name.
     */
    @Option(option = "outputRootPackageName", description = "Configures the output root package name.")
    public void setOutputRootPackageName(String outputRootPackageName) {
        this.outputRootPackageName = outputRootPackageName;
    }

    /**
     * Returns the target output language ("java" or "kotlin").
     *
     * @return The output language.
     */
    @Input
    public String getOutputLanguage() {
        return outputLanguage;
    }

    /**
     * Sets the target output language ("java" or "kotlin").
     *
     * @param outputLanguage The output language.
     */
    @Option(option = "outputLanguage", description = "Configures the output language.")
    public void setOutputLanguage(String outputLanguage) {
        this.outputLanguage = outputLanguage;
    }

    /**
     * Returns the prefix for the generated class names.
     *
     * @return The class name prefix.
     */
    @Input
    public String getOutputClassNamePrefix() {
        return outputClassNamePrefix;
    }

    /**
     * Sets the prefix for the generated class names.
     *
     * @param outputClassNamePrefix The class name prefix.
     */
    @Option(option = "outputClassNamePrefix", description = "Configures the output class name prefix.")
    public void setOutputClassNamePrefix(String outputClassNamePrefix) {
        this.outputClassNamePrefix = outputClassNamePrefix;
    }

    /**
     * Returns the root input directory containing the SVG files.
     *
     * @return The root input directory.
     */
    @InputDirectory
    @PathSensitive(PathSensitivity.ABSOLUTE)
    public File getInputRootDirectory() {
        return inputRootDirectory;
    }

    /**
     * Sets the root input directory containing the SVG files.
     *
     * @param inputRootDirectory The root input directory.
     */
    @Option(option = "inputRootDirectory", description = "Configures the input root directory.")
    public void setInputRootDirectory(File inputRootDirectory) {
        this.inputRootDirectory = inputRootDirectory;
    }

    /**
     * Returns the root output directory where the transcoded files will be written.
     *
     * @return The root output directory.
     */
    @OutputDirectory
    public File getOutputRootDirectory() {
        return outputRootDirectory;
    }

    /**
     * Sets the root output directory where the transcoded files will be written.
     *
     * @param outputRootDirectory The root output directory.
     */
    @Option(option = "outputRootDirectory", description = "Configures the output root directory.")
    public void setOutputRootDirectory(File outputRootDirectory) {
        this.outputRootDirectory = outputRootDirectory;
    }

    /**
     * Executes the recursive transcoding: reads all SVG files from the input directory tree
     * and generates the corresponding Java or Kotlin source files, mirroring the folder
     * hierarchy as package structure.
     */
    @TaskAction
    public void transcode() {
        Logger logger = getLogger();

        logger.trace("Working on files in " + inputRootDirectory.getAbsolutePath());

        if (!this.inputRootDirectory.exists()) {
            return;
        }

        this.outputRootDirectory.mkdirs();

        boolean renderAsKotlinCode = ("kotlin".compareTo(outputLanguage) == 0);

        LanguageRenderer languageRenderer = renderAsKotlinCode
                ? new KotlinLanguageRenderer()
                : new JavaLanguageRenderer();
        String outputFileNameExtension = ("java".compareTo(outputLanguage) == 0) ? ".java" : ".kt";

        logger.trace("Processing " + inputRootDirectory.getAbsolutePath() + " to " + outputRootPackageName +
                " in " + outputLanguage);

        String templateFileName = "/org/pushingpixels/radiance/tools/svgtranscoder/api/"
                + outputLanguage + "/" + "SvgTranscoderTemplateRadiance.templ";

        processFolder(inputRootDirectory, outputRootDirectory, outputClassNamePrefix, outputFileNameExtension,
                outputRootPackageName, languageRenderer, templateFileName);
    }

    /**
     * Recursively processes a folder and all its sub-folders.
     *
     * @param inputFolder             Folder containing the SVG files.
     * @param outputFolder            Folder where the transcoded files will be written.
     * @param outputClassNamePrefix   Prefix for the generated class names.
     * @param outputFileNameExtension File extension for the generated files.
     * @param outputPackageName       Package name for the generated classes.
     * @param languageRenderer        Language renderer for the target language.
     * @param templateFile            Path to the template resource file.
     */
    protected void processFolder(File inputFolder, File outputFolder,
            String outputClassNamePrefix, String outputFileNameExtension,
            String outputPackageName, LanguageRenderer languageRenderer,
            String templateFile) {

        Logger logger = getLogger();
        logger.trace("Working on files in " + inputFolder.getAbsolutePath());

        // Transcode all SVG files in this folder
        transcodeAllFilesInFolder(inputFolder, outputFolder, outputClassNamePrefix, outputFileNameExtension,
                outputPackageName, languageRenderer, templateFile);

        // Now scan the folder for sub-folders
        for (File inputSubfolder : inputFolder.listFiles(
                (directory, name) -> new File(directory, name).isDirectory())) {
            String subfolderName = inputSubfolder.getName();
            logger.trace("Going into sub-folder " + subfolderName);

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
