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
package org.pushingpixels.radiance.tools.svgtranscoderplugin;

import org.gradle.api.logging.Logger;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.InputDirectory;
import org.gradle.api.tasks.TaskAction;
import org.gradle.api.tasks.options.Option;
import org.pushingpixels.radiance.tools.svgtranscoder.api.LanguageRenderer;
import org.pushingpixels.radiance.tools.svgtranscoder.api.java.JavaLanguageRenderer;
import org.pushingpixels.radiance.tools.svgtranscoder.api.kotlin.KotlinLanguageRenderer;

import java.io.File;

public class TranscodeTask extends TranscodeBaseTask {
    private String outputPackageName;

    private String outputLanguage;

    private String outputClassNamePrefix = "";

    private boolean useRadianceTemplate;

    private File inputDirectory;

    private File outputDirectory;

    @Input
    public String getOutputPackageName() {
        return outputPackageName;
    }

    @Option(option = "outputPackageName", description = "Configures the output package name.")
    public void setOutputPackageName(String outputPackageName) {
        this.outputPackageName = outputPackageName;
    }

    @Input
    public String getOutputLanguage() {
        return outputLanguage;
    }

    @Option(option = "outputLanguage", description = "Configures the output language.")
    public void setOutputLanguage(String outputLanguage) {
        this.outputLanguage = outputLanguage;
    }

    @Input
    public String getOutputClassNamePrefix() {
        return outputClassNamePrefix;
    }

    @Option(option = "outputClassNamePrefix", description = "Configures the output class name prefix.")
    public void setOutputClassNamePrefix(String outputClassNamePrefix) {
        this.outputClassNamePrefix = outputClassNamePrefix;
    }

    @Input
    public boolean isUseRadianceTemplate() {
        return useRadianceTemplate;
    }

    @Option(option = "useRadianceTemplate", description = "Configures the usage of Radiance template.")
    public void setUseRadianceTemplate(boolean useRadianceTemplate) {
        this.useRadianceTemplate = useRadianceTemplate;
    }

    @InputDirectory
    public File getInputDirectory() {
        return inputDirectory;
    }

    @Option(option = "inputDirectory", description = "Configures the input directory.")
    public void setInputDirectory(File inputDirectory) {
        this.inputDirectory = inputDirectory;
    }

    @InputDirectory
    public File getOutputDirectory() {
        return outputDirectory;
    }

    @Option(option = "outputDirectory", description = "Configures the output directory.")
    public void setOutputDirectory(File outputDirectory) {
        this.outputDirectory = outputDirectory;
    }

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
                + outputLanguage + "/" + "SvgTranscoderTemplate";
        templateFileName += (useRadianceTemplate ? "Radiance" : "Plain");
        templateFileName += ".templ";

        this.transcodeAllFilesInFolder(inputDirectory, outputDirectory,
                outputClassNamePrefix, outputFileNameExtension,
                outputPackageName, languageRenderer, templateFileName);
    }
}
