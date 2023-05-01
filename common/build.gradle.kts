plugins {
    id("org.springframework.boot")
    id("io.spring.dependency-management")
    kotlin("jvm")
    kotlin("plugin.spring")
    kotlin("plugin.jpa")
    kotlin("plugin.allopen")
    kotlin("plugin.noarg")
    kotlin("kapt")
}

java.sourceCompatibility = JavaVersion.VERSION_11
group = "me.yevgnenll"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
    jvmArgs(
        "--add-opens", "java.base/jdk.internal.misc=ALL-UNNAMED",
        "-Dio.netty.tryReflectionSetAccessible=true"
    )
}
