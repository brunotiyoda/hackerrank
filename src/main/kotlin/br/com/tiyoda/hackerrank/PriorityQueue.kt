package br.com.tiyoda.hackerrank

import java.util.Objects.isNull
import java.util.Objects.nonNull
import java.util.PriorityQueue
import java.util.Scanner

internal class Student(val id: Int, val name: String, val cgpa: Double)

internal class Priorities {
    fun getStudents(events: List<String?>): List<Student> {
        val studentQueue = PriorityQueue(
            Comparator
                .comparing { obj: Student -> obj.cgpa }
                .reversed()
                .thenComparing { obj: Student -> obj.name }
                .thenComparing { obj: Student -> obj.id }
        )

        val students: MutableList<Student> = ArrayList()

        events.forEach { e ->
            val `in` = Scanner(e)
            val event: String = `in`.next()

            if (event == "ENTER") {
                addStudent(studentQueue, `in`)
            } else if (event == "SERVED") {
                studentQueue.poll()
            }

            `in`.close()
        }

        var first = studentQueue.poll()

        if (isNull(first)) {
            return students
        }

        while (nonNull(first)) {
            students.add(first)
            first = studentQueue.poll()
        }

        return students
    }

    private fun addStudent(studentQueue: PriorityQueue<Student>, `in`: Scanner) {
        val name: String = `in`.next()
        val cgpa: Double = `in`.nextDouble()
        val id: Int = `in`.nextInt()
        val student = Student(id, name, cgpa)
        studentQueue.add(student)
    }
}

private val scan = Scanner(System.`in`)
private val priorities = Priorities()

fun main() {
    var totalEvents = scan.nextLine().toInt()
    val events: MutableList<String?> = ArrayList()

    while (totalEvents-- != 0) {
        val event = scan.nextLine()
        events.add(event)
    }

    val students = priorities.getStudents(events)

    if (students.isEmpty()) {
        println("EMPTY")
    } else {
        for (st in students) {
            println(st.name)
        }
    }
}