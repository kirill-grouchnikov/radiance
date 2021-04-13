
## Ignite - Gradle plugin for transcoding SVG content

The goal of this project is to allow build-time transcoding of SVG content into Java / Kotlin classes by wrapping [Photon APIs](../../photon/photon.md) and making them available for Gradle builds.

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-ignite/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-ignite) `radiance-ignite` for build instructions of the latest stable release.

### Using Ignite in your Gradle script

Add Ignite to the `buildscript` part of your Gradle build file and apply the plugin:

```groovy
buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath 'org.pushing-pixels:radiance-ignite:X.Y.Z'
    }
}

apply plugin: 'org.pushing-pixels.ignite'
```

In case you want to use the latest snapshot version of Ignite, use the Sonatype repository:

```groovy
buildscript {
    repositories {
        maven {
            url 'https://oss.sonatype.org/content/repositories/snapshots'
        }
    }
    dependencies {
        classpath 'org.pushing-pixels:radiance-ignite:X.Y.Z-SNAPSHOT'
    }
}
```

### Transcoding SVG files from a single folder

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

### Recursively transcoding SVG files under a folder

For a Java project, generate Java classes with Ignite (add multiple `igniteDeep` lambdas if you have more than one SVG content root folder):

```groovy
compileJava.doFirst {
    igniteDeep {
        inputRootDirectory = file('src/main/resources')
        outputRootDirectory = file('src/main/java/org/radiance/demo/svg')
        outputLanguage = 'java'
        outputRootPackageName = 'org.radiance.demo.svg'
        useResizableTemplate = true
        transcode()
    }
}
```

For a Kotlin project, generate Kotlin classes with Ignite (add multiple `igniteDeep` lambdas if you have more than one SVG content root folder):

```groovy
compileKotlin.doFirst {
    igniteDeep {
        inputRootDirectory = file('src/main/resources')
        outputRootDirectory = file('src/main/java/org/radiance/demo/svg')
        outputLanguage = 'kotlin'
        outputRootPackageName = 'org.radiance.demo.svg'
        useResizableTemplate = true
        transcode()
    }
}
```
### Additional notes

Note that using either `compileJava` or `compileKotlin` assumes that you have at least one "real" source file in your project so that these tasks are executed by Gradle. If you are planning to use Ignite in a module that will have only SVG content and the transcoded classes, you will need to use the `ignite` / `igniteDeep` tasks in a different way (perhaps as a default task).

In case you are using `useResizableTemplate = true`, you would also need to declare a dependency on the matching [Neon](../../neon/neon.md) version:

```groovy
dependencies {
    implementation 'org.pushing-pixels:radiance-neon:X.Y.Z'
}
```
