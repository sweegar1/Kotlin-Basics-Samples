package com.data.studykotlinterms.testcode

/**
 * Created by sweety on 18,December,2021
 */
class BookInfoTest(s: String, s1: String, i: Int, b: Boolean) {
    var title: String = s
    val author: String = s1
    val publicationYear: Int = i
    var isBorrowed: Boolean = b
    fun printSelf() {
        print("Title : $title \nAuthor : $author \nPublication Year : $publicationYear \nisBorrowed : $isBorrowed")
    }

    fun borrowBook() {
       if(!isBorrowed){
           isBorrowed=true
           println("Book is Borrowed")
       }else{
           println("Book is already Borrowed, Cant borrow")
       }
    }
    fun returnBook(){
        if(isBorrowed){
            isBorrowed=false
            println("Book is Returned")
        }else{
            println("Book is not Borrowed, Cant Return")
        }
    }
}

fun main() {
    val bookInfoTest = BookInfoTest("Kotlin", "Andy", 2021,false)
    bookInfoTest.borrowBook()
    bookInfoTest.borrowBook()
    bookInfoTest.returnBook()
    bookInfoTest.returnBook()
    bookInfoTest.borrowBook()
bookInfoTest.printSelf()
}