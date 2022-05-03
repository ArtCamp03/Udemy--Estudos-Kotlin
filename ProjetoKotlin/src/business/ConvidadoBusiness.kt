package business

import entity.Convite

class ConvidadoBusiness {
    fun validaTipo(tipo: String) = (tipo == "comum" || tipo == "premium" || tipo == "luxo")

    /*
    fun codigoValido(codigo:String, tipo: String): Boolean{
        return if (tipo == "comum" && codigo.startsWith("xt")) {
            return true
        } else ((tipo == "premium" || tipo == "luxo") && codigo.startsWith("xl"))
    }
    variaçao
     */

    fun maiorIdade(idade:Int) = idade >= 18

    fun codigoValido(convite : Convite) = when(convite.tipo){
        "comum" -> convite.codigo.startsWith("xt")
        "premium", "luxo" -> convite.codigo.startsWith("xt")
        else -> false
    }

}