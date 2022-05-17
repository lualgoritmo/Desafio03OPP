package Produtos

class Sucos( override var quantidade:Int,
                    override var codigo: Int,
                    override var nome:String,
                    override var valor:Double = 6.00):Produtos(quantidade = 0, codigo = 0, nome = "Suco", valor = 6.00) {

    fun suco() {
        try {
            println("Quantos Sucos?")
            quantidade = readln().toInt()
            if (quantidade > 0) {
                var resultado = quantidade * valor
                println("Quantidade: $quantidade")
                println("Código da Compra: $codigo")
                println("Nome: $nome")
                println("Valor: %.2f".format(resultado))
            }
            else {
                println("Digite uma quantidade maior que zero")
            }
        } catch (e: NumberFormatException) {
            println("Formato inválido, digite um número")

        }
    }
}
