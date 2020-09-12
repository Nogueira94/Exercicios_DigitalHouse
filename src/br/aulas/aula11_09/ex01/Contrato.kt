package br.aulas.aula11_09.ex01

class Contrato(override val nome: String, override val tipoDocumento: String) : Imprimivel {
    override fun imprimir() = println("Sou um contrato muito legal com nome de $nome e tipo $tipoDocumento")
}