plugins {
    id("java")
}

group = "me.yevgnenll"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":common"))

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("io.kotest:kotest-runner-junit5-jvm:4.6.0")
}

tasks.test {
    useJUnitPlatform()
}