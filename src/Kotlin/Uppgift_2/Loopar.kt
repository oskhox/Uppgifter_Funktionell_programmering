package Kotlin.Uppgift_2

fun printEvenNumbersReverse(){
    println("Jämna tal 0-20 baklänges:")
    for (x in 20 downTo 0) if (x % 2 == 0) println(x)
}

fun printMultiplicationTable(table : Int, lowestMult : Int, highestMult : Int) {
    println("Del av multiplikationstabell för $table:")
    for (x in lowestMult..highestMult) println(x * table)

}

fun main(){
printEvenNumbersReverse()
printMultiplicationTable(7, 3, 6)

}