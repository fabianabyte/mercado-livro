package com.mercadolivro.basico

class Pessoa(var nome : String, var idade : Int){
    override fun toString() : String{
        return "Nome: ${nome}, idade: ${idade}"
    }
}

data class PessoaData(var nome:String, var idade:Int){

}

fun main(){
    println(Pessoa("teste", 12).toString())
    println(PessoaData("teste", 12))
}
