package br.aulas.aula04_09.ex3

class Prova (var dificuldade: Int, var energiaNecessaria: Int) {
    fun podeRealizar(atleta: Atleta): Boolean{
        return atleta.energia >= energiaNecessaria && atleta.nivel >= dificuldade;
    }
}