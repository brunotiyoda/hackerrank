package br.com.tiyoda.hackerrank.medium

// https://www.hackerrank.com/challenges/new-year-chaos/forum/comments/497625?h_l=interview&isFullScreen=false&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays

fun minimumBribes(q: Array<Int>): Unit {
    var count = 0

    var midOfThree = Int.MAX_VALUE
    var maxOfThree = Int.MAX_VALUE
    var minOfThree = Int.MAX_VALUE

    for (i in q.size - 1 downTo 0) {
        if (q[i] - i > 3) {
            println("Too chaotic")
            return
        } else {
            if (q[i] > maxOfThree) {
                println("Too chaotic")
                return
            } else if (q[i] > midOfThree) {
                count += 2
            } else if (q[i] > minOfThree) {
                count += 1
            }

            if (q[i] < minOfThree) {
                maxOfThree = midOfThree
                midOfThree = minOfThree
                minOfThree = q[i]
            } else if (q[i] < midOfThree) {
                maxOfThree = midOfThree
                midOfThree = q[i]
            } else if (q[i] < maxOfThree) {
                maxOfThree = q[i]
            }
        }
    }
    println(count)
}

fun main() {
    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val n = readLine()!!.trim().toInt()

        val q = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

        minimumBribes(q)
    }
}