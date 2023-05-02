package me.yevgnenll.coroutine

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

class CoroutineExam

private suspend fun createCoroutines(amount: Int) {
    val jobs = ArrayList<Job>()

    coroutineScope {
        for (i in 0..amount) jobs += launch {
            println("started $i in ${Thread.currentThread().name}")
            delay(1000)
            println("Finished $i in ${Thread.currentThread().name}")
        }

        jobs.forEach {
            it.join()
        }
    }
}

fun main(args: Array<String>) = runBlocking {
    println("${Thread.activeCount()} thread active at the start")

    val time = measureTimeMillis {
        createCoroutines(1_000)
    }

    println("${Thread.activeCount()} thread active at the end")
    println("Took $time ms")
}