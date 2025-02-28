package Kotlin.Rekursion

//vanlig
fun factorial(n: Long): Long {
    if (n <= 1) return 1
    return n * factorial(n - 1) //not tailrec because of n*
}

//tail recursion
fun factorialWithAccumulator(n: Int): Int {

    tailrec fun factorialAccumulator(acc: Int, n: Int): Int {
        return if (n == 0) acc
        else factorialAccumulator(n*acc, n-1)
    }

    return factorialAccumulator(1, n)
}

fun main(){
    println(factorial(10))
    println(factorialWithAccumulator(6))
}