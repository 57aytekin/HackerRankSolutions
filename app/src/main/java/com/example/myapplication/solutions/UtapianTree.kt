package com.example.myapplication.solutions

/**
 * The Utopian Tree goes through 2 cycles of growth every year. Each spring, it doubles in height.
 * Each summer, its height increases by 1 meter.
 */
fun utopianTree(n: Int): Int {
    // Write your code here
    var value = 1
    if (n > 0){
        for (i in 1..n){
            if (i % 2 == 1){ // is odd number
                value *= 2
            }else {
                value ++
            }
        }
    }
    return value
}

fun main() {
    val t = readln().trim().toInt()

    for (tItr in 1..t) {
        val n = readln().trim().toInt()

        val result = utopianTree(n)

        println(result)
    }
}