
plugins {
  id("com.android.application")
  id("kotlin-android")
  id("kotlin-kapt")
  id("kotlin-android-extensions")
}

android {
  compileSdkVersion(Versions.Android.compileSdk)

  dataBinding {
    isEnabled = true
  }

  dexOptions {
    javaMaxHeapSize = "2g"
  }

  defaultConfig {
    minSdkVersion(Versions.Android.minSdk)
    targetSdkVersion(Versions.Android.targetSdk)

    applicationId = "com.skunk.business"

    versionCode = 1
    versionName = "0.1.0"

    vectorDrawables.useSupportLibrary = true
  }

  buildTypes {
    getByName("release") {
      isMinifyEnabled = false
      proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
    }
    getByName("debug") {
      isDebuggable = true
      applicationIdSuffix = ".debug"
    }
  }

  packagingOptions {
    exclude("META-INF/*.kotlin_module")
  }
}

dependencies {
  implementation(Deps.Libs.Android.kotlinStdLib.name)
  implementation(Deps.Libs.Android.appCompat.name)
  implementation(project(":mpp-library"))
}
