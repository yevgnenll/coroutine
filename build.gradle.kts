import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "me.yevgnenll"
version = "1.0-SNAPSHOT"

plugins {
    id("org.springframework.boot") version "2.7.1"
    id("io.spring.dependency-management") version "1.1.0"
    id("io.spring.nohttp")

    kotlin("jvm") version "1.8.0"
    kotlin("plugin.spring") version "1.8.0"
    kotlin("kapt") version "1.8.0"
    kotlin("plugin.jpa") version "1.8.0"
    kotlin("plugin.allopen") version "1.8.0"
    kotlin("plugin.noarg") version "1.8.0"

    kotlin("plugin.serialization") version "1.8.0"
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

repositories {
    mavenCentral()
}

java.sourceCompatibility = JavaVersion.VERSION_11
java.targetCompatibility = JavaVersion.VERSION_11

subprojects {
    apply {
        plugin("org.springframework.boot")
        plugin("io.spring.dependency-management")
        plugin("org.jetbrains.kotlin.jvm")
        plugin("org.jetbrains.kotlin.plugin.spring")
        plugin("org.jetbrains.kotlin.plugin.allopen")
        plugin("org.jetbrains.kotlin.plugin.serialization")
        plugin("org.jetbrains.kotlin.kapt")
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "11"
        }
    }



    dependencies {
        implementation("org.springframework.boot:spring-boot-starter-data-mongodb-reactive")
        implementation("org.springframework.boot:spring-boot-starter-webflux")
        implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
        implementation("io.projectreactor.kotlin:reactor-kotlin-extensions")
        implementation("org.jetbrains.kotlin:kotlin-reflect")

        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor")
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactive")
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-slf4j")

        implementation("ca.pjer:logback-awslogs-appender:1.6.0")
        implementation("org.jsoup:jsoup:1.15.3")

        developmentOnly("org.springframework.boot:spring-boot-devtools")
        testImplementation("org.springframework.boot:spring-boot-starter-test")
        testImplementation("io.projectreactor:reactor-test")
    }

}
