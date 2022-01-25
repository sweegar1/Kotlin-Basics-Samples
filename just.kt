import io.reactivex.Observable

fun main() {
    println("Testing")
    Observable.just("Data", "Data2", "Data3")
        .subscribe { value ->
            println(value)
        }
    Observable.just("Data", "Data2", "Data3")
        .subscribe({ value ->
            println(value)
        })
    Observable.just("Apple", "Orange", "Banana")
        .subscribe(
            { value -> println("Received: $value") }, // onNext
            { error -> println("Error: $error") },    // onError
            { println("Completed!") }                 // onComplete
        )
    Observable.just("just1", "just2")
        .subscribe(
            { value -> println("Received" + value) },
            { error -> println(error) })

    Observable.just("error1", "error2", "error3")
        .map { input -> throw RuntimeException() }
        .subscribe(
            { value -> println("Received" + value) },
            { error -> println(error) })


}