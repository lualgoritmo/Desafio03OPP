package Produtos

import kotlin.math.roundToInt

abstract class Produtos(
    open var quantidade:Int,
    protected open var codigo: Int,
    open var nome:String, open var valor:Double) {
    open fun mostrarProduto() {
        var resultado = quantidade * valor
        println("--------------------------")
        println("Quantidade: $quantidade")
        println("Nome: $nome")
        println("Valor: $resultado")
        println("--------------------------")
    }
}