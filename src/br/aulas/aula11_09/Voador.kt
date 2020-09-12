package br.aulas.aula11_09

interface Voador {

    var nome: String; //propriedades sempre são obrigatorias o override

    fun voar();

    fun voarRapido(){
        println("Voando rapido");
    }
}