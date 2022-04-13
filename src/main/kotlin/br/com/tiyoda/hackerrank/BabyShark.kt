package br.com.tiyoda.hackerrank

val doodoo = ", doo doo doo doo doo doo"

fun main() {
    val verses: MutableList<String> = ArrayList()
    verses.add("Baby shark")
    verses.add("Mommy shark")
    verses.add("Daddy shark")
    verses.add("Grandma shark")
    verses.add("Grandpa shark")
    verses.add("Let's go hunt")
    verses.add("Run away")
    verses.add("Safe at last")
    verses.add("It's the end")

    verses.forEach { verse ->
        println(verse + doodoo)
        println(verse + doodoo)
        println(verse + doodoo)
        println("$verse!\n")
    }
}