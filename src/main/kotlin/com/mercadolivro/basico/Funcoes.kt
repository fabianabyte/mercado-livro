package com.mercadolivro.basico



fun teste(): String{
    return "teste"
}

fun concatena(str1: String, str2: String): String{
    return str1 + str2;
}

fun main(){
    println(concatena(teste(), " funções."))
}