package com.example.myapplication.solutions

fun designerPdfViewer(h: Array<Int>, word: String): Int {
    // Write your code here
    var biggerValue = 0
    val alphabet = "abcdefghijklmnopqrstuvwxyz"
    word.forEach {
        val currentIndex = alphabet.indexOf(it)
        val value = h[currentIndex]
        if (value > biggerValue) biggerValue = value
    }
    return biggerValue * word.length
}

fun main(args: Array<String>) {

    val h = readlnOrNull()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    val word = readln()

    val result = designerPdfViewer(h, word)
    println(result)
}
