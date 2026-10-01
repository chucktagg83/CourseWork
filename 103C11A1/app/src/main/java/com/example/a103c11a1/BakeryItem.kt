package com.example.a103c11a1

// CHALLENGE 1 SESSION 1
data class BakeryItem(
    var name: String,
    var sold: Double,
    var price: Double
){
    // CHALLENGE 2 SESSION 1
    fun revenue(): Double {
        return sold * price
    }
}