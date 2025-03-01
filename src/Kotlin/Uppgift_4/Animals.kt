package Kotlin.Uppgift_4

class Animal(type: String, numberOfLegs: Int) {

    var typeString: String = type
        get() = field
        set(value) {
            field = value
        }

    var numberOfLegsInt: Int = numberOfLegs
        get() = field
        set(value) {
            field = value
        }

    fun printTypeOfAnimal(){
        println("The type of animal is $typeString.")
    }

    fun printNumberOfLegs(){
        println("It has $numberOfLegsInt legs.")
    }

    fun printAllInfo(){
        println("The type of animal is $typeString with $numberOfLegsInt legs.")
    }
}

fun main(){
    val cat = Animal("Cat", 4)
    val beaver = Animal("Beaver", 4)
    val emu = Animal("Emu", 2)

    //prints
    cat.printTypeOfAnimal()
    cat.printNumberOfLegs()
    cat.printAllInfo()

    beaver.printTypeOfAnimal()
    beaver.printNumberOfLegs()
    beaver.printAllInfo()

    emu.printTypeOfAnimal()
    emu.printNumberOfLegs()
    emu.printAllInfo()

    //val list = listOf(cat, beaver, emu)
}