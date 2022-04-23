class Animais(var especie: String){
    var fala: String = " "

    get(){
        println("acesso get")
        // so entra uma vez
        return field
    }

    set(value){
        println("acesso set")
        field = value
    }
}

fun main(){
    var a = Animais("gato")
    a.fala = "auuuu"
}