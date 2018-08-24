package org.pushingpixels.hibiscus;

import org.gradle.api.DefaultTask;
import org.gradle.api.logging.Logger;
import org.gradle.api.tasks.*;
import org.pushingpixels.ibis.transcoder.*;
import org.pushingpixels.ibis.transcoder.java.JavaLanguageRenderer;
import org.pushingpixels.ibis.transcoder.kotlin.KotlinLanguageRenderer;

import java.io.*;
import java.util.concurrent.CountDownLatch;

public class HibiscusTask extends DefaultTask {
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

        if (!inputDirectory.exists()) {
            return;
        }

        boolean renderAsKotlinCode = ("kotlin".compareTo(outputLanguage) == 0);

        LanguageRenderer languageRenderer = renderAsKotlinCode
                ? new KotlinLanguageRenderer()
                : new JavaLanguageRenderer();
        String outputFileNameExtension = ("java".compareTo(outputLanguage) == 0) ? ".java" : ".kt";

        logger.trace("Processing " + inputDirectory.getAbsolutePath() + " to " + outputPackageName + " in "
                + outputLanguage);

        String templateFileName = "/org/pushingpixels/ibis/transcoder/" + outputLanguage + "/"
                + "SvgTranscoderTemplate";
        templateFileName += (useResizableTemplate ? "Resizable" : "Plain");
        templateFileName += ".templ";

        for (File file : inputDirectory.listFiles((File dir, String name) -> name.endsWith(".svg"))) {
            String svgClassName = outputClassNamePrefix
                    + file.getName().substring(0, file.getName().length() - 4);
            svgClassName = svgClassName.replace('-', '_');
            svgClassName = svgClassName.replace(' ', '_');
            String classFilename = outputDirectory + File.separator + svgClassName + outputFileNameExtension;

            logger.trace("Processing " + file.getName());

            try (PrintWriter pw = new PrintWriter(classFilename);
                 InputStream templateStream = SvgBatchConverter.class
                         .getResourceAsStream(templateFileName)) {
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
                if (templateStream == null) {
                    logger.error("Couldn't load " + templateFileName);
                    return;
                }
                transcoder.transcode(templateStream);
                latch.await();
            } catch (Exception e) {
                logger.error("Transcoding failed", e);
            }
        }
    }
}