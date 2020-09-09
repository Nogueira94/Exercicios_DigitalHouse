package br.digital.com.ex2

fun main() {
    val jogadorA = JogadorDeFutebol ("Guilherme", 100, 100, 5, 25);
    val jogadorB = JogadorDeFutebol ("João", 80 ,40, 25, 15);
    val treinoA = SessaoDeTreinamento (10);

    treinoA.treinarA(jogadorA);
    treinoA.treinarA(jogadorB);
}