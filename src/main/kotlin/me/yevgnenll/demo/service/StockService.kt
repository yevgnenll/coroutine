package me.yevgnenll.demo.service

import kotlinx.coroutines.runBlocking
import me.yevgnenll.demo.Stock
import me.yevgnenll.demo.StockRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class StockService(
    private val stockRepository: StockRepository,
) {

    @Transactional
    suspend fun saveStockData(stock: Stock): Stock {
        return runBlocking {
            stockRepository.save(stock)
        }
    }
}