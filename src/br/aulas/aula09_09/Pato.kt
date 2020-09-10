package br.aulas.aula09_09

open class Pato (nome: String) : Animal (nome) {

    final override fun andar () {
        println("Pato andando")
    }

    final override fun comer() {
        println("Comendo como um pato")
    }

}