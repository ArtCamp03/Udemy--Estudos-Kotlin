package controller

import business.ConvidadoBusiness
import entity.Convite

class Portaria {

    private val conviteBusiness = ConvidadoBusiness()
    init {
        println("Portaria Inicializada")
        println(controle())
    }

    private fun controle() : String{
        val idade = Console.readInt("Qual sua idade? ")
        val convidado = Convite(idade = idade)

        if(!conviteBusiness.maiorIdade(convidado.idade)){
            return "Negado. Menores de idade não são permitidos."

        }

        convidado.tipo = Console.readString("Qual é o tipo de convite? ")
        if(!conviteBusiness.validaTipo(convidado.tipo)){
            return "Negado, convite Invalido !!"
        }

        convidado.codigo = Console.readString("Qual é o tipo de convite? ")
        if(!conviteBusiness.codigoValido(convidado)){
            return "Negado, convite Invalido !!"
        }

        return "Welcome !!!"
    }
}