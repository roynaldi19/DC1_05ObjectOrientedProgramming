package `12AbstractClass`



abstract class Animal(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean){

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

fun main(){
    // abtrack class hanya bisa di turunkan tidak bisa di jakin objek
    //val reptil = Animal("Crocodile", 2.6, 1, true)

}