plugins {
    kotlin("jvm") version "1.5.10"
}

group = "org.artemas"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.8.2")
    testImplementation("org.assertj:assertj-core:3.21.0")
}

tasks.withType<Test> {
    useJUnitPlatform()
}