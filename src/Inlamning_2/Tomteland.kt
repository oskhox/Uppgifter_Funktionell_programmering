package Inlamning_2

class Tomteland {

    //TODO: skapa en datastruktur för att lagra tomtarna och deras relationer i

    // current namn är den tomte vars underlydande ni vill ta fram
    //res är listan som håller alla underlydande
    fun getUnderlings(currentName: String, res: MutableList<String>): List<String> {
        //TODO, skriv denna metod, glöm inte att den ska vara rekursiv!
        throw UnsupportedOperationException()
    }

    fun main() {

        //Exempel på anrop till den rekursiva funktionen getUnderlings,
        //här är tanken att hitta Tröger underlydande
        //listan fylls på successivt när vi rekurserar:

        var list: MutableList<String> = mutableListOf()
        println(getUnderlings("Tröger", list))

    }
}