package com.data.studykotlinterms

/**
 * Created by sweety on 17,December,2021
 */
fun main() {
continueExample()
    for (c in "Python") {
        if (c == 'h') {
            break
        }
        print(c)
    }
}

fun continueExample() {
    val list = listOf("books", "Pencil", "Laptop")
    for (value in list) {
        if (!value.contains('o')) {
            continue
        }
        print(value)
    }

}