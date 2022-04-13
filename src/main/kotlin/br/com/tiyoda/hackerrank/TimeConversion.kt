package br.com.tiyoda.hackerrank

import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.Date

fun timeConversion(s: String): String {
    val df: DateFormat = SimpleDateFormat("hh:mm:ssa")
    val out: DateFormat = SimpleDateFormat("HH:mm:ss")
    val date: Date = df.parse(s)
    return out.format(date)
}

fun main() {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}
