package com.data.studykotlinterms

/**
 * Created by sweety on 22,December,2021
 */
class Book(val author: String, val name: String, val publicationYear: Int, val price: Double) {
    override fun toString(): String {
        return "Book(author=$author, name=$name, publicationYear=$publicationYear,price=$price)"
    }
}

data class DataBook(
    val author: String,
    val name: String,
    val publicationYear: Int,
    val price: Double
)

fun main() {
    val book = Book("Andy", "Kotlin", 2022, 2200.99)
    val book1 = Book("Andy", "Kotlin", 2022, 2200.99)
    val dataBook = DataBook("Andy", "Kotlin", 2022, 2200.99)
    val dataBook1 = DataBook("Andy", "Kotlin", 2022, 2200.99)

//    printBothObject(book, dataBook)
//    compareBothObject(book, book1, dataBook, dataBook1)
//    createDataObjectCopy()
//    decompositionIntoProperties()
    SetCreationForDataClass(book, book1, dataBook, dataBook1)
}


fun printBothObject(book: Book, dataBook: DataBook) {
    println(book.toString()) //toString Method required in class
    println(dataBook)
}

fun compareBothObject(book: Book, book1: Book, dataBook: DataBook, dataBook1: DataBook) {
    println(book.equals(book1))
    println(dataBook.equals(dataBook1))
}

fun createDataObjectCopy() {
    val dataBook2 = DataBook("Andy", "Kotlin", 2022, 2200.99)
    val dataBook3 = dataBook2.copy(author = "Robert")
    println(dataBook2)
    println(dataBook3)
}

fun decompositionIntoProperties() {
    val dataBook = DataBook("Andy", "Kotlin", 2022, 2200.99)
    val (author, name, year, price) = dataBook
    println(author)
    println(name)
    println(year)
    println(price)
}

//Set removes duplicacy of data Class Object
fun SetCreationForDataClass(book: Book, book1: Book, dataBook: DataBook, dataBook1: DataBook) {
    val setOfBook = hashSetOf(book, book1)
    val setOfDataBook = hashSetOf(dataBook, dataBook1)
    println(setOfBook)
    println(setOfDataBook)
}