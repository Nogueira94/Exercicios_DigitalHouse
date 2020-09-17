package br.aulas.aula16_09.ex01

fun main() {
    val loteriaDosSonhos = listOf("Ovos", "Água", "Escopeta", "Cavalo", "Dentista", "Fogo");

    val apelidos = mapOf(
            "Joao" to listOf("Juan", "Fissura", "Maromba"),
            "Miguel" to listOf("Night Watch", "Bruce Wayne", "Tampinha"),
            "Maria" to listOf("Wonder Woman", "Mary", "Marilene"),
            "Lucas" to listOf("Lukinha", "Jorge", "George"))

    apelidos.forEach { (t, u) -> println("Nome: $t, Apelidos : $u") };

    loteriaDosSonhos.forEachIndexed { k, u -> println("$k $u") };
}

