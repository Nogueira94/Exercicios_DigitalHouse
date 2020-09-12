package br.aulas.aula11_09

class SuperHomem(override var nome: String) : Voador, Aquatico {
    override fun voar() {
        println("Estou voando como o SuperHomem");
        }
}