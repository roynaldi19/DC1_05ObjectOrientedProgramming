package `10Inheritances`

open class Animal(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean){

    open fun eat(){
        println("$name sedang makan!")
    }

    open fun sleep(){
        println("$name sedang tidur!")
    }

    fun likeCoding(){
        println("$name is not like coding")
    }
}

class Cat(name: String, weight: Double, age: Int, isCarnivore: Boolean, val furColor: String, val numberOfFeet: Int) :
        Animal(name, weight, age, isCarnivore) {

    fun playWithHuman() {
        println("$name bermain bersama Manusia !")
    }

    override fun eat() {
        println("$name sedang memakan ikan !")
    }

    override fun sleep() {
        println("$name sedang tidur di bantal !")
    }
}

fun main() {
    val cat1 = Cat("Manis", 3.4, 5, true, "Putih", 4)
    cat1.playWithHuman()
    cat1.eat()
    cat1.sleep()
    cat1.likeCoding()
}