package br.aulas.aula11_09.ex01

class Documento(override val nome: String, override val tipoDocumento: String) : Imprimivel{
    override fun imprimir() = println("Eu sou um documento word com nome de $nome e tipo $tipoDocumento")

    /* ou
      override fun imprimir(){
        print("Eu sou um documento");
        super.imprimir();
    }*/

}
