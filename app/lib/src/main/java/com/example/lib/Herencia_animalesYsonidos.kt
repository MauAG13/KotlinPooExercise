package com.example.lib

open class Animal(val nombre: String, val edad: Int) {
    open fun hacerSonido() {
        println("Sonido genérico.")
    }
    fun describirse() {
        println("Soy $nombre y tengo $edad años.")
    }
}
class Perro(nombre: String, edad: Int) : Animal(nombre, edad) {
    override fun hacerSonido() {
        // TODO: imprime ¡Guau!
        println("WOOF WOOF")
    }
}

class Gato(nombre: String, edad: Int) : Animal(nombre, edad) {
    override fun hacerSonido() {
        println("Miauuuuuuuu")
    }
}

class Vaca(nombre: String, edad: Int) : Animal(nombre, edad) {
    override fun hacerSonido() {
        println("MUUUUUUUUUU")
    }
}

fun main() {
    val perro = Perro("Rex", 3)
    perro.describirse()
    perro.hacerSonido()
    val gato = Gato("Tomiris", 452)
    gato.describirse()
    gato.hacerSonido()
    val vaca = Vaca("Lola", 13)
    vaca.describirse()
    vaca.hacerSonido()
}