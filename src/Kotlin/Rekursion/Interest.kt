package Kotlin.Rekursion

//tail recursion
fun main(){
    tailrec fun getInterest(amount :Double, years: Int, interest: Double) : Double  {
        return if (years == 0) amount
        else getInterest ((amount + amount*interest / 100), years-1, interest)
    }

    println(getInterest(100.0, 3, 10.0))
}