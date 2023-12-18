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
        val stringBuilder = StringBuilder()
        stringBuilder.append(number)
        val reversed = stringBuilder.reverse().toString().toInt()
        if ((abs(number - reversed)) % k == 0){
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