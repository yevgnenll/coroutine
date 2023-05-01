package me.yevgnenll.demo.service

import kotlinx.coroutines.runBlocking
import me.yevgnenll.demo.model.Stock
import me.yevgnenll.demo.repository.StockRepository
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class StockServiceTest {

    @Autowired
    private lateinit var stockRepository: StockRepository

    @Test
    fun `create and get`() {
        val stock = Stock(
            id = "AAPL",
            name = "Apple Inc",
            low = 100.0,
            high = 250.0,
            open = 120.0,
            close = 220.0,
        )

        runBlocking {
            stockRepository.save(stock)
            stockRepository.findById("AAPL")?.also {
                assertThat(it.name).isEqualTo(stock.name)
            }
        }
    }

}