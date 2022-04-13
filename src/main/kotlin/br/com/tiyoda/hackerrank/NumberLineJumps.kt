package br.com.tiyoda.hackerrank


fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    val canCatchUp = (v2 < v1)
    if (canCatchUp) {
        val willIntersectOnLand = (x1 - x2) % (v2 - v1) == 0
        if (willIntersectOnLand) {
            return "YES"
        }
    }

    return "NO"
}

fun main() {
    val firstMultipleInput = readLine()!!.trimEnd().split(" ")

    val x1 = firstMultipleInput[0].toInt()

    val v1 = firstMultipleInput[1].toInt()

    val x2 = firstMultipleInput[2].toInt()

    val v2 = firstMultipleInput[3].toInt()

    val result = kangaroo(x1, v1, x2, v2)

    println(result)
}
