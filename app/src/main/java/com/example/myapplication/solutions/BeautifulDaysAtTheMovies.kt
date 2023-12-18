package com.example.myapplication.solutions

import kotlin.math.abs


/*
 * Complete the 'beautifulDays' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER i
 *  2. INTEGER j
 *  3. INTEGER k
 */

fun beautifulDays(i: Int, j: Int, k: Int): Int {
    // Write your code here
    var beautifulCount = 0
    for (number in i .. j){
        val calculated: Float = (abs(number - number.reverse())) / k.toFloat()
        if (calculated.rem(1).toDouble() == 0.0){
            beautifulCount ++
        }
    }
    return beautifulCount
}

fun main() {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val i = first_multiple_input[0].toInt()

    val j = first_multiple_input[1].toInt()

    val k = first_multiple_input[2].toInt()

    val result = beautifulDays(i, j, k)

    println(result)
}

fun Int.reverse(): Int {
    var n = this
    var result = 0
    while (n > 0) {
        result = 10 * result + n % 10
        n = n / 10
    }
    return result
}
