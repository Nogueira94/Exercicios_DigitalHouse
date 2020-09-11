package br.aulas.aula09_09.ex02

import java.lang.Integer.parseInt

fun main(){

    val ingressoNormal = Normal(100.0)
    val ingressoCamaroteInferior = CamaroteInferior ("Fileira A", 100.0);
    val ingressoCamaroteSuperior = CamaroteSuperior (100.0);

    println("Bem vindos a venda de ingresso, digite 1 para ingresso Normal ou 2 para ingresso VIP");
    var resp = parseInt(readLine());

    if (resp == 1) {
        return println(ingressoNormal.imprimeValor());
    } else if (resp ==2){
            println("Qual ingresso VIP deseja, 1 para CamaroteInferior ou 2 para Camarote Superior");
            var respVIP = parseInt(readLine());
            if (respVIP == 1) {
                println(ingressoCamaroteInferior.imprimeLocalizacao());
                println(ingressoCamaroteInferior.imprimeValor());
            } else if (respVIP == 2) {
                println(ingressoCamaroteSuperior.imprimeValor());
            } else {
                println("Alternativa não disponivel")
            }
    } else {
        println("Alternativa não disponivel")
    }

}