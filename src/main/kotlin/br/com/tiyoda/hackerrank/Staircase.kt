package br.com.tiyoda.hackerrank

fun staircase(n: Int): Unit {
    val builder = StringBuilder()
    for (i in 0 until n) builder.append(" ")

    for ((j, i) in (1..n).withIndex()) {
        builder.replace(builder.length - i, builder.length - j, "#")
        println(builder)
    }
}

fun main() {
    val n = readLine()!!.trim().toInt()

    staircase(n)
}