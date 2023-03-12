package com.tatar.buildsrc

import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.kotlinStdlib() {
    implementation(Dependencies.Kotlin.stdlib)
}

fun DependencyHandler.coroutinesCore() {
    implementation(Dependencies.Kotlin.Coroutines.core)
}

fun DependencyHandler.coroutinesAndroid() {
    implementation(Dependencies.Kotlin.Coroutines.android)
}

fun DependencyHandler.androidX() {
    implementation(Dependencies.AndroidX.coreKtx)
    implementation(Dependencies.AndroidX.appCompat)
    implementation(Dependencies.AndroidX.constraintLayout)
    implementation(Dependencies.Other.materialComponents)
}

fun DependencyHandler.navigation() {
    implementation(Dependencies.AndroidX.Navigation.fragment)
    implementation(Dependencies.AndroidX.Navigation.ui)
}

fun DependencyHandler.hilt() {
    implementation(Dependencies.External.Hilt.implementation)
    kapt(Dependencies.External.Hilt.compiler)
}

fun DependencyHandler.retrofit() {
    implementation(Dependencies.External.Retrofit.implementation)
    implementation(Dependencies.External.Retrofit.moshiConverter)
}

fun DependencyHandler.moshi() {
    implementation(Dependencies.External.Moshi.implementation)
    implementation(Dependencies.External.Moshi.kotlin)
}

fun DependencyHandler.lifecycle() {
    implementation(Dependencies.AndroidX.LifeCycle.viewModel)
    implementation(Dependencies.AndroidX.LifeCycle.liveData)
    implementation(Dependencies.AndroidX.LifeCycle.compiler)
    implementation(Dependencies.AndroidX.LifeCycle.savedState)
    implementation(Dependencies.AndroidX.LifeCycle.extensions)
}

fun DependencyHandler.room() {
    implementation(Dependencies.AndroidX.Room.implementation)
    implementation(Dependencies.AndroidX.Room.extensions)
    kapt(Dependencies.AndroidX.Room.compiler)
    androidTestImplementation(Dependencies.AndroidX.Room.test)
}

fun DependencyHandler.androidxTest() {
    androidTestImplementation(Dependencies.AndroidX.Test.jUnitExt)
    androidTestImplementation(Dependencies.AndroidX.Test.espresso)
}

fun DependencyHandler.javaApiDesugaring() {
    add("coreLibraryDesugaring", Dependencies.Other.deSugaringLib)
}

fun DependencyHandler.test() {
    testImplementation(Dependencies.External.Test.jUnit)
}

fun DependencyHandler.timber() {
    implementation(Dependencies.External.Timber.implementation)
}

fun DependencyHandler.inject() {
    implementation(Dependencies.Other.inject)
}

private fun DependencyHandler.implementation(dependency: Dependency) {
    add("implementation", dependency)
}

private fun DependencyHandler.implementation(depName: String) {
    add("implementation", depName)
}

private fun DependencyHandler.testImplementation(depName: String) {
    add("testImplementation", depName)
}

private fun DependencyHandler.androidTestImplementation(depName: String) {
    add("androidTestImplementation", depName)
}

private fun DependencyHandler.kapt(depName: String) {
    add("kapt", depName)
}