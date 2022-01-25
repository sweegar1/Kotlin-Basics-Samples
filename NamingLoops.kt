package com.data.studykotlinterms

/**
 * Created by sweety on 17,December,2021
 */
fun main() {
   outer@ for (i in 1..10) {
        for (j in 1..10) {
            if (i - j == 5) {
                break@outer
            }
            println("i : $i - j : $j")
        }
    }
}