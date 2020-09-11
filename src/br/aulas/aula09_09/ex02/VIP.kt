package br.aulas.aula09_09.ex02

abstract class VIP (valor: Double) : Ingresso (valor) {
    abstract override fun imprimeValor() : String;
}