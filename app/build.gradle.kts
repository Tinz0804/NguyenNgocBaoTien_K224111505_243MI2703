plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.baotien.nguyenngocbaotien_k224111505_243mi2703"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.baotien.nguyenngocbaotien_k224111505_243mi2703"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    // Glide
    implementation(libs.glide)
    annotationProcessor(libs.glide.compiler)

    // Android UI components
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)

    // Testing
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}
