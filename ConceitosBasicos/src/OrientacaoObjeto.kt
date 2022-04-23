// revisao orientaçaoa objeto

class Pessoa(var p1:String = "Ninguem"){
    var dopcuemtno:String = " "

    public var estado:String = " "

    // construtor secunbdario chamndo primerio  construtor
    // this - referencia a instancia da classe
    constructor(nome:String, idade:Int): this(nome, idade){
        this.dopcuemtno = nome
    }

    fun dormir(){
        estado = "Dormiu"
        return estado
    }

    fun acordar(){
        estado = "Dormiu"
        return estado
    }

}

// construtor private
class Varia private constructor()

// construtor
class Pessoa1(val anoNascimento: Int = 2020, var nome:String)

fun Main(){
    // instancia de classe
    var pessoa: Pessoa = Pessoa()

    // instancia com atributo
    var pessoa1: Pessoa1 = Pessoa1(2015, "Joao")
    println(pessoa1.nome)

    // com construtor secundario
    var pessoa2: Pessoa = Pessoa("Joao",45)

    println(pessoa.dormir())

}