package me.yevgnenll.demo.model

import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Stock(
    var id: String?,
    val name: String,
    val open: Double,
    val close: Double,
)