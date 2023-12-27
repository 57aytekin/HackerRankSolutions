package com.example.myapplication.solutions

import kotlin.math.min


/*
 * Complete the 'appendAndDelete' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. STRING s
 *  2. STRING t
 *  3. INTEGER k
 */

fun appendAndDelete(s: String, t: String, k: Int): String {
    // Write your code here
    var value = k

    if(k >= t.length + s.length) return "Yes";
    var same: Int = min(t.length, s.length)
    for (i in 0 until min(t.length, s.length)) {
        if (s[i] != t[i]) {
            same = i
            break
        }
    }
    value -= (s.length - same);
    value -= (t.length - same);
    return if (value >= 0 && value % 2 == 0) "Yes" else "No"
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val t = readLine()!!

    val k = readLine()!!.trim().toInt()

    val result = appendAndDelete(s, t, k)

    println(result)
}
