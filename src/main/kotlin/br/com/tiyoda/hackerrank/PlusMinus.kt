package br.com.tiyoda.hackerrank

fun plusMinus(arr: Array<Int>): Unit {
    val positives = arr.count { it > 0 }
    val negatives = arr.count { it < 0 }
    val equalsZero = arr.count { it == 0 }

    val arraySize = arr.size

    println("%.6f".format(positives / arraySize.toFloat()))
    println("%.6f".format(negatives / arraySize.toFloat()))
    println("%.6f".format(equalsZero / arraySize.toFloat()))

}

fun main() {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    plusMinus(arr)
}
