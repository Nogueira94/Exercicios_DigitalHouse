package br.aulas.aula11_09.ex01

class Foto(override val nome: String, override val tipoDocumento: String) : Imprimivel{
    override fun imprimir() = println("Eu sou uma selfie com nome de $nome e tipo $tipoDocumento")
}