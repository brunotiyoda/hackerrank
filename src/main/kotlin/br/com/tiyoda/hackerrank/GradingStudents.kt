package br.com.tiyoda.hackerrank

fun gradingStudents(grades: Array<Int>): MutableList<Int> {
    val ans = mutableListOf<Int>()
    grades.forEach { grade ->
        if (grade < 38 || grade % 5 < 3) {
            ans.add(grade)
        } else {
            val add = 5 - (grade % 5)
            ans.add(grade + add)
        }
    }
    return ans
}

fun main() {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array<Int>(gradesCount) { 0 }
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}