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
 * Gradle task that transcodes all SVG files in a single folder into Java or Kotlin source files.
 * <p>
 * Configure the input and output directories, the target package name, and the output language
 * before running this task.
 *
 * @author Kirill Grouchnikov.
 */
@CacheableTask
public class TranscodeTask extends TranscodeBaseTask {
    /**
     * Creates a new transcoding task for a single folder.
     */
    public TranscodeTask() {
    }

    private String outputPackageName;

    private String outputLanguage;

    private String outputClassNamePrefix = "";

    private File inputDirectory;

    private File outputDirectory;

    /**
     * Returns the target package name for the generated classes.
     *
     * @return The package name.
     */
    @Input
    public String getOutputPackageName() {
        return outputPackageName;
    }

    /**
     * Sets the target package name for the generated classes.
     *
     * @param outputPackageName The package name.
     */
    @Option(option = "outputPackageName", description = "Configures the output package name.")
    public void setOutputPackageName(String outputPackageName) {
        this.outputPackageName = outputPackageName;
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
     * Returns the input directory containing the SVG files.
     *
     * @return The input directory.
     */
    @InputDirectory
    @PathSensitive(PathSensitivity.ABSOLUTE)
    public File getInputDirectory() {
        return inputDirectory;
    }

    /**
     * Sets the input directory containing the SVG files.
     *
     * @param inputDirectory The input directory.
     */
    @Option(option = "inputDirectory", description = "Configures the input directory.")
    public void setInputDirectory(File inputDirectory) {
        this.inputDirectory = inputDirectory;
    }

    /**
     * Returns the output directory where the transcoded files will be written.
     *
     * @return The output directory.
     */
    @OutputDirectory
    public File getOutputDirectory() {
        return outputDirectory;
    }

    /**
     * Sets the output directory where the transcoded files will be written.
     *
     * @param outputDirectory The output directory.
     */
    @Option(option = "outputDirectory", description = "Configures the output directory.")
    public void setOutputDirectory(File outputDirectory) {
        this.outputDirectory = outputDirectory;
    }

    /**
     * Executes the transcoding: reads all SVG files from the input directory and generates
     * the corresponding Java or Kotlin source files in the output directory.
     */
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

        logger.trace("Processing " + inputDirectory.getAbsolutePath() + " to " + outputPackageName +
                " in " + outputLanguage);

        String templateFileName = "/org/pushingpixels/radiance/tools/svgtranscoder/api/"
                + outputLanguage + "/" + "SvgTranscoderTemplateRadiance.templ";

        this.transcodeAllFilesInFolder(inputDirectory, outputDirectory,
                outputClassNamePrefix, outputFileNameExtension,
                outputPackageName, languageRenderer, templateFileName);
    }
}
