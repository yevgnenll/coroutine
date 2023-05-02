pluginManagement {

    val spring_boot_version: String by settings
    val kotlin_version: String by settings
    val spring_no_http_plugin_version: String by settings
    val ktlint_version: String by settings
    val spring_cloud_version: String by settings
    plugins {
        id("org.springframework.boot") version spring_boot_version
        id("org.springframework.cloud") version spring_cloud_version
        id("io.spring.nohttp") version spring_no_http_plugin_version

        kotlin("jvm") version kotlin_version
        kotlin("kapt") version kotlin_version
        kotlin("plugin.spring") version kotlin_version
        kotlin("plugin.allopen") version kotlin_version
    }
}

rootProject.name = "coroutine"

include(":common")
include(":api")
