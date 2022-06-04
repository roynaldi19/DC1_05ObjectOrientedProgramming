package `03MembuatClass`

class Animal(val name: String, val weight: Double, val age: Int, val isMammal: Boolean) {

    fun eat(){
        println("$name makan !")
    }

    fun sleep() {
        println("$name tidur !")
    }
}

fun main() {
    val cat1 = Animal("Manis", 4.1, 4, true)
    println("Nama: ${cat1.name}, Berat: ${cat1.weight}, Umur: ${cat1.age}, mamalia: ${cat1.isMammal}" )
    cat1.eat()
    cat1.sleep()
}
