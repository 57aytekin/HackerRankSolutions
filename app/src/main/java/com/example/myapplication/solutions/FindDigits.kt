package com.example.myapplication.solutions

/*
 * Complete the 'findDigits' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER n as parameter.
 */

fun findDigits(n: Int): Int {
    // Write your code here
    val numbers = n.toString()
    var count = 0
    numbers.forEach {
        if (it == '0') return@forEach
        if (n % it.digitToInt() == 0)
            count ++
    }
    return count
}

fun main(args: Array<String>) {
    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val n = readLine()!!.trim().toInt()

        val result = findDigits(n)

        println(result)
    }
}
