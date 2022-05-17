package Produtos

import kotlin.math.roundToInt

open class Produtos(
    open var quantidade:Int,
    protected open var codigo: Int,
    open var nome:String, open var valor:Double){
}