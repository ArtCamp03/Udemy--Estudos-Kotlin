package controller

import business.ConviteBusiness

class Portaria {

    private val conviteBusiness = ConviteBusiness()
    init {
        println("Portaria Inicializada")
        println(controle())
    }

    private fun controle() : String{
        val idade = Console.readInt("Qual sua idade? ")
        if(idade < 18){
            println("Negado. Menores de idade não são permitidos.")
            return
        }

        val tipoConvite = Console.readString("Qual é o tipo de convite? ")
        if(!conviteBusiness.validaTipo(tipoConvite)){
            return "Negado, convite Invalido !!"
        }

        val codigo = Console.readString("Qual é o tipo de convite? ")
        if(!conviteBusiness.codigoValido(codigo, tipoConvite)){
            return "Negado, convite Invalido !!"
        }

        return "TODO!"
    }
}

fun portaria() {
    /*
    println("Qual sua idade? ")
    val idade = readLine()
    if (idade != null && idade != "") {
        if (idade.toInt() < 18) {
            println("Negado. Menores de idade não são permitidos.")
            return
        }
    }
    */

    print("Qual é o tipo de convite? ")
    var tipoConvite = readLine()
    if (tipoConvite != null && tipoConvite != "") {
        /*tipoConvite = tipoConvite.lowercase()
        // Validação do tipo de convite
        if (tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo") {
            println("Negado. entity.Convite inválido.")
            return
        }*/
        print("Qual o código do convite? ")
        var codigo = readLine()
        if (codigo != null && codigo != "") {
            codigo = codigo.lowercase()
            if (tipoConvite == "comum" && codigo.startsWith("xt")) {
                println("Welcome :)")
            } else if ((tipoConvite == "premium" || tipoConvite == "luxo") && codigo.startsWith("xl")
            ) {
                println("Welcome :)")
            } else {
                println("Negado. entity.Convite inválido")
            }
        }
    }
}