package com.example.lib

interface Figura {
    fun calcularArea(): Double
    fun calcularPerimetro(): Double
}
class Rectangulo(val base: Double, val altura: Double) : Figura {
    override fun calcularArea(): Double = base * altura
    override fun calcularPerimetro(): Double = 2 * (base + altura)
}
class Circulo(val radio: Double) : Figura {
    override fun calcularArea(): Double = Math.PI * (radio * radio)
    override fun calcularPerimetro(): Double = Math.PI * (2 * radio)
}
fun main() {
    val rect = Rectangulo(5.0, 3.0)
    val circ = Circulo(4.0)
    println("Rectángulo - Área: %.2f, Perímetro: %.2f".format(rect.calcularArea(), rect.calcularPerimetro()))
    println("Círculo - Área: %.2f, Perímetro: %.2f".format(circ.calcularArea(), circ.calcularPerimetro()))
}
