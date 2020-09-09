package br.digital.com.ex4

class Tripe (var dobrado: Boolean, var alturaMinima: Int, var alturaMaxima: Int, var alturaAtual: Int) {

    fun definirAltura(novaAltura: Int){
        alturaAtual = novaAltura;
    }

    fun dobra(){
        when (dobrado){
            false -> {
                println("Tripe sera dobrado")
                dobrado = true
            }
            else -> {
                println("Tripe ja está dobrado")
            }
        }
    }

    fun desdobrar(){
        when (dobrado){
            true -> {
                println("Tripe sera aberto")
                dobrado = false
            }
            else -> {
                println("Tripe ja está aberto")
            }
        }
    }

    fun guardar(){
        if (dobrado == true && alturaAtual <= alturaMinima){
            println("tripe guardado")
        } else{
            println("o tripe não atende as recomendações para guardar")
        }
    }

    fun prontoParaGuardar(){
        if (dobrado == true && alturaAtual <= alturaMinima){
            guardar();
        } else{
            println("o tripe não atende as recomendações para ser guardado")
        }
    }

    fun usar(){
        if (dobrado == false && alturaAtual >= alturaMaxima/2){
            println("tripe está pronto para ser usado")
        } else{
            println("o tripe não atende as recomendações para ser usado")
        }
    }

    fun prontoParaUsar(){
        if (dobrado == false && alturaAtual >= alturaMaxima/2){
            usar();
        } else{
            println("o tripe não atende as recomendações para ser usado")
        }
    }

}