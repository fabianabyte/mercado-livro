package com.mercadolivro.basico

class Carro (var cor: String, val ano: Int, var fabricante: Fabricante) {
}

data class Fabricante (var nome: String) {
}

fun main(){

    var carro = Carro("Vermelho", 1998, Fabricante("Ferrari"))

    println(carro.cor)

    carro.cor = "Azul"

    println(carro.cor)

    println(carro.fabricante)
}