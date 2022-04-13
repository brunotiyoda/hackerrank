package br.com.tiyoda.hackerrank

import java.text.NumberFormat
import java.util.Locale
import java.util.Scanner


// https://www.hackerrank.com/challenges/java-currency-formatter/problem
fun main() {
    val scanner = Scanner(System.`in`)
    val payment: Double = scanner.nextDouble()
    scanner.close()

    val indiaLocale = Locale("en", "IN")
    val india = NumberFormat.getCurrencyInstance(indiaLocale)

    val us = NumberFormat.getCurrencyInstance(Locale.US)
    val china = NumberFormat.getCurrencyInstance(Locale.CHINA)
    val france = NumberFormat.getCurrencyInstance(Locale.FRANCE)

    println("US: ${us.format(payment)}")
    println("India: ${india.format(payment)}")
    println("China: ${china.format(payment)}")
    println("France: ${france.format(payment)}")
}