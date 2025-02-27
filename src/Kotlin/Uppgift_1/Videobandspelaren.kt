package Kotlin.Uppgift_1

val tapeLenght = 150
val usedLength = 43
val hourProgramStarts = 20
val minProgramStarts = 15
val hourProgramEnds = 21
val minProgramEnds = 55

fun main() {
    fun lengthLeft(tapeLMins : Int, usedLMins : Int) = tapeLMins - usedLMins

    fun totalProgramLengthMinutes(startHour: Int, startMin: Int, endHour: Int, endMin: Int): Int {
        val startTotalMinutes = (startHour * 60) + startMin
        val endTotalMinutes = (endHour * 60) + endMin
        return endTotalMinutes - startTotalMinutes
    }

    fun doesItFit(remainingTapeL : Int, movieLength : Int) = remainingTapeL >= movieLength

    val tapeLeft = lengthLeft(tapeLenght, usedLength)
    val totalMins = totalProgramLengthMinutes(hourProgramStarts, minProgramStarts, hourProgramEnds, minProgramEnds)
    val fitsOrNot = doesItFit(tapeLeft, totalMins)

    if (fitsOrNot) println("The movie fits on the tape.")
    else println("The movie does not fit on the tape.")
}