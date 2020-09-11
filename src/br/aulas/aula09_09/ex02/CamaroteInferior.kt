package br.aulas.aula09_09.ex02

class CamaroteInferior (var local: String, valor : Double) : VIP (valor) {
    override fun imprimeValor(): String {
        val adicional = 50;
        return ("Ingresso no valor de : R$${super.valor+adicional}");
    }
    fun imprimeLocalizacao(): String{
        return ("Local do ingresso : ${local}");
    }

}