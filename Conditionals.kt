fun main() {

    runIfBlock()
    runWhenBlock()
}

fun runIfBlock() {
    val age: Byte = 21
    if (age < 18) {
        println("not allowed")
    } else {
        println("allowed")
    }

}

fun runWhenBlock() {
    val mode = 5
    when (mode) {
        1 -> println("1")
        2 -> {
            println("2")
        }
        3 -> println("3")
        else -> println("else")
    }
}