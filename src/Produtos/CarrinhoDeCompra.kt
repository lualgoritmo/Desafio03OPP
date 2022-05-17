package Produtos

class CarrinhoDeCompra(
    override var quantidade: Int,
    override var codigo: Int,
    override var nome: String,
    override var valor: Double,):Produtos(quantidade = 0, codigo = 0, nome = "", valor = 0.0) {
    var produtos = mutableMapOf<Int,MutableList<Produtos>>()
    private var contador: Int = 0

    fun inserirItem(lista: MutableList<Produtos>):Int {
        contador = + 1
        produtos[contador] = lista
        return contador
    }
    fun salvarItem(item: MutableList<Produtos>) {
        inserirItem(item.toMutableList())
    }

    fun mostrarCarrinho() {
        produtos.forEach { chave, value->
            println("A sua chave é : $chave")
            value.forEachIndexed(){ index, valor ->
                println("A peça é: ${valor.quantidade}")
                println("A marca: ${valor.nome}")
                println("O modelo: ${valor.valor}")
            }
        }
    }
    fun removeProduto(numero: Int) {
        produtos.remove(numero)
    }
}