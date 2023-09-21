plugins {
    kotlin("jvm") version "1.9.0"
    application
}

group = "com.github.galcyurio"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.github.ajalt.clikt:clikt:4.2.0")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("com.github.galcyurio.cli.MainKt")
}
