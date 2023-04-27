package me.yevgnenll.demo

import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface StockRepository: CoroutineCrudRepository<Stock, String>