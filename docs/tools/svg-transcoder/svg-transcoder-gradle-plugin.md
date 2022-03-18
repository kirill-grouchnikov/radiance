## Gradle plugin for transcoding SVG content

The goal of this project is to allow build-time transcoding of SVG content into Java / Kotlin classes by wrapping [SVG transcoder APIs](svg-transcoder.md) and making them available for Gradle builds.

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-svg-transcoder-gradle-plugin/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-svg-transcoder-gradle-plugin) `radiance-svg-transcoder-gradle-plugin` for build instructions of the latest stable release.

### Using the plugin in your Gradle script

Add the plugin to the `buildscript` part of your Gradle build file and apply the plugin:

```groovy
buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath 'org.pushing-pixels:radiance-svg-transcoder-gradle-plugin:X.Y.Z'
    }
}

apply plugin: 'org.pushing-pixels.radiance.tools.svgtranscoder.gradle'
```

In case you want to use the latest snapshot version of the plugin, use the Sonatype repository:

```groovy
buildscript {
    repositories {
        maven {
            url 'https://oss.sonatype.org/content/repositories/snapshots'
        }
    }
    dependencies {
        classpath 'org.pushing-pixels:radiance-svg-transcoder-gradle-plugin:X.Y.Z-SNAPSHOT'
    }
}
```

### Transcoding SVG files from a single folder

For a Java project, generate Java classes with the plugin (add multiple `transcode` lambdas if you have more than one SVG content folder):

```groovy
compileJava.doFirst {
    transcode {
        inputDirectory = file('src/main/resources')
        outputDirectory = file('src/main/java/org/radiance/demo/svg')
        outputLanguage = 'java'
        outputPackageName = 'org.radiance.demo.svg'
        transcode()
    }
}
```

For a Kotlin project, generate Kotlin classes with the plugin (add multiple `transcode` lambdas if you have more than one SVG content folder):

```groovy
compileKotlin.doFirst {
    transcode {
        inputDirectory = file('src/main/resources')
        outputDirectory = file('src/main/java/org/radiance/demo/svg')
        outputLanguage = 'kotlin'
        outputPackageName = 'org.radiance.demo.svg'
        transcode()
    }
}
```

### Recursively transcoding SVG files under a folder

For a Java project, generate Java classes with the plugin (add multiple `transcodeDeep` lambdas if you have more than one SVG content root folder):

```groovy
compileJava.doFirst {
    transcodeDeep {
        inputRootDirectory = file('src/main/resources')
        outputRootDirectory = file('src/main/java/org/radiance/demo/svg')
        outputLanguage = 'java'
        outputRootPackageName = 'org.radiance.demo.svg'
        transcode()
    }
}
```

For a Kotlin project, generate Kotlin classes with the plugin (add multiple `transcodeDeep` lambdas if you have more than one SVG content root folder):

```groovy
compileKotlin.doFirst {
    transcodeDeep {
        inputRootDirectory = file('src/main/resources')
        outputRootDirectory = file('src/main/java/org/radiance/demo/svg')
        outputLanguage = 'kotlin'
        outputRootPackageName = 'org.radiance.demo.svg'
        transcode()
    }
}
```
### Additional notes

Note that using either `compileJava` or `compileKotlin` assumes that you have at least one "real" source file in your project so that these tasks are executed by Gradle. If you are planning to use the plugin in a module that will have only SVG content and the transcoded classes, you will need to use the `transcode` / `transcodeDeep` tasks in a different way (perhaps as a default task).

You also need to declare a dependency on the matching [common](../../common/common.md) version:

```groovy
dependencies {
    implementation 'org.pushing-pixels:radiance-common:X.Y.Z'
}
```
