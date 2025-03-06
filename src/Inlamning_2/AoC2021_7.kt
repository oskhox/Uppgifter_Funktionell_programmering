package Inlamning_2

import java.io.File
import kotlin.math.absoluteValue

//AOC 2021 day 7(A)
//How many units fuel must be spent to move all crabs to the one horizontal position that require the least fuel to move to?

fun main() {
    val data: String = File("src/Inlamning_2/dataAoC7.txt").readText()

    //Key är en viss nuvarande horisontell position, value är hur många krabbor är där
    val crabs: Map<Int, Int> = data.split(",").map { a -> a.toInt() }.groupingBy { b -> b }.eachCount()

    fun lowestFuelCost(): Int {
        val minPosition = crabs.keys.minOrNull()!!
        val maxPosition = crabs.keys.maxOrNull()!!

        //Tar en range, mappar genom att gå igenom alla entries och tar summan av total bränslemängd för varje position
        val minFuelCost = (minPosition..maxPosition)
            .map { targetPosition -> crabs.entries.sumOf { (crabPosition, crabCount) -> (targetPosition - crabPosition).absoluteValue * crabCount }
            }.min()

        return minFuelCost
    }

    val answer = lowestFuelCost()
    println("Moving to the most fuel efficient position requires $answer units of fuel to be spent.")
}