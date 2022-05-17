package NavegacaoMenus

import Produtos.CarrinhoDeCompra
import Produtos.XSalada
import Produtos.xBurguer
import kotlin.system.exitProcess

class SubMenu {
    fun subMenu() {
        println("--------------------------")
        println("X-Burguer, digite 1")
        println("X-Salada, digite 2")
        println("Digite 3 para sair")
        println("--------------------------")
        var option = readln().toInt()
        while (true) {
            if (option == 1) {

                val xBurguer: xBurguer = xBurguer(quantidade = 0, codigo = 0, nome = "X-Burguer", valor = 10.00)
                xBurguer.lanche()
                val carrinho: CarrinhoDeCompra = CarrinhoDeCompra(quantidade = 0, codigo = 0, nome = "X-Burguer", valor = 10.00)
                carrinho.inserirItem(xBurguer)
                carrinho.mostrarCarrinho()
            }
            else if (option == 2) {
                var xSalada: XSalada = XSalada(quantidade = 0, codigo = 0, nome = "X-Salada", valor = 12.00)
                xSalada.lanche()
               val carrinho: CarrinhoDeCompra = CarrinhoDeCompra(quantidade = 0, codigo = 0, nome = "X-Salada", valor = 12.00)
                carrinho.inserirItem(xSalada)
                carrinho.mostrarCarrinho()
            }
            else if (option == 3) {
                exitProcess(0)
            }
            else {
                println("Opção invalida!")
                subMenu()
            }
            Menu().execute()
            break
        }
    }
}