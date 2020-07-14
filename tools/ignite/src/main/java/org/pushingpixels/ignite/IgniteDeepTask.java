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
package org.pushingpixels.ignite;

import org.gradle.api.logging.Logger;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.InputDirectory;
import org.gradle.api.tasks.TaskAction;
import org.gradle.api.tasks.options.Option;
import org.pushingpixels.photon.api.transcoder.LanguageRenderer;
import org.pushingpixels.photon.api.transcoder.java.JavaLanguageRenderer;
import org.pushingpixels.photon.api.transcoder.kotlin.KotlinLanguageRenderer;

import java.io.File;

public class IgniteDeepTask extends IgniteBaseTask {
    private String outputRootPackageName;

    private String outputLanguage;

    private String outputClassNamePrefix = "";

    private boolean useResizableTemplate;

    private File inputRootDirectory;

    private File outputRootDirectory;

    @Input
    public String getOutputRootPackageName() {
        return outputRootPackageName;
    }

    @Option(option = "outputRootPackageName", description = "Configures the output root package name.")
    public void setOutputRootPackageName(String outputRootPackageName) {
        this.outputRootPackageName = outputRootPackageName;
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
    public boolean isUseResizableTemplate() {
        return useResizableTemplate;
    }

    @Option(option = "useResizableTemplate", description = "Configures the usage of resizable template.")
    public void setUseResizableTemplate(boolean useResizableTemplate) {
        this.useResizableTemplate = useResizableTemplate;
    }

    @InputDirectory
    public File getInputRootDirectory() {
        return inputRootDirectory;
    }

    @Option(option = "inputRootDirectory", description = "Configures the input root directory.")
    public void setInputRootDirectory(File inputRootDirectory) {
        this.inputRootDirectory = inputRootDirectory;
    }

    @InputDirectory
    public File getOutputRootDirectory() {
        return outputRootDirectory;
    }

    @Option(option = "outputRootDirectory", description = "Configures the output root directory.")
    public void setOutputRootDirectory(File outputRootDirectory) {
        this.outputRootDirectory = outputRootDirectory;
    }

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

        String templateFileName = "/org/pushingpixels/photon/api/transcoder/" + outputLanguage + "/"
                + "SvgTranscoderTemplate";
        templateFileName += (useResizableTemplate ? "Resizable" : "Plain");
        templateFileName += ".templ";

        processFolder(inputRootDirectory, outputRootDirectory, outputClassNamePrefix, outputFileNameExtension,
                outputRootPackageName, languageRenderer, templateFileName);
    }

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