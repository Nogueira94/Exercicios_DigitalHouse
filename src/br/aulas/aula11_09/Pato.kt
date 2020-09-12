package br.aulas.aula11_09

class Pato(override var nome: String) : Voador {
    override fun voar() {
        println("Estou voando como um Pato");
    }
}