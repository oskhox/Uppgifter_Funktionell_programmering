package Inlamning_2

import java.io.File

//AOC 2022 day 6(A)
//Identify the first position where the four most recently received characters were all different.
//How many characters need to be processed before the first full unique sequence is detected?

fun main() {
    val data: String = File("src/Inlamning_2/dataAoC6.txt").readText()

    fun findSequence(sequenceSize: Int): Int {
        try {
            val windows = data.windowed(sequenceSize, 1)
            for (window in windows) {
                if (window.toSet().size == sequenceSize) {
                    return data.indexOf(window) + sequenceSize
                }
            }
        } catch (e: IllegalArgumentException) {
            e.printStackTrace()
        }
        return -1
    }

    val answer = findSequence(4)
    println("The first full unique sequence is found after $answer characters.")
}