package com.data.studykotlinterms

/**
 * Created by sweety on 21,December,2021
 */
open class Person(open val name: String, open val age: Int) {
    open fun dataTexting() {
        println("dataTexting")
    }

}

class Employee(override val name: String, override val age: Int) : Person(name, age) {
    override fun dataTexting() {
        println("Employee Datatexting")
    }
}

fun main() {
    val obj=Employee("gcgc",78)
    obj.dataTexting()
}
class Student {

}