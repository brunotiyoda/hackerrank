package br.com.tiyoda.hackerrank


fun compareTriplets(alice: Array<Int>, bob: Array<Int>): Array<Int> {
    require(alice.size == bob.size)

    var pointAlice = 0
    var pointBob = 0

    alice.indices.forEach { i ->
        if (alice[i] > bob[i]) pointAlice++
        else if (alice[i] < bob[i]) pointBob++
    }

    return arrayOf(pointAlice, pointBob)
}


fun main(args: Array<String>) {

    val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}

