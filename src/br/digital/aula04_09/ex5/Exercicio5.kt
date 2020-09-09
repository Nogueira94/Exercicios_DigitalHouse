package br.digital.aula04_09.ex5

fun main(){

    val Veiculo = Veiculo("Fiat", "Uno", 1990, "Preto", 150.5 );
    val Cliente = Cliente("Guilherme", "Nogueira", 999999999);
    val Concessionaria = Concessionaria();

    println(Concessionaria.registrarVenda(Veiculo,Cliente,1500.00));

}