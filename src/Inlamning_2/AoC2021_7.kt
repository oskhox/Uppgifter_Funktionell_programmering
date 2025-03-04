package Inlamning_2

import java.io.File
import kotlin.math.absoluteValue

//AOC 2021 day 7(A)
//How manu units fuel must be spent, to move to the one horizontal position that require the least fuel to move to?

class Day07(input: String) {

    //Lägger in input i en Map. Map där key är en viss nuvarande horisontell position, value är hur många krabbor är där.
    private val crabs: Map<Int, Int> = input.split(",").map { a -> a.toInt() }.groupingBy { b -> b }.eachCount()

    //Extension-function av inbyggda Set.asRange(). Så att vi får med sista elementet.
    //Returnerar en int-range med den minsta och största positionen.
    private fun Set<Int>.asRange(): IntRange =
        this.minOf { a -> a }..this.maxOf { a -> a }

    //Returnerar den mängden bränsle som krävs för att flytta alla krabbor till den mest effektiva positionen.
    //1. Tar först en funktion fuelCost som inparameter, som beräknar kostnaden för ett givet avstånd. Inparameter och retur är samma avstånd.
    //2. Mappar sedan om crabs. Skickar in alla krabbornas positioner och antalet krabbor. Transformerar genom att skicka in
    //avståndet mellan en viss mål-location och en viss krabb-location i fuelCost. Multiplicerar sedan med antalet krabbor.
    //Det ger en lista med totala bränslekostnaden för att flytta alla krabbor på en viss location till en specifik mål-position.
    //3. Summerar sedan och får den totala kostnaden att flytta alla krabbor från olika locations till en visst location.
    //4. Den minsta kostnaden plockas ut och returneras.
    private fun solve(fuelCost: (Int) -> Int): Int =
        crabs.keys.asRange().minOf { location ->
            crabs.map { (crab, crabCount) ->
                fuelCost((location - crab).absoluteValue) * crabCount
            }.sum()
        }

    //Skickar in en lambda med samma avstånd som både inparameter och returvärde
    fun solvePart1(): Int = solve { distance -> distance }
}

fun main() {
    val data: String = File("src/Inlamning_2/dataAoC7.txt").readText()
    println("Moving to the most fuel efficient position requires " + Day07(data).solvePart1() + " units of fuel to be spent.")
}