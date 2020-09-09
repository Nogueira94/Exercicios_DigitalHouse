package br.digital.aula04_09.exemplo

class Pessoa (
        var nome:String,
        var sobrenome:String,
        var idade:Int
) {

    init {
        jantar()
    }

    fun jantar(){
        println("Pessoa $nome está jantando")
    }

    init {
        println("$nome $sobrenome completou $idade")
    }

    fun andarComDog (cachorro: Cachorro){
        println("Estou passeando com meu cachorro ${cachorro.nome}")
    }

}