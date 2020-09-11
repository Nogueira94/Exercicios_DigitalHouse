package br.aulas.aula09_09.ex02

class CamaroteSuperior (valor : Double) : VIP (valor) {
    override fun imprimeValor(): String {
        val adicional = 100;
        return ("Ingresso no valor de : R$${super.valor+adicional}");
    }

}