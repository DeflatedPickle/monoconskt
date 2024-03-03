plugins {
    kotlin("jvm") version "1.9.22"
}

group = "com.deflatedpickle"

repositories {
    mavenCentral()
}

dependencies {
}

kotlin {
    sourceSets.all {
        languageSettings {
            languageVersion = "2.0"
        }
    }
}