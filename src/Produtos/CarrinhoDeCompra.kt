package Produtos

class CarrinhoDeCompra(
    override var quantidade: Int,
    override var codigo: Int,
    override var nome: String,
    override var valor: Double,):Produtos(quantidade = 0, codigo = 0, nome = "", valor = 0.0) {
    var produtos = mutableMapOf<Int,Produtos>()
    private var contador: Int = 0

    fun inserirItem(item: Produtos):Int {
        contador+= 1
        produtos[contador] = item
        return contador
    }

    fun mostrarCarrinho() {
        produtos.forEach { map ->
            println("A sua chave é : ${map.key}")
            println("${map.value.mostrarProduto()}")
        }
    }
    fun removeProduto(numero: Int) {
        produtos.remove(numero)
    }
}