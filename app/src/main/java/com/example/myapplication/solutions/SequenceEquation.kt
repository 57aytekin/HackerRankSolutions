package com.example.myapplication.solutions

/*
 * Complete the 'permutationEquation' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY p as parameter.
 */

fun permutationEquation(p: Array<Int>): Array<Int> {
    // Write your code here
    val sortedList = p.sorted()
    val newList = sortedList.map {sortedItem ->
        val second = p.indexOf(sortedItem)+1
        p.indexOf(second) +1
    }
    return newList.toTypedArray()
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val p = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = permutationEquation(p)

    println(result.joinToString("\n"))
}
