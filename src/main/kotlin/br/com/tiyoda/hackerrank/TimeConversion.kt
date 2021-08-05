package br.com.tiyoda.hackerrank

import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*


fun timeConversion(s: String): String {
    val df: DateFormat = SimpleDateFormat("hh:mm:ssa")
    val out: DateFormat = SimpleDateFormat("HH:mm:ss")
    val date: Date = df.parse(s)
    return out.format(date)
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}
