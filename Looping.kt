package com.data.studykotlinterms

/**
 * Created by sweety on 17,December,2021
 */
fun main() {
    forLoop()
    getSumNumber100()
    showList()
    forloopWithIndex()
}

fun forLoop() {
    for (i in 1..10){
        print(i)
    }
}
fun getSumNumber100() {
    var sum =0
    for (i in 1..100){
        sum=sum+i
    }
    sum
    println("Sum is : "+sum)
}
fun showList(){
    val list= listOf("Orange","Apple","Mango")
    for (element in list){
        println(element)
    }
}
fun forloopWithIndex(){
    val list= listOf("Orange","Apple","Mango")
    for ((index,value) in list.withIndex()){
        println("index is : $index  Value is : $value")
    }

}