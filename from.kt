import android.annotation.SuppressLint
import io.reactivex.Observable

@SuppressLint("CheckResult")
fun main(){

    var mArray= arrayOf("marray1","marray2")
    val num = arrayOf<Int>(1, 2, 3)

    Observable.fromArray("array1","array2","array3")
        .subscribe { println(it) }

    Observable.fromArray(mArray)
        .subscribe { println(it.toList()) }

    Observable.fromIterable(listOf("Iterable1","Iterable2"))
        .subscribe({
            value -> println(value)
        })

    val list = listOf("Iterable11", "Iterable22")
    Observable.fromIterable(list)
        .subscribe(
            { value ->
                println(value)
            },
        )
}