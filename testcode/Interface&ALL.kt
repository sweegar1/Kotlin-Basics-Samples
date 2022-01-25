package com.data.studykotlinterms.testcode

/**
 * Created by sweety on 22,December,2021
 */
interface Lendable {
    fun borrow()
}

abstract class InventoryItem : Lendable {

}

data class Book(
    val title: String,
    val genre: String,
    val publicationYear: Int,
    val author: String,
    val isBorrowed: Boolean = false
) :
    InventoryItem() {
    override fun borrow() {
        TODO("Not yet implemented")
    }

}

data class DVD(
    val title: String,
    val genre: String,
    val publicationYear: Int,
    val length: Long,
    val isBorrowed: Boolean = false
) :
    InventoryItem() {
    override fun borrow() {
        TODO("Not yet implemented")
    }

}

fun main() {
    val book1 = Book("Kotlin", "1.0", 2022, "Andy", false)
    val book2 = book1.copy(title = "Android With Kotlin")
    val book3 = book1.copy(title = "Super Kotlin")
    val list= arrayListOf(book1,book2,book3)


}