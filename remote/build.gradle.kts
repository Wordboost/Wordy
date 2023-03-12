import com.tatar.buildsrc.*

plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
    kotlin("kapt")
}

java {
    sourceCompatibility = AppConfig.sourceCompatibility
    targetCompatibility = AppConfig.targetCompatibility
}

dependencies {
    implementation(project(":core"))
    implementation(project(":data"))

    kotlinStdlib()
    coroutinesCore()
    test()
    inject()
    moshi()
    retrofit()
}