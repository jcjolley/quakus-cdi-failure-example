plugins {
    kotlin("jvm") version "1.7.22"
    `java-library`
    id("org.kordamp.gradle.jandex") version "1.1.0"
}

dependencies {
    implementation("io.quarkus:quarkus-arc:2.16.2.Final")
}

group = "com.bean.example"