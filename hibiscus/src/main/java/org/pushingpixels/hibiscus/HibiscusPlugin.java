package org.pushingpixels.hibiscus;

import org.gradle.api.*;

public class HibiscusPlugin implements Plugin<Project> {

    public void apply(Project project) {
        project.getTasks().create("hibiscus", HibiscusTask.class);
    }

}