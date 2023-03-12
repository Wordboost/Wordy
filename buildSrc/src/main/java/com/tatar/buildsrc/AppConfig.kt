package com.tatar.buildsrc

import org.gradle.api.JavaVersion
import org.gradle.api.artifacts.dsl.DependencyHandler

object AppConfig {

    const val applicationId = "com.tatar.wordy"

    const val compileSdk = 33
    const val minSdk = 24
    const val targetSdk = 33

    const val kotlinJVMTarget = "1.8"
    val sourceCompatibility = JavaVersion.VERSION_1_8
    val targetCompatibility = JavaVersion.VERSION_1_8
}
