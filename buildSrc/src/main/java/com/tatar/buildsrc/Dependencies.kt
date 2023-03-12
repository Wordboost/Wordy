package com.tatar.buildsrc

object Dependencies {

    object Kotlin {
        private const val version = "1.8.0"

        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:$version"

        object Coroutines {
            private const val version = "1.6.4"

            const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
            const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
        }
    }

    object AndroidX {
        const val coreKtx = "androidx.core:core-ktx:1.9.0"
        const val appCompat = "androidx.appcompat:appcompat:1.6.1"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.1.4"

        object Navigation {
            private const val version = "2.5.3"

            const val fragment = "androidx.navigation:navigation-fragment-ktx:$version"
            const val ui = "androidx.navigation:navigation-ui-ktx:$version"
            const val safeArgs = "androidx.navigation:navigation-safe-args-gradle-plugin:$version"
        }

        object LifeCycle {
            private const val version = "2.5.1"

            const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"
            const val compiler = "androidx.lifecycle:lifecycle-common-java8:$version"
            const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:$version"
            const val savedState = "androidx.lifecycle:lifecycle-viewmodel-savedstate:$version"
            const val extensions = "androidx.lifecycle:lifecycle-extensions:2.2.0"
        }

        object Room {
            private const val version = "2.5.0"

            const val implementation = "androidx.room:room-runtime:$version"
            const val compiler = "androidx.room:room-compiler:$version"
            const val test = "androidx.room:room-testing:$version"
            const val extensions = "androidx.room:room-ktx:$version"
        }

        object Test {
            const val jUnitExt = "androidx.test.ext:junit:1.1.5"
            const val espresso = "androidx.test.espresso:espresso-core:3.5.1"
        }
    }

    object External {
        object Hilt {
            private const val version = "2.44"

            const val implementation = "com.google.dagger:hilt-android:$version"
            const val compiler = "com.google.dagger:hilt-compiler:$version"
        }

        object Retrofit {
            private const val version = "2.9.0"

            const val implementation = "com.squareup.retrofit2:retrofit:$version"
            const val moshiConverter = "com.squareup.retrofit2:converter-moshi:$version"
        }

        object Moshi {
            private const val version = "1.14.0"

            const val implementation = "com.squareup.moshi:moshi:$version"
            const val kotlin = "com.squareup.moshi:moshi-kotlin:$version"
        }

        object Test {
            const val jUnit = "junit:junit:4.13.2"
        }

        object Timber {
            private const val version = "4.7.1"

            const val implementation = "com.jakewharton.timber:timber:$version"
        }
    }

    object Other {
        const val materialComponents = "com.google.android.material:material:1.8.0"
        const val deSugaringLib = "com.android.tools:desugar_jdk_libs:1.1.0"
        const val inject = "javax.inject:javax.inject:1"
    }
}