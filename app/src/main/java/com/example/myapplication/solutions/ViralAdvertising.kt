package com.example.myapplication.solutions

/*
 * Complete the 'viralAdvertising' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER n as parameter.
 */

fun viralAdvertising(n: Int): Int {
    // Write your code here
    var cumulativeLikes = 0
    var liked = 0
    var shared = 5
    for(i in 1 .. n){
        liked = shared /  2
        shared = shared / 2 * 3
        cumulativeLikes += liked
    }
    return cumulativeLikes
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val result = viralAdvertising(n)

    println(result)
}
