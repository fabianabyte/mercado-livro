package com.mercadolivro.basico

class Variaveis {
    lateinit var teste: String;
    val iniciada = "oi"

    fun iniciarVariaveis(){
        teste = "teste";
    }
}

fun main(){
    var variaveis = Variaveis()
    variaveis.iniciarVariaveis()

    println(Variaveis().iniciada)
    println(variaveis.teste)
}