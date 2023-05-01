package me.yevgnenll.coroutine.service

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import kotlinx.coroutines.runBlocking
import me.yevgnenll.coroutine.model.Stock
import me.yevgnenll.coroutine.repository.StockRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class StockServiceSpec : FunSpec() {

    @Autowired
    private lateinit var stockRepository: StockRepository

    init {
        test("create and get") {
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
                stockRepository.findById("AAPL")?.name shouldBe stock.name
            }
        }
    }

}
