pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        maven("https://maven.florianreuth.de/releases")
        maven("https://maven.fabricmc.net/")
    }

    plugins {
        id("net.fabricmc.fabric-loom") version "1.9.2"
        id("de.florianreuth.baseproject") version "2.0.2"
    }

    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "net.fabricmc.fabric-loom" || requested.id.id == "fabric-loom") {
                useModule("net.fabricmc:fabric-loom:1.9.2")
            }
        }
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

rootProject.name = "viafabricplus"

include("viafabricplus-api")
include("viafabricplus-visuals")
