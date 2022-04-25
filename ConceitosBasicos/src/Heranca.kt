open class Eletronico(var marca: String){
    fun ligar() {
        println("Computador Ligado ..")
    }
    fun desligar() {
        println("Computador desligando ..")
    }

}

class Computador(marca: String): Eletronico(marca){
    fun instalarSoftware() {}
    fun processar() {}
}

fun main(){
    var c: Computador = Computador("DELL")

    println(c.ligar())
}