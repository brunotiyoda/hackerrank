package br.com.tiyoda.hackerrank

fun rotLeft(a: Array<Int>, shiftAmount: Int): IntArray {
    val arr = IntArray(a.size)
    val sizeOfArray = a.size
    for (i in 0 until sizeOfArray) {
        arr[i] = a[(i + shiftAmount) % sizeOfArray]
    }

    return arr
}

fun main() {
    val firstMultipleInput = readLine()!!.trimEnd().split(" ")

    val n = firstMultipleInput[0].toInt()

    val d = firstMultipleInput[1].toInt()

    val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = rotLeft(a, d)

    println(result.joinToString(" "))
}