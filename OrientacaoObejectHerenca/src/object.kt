class Matematica {

    // variaveis statica ficam dentro do metodo
    //companion object po ou nao ser nomeado
    companion object  NOME{
       val PI = 3.1415
        fun teste() {}

        println("Fui inicializado")
    }

    //Object pode ter varios , eh obrigatorio ter nome
    object obj1{
        val PI = 3.1415
        fun teste() {}

        println("Fui inicializado")
    }

    object obj2{
        val PI = 3.1415
        fun teste() {}

        println("Fui inicializado")
    }

}

fun main(){
    Matematica.PI
    // ou
    Matematica.NOME.PI

    // chamada de metodo
    Matematica.teste()

    // chamando object
    Matematica.obj1.PI
    Matematica.obj2.PI

    // ccompanion object e object sao inicializado quando chamados da primeira vez
}