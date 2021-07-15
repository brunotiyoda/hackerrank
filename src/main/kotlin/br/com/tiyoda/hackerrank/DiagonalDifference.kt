package br.com.tiyoda.hackerrank

import kotlin.math.abs

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var firstDiagonalSum = 0
    var secondDiagonalSum = 0

    arr.indices.withIndex().forEach { (column, row) ->
        firstDiagonalSum += arr[row][column]
        secondDiagonalSum += arr[row][arr[row].size - 1 - column]
    }

    return abs(firstDiagonalSum - secondDiagonalSum)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}
