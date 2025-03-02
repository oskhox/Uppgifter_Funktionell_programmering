package Inlamning_2

import java.io.File

//AoC 2020 day 1(B)
//Find the THREE entries that sum to 2020; what do you get if you multiply them together?

private fun findEntries() {
    val data: List<Int> = File("src/Inlamning_2/dataAoC1.txt").readLines().map { row -> row.toInt() }

    val sum = 2020

    for (i in 0 until data.size) {
        for (j in i + 1 until data.size) {
            for (k in j + 1 until data.size) {
                val entry1 = data[i]
                val entry2 = data[j]
                val entry3 = data[k]

                if (entry1 + entry2 + entry3 == sum) {
                    multiply(entry1, entry2, entry3)
                }

            }
        }
    }
}

private fun multiply(entry1: Int, entry2: Int, entry3: Int) {
    println("The numbers are $entry1 and $entry2 and $entry3.")
    println("The product is " + entry1 * entry2 * entry3 + ".")
}

fun main() {
    findEntries()
}