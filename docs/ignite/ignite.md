## Ignite - Gradle plugin for transcoding SVG content

### Overview

The goal of this project is to allow build-time transcoding of SVG content into Java / Kotlin classes.

### Using Ignite in your Gradle script

Add Ignite to the `buildscript` part of your Gradle build file and apply the plugin:

```groovy
buildscript {
    repositories {
        maven { url "https://oss.sonatype.org/content/repositories/snapshots" }
    }
    dependencies {
        classpath 'org.pushing-pixels:radiance-ignite:0.9-SNAPSHOT'
    }
}

apply plugin: 'org.pushing-pixels.ignite'
```

For a Java project, generate Java classes with Ignite (add multiple `ignite` lambdas if you have more than one SVG content folder):

```groovy
compileJava.doFirst {
    ignite {
        inputDirectory = file('src/main/resources')
        outputDirectory = file('src/main/java/org/radiance/demo/svg')
        outputLanguage = 'java'
        outputPackageName = 'org.radiance.demo.svg'
        useResizableTemplate = true
        transcode()
    }
}
```

For a Kotlin project, generate Kotlin classes with Ignite (add multiple `ignite` lambdas if you have more than one SVG content folder):

```groovy
compileKotlin.doFirst {
    ignite {
        inputDirectory = file('src/main/resources')
        outputDirectory = file('src/main/java/org/radiance/demo/svg')
        outputLanguage = 'kotlin'
        outputPackageName = 'org.radiance.demo.svg'
        useResizableTemplate = true
        transcode()
    }
}
```
