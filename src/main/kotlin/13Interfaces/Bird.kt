package `13Interfaces`

class Bird (override  val numberOfWings: Int) : IFly {
    override fun fly() {
        if (numberOfWings > 0 ) println("Flying with $numberOfWings wings")
        else println("I'm Flying without wings")
    }
}

fun main() {
    val perkutut = Bird(3)
    perkutut.fly()
}