package br.aulas.aula11_09.ex01

fun main() {
    var foto = Foto("Joao","PNG")
    var documento = Documento("Vitoria","DOCX")
    var contrato = Contrato("Digital House", "Matricula")


    var impressora = Impressora()

    impressora.addList(foto,documento, contrato)
    impressora.imprimir();
}