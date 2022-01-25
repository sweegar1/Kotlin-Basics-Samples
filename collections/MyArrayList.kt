package com.data.studykotlinterms.collections

/**
 * Created by sweety on 17,December,2021
 */
fun main() {
    val mArrayList = arrayListOf("Josh", "Peter", "Michel")
    val list = arrayListOf("Danial")
    println(mArrayList[0])
    println(mArrayList + list)
    println(mArrayList.size)
    println(mArrayList.isEmpty())
    println(mArrayList.contains("Josh"))
    addData(mArrayList, list)
    removeData(mArrayList)
    //sublist
}

fun addData(mArrayList: ArrayList<String>, list: ArrayList<String>) {
    mArrayList.add(1, "Sweegar")
    mArrayList.add("Sweety")
    println(mArrayList)
}

fun removeData(mArrayList: ArrayList<String>) {
    val removed = mArrayList.remove("data")
    println(mArrayList)
    println("removed1:" + removed)
    val removed1 = mArrayList.remove("Josh")
    println(mArrayList)
    println("removed:2" + removed1)
}