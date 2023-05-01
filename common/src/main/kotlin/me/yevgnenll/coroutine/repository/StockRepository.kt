package me.yevgnenll.coroutine.repository

import me.yevgnenll.coroutine.model.Stock
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface StockRepository: CoroutineCrudRepository<Stock, String>