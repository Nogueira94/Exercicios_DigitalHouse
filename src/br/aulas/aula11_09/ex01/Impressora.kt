package br.aulas.aula11_09.ex01

class Impressora(){
    val listaImprimivel = mutableListOf<Imprimivel>()

    fun addList(vararg item: Imprimivel) = listaImprimivel.addAll(item);
    val imprimir = { listaImprimivel.forEach() {it.imprimir()}}// - o it significa cada objeto do for each

    //ou

    /*fun addList(vararg obj : Imprimivel){
        for(item in obj) {
            listaImprimivel.add(item)
        }
    }*/
    /*fun imprimir(){
        for(item in listaImprimivel){
            item.imprimir()
        }
    }*/
}