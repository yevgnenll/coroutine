package me.yevgnenll.coroutine

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories

@EnableReactiveMongoRepositories(basePackages = ["me.yevgnenll.coroutine"])
@SpringBootApplication(scanBasePackages = ["me.yevgnenll.coroutine"])
class ApiApplication

fun main(args: Array<String>) {
    runApplication<ApiApplication>(*args)
}
