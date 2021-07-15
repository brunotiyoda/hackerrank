package br.com.tiyoda.hackerrank

fun aVeryBigSum(ar: Array<Long>): Long {
    return ar.sum()
}

fun main(args: Array<String>) {
    val arCount = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toLong() }.toTypedArray()

    val result = aVeryBigSum(ar)

    println(result)
}