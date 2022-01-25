package com.data.studykotlinterms.collections

/**
 * Created by sweety on 17,December,2021
 */
fun main() {
    val array = arrayOf("array1", "array2")
    val mixed = arrayOf("data mixed", 3.1, 22, "Mixing")
    val numberArra = intArrayOf(1, 2, 3, 4)
//    array[2]="array3" //cant add because size cant be  changed
//    println(array.toList())

    array[0] = "data1"
    println(array.toList())
    println(mixed.get(1))
    println(mixed[1])

    stringAsArray()
    concatingArray()

    //isEmpty and contains methods are also there
}

fun concatingArray() {
    val states = arrayOf("Rajasthan", "Kolkata", "Karnataka")
    val country = arrayOf("India", "Japan", "Switzerland")
    val allStates = states + country
    println(allStates.toList())
}

fun stringAsArray() {
    val str = "Kotlin"
    println(str[0])
}