
plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.multiplatform")
    id("kotlin-android-extensions")
    id("dev.icerock.mobile.multiplatform")
}

android {
    compileSdkVersion(Versions.Android.compileSdk)

    defaultConfig {
        minSdkVersion(Versions.Android.minSdk)
        targetSdkVersion(Versions.Android.targetSdk)
    }
}

dependencies {
   // mppLibrary(Deps.Libs.MultiPlatform.kotlinStdLib)
   // mppLibrary(Deps.Libs.MultiPlatform.mppUuid)
    //mppLibrary(Deps.Libs.MultiPlatform.klock)
    //mppLibrary(Deps.Libs.MultiPlatform.islandTime)
    //mppLibrary(Deps.Libs.MultiPlatform.stately)
    //mppLibrary(Deps.Libs.MultiPlatform.statelyCollections)
   // mppLibrary(Deps.Libs.MultiPlatform.bigNum)
}
