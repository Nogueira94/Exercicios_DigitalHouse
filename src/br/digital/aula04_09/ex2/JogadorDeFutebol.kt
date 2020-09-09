package br.digital.aula04_09.ex2

class JogadorDeFutebol (var nome: String, var energia: Int, var alegria: Int, var gols: Int, var exp: Int) {

    fun fazerGol (){
        energia -= 5
        alegria += 10
        gols += 1
        println("GOOOOL!")
    }

    fun correr (){
        energia -= 10
        println("Cansei")
    }

}