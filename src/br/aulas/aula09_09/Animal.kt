package br.aulas.aula09_09

abstract class Animal (var nome: String) {

    abstract fun comer();

    open fun andar(){
        println("Andando")
    }
}