// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    extra.set("kotlinVersion", "1.4.31")

    repositories {
        google()
        jcenter()
    }

    dependencies {
        val kotlinVersion = rootProject.extra.get("kotlinVersion")

        classpath("com.android.tools.build:gradle:4.1.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")

        // NOTE: Do not place your application dependencies here they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        jcenter()
        google()
//        todo: Remove this after publishing the client library
        mavenLocal()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
