package com.data.studykotlinterms

/**
 * Created by sweety on 21,December,2021
 */

class NamedParameter(val age:Int,val name:String,val id:Int=3){
    fun print(){
        println("Age : $age Name : $name Id : $id")
    }

}

fun main() {
    val namedParameter = NamedParameter(23, "Tester", 1)
    val namedParameter1 = NamedParameter(age = 23, id = 2, name = "hvhgvhgv")//Order not required
    val namedParameter2 = NamedParameter(age = 23,  name = "hvhgvhgv")
    namedParameter.print()
    namedParameter1.print()
    namedParameter2.print()
}