package br.com.tiyoda.hackerrank.medium

fun climbingLeaderboard(ranked: Array<Int>, player: Array<Int>): IntArray {
    val set = ranked.toSet()

    return player.map { score ->
        val rankedPoint = set.firstOrNull { element -> (element <= score) }
        if (rankedPoint != null) set.indexOf(rankedPoint) + 1
        else set.size + 1
    }.toIntArray()

}

fun main() {
    val rankedCount = readLine()!!.trim().toInt()

    val ranked = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val playerCount = readLine()!!.trim().toInt()

    val player = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = climbingLeaderboard(ranked, player)

    println(result.joinToString("\n"))
}
