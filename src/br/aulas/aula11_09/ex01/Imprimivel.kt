package br.aulas.aula11_09.ex01

interface Imprimivel {
    val nome: String
    val tipoDocumento: String

    fun imprimir()

    /*ou
    fun imprimir(){
            print("$nome $tipoDocumento")
    }*/
}