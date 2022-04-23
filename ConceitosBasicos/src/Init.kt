class Animal(var especie: String){

    var fala: String = " "

    // inicializaçao - bloco qe sera inicializado quando a classe for criada

    init {
        if(especie == "cachorro"){
            fala = "auau"
        }else if(especie == "gato"){
            fala = "miau"
        }else{
            fala = " "
        }
    }

    // pode ser declarado varios init -  e todos seram executados em sequencia
    init {
        println("init 2")
    }

    fun falar(){
        println(fala)
    }
}

fun main(){
    var animal = Animal("cachorro")
    animal.falar()

    // chamada rapida de instacia rapida
    Animal("gato").falar()

}