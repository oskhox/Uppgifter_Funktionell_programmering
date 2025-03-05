package Inlamning_2

import java.io.File

//AOC 2022 day 6(A) Todd Ginsberg-ish:

/*
    Gör om data till indexValue med index och innehåll
    Hittar första vyn som har 4 unika chars genom att mappa
    .toSet() rensar ut dubletter, är den fortfarande 4 lång så är alla chars i just det window:et unika
    .first() ger FÖRSTA värdet i fönstret där villkoret uppfylls
    .last() ger svaret, alltså den sista inklusive de fyra chars i window:et
 */

fun main() {
    val data: String = File("src/Inlamning_2/dataAoC6.txt").readText()

    fun findSequence(sequenceSize: Int): Int = data.withIndex() //lista med både index och värde
        .windowed(sequenceSize, 1)
        .first { window ->
            window
                .map { it.value }
                .toSet().size == sequenceSize
        }
        .last().index + 1

    val answer = findSequence(4)
    println("The first full unique sequence is found after $answer characters.")
}