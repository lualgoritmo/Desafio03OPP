package NavegacaoMenus
import kotlin.system.exitProcess

class Menu {
    init {
        println("Seja bem vindo!")
        println("Escolha a melhor opção")
    }
    fun execute() {
        try {
            while (true) {
                println("Para Hamburguer digite: 1")
                println("Para Bebida digite: 2")
                println("Para sair digite: 3")
                val option = readln().toInt()
                if (option == 1) {
                    var subMenu: SubMenu = SubMenu()
                    subMenu.subMenu()
                }
                else if (option == 2) {
                    var subMenuBebida: SubMenuBebidas = SubMenuBebidas()
                    subMenuBebida.subMenuBebida()
                }
                else if (option == 3) {
                    exitProcess(0)
                }
                else {
                    println("Opção Inválida, tente novamente!")
                }
            }
        } catch (e: NumberFormatException) {
            println("Formato inválido, para " + "escolher o item, você deve informar o número deleo")
            execute()
        }
    }
}