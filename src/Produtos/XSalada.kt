package Produtos

import Utilitarios.Utilitarios

class XSalada( override var quantidade:Int,
               override var codigo: Int,
               override var nome:String,
               override var valor:Double = 12.00):Produtos(quantidade = 0, codigo = 0,
    nome = "X-Salada", valor = 12.00), Utilitarios {
    override fun codigoAleatorio() {
        TODO("Not yet implemented")
    }

    override fun lanche() {
        try {
            println("Quantos X-Salada?")
            quantidade = readln().toInt()
            var resultado = quantidade * valor
            println("Quantidade: $quantidade")
            println("Código da Compra: $codigo")
            println("Nome: $nome")
            println("Valor: %.2f".format(resultado))
        }
        catch (e: NumberFormatException) {
            println("Formato inválido, digite um número")

        }
    }
}