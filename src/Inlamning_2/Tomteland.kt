package Inlamning_2

class Tomteland {

    private val hierarchy = mapOf(
        "Tomten" to listOf("Glader", "Butter"),
        "Butter" to listOf("Rådjuret", "Nyckelpigan", "Haren", "Räven"),
        "Räven" to listOf("Myran", "Gråsuggan"),
        "Myran" to listOf("Bladlusen"),
        "Glader" to listOf("Tröger", "Trötter", "Blyger"),
        "Trötter" to listOf("Skumtomten"),
        "Skumtomten" to listOf("Dammråttan")
    )

    fun getUnderlings(currentName: String, res: MutableList<String>): List<String> {
        val searchResult = hierarchy[currentName]

        if (searchResult != null) {
            res.addAll(searchResult)

            for (underling in searchResult) {
                getUnderlings(underling, res)
            }
        }
        return res
    }
}

fun main() {
    val tomteland = Tomteland()
    var list: MutableList<String> = mutableListOf()

    println(tomteland.getUnderlings("Räven", list))
    list = mutableListOf()
    println(tomteland.getUnderlings("Tröger", list))
    list = mutableListOf()
    println(tomteland.getUnderlings("Glader", list))
    list = mutableListOf()
    println(tomteland.getUnderlings("Butter", list))
}