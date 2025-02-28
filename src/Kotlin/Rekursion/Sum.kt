package Kotlin.Rekursion

//tail recursion med inre och yttre funktion
fun sum(ints :List<Int>) : Int {

    tailrec fun doSum(sum :Int, counter :Int) : Int  {
        return if (counter == -1) sum
        else doSum(sum+ints[counter], counter -1 )
    }
    return doSum(0, ints.size-1)
}

fun main (){
println(sum(listOf(1, 5, 3, 4, 10, -3, 6)))
}