println("Hello World!")

fun hej(){
    println("Hlo wrld")
}
hej()

val i = 5
var j = "Använd ej var"

fun hej2() = println("Hello world as a one liner")
hej2()

fun returnEightSeveralLines() : Int {
    return 8
}
println(returnEightSeveralLines())

fun returnNineOneLine() = 9
println(returnNineOneLine())

println(returnNineOneLine() + 22)

fun inParameterOneLine(x : Int) = 5 + x
println(inParameterOneLine(2))

val quickResult = if (99 < 100) 4 else 42
println(quickResult)

fun stringInterpolation (x : String) = "Hej $x"
stringInterpolation("Oskar")