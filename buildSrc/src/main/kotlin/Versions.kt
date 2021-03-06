
object Versions {
    object Android {
        const val compileSdk = 28
        const val targetSdk = 28
        const val minSdk = 21
    }

    const val kotlin = "1.3.50"

    object Plugins {
        const val kotlin = Versions.kotlin
        const val androidExtensions = Versions.kotlin
    }

    object Libs {
        object Android {
            const val kotlinStdLib = Versions.kotlin
            const val appCompat = "1.0.2"
        }

        object MultiPlatform {
            const val kotlinStdLib = Versions.kotlin
            const val uuid = "0.0.5"
            const val klock = "1.7.3"
            const val bigNum = "0.1.1"
            const val islandTime = "0.1.0-SNAPSHOT"
        }
    }
}