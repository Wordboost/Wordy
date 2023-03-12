import com.tatar.buildsrc.AppConfig

plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
}

java {
    sourceCompatibility = AppConfig.sourceCompatibility
    targetCompatibility = AppConfig.targetCompatibility
}