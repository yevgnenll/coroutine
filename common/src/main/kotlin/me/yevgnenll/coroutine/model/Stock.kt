package me.yevgnenll.coroutine.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document
data class Stock(
    @Id
    var id: String?,

    @Field
    val name: String,

    @Field
    val open: Double,

    @Field
    val close: Double,

    @Field
    val high: Double,

    @Field
    val low: Double,
)