package com.data.studykotlinterms.testcode

import java.util.*

/**
 * Created by sweety on 17,December,2021
 */

fun main() {
    val random = Random().nextInt(50) + 1
println(random)
    when (random) {
        in 1..10 -> println("Number is in range of 1 to 10")
        in 11..20 -> println("Number is in range of 11 to 20")
        in 21..30 -> println("Number is in range of 21 to 30")
        in 31..40 -> println("Number is in range of 31 to 40")
        else -> println("Number is more then 40")
    }
}