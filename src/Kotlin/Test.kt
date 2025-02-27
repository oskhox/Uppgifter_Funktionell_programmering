package Kotlin

    fun main() {
    val res = multiplyByTwo(10)
        println(res)
    }

    fun multiplyByTwo (x: Int) : Int {
        println("Inside multiplyByTwo")
        return x * 2
    }