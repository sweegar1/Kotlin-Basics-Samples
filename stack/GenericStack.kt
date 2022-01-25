package com.data.studykotlinterms.stack

/**
 * Created by sweety on 23,December,2021
 */

class GenericStack<E>(vararg val items: E) {
    val elements = items.toMutableList()

    fun push(element: E) {
        elements.add(element)
    }

    fun pop(): E? {
        if (!isEmpty()) {
            return elements.removeAt(elements.size - 1)
        }
        return null
    }

    fun isEmpty(): Boolean {
        return elements.isEmpty()
    }
}

fun <T> returnStack(vararg element: T): GenericStack<T> {
    return GenericStack(*element)
}

fun main() {
    val stack = GenericStack("a", "b", "c", "d")
    val stack2 = returnStack(1, 2, 3, 4,"h")
    val stack3 = returnStack("RED","BLUE","GREEN")
    println(stack.pop())
    println(stack2.pop())
    println(stack2.pop())
}