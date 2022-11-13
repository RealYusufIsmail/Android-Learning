buildscript {
    repositories { mavenCentral() }

    dependencies { classpath("org.jetbrains.dokka:dokka-base:1.7.20") }
}

plugins {
    kotlin("android") version "1.7.20"
    kotlin("plugin.allopen") version "1.7.20"
    id("com.android.library") version "7.3.0"
    id("org.jetbrains.dokka") version "1.7.20"
    id("com.diffplug.spotless") version "6.11.0"
    jacoco // code coverage reports
}