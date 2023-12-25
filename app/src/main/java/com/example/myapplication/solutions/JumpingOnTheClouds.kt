package com.example.myapplication.solutions

import java.util.Scanner

// Complete the jumpingOnClouds function below.
fun jumpingOnClouds(c: Array<Int>, n: Int, k: Int): Int {
    var energy = 100
    var curr = 0
    while (curr < n){
        energy --
        if (c[curr] == 1)
            energy -= 2
        curr += k
    }

    return energy

}

fun jumpingOnClouds(c: Array<Int>, k: Int): Int {
    var energyLevel = 100
    var i = k
    while (i != 0) {
        if (i >= c.size) i -= c.size
        energyLevel -= 1
        if (c[i] == 1) energyLevel -= 2
        if (i == 0) break
        i += k
    }
    return energyLevel
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val c = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = jumpingOnClouds(c, k)

    println(result)
}
