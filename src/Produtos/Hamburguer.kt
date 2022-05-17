package Produtos

import Utilitarios.Utilitarios

class xBurguer(
    override var quantidade: Int,
    override var codigo: Int,
    override var nome: String,
    override var valor: Double,
):Produtos(quantidade = 0, codigo = 0, nome = "X-Burguer", valor = 10.00), Utilitarios {
    override fun codigoAleatorio() {
        TODO("Not yet implemented")
    }

    override fun lanche() {
          try {
            println("Quantos X-Burguer's?")
            quantidade = readln().toInt()
            var resultado = quantidade * valor
                println("Quantidade: $quantidade")
                println("Nome: $nome")
                println("Valor: %.2f".format(resultado))
            }
            catch(e: NumberFormatException) {
            println("Formato inválido, digite um número")
        }
    }

}