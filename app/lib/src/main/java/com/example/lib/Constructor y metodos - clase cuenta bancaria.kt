package com.example.lib

class CuentaBancaria(val titular: String) {
    var saldo: Double = 0.0
    fun depositar(cantidad: Double) {
        // TODO
        saldo = cantidad + saldo
        println("Nuevo saldo: $saldo")
    }
    fun retirar(cantidad: Double) {
        // TODO: verifica que haya saldo suficiente
        if (cantidad <= saldo){
            saldo = saldo - cantidad
            println("Nuevo saldo: $saldo")
        } else {
            println("Error. La cantidad retirada es mayor al saldo disponible")
        }
    }
    fun mostrarSaldo() {
        // TODO
        println("Tu saldo actual es: $saldo")
    }
}
fun main() {
    val cuenta = CuentaBancaria("María García")
    cuenta.depositar(1000.0)
    cuenta.retirar(400.0)
    cuenta.retirar(800.0) // No debe permitirlo
    cuenta.mostrarSaldo()
}