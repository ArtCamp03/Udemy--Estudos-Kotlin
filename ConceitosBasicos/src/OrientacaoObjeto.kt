// revisao orientaçaoa objeto

class Pessoa(var p1:String = "Ninguem"){
    public var estado:String = " "

    fun dormir(){
        estado = "Dormiu"
        return estado
    }

    fun acordar(){
        estado = "Dormiu"
        return estado
    }


}

// construtor
class Pessoa1(val anoNascimento: Int = 2020, var nome:String)

fun main(){
    // instancia de classe
    var pessoa: Pessoa = Pessoa()

    // instancia com atributo
    var pessoa1: Pessoa1 = Pessoa1(2015, "Joao")
    println(pessoa1.nome)

    println(pessoa.dormir())

}