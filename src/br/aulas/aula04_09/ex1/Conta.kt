package br.aulas.aula04_09.ex1

class Conta (var numConta: Int, var saldo: Float, val titular: Cliente ) {

    fun depositar(quantia: Float) : String{
        saldo += quantia;
        return ("Deposito efetuado com sucesso, novo saldo de: R${saldo}");
    }
    fun sacar (quantia: Float) : String{
        when {
            quantia >= saldo -> {
                return ("Saldo Insuficiente")
            }
            else -> {
                saldo += quantia;
                return ("Saque efetuado com sucesso. Novo saldo de: ${saldo}")
            }
        }
    }
}