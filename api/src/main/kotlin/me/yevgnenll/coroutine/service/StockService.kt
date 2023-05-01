package me.yevgnenll.coroutine.service

import kotlinx.coroutines.runBlocking
import me.yevgnenll.coroutine.model.Stock
import me.yevgnenll.coroutine.repository.StockRepository
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