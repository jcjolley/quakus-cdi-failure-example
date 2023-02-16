plugins {
    kotlin("jvm") version "1.7.22"
    id("io.quarkus") version "2.16.2.Final"
    id("org.kordamp.gradle.jandex") version "1.1.0"
}

dependencies {
    implementation(enforcedPlatform("io.quarkus.platform:quarkus-bom:2.16.2.Final"))
    implementation("com.bean.example:auth")
    implementation("io.quarkus:quarkus-core:2.16.2.Final")
    implementation("io.quarkus:quarkus-arc:2.16.2.Final")
    implementation("io.quarkus:quarkus-kotlin:2.16.2.Final")
    implementation("io.quarkus:quarkus-resteasy-reactive-jackson:2.16.2.Final")

    testImplementation("io.quarkus:quarkus-junit5:2.16.2.Final")
}


group = "com.bean.example"
version = "1.0"

tasks.compileTestKotlin {
    dependsOn("jandex")
}