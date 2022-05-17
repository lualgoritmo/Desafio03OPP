package Produtos

class Refrigerante( override var quantidade:Int,
                    override var codigo: Int,
                    override var nome:String,
                    override var valor:Double = 8.00):Produtos(quantidade = 0, codigo = 0, nome = "Refrigerante", valor = 8.00) {

    fun refrigerante() {
        try {
            println("Quantos X-Salada?")
            quantidade = readln().toInt()
            var resultado = quantidade * valor
            println("Quantidade: $quantidade")
            println("Código da Compra: $codigo")
            println("Nome: $nome")
            println("Valor: %.2f".format(resultado))
        } catch (e: NumberFormatException) {
            println("Formato inválido, digite um número")

        }
    }
}
