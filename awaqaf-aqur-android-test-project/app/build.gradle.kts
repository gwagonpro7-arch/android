plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.awaqafaqur.app"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.awaqafaqur.app"
        minSdk = 23
        targetSdk = 36
        versionCode = 1
        versionName = "0.1"
    }
}
