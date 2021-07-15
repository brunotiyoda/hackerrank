package br.com.tiyoda.hackerrank

fun plusMinus(arr: Array<Int>): Unit {
    val negatives = arr.filter { it < 0 }.count()
    val positives = arr.filter { it > 0 }.count()
    val equalsZero = arr.filter { it == 0 }.count()

    val arraySize = arr.size

    println("%.6f".format(positives / arraySize.toFloat()))
    println("%.6f".format(negatives / arraySize.toFloat()))
    println("%.6f".format(equalsZero / arraySize.toFloat()))

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    plusMinus(arr)
}
