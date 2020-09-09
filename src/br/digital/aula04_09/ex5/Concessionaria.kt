package br.digital.aula04_09.ex5

class Concessionaria {

    var registroVenda = ArrayList<Vendas>();

    fun registrarVenda(Veiculo: Veiculo, cliente: Cliente, valor: Double): String{
        val venda = Vendas(valor, Veiculo, cliente);
        registroVenda.add(venda);
        return "Carro ${Veiculo.modelo}, vendido para o cliente ${cliente.nome}, pelo valor de R$ ${valor}"
    }
}
