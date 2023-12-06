plugins {
    kotlin("jvm") version "1.6.10"
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    // Example: Adding a potentially vulnerable package
    // implementation("com.example:vulnerable-package:1.0.0")
}

tasks.test {
    useJUnitPlatform()
}

