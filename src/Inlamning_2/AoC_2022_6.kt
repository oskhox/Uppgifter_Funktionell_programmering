package Inlamning_2

import java.io.File

//AOC 2022 day 6(A)
//Identify the first position where the four most recently received characters were all different.
//How many characters need to be processed before the first full unique sequence is detected?

//Todd Ginsberg:
//ANT: Kedja av Kotlins inbyggda metoder. Windowed intressant, ger avgränsad del av det man skickar in, ökar med en i taget.
class Day06A(private val input: String) {

    //Extension function för String (storlek)
    //1. Gör om strängen till en lista med både index och värde.
    //2. Windowed går framåt med fönstret som är 4 långt en int åt gången.
    //3. Hittar första vyn som har 4 unika chars genom att mappa.
    //3. .toSet() rensar ut dubletter i den window som granskas nu, och är den fortfarande 4 lång så är alla chars i
    //just det window:et unika. Då blir det träff.
    //4. .first() ger FÖRSTA värdet i fönstret där villkoret uppfylls.
    //5. .last() ger svaret, alltså den sista inklusive de fyra chars i window:et

    private fun String.findStartMarker(startMarkerSize: Int): Int
            = withIndex()
        .windowed(startMarkerSize, 1)
        .first { window -> window.map { it.value }.toSet().size == startMarkerSize }
        .last().index + 1

    fun solvePart1(): Int =
        input.findStartMarker(4)
}

fun main() {
    val data: String = File("src/Inlamning_2/dataAoC6.txt").readText()
    val answer = Day06A(data).solvePart1();
    println("The first full unique sequence is found after $answer characters.")
}

