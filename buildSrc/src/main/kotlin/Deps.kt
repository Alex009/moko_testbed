
object Deps {
    object Plugins {
        const val androidExtensions =
            "org.jetbrains.kotlin:kotlin-android-extensions:${Versions.Plugins.androidExtensions}"
    }

    object Libs {
        object Android {
            val kotlinStdLib = AndroidLibrary(
                name = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.Libs.Android.kotlinStdLib}"
            )
            val appCompat = AndroidLibrary(
                name = "androidx.appcompat:appcompat:${Versions.Libs.Android.appCompat}"
            )
        }

        object MultiPlatform {
            val kotlinStdLib = MultiPlatformLibrary(
                android = Android.kotlinStdLib.name,
                common = "org.jetbrains.kotlin:kotlin-stdlib-common:${Versions.Libs.MultiPlatform.kotlinStdLib}"
            )
            val mppUuid = MultiPlatformLibrary(
                common = "com.benasher44:uuid:${Versions.Libs.MultiPlatform.uuid}"
            )
            val klock = MultiPlatformLibrary(
                common = "com.soywiz.korlibs.klock:klock:${Versions.Libs.MultiPlatform.klock}"
            )
            val islandTime = MultiPlatformLibrary(
                common = "io.islandtime:core:${Versions.Libs.MultiPlatform.islandTime}"
               // android = "io.islandtime:core-jvm:${Versions.Libs.MultiPlatform.islandTime}",
               // iosArm64 = "io.islandtime:core-iosarm64 :${Versions.Libs.MultiPlatform.islandTime}",
               // iosX64 = "io.islandtime:core-iosx64:${Versions.Libs.MultiPlatform.islandTime}"
            )
            val stately = MultiPlatformLibrary(
                common = "co.touchlab:stately:0.9.3"
            )
            val statelyCollections = MultiPlatformLibrary(
                common = "co.touchlab:stately-collections:0.9.3"
            )
            val bigNum = MultiPlatformLibrary(
                common = "com.ionspin.kotlin:bignum:${Versions.Libs.MultiPlatform.bigNum}"
            )
        }
    }

    val plugins: Map<String, String> = mapOf(
        "kotlin-android-extensions" to Plugins.androidExtensions
    )
}