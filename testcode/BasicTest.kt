package com.data.studykotlinterms.testcode

/**
 * Created by sweety on 18,December,2021
 */

fun main() {
    var mArrayList= arrayListOf("English","Panchtantra","Mathmatics","Science","Hindi")
    for (i in mArrayList){
        if(i.contains('e',true)){
            for (c in i){
                print(c)
            }
           break
        }else{
//            continue
        }
    }
}