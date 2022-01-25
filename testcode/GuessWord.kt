package com.data.studykotlinterms.testcode


/**
 * Created by sweety on 23,December,2021
 */
fun main() {
    var count: Int = 0
    var correctSubString = ""
    var character: String = ""
    print("Enter a Word to Guess: ")
    val word: String? = readLine()
    if (word?.isEmpty() == true) {
        println("No word entered so game is ended")
    } else {
        println("Number of wrong count : $count")
        print("Enter a letter to guess the word")
        character = readLine().toString()
        if (isCharacterCorrect(word, correctSubString, character)) {
            if (word != null) {
                var remainingSubString = word.substring(correctSubString.lastIndex + 1)
                print(remainingSubString)
                for (i in word) {
                    print(i)
                }
            }
        }else{
            count=count++
            println("Number of wrong count : $count")
            print("Enter a letter to guess the word")
        }
    }
}

fun isCharacterCorrect(word: String?, correctSubString: String, character: String): Boolean {
    var remainedWord: String = word!!.substring(correctSubString.length)
    if (remainedWord.first().toString()==(character)) {
        return true
        print(true)
    }
    return false
}