package br.com.tiyoda.hackerrank

fun birthdayCakeCandles(candles: Array<Int>): Int {
    var max = 0
    var count = 0

    candles.forEach { candle ->
        if (candle > max) {
            max = candle
            count = 1
        } else if (candle == max) count++
    }

    return count
}

fun main(args: Array<String>) {
    val candlesCount = readLine()!!.trim().toInt()

    val candles = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = birthdayCakeCandles(candles)

    println(result)
}