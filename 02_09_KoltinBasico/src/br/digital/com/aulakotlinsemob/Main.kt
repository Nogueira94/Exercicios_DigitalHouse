package br.digital.com.aulakotlinsemob

fun main(){
    println("Ex1 = Escrever o código que deve analisar três números inteiros e retornar o maior " +
            "deles.");
    println(ex1(5,4,4));

    println("Ex2 = Escrever o código que deve analisar duas cadeias de texto e, caso sejam" +
            "diferentes, retornar true, ou, caso sejam iguais, retornar false.");
    println(ex2("teste","teste"));

    println("Ex3 = Escrever o código que deve analisar um número inteiro e, caso ele seja par," +
            "retornar true, caso contrário, retorna false.");
    println(ex3(101));

    println("Ex4 = Escrever um programa que imprima na tela os primeiros 100 números" +
            "inteiros positivos ímpares.");
    ex4();

    println("Ex5 = Escrever um código que deve analisar quatro números inteiros e, caso numA" +
            "seja maior que numC e numD ou caso numB seja maior que numC e numD," +
            "retornar true, caso contrário, retornar false");
    println(ex5(1,2,3,4));

    println("Ex6 = Escrever um programa que exiba os primeiros 100 números positivos");
    ex6();
}

fun ex1(n1: Int, n2: Int, n3: Int) :Int{
    if(n1 >= n2 && n1 >= n3)
        return n1
    else if(n2 >= n1 && n2 >= n3)
        return n2
    else
        return n3
}

fun ex2(tx1: String, tx2: String) :Boolean{
    return (tx1 != tx2)
}

fun ex3(n: Int) :Boolean{
    return (n % 2 == 0)
}

fun ex4(){
    for (i in 1..200 step 2)
        print("$i ")
    print("\n")
}

fun ex5(nA: Int, nB: Int, nC: Int, nD: Int) :Boolean{
    if ((nA > nC && nA > nD) || (nB > nC && nB > nD)){
        return true
    }
    return false
}

fun ex6(){
    for (i in 0..200 step 2)
        print("$i ")
    print("\n")
}

