package br.aulas.aula09_09.ex02

class Normal (valor: Double) : Ingresso(valor){
    override fun imprimeValor() : String{
        return ("Ingresso Normal, total de ${super.valor}");
    }
}