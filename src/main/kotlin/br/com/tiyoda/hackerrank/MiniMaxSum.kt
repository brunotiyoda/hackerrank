package br.com.tiyoda.hackerrank


fun miniMaxSum(arr: Array<Int>): Unit {
    var min: Int = 0
    var max: Int = 0
    var sum: Int = 0
    min = arr[0]
    max = min
    sum = min

    for (i in 1 until arr.size) {
        sum += arr[i]
        if (arr[i] < min) {
            min = arr[i]
        }
        if (arr[i] > max) {
            max = arr[i]
        }
    }

    println((sum - max).toString() + " " + (sum - min))
}


fun main(args: Array<String>) {

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    miniMaxSum(arr)
}