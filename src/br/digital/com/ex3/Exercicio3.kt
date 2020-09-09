package br.digital.com.ex3

fun main(){
    val atletaA = Atleta("Guilherme", 10, 10);
    val atletaB = Atleta("João", 3,10);
    val provaA = Prova(5, 10);

    println(provaA.podeRealizar(atletaA));
    println(provaA.podeRealizar(atletaB));

}