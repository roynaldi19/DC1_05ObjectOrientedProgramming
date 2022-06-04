package `12AbstractClass`

abstract class Animal(var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean){

    fun eat(){
        println("$name sedang makan !")
    }

    fun sleep(){
        println("$name sedang tidur !")
    }
}

fun main(){
    // abtrack class hanya bisa di turunkan tidak bisa di jakin objek
    // val animal = Animal("dicoding animal", 2.6, 1, true)
}