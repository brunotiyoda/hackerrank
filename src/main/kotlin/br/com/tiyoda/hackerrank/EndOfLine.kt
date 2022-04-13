package br.com.tiyoda.hackerrank

import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    var i = 1

    while (scan.hasNext()) {
        println(i.toString() + " " + scan.nextLine())
        i++
    }
}
