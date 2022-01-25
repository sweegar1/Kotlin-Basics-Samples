package com.data.studykotlinterms.collections

/**
 * Created by sweety on 24,December,2021
 */
fun main() {
    var hashMap= hashMapOf("fruit" to "Orange","Veggie" to "Potato")
    for ((key,value ) in hashMap){
        println("$key : $value")
    }
    println(hashMap.keys)
    println(hashMap.values)
}