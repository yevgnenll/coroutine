package me.yevgnenll.demo.repository

import me.yevgnenll.demo.model.Stock
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface StockRepository: CoroutineCrudRepository<Stock, String>