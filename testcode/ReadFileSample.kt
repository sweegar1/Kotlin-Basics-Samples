package com.data.studykotlinterms.testcode

import java.io.File

/**
 * Created by sweety on 23,December,2021
 */
fun main() {
    var linenumber=0
    File("/Users/sweety/AndroidStudioProjects/study/studykotlinterms/app/src/main/java/com/data/studykotlinterms/input.txt").forEachLine {
        ++linenumber
        println("$linenumber : $it")
    }

}