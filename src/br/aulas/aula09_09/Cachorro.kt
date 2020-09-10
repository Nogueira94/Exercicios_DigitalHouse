package br.aulas.aula09_09

class Cachorro(nome :String) : Animal (nome) {

    override fun andar () {
        println("Cachorro andando")
    }

    override fun comer() {
        println("Comendo como um cachorro")
    }

}