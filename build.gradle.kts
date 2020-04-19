buildscript {

    repositories {
        google()
        jcenter()
    }

    dependencies {
        classpath(Config.Plugins.gradleAndroid)
        classpath(Config.Plugins.gradleKotlin)
        classpath(Config.Plugins.googleServices)
    }
}

allprojects {

    repositories {
        google()
        jcenter()
        mavenCentral()
    }

    // Configure all gradle modules as android/library
    if ((group as String).isNotEmpty()) configureAndroid()
}


fun Project.configureAndroid() {

    if (name == "app") apply(plugin = "com.android.application") else apply(plugin = "com.android.library")

    configure<com.android.build.gradle.BaseExtension> {

        compileSdkVersion(Config.SdkVersions.compile)
        buildToolsVersion = Config.buildTools

        defaultConfig {

            minSdkVersion(Config.SdkVersions.min)
            targetSdkVersion(Config.SdkVersions.target)

            vectorDrawables.useSupportLibrary = true

            testInstrumentationRunner = Config.testRunner

            consumerProguardFiles("consumer-rules.pro")
        }

        sourceSets {
            getByName("main").java.srcDirs(Config.kotlinDir)
            getByName("test").java.srcDirs(Config.kotlinDir)
        }
    }

}