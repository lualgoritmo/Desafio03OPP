package NavegacaoMenus

import Produtos.CarrinhoDeCompra
import Produtos.Refrigerante
import Produtos.Sucos
import kotlin.system.exitProcess

class SubMenuBebidas {
    fun subMenuBebida() {
        println("Refrigerante, digite 1")
        println("Suco, digite 2")
        println("Digite 3 para sair")
        var option = readln().toInt()
        while (true) {
            if (option == 1) {
                val refrigerante: Refrigerante =
                    Refrigerante(quantidade = 0, codigo = 0, nome = "X-Burguer", valor = 8.00)
                refrigerante.refrigerante()
                val carrinho: CarrinhoDeCompra = CarrinhoDeCompra(quantidade = 0, codigo = 0, nome = "X-Burguer", valor = 10.00)
                carrinho.inserirItem(refrigerante)
                carrinho.mostrarCarrinho()
            } else if (option == 2) {
                var suco: Sucos = Sucos(quantidade = 0, codigo = 0, nome = "X-Salada", valor = 6.00)
                suco.suco()
                val carrinho: CarrinhoDeCompra = CarrinhoDeCompra(quantidade = 0, codigo = 0, nome = "X-Burguer", valor = 10.00)
                carrinho.inserirItem(suco)
                carrinho.mostrarCarrinho()
            } else if (option == 3) {
                exitProcess(0)
            }
            else {
                println("Opção inválida, escolha uma opção correta")
            }
            Menu().execute()
            break
        }
    }
}