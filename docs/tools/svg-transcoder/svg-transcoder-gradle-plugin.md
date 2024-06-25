## Gradle plugin for transcoding SVG content

The goal of this project is to allow build-time transcoding of SVG content into Java / Kotlin classes by wrapping [SVG transcoder APIs](svg-transcoder.md) and making them available for Gradle builds.

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-svg-transcoder-gradle-plugin/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-svg-transcoder-gradle-plugin) `radiance-svg-transcoder-gradle-plugin` for build instructions of the latest stable release.

### Using the plugin in your Gradle script, Groovy DSL flavor

The instructions in this section apply to the build script written in Groovy, usually placed in the `build.gradle` file.

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

#### Transcoding SVG files from a single folder

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

#### Recursively transcoding SVG files under a folder

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

#### Additional notes

Note that using either `compileJava` or `compileKotlin` assumes that you have at least one "real" source file in your project so that these tasks are executed by Gradle. If you are planning to use the plugin in a module that will have only SVG content and the transcoded classes, you will need to use the `transcode` / `transcodeDeep` tasks in a different way (perhaps as a default task).

You also need to declare a dependency on the matching [common](../../common/common.md) version in order to compile the transcoded classes:

```groovy
dependencies {
    implementation 'org.pushing-pixels:radiance-common:X.Y.Z'
}
```

### Using the plugin in your Gradle script, Kotlin DSL flavor

The instructions in this section apply to the build script written in Kotlin, usually placed in the `build.gradle.kts` file.

Add the plugin to the `buildscript` part of your Gradle build file:

```kotlin
import org.pushingpixels.radiance.tools.svgtranscoder.gradle.TranscodeTask
import org.pushingpixels.radiance.tools.svgtranscoder.gradle.TranscodeDeepTask

buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("org.pushing-pixels:radiance-svg-transcoder-gradle-plugin:X.Y.Z")
    }
}
```

In case you want to use the latest snapshot version of the plugin, use the Sonatype repository:

```kotlin
buildscript {
    repositories {
        maven { url = uri("https://oss.sonatype.org/content/repositories/snapshots") }
    }
    dependencies {
        classpath("org.pushing-pixels:radiance-svg-transcoder-gradle-plugin:X.Y.Z-SNAPSHOT")
    }
}
```

#### Optionally place the generated files in a separate source folder

Mark `src/gen/java` (or similarly named folder) to contain generated sources:

```kotlin
idea {
    module {
        generatedSourceDirs.add(file("$rootDir/src/gen/java"))
    }
}
```

And add them as source set alongside your main code:

```kotlin
java {
    sourceSets {
        java {
            sourceSets["main"].apply {
                java.srcDir("$rootDir/src/main/java")
                java.srcDir("$rootDir/src/gen/java")
            }
        }
    }
}
```

#### Transcoding SVG files from a single folder

For a Java project, generate Java classes with the plugin (add multiple `tasks.create<TranscodeTask>` if you have more than one SVG content folder):

```kotlin
tasks.register<org.pushingpixels.radiance.tools.svgtranscoder.gradle.TranscodeDeepTask>("transcodeSingle") {
    inputDirectory = file("src/main/resources")
    outputDirectory = file("src/gen/java/org/radiance/demo/svg")
    outputLanguage = "java"
    outputPackageName = "org.radiance.demo.svg"
    transcode()
}

tasks.withType<JavaCompile> {
    dependsOn("transcodeSingle")
}
```

For a Kotlin project, generate Kotlin classes with the plugin (add multiple `tasks.create<TranscodeTask>` if you have more than one SVG content folder):

```kotlin
tasks.register<org.pushingpixels.radiance.tools.svgtranscoder.gradle.TranscodeDeepTask>("transcodeSingle") {
    inputDirectory = file("src/main/resources")
    outputDirectory = file("src/gen/java/org/radiance/demo/svg")
    outputLanguage = "kotlin"
    outputPackageName = "org.radiance.demo.svg"
    transcode()
}

tasks.withType<KotlinCompile> {
    dependsOn("transcodeSingle")
}
```

#### Recursively transcoding SVG files under a folder

For a Java project, generate Java classes with the plugin (add multiple `tasks.create<TranscodeDeepTask>` if you have more than one SVG content root folder):

```kotlin
tasks.register<org.pushingpixels.radiance.tools.svgtranscoder.gradle.TranscodeDeepTask>("transcodeDeep") {
    inputRootDirectory = file("src/main/resources")
    outputRootDirectory = file("src/gen/java/org/radiance/demo/svg")
    outputRootPackageName = "org.radiance.demo.svg"
    outputLanguage = "java"
    transcode()
}

tasks.withType<JavaCompile> {
    dependsOn("transcodeDeep")
}
```

For a Kotlin project, generate Kotlin classes with the plugin (add multiple `tasks.create<TranscodeDeepTask>` if you have more than one SVG content root folder):

```kotlin
tasks.register<org.pushingpixels.radiance.tools.svgtranscoder.gradle.TranscodeDeepTask>("transcodeDeep") {
    inputRootDirectory = file("src/main/resources")
    outputRootDirectory = file("src/gen/java/org/radiance/demo/svg")
    outputRootPackageName = "org.radiance.demo.svg"
    outputLanguage = "kotlib"
    transcode()
}

tasks.withType<KotlinCompile> {
    dependsOn("transcodeDeep")
}
```

#### Additional notes

Note that using either `compileJava` or `compileKotlin` assumes that you have at least one "real" source file in your project so that these tasks are executed by Gradle. If you are planning to use the plugin in a module that will have only SVG content and the transcoded classes, you will need to use the `TranscodeTask` / `TranscodeDeepTask` tasks in a different way (perhaps as a default task).

You also need to declare a dependency on the matching [common](../../common/common.md) version in order to compile the transcoded classes:

```kotlin
dependencies {
    implementation("org.pushing-pixels:radiance-common:X.Y.Z")
}
```
