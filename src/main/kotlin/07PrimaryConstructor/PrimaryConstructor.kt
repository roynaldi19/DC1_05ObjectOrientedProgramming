package `07PrimaryConstructor`

class Animal(var name: String, var weight: Double, var age: Int = 0, var isMammal: Boolean = true)

fun main(){
    val dicodingCat = Animal("Dicoding Miaw", 4.2, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )
}