package `10Inheritances`

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