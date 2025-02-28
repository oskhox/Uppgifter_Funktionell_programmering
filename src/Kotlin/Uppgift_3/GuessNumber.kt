package Kotlin.Uppgift_3

fun main() {
    var randomInt = (1..10).random()

    println("Guess a number between 1-10:")
    while (true) {
        try {
            val guess = readLine()!!.toInt()

            if (guess == randomInt) {
                println("Correct.")
                randomInt = (1..10).random()
                println("Guess a number between 1-10:")
            } else {
                if (guess < randomInt) println("Too low. Try again:")
                if (guess > randomInt) println("Too high. Try again:")
            }
        } catch (e: NumberFormatException) {
            e.printStackTrace()
            println("That's not a valid number. Try again.")
        } catch (e: Exception) {
            e.printStackTrace()
            println("That's not a valid number. Try again.")
        }
    }
}