package br.digital.com.ex2

class SessaoDeTreinamento (var expTreino: Int) {

    fun treinarA(Jogador: JogadorDeFutebol){
        println("Experiencia no inicio do treinamento ${Jogador.exp}");
        Jogador.correr();
        Jogador.fazerGol();
        Jogador.correr();
        Jogador.exp+=expTreino;
        println("Experiencia ao termino do treinamento ${Jogador.exp}");
    }

}